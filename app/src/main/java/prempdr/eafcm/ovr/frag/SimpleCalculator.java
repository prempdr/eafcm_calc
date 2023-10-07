package prempdr.eafcm.ovr.frag;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

import prempdr.eafcm.ovr.R;

public class SimpleCalculator extends Fragment {

    TextView om_ovr;

    EditText player1_input_base, player2_input_base, player3_input_base, player4_input_base, player5_input_base, player6_input_base, player7_input_base, player8_input_base, player9_input_base, player10_input_base, player11_input_base;
    String p1_b, p2_b, p3_b, p4_b, p5_b, p6_b, p7_b, p8_b, p9_b, p10_b, p11_b;

    EditText sub_count, rank_count;
    String s_c, r_c;

    EditText sub1_input_base, sub2_input_base, sub3_input_base, sub4_input_base, sub5_input_base, sub6_input_base, sub7_input_base;
    String s1_b, s2_b, s3_b, s4_b, s5_b, s6_b, s7_b;

    MaterialCardView btn_sub;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_simple_calculator, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        AppBarLayout appBarLayout = getView().findViewById(R.id.appBarlayout);
        appBarLayout.setExpanded(false);

        btn_sub = getView().findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(v -> btn_sub());
    }

    @Override
    public void onPause() {
        super.onPause();

        AppBarLayout appBarLayout = getView().findViewById(R.id.appBarlayout);
        appBarLayout.setExpanded(false);
    }

    public void player_data() {
        player1_input_base = getView().findViewById(R.id.player1_input_base);
        player2_input_base = getView().findViewById(R.id.player2_input_base);
        player3_input_base = getView().findViewById(R.id.player3_input_base);
        player4_input_base = getView().findViewById(R.id.player4_input_base);
        player5_input_base = getView().findViewById(R.id.player5_input_base);
        player6_input_base = getView().findViewById(R.id.player6_input_base);
        player7_input_base = getView().findViewById(R.id.player7_input_base);
        player8_input_base = getView().findViewById(R.id.player8_input_base);
        player9_input_base = getView().findViewById(R.id.player9_input_base);
        player10_input_base = getView().findViewById(R.id.player10_input_base);
        player11_input_base = getView().findViewById(R.id.player11_input_base);

        p1_b = player1_input_base.getText().toString();
        p2_b = player2_input_base.getText().toString();
        p3_b = player3_input_base.getText().toString();
        p4_b = player4_input_base.getText().toString();
        p5_b = player5_input_base.getText().toString();
        p6_b = player6_input_base.getText().toString();
        p7_b = player7_input_base.getText().toString();
        p8_b = player8_input_base.getText().toString();
        p9_b = player9_input_base.getText().toString();
        p10_b = player10_input_base.getText().toString();
        p11_b = player11_input_base.getText().toString();

        sub_count = getView().findViewById(R.id.sub_count);
        s_c = sub_count.getText().toString();

        sub1_input_base = getView().findViewById(R.id.sub1_input_base);
        sub2_input_base = getView().findViewById(R.id.sub2_input_base);
        sub3_input_base = getView().findViewById(R.id.sub3_input_base);
        sub4_input_base = getView().findViewById(R.id.sub4_input_base);
        sub5_input_base = getView().findViewById(R.id.sub5_input_base);
        sub6_input_base = getView().findViewById(R.id.sub6_input_base);
        sub7_input_base = getView().findViewById(R.id.sub7_input_base);

        s1_b = sub1_input_base.getText().toString();
        s2_b = sub2_input_base.getText().toString();
        s3_b = sub3_input_base.getText().toString();
        s4_b = sub4_input_base.getText().toString();
        s5_b = sub5_input_base.getText().toString();
        s6_b = sub6_input_base.getText().toString();
        s7_b = sub7_input_base.getText().toString();

        rank_count = getView().findViewById(R.id.rank_count);
        r_c = rank_count.getText().toString();

        om_ovr = getView().findViewById(R.id.om_ovr);
    }

    public void btn_sub() {
        player_data();

        if (TextUtils.isEmpty(p1_b) || TextUtils.isEmpty(p2_b) || TextUtils.isEmpty(p3_b) || TextUtils.isEmpty(p4_b) || TextUtils.isEmpty(p5_b) || TextUtils.isEmpty(p6_b) || TextUtils.isEmpty(p7_b) || TextUtils.isEmpty(p8_b) || TextUtils.isEmpty(p9_b) || TextUtils.isEmpty(p10_b) || TextUtils.isEmpty(p11_b)) {
            Snackbar snackbar = Snackbar.make(getActivity().findViewById(android.R.id.content), "First Team Info Error", Snackbar.LENGTH_SHORT);
            snackbar.show();
        } else if (TextUtils.isEmpty(s_c)) {
            Snackbar snackbar = Snackbar.make(getActivity().findViewById(android.R.id.content), "Input Total Sub Player Count", Snackbar.LENGTH_SHORT);
            snackbar.show();
        } else if (TextUtils.isEmpty(r_c)) {
            Snackbar snackbar = Snackbar.make(getActivity().findViewById(android.R.id.content), "Input Total Ranked Player Count", Snackbar.LENGTH_SHORT);
            snackbar.show();
        } else {
            int p1_base = Integer.parseInt(p1_b);
            int p2_base = Integer.parseInt(p2_b);
            int p3_base = Integer.parseInt(p3_b);
            int p4_base = Integer.parseInt(p4_b);
            int p5_base = Integer.parseInt(p5_b);
            int p6_base = Integer.parseInt(p6_b);
            int p7_base = Integer.parseInt(p7_b);
            int p8_base = Integer.parseInt(p8_b);
            int p9_base = Integer.parseInt(p9_b);
            int p10_base = Integer.parseInt(p10_b);
            int p11_base = Integer.parseInt(p11_b);

            int total_base = p1_base + p2_base + p3_base + p4_base + p5_base + p6_base + p7_base + p8_base + p9_base + p10_base + p11_base;

            int sub_c = Integer.parseInt(s_c);
            int rank_c = Integer.parseInt(r_c);

            if (TextUtils.isEmpty(s1_b)) {
                s1_b = "0";
            }
            if (TextUtils.isEmpty(s2_b)) {
                s2_b = "0";
            }
            if (TextUtils.isEmpty(s3_b)) {
                s3_b = "0";
            }
            if (TextUtils.isEmpty(s4_b)) {
                s4_b = "0";
            }
            if (TextUtils.isEmpty(s5_b)) {
                s5_b = "0";
            }
            if (TextUtils.isEmpty(s6_b)) {
                s6_b = "0";
            }
            if (TextUtils.isEmpty(s7_b)) {
                s7_b = "0";
            }

            int s1_base = Integer.parseInt(s1_b);
            int s2_base = Integer.parseInt(s2_b);
            int s3_base = Integer.parseInt(s3_b);
            int s4_base = Integer.parseInt(s4_b);
            int s5_base = Integer.parseInt(s5_b);
            int s6_base = Integer.parseInt(s6_b);
            int s7_base = Integer.parseInt(s7_b);

            int s_total_base = 0;

            switch (s_c) {
                case "1":
                    s_total_base = s1_base;
                    break;
                case "2":
                    s_total_base = s1_base + s2_base;
                    break;
                case "3":
                    s_total_base = s1_base + s2_base + s3_base;
                    break;
                case "4":
                    s_total_base = s1_base + s2_base + s3_base + s4_base;
                    break;
                case "5":
                    s_total_base = s1_base + s2_base + s3_base + s4_base + s5_base;
                    break;
                case "6":
                    s_total_base = s1_base + s2_base + s3_base + s4_base + s5_base + s6_base;
                    break;
                case "7":
                    s_total_base = s1_base + s2_base + s3_base + s4_base + s5_base + s6_base + s7_base;
                    break;
            }

            int s_round_base = (total_base + s_total_base);
            int s_final_base = (int) Math.ceil(s_round_base / (sub_c + 11.0));
            int total_rank = (int) Math.ceil(rank_c / (sub_c + 11.0));

            int s_final_ovr = (s_final_base + total_rank);
            om_ovr.setText(String.valueOf(s_final_ovr));

            AppBarLayout appBarLayout = getView().findViewById(R.id.appBarlayout);
            appBarLayout.setExpanded(true);
        }
    }

}