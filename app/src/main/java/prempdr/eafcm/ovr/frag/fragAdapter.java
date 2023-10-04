package prempdr.eafcm.ovr.frag;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class fragAdapter extends FragmentStateAdapter {
    public fragAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new Menu();
            case 0:
            default:
                return new Calculator();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
