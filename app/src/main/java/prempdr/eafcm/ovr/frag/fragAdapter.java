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
            case 0:
                return new SimpleCalculator();
            default:
            case 1:
                return new Calculator();
            case 2:
                return new Menu();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
