package app.com.pearlsravanthi.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by sravanthi on 27/1/17.
 */
public class ParksFragment extends Fragment {
    public ParksFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions, container, false);

        ArrayList<CityAttraction> cityAttractionsList = new ArrayList<CityAttraction>();
        cityAttractionsList.add(new CityAttraction(getString(R.string.park_1), getString(R.string.park_1_address)));
        cityAttractionsList.add(new CityAttraction(getString(R.string.park_2), getString(R.string.park_2_address)));
        cityAttractionsList.add(new CityAttraction(getString(R.string.park_3), getString(R.string.park_3_address)));
        cityAttractionsList.add(new CityAttraction(getString(R.string.park_4), getString(R.string.park_4_address)));
        cityAttractionsList.add(new CityAttraction(getString(R.string.park_5), getString(R.string.park_5_address)));
        cityAttractionsList.add(new CityAttraction(getString(R.string.park_6), getString(R.string.park_6_address)));
        cityAttractionsList.add(new CityAttraction(getString(R.string.park_7), getString(R.string.park_7_address)));

        CityAttractionAdapter itemsAdapter = new CityAttractionAdapter(getContext(), cityAttractionsList);

        ListView listView = (ListView) rootView.findViewById(R.id.attractions_list_view);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
