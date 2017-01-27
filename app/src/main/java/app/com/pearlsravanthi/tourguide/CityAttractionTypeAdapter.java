package app.com.pearlsravanthi.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

/**
 * Created by sravanthi on 27/1/17.
 */
public class CityAttractionTypeAdapter extends FragmentPagerAdapter {
    private String[] mTabTitles = new String[] { "Parks", "Museums", "Restaurants", "Bars / Clubs"};

    public CityAttractionTypeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0) {
            return new ParksFragment();
        } else if (position == 1) {
            return new MuseumsFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        }  else {
            return new BarsClubsFragment();
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles[position];
    }
}
