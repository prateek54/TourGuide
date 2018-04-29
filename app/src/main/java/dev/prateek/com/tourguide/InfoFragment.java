package dev.prateek.com.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class InfoFragment extends Fragment {

    public InfoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        // Use same layout as other fragments, but without ListView, requires some adaptations
        LinearLayout background = rootView.findViewById(R.id.background);
        background.setBackgroundColor(getResources().getColor(R.color.white));

        ImageView imageView = rootView.findViewById(R.id.image_view);
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(R.drawable.maps);

        TextView nameTextView = rootView.findViewById(R.id.name_text_view);
        nameTextView.setVisibility(View.GONE);

        TextView infoTextView = rootView.findViewById(R.id.durban_text_view);
        infoTextView.setText(R.string.info_text);

        ScrollView scrollView = rootView.findViewById(R.id.scroll_view);
        scrollView.setVisibility(View.VISIBLE);

        return rootView;
    }

}
