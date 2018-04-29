package dev.prateek.com.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NatureFragment extends Fragment {

    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.objects_list, container, false);

        // Create an ArrayList and add newly created LocationObjects
        ArrayList<LocationObject> objects = new ArrayList<>();
        objects.add(new LocationObject(R.string.botanic_gardens, R.string.botanic_gardens_info));
        objects.add(new LocationObject(R.string.mitchel_jameson, R.string.mitchel_jameson_info));
        objects.add(new LocationObject(R.string.krantzkloof, R.string.krantzkloof_info));
        objects.add(new LocationObject(R.string.palmiet, R.string.palmiet_info));
        objects.add(new LocationObject(R.string.hawaan_forest, R.string.hawaan_forest_info));
        objects.add(new LocationObject(R.string.new_germany, R.string.new_germany_info));
        objects.add(new LocationObject(R.string.pigeon_valley, R.string.pigeon_valley_info));
        objects.add(new LocationObject(R.string.bird_park, R.string.bird_park_info));
        objects.add(new LocationObject(R.string.umhlanga_reserve, R.string.umhlanga_reserve_info));
        objects.add(new LocationObject(R.string.burman_bush, R.string.burman_bush_info));

        // Create an ObjectAdapter, with the foregoing ArrayList as data source. Connect adapter with listView
        ObjectAdapter adapter = new ObjectAdapter(getActivity(), objects);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
