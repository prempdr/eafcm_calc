package prempdr.eafcm.ovr.frag;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.Snackbar;

import de.hdodenhof.circleimageview.CircleImageView;
import prempdr.eafcm.ovr.R;

public class Menu extends Fragment {

    CircleImageView fb, twitter, linkedin, github;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        fb = getView().findViewById(R.id.link_fb);
        twitter = getView().findViewById(R.id.link_twitter);
        linkedin = getView().findViewById(R.id.link_linkedin);
        github = getView().findViewById(R.id.link_github);

        fb.setOnClickListener(v -> {
            if (isNetworkStatusAvialable(getActivity().getApplication())) {
                Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                String facebookUrl = getFacebookPageURL(getActivity());
                facebookIntent.setData(Uri.parse(facebookUrl));
                startActivity(facebookIntent);
            } else {
                Snackbar snackbar = Snackbar.make(getActivity().findViewById(android.R.id.content), "No Internet!", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });

        twitter.setOnClickListener(v -> {
            if (isNetworkStatusAvialable(getActivity().getApplication())) {
                Uri uri = Uri.parse("http://www.twitter.com/prempdr");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            } else {
                Snackbar snackbar = Snackbar.make(getActivity().findViewById(android.R.id.content), "No Internet!", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });

        linkedin.setOnClickListener(v -> {
            if (isNetworkStatusAvialable(getActivity().getApplication())) {
                Uri uri = Uri.parse("http://www.linkedin.com/in/prempdr");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            } else {
                Snackbar snackbar = Snackbar.make(getActivity().findViewById(android.R.id.content), "No Internet!", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });

        github.setOnClickListener(v -> {
            if (isNetworkStatusAvialable(getActivity().getApplication())) {
                Uri uri = Uri.parse("http://www.github.com/prempdr");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            } else {
                Snackbar snackbar = Snackbar.make(getActivity().findViewById(android.R.id.content), "No Internet!", Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
        });
    }

    private Boolean isNetworkStatusAvialable(Application application) {
        ConnectivityManager connectivityManager = (ConnectivityManager) application.getSystemService(Context.CONNECTIVITY_SERVICE);
        Network nw = connectivityManager.getActiveNetwork();
        if (nw == null) return false;
        NetworkCapabilities actNw = connectivityManager.getNetworkCapabilities(nw);
        return actNw != null && (actNw.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) || actNw.hasTransport(NetworkCapabilities.TRANSPORT_BLUETOOTH));
    }

    public String getFacebookPageURL(Context context) {
        String FACEBOOK_URL = "https://www.facebook.com/prempdr";
        String FACEBOOK_PAGE_ID = "100072611716171";

        PackageManager packageManager = context.getPackageManager();
        try {
            int versionCode = packageManager.getPackageInfo("com.facebook.katana", 0).versionCode;
            if (versionCode >= 3002850) { //newer versions of fb app
                return "fb://facewebmodal/f?href=" + FACEBOOK_URL;
            } else { //older versions of fb app
                return "fb://page/" + FACEBOOK_PAGE_ID;
            }
        } catch (PackageManager.NameNotFoundException e) {
            return FACEBOOK_URL; //normal web url
        }
    }
}