package asiainfo.com.ainetxpert.home;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;

import asiainfo.com.ainetxpert.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    @BindView(R.id.banner)
    Banner banner;

    public HomeFragment() {
        // Required empty public constructor
    }

    private ArrayList<Integer> localImages = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, view);

        setBannerView();

        return view;
    }

    private void setBannerView() {
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
        banner.setIndicatorGravity(BannerConfig.RIGHT);
        banner.setDelayTime(3000);
        banner.setOnBannerClickListener(new Banner.OnBannerClickListener() {
            @Override
            public void OnBannerClick(View view, int position) {
                Toast.makeText(HomeFragment.this.getActivity(), "not touch me!", Toast.LENGTH_SHORT).show();
            }
        });

        String[] images = getActivity().getResources().getStringArray(R.array.url);
        banner.setImages(images);
    }

}
