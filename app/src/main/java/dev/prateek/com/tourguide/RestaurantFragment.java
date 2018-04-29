package dev.prateek.com.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.objects_list, container, false);

        // Create an ArrayList and add newly created LocationObjects
        ArrayList<LocationObject> objects = new ArrayList<>();
        objects.add(new LocationObject(R.string.cafe_1999, R.string.address_cafe_1999));
        objects.add(new LocationObject(R.string.butcher_boys, R.string.address_butcher_boys));
        objects.add(new LocationObject(R.string.grill_jichana, R.string.address_grill_jichana));
        objects.add(new LocationObject(R.string.mali, R.string.address_mali));
        objects.add(new LocationObject(R.string.quo_restaurant, R.string.address_quo_restaurant));
        objects.add(new LocationObject(R.string.avenue_bistro, R.string.address_avenue_bistro));
        objects.add(new LocationObject(R.string.little_india, R.string.address_little_india));
        objects.add(new LocationObject(R.string.joops_place, R.string.address_joops_place));
        objects.add(new LocationObject(R.string.surf_riders, R.string.address_surf_riders));
        objects.add(new LocationObject(R.string.afro, R.string.address_afro));
        objects.add(new LocationObject(R.string.jack_salmon, R.string.address_jack_salmon));
        objects.add(new LocationObject(R.string.olive_oil, R.string.address_olive_oil));
        objects.add(new LocationObject(R.string.mooki_noodle_bar, R.string.address_mooki_noodle_bar));
        objects.add(new LocationObject(R.string.lupa_osteria, R.string.address_lupa_osteria));
        objects.add(new LocationObject(R.string.big_easy, R.string.address_big_easy));
        objects.add(new LocationObject(R.string.havana_grill, R.string.address_havana_grill));
        objects.add(new LocationObject(R.string.unity, R.string.address_unity));
        objects.add(new LocationObject(R.string.mozambik, R.string.address_mozambik));

        // Create an ObjectAdapter, with the foregoing ArrayList as data source. Connect adapter with listView
        ObjectAdapter adapter = new ObjectAdapter(getActivity(), objects);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
