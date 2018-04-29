package dev.prateek.com.tourguide;


import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set InfoFragment as a starting view
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.list_layout, new InfoFragment()).commit();
        }

        // Set custom toolbar as a supportActionBar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        // Set listener on the navigationView
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();

                        // switch statement which opens chosen fragment form the drawer
                        switch (menuItem.getItemId()) {
                            case R.id.nav_museums:
                                getSupportFragmentManager().beginTransaction().replace(R.id.list_layout,
                                        new MuseumFragment()).commit();
                                break;
                            case R.id.nav_restaurants:
                                getSupportFragmentManager().beginTransaction().replace(R.id.list_layout,
                                        new RestaurantFragment()).commit();
                                break;
                            case R.id.nav_info:
                                getSupportFragmentManager().beginTransaction().replace(R.id.list_layout,
                                        new InfoFragment()).commit();
                                break;
                            case R.id.nav_attractions:
                                getSupportFragmentManager().beginTransaction().replace(R.id.list_layout,
                                        new AttractionsFragment()).commit();
                                break;
                            case R.id.nav_nature:
                                getSupportFragmentManager().beginTransaction().replace(R.id.list_layout,
                                        new NatureFragment()).commit();
                                break;
                        }

                        return true;
                    }
                });
    }

    @Override
    // Open the drawer when menu button was clicked
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
