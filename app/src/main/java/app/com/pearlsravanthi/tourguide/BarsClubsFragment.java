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
public class BarsClubsFragment extends Fragment {
    public BarsClubsFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions, container, false);

        ArrayList<CityAttraction> cityAttractionsList = new ArrayList<CityAttraction>();
        cityAttractionsList.add(new CityAttraction(getString(R.string.bar_club_1), getString(R.string.bar_club_1_address)));
        cityAttractionsList.add(new CityAttraction(getString(R.string.bar_club_2), getString(R.string.bar_club_2_address)));
        cityAttractionsList.add(new CityAttraction(getString(R.string.bar_club_3), getString(R.string.bar_club_3_address)));
        cityAttractionsList.add(new CityAttraction(getString(R.string.bar_club_4), getString(R.string.bar_club_4_address)));

        CityAttractionAdapter itemsAdapter = new CityAttractionAdapter(getContext(), cityAttractionsList);

        ListView listView = (ListView) rootView.findViewById(R.id.attractions_list_view);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
