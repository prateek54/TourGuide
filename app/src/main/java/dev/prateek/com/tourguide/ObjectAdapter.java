package dev.prateek.com.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ObjectAdapter extends ArrayAdapter<LocationObject> {

    // Create the ObjectAdapter constructor
    public ObjectAdapter(Context context, ArrayList<LocationObject> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Create a LocationObject and call its methods to assign proper values to views in the layout
        LocationObject currentObject = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        assert currentObject != null;
        nameTextView.setText(currentObject.getObjectNameId());

        TextView infoTextView = listItemView.findViewById(R.id.info_text_view);
        infoTextView.setText(currentObject.getObjectInfoId());

        ImageView imageView = listItemView.findViewById(R.id.image_view);
        imageView.setImageResource(currentObject.getObjectPhotoId());
        if (currentObject.getObjectPhotoId() != 0) {
            imageView.setVisibility(View.VISIBLE);
        }

        return listItemView;
    }
}
