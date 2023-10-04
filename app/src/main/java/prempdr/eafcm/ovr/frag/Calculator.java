package prempdr.eafcm.ovr.frag;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

import prempdr.eafcm.ovr.R;

public class Calculator extends Fragment {

    TextView om_ovr, txt_needed_base_with_sub, txt_needed_rank_with_sub;

    EditText player1_input_base, player2_input_base, player3_input_base, player4_input_base, player5_input_base, player6_input_base, player7_input_base, player8_input_base, player9_input_base, player10_input_base, player11_input_base;
    String p1_b, p2_b, p3_b, p4_b, p5_b, p6_b, p7_b, p8_b, p9_b, p10_b, p11_b;

    EditText player1_input_rank, player2_input_rank, player3_input_rank, player4_input_rank, player5_input_rank, player6_input_rank, player7_input_rank, player8_input_rank, player9_input_rank, player10_input_rank, player11_input_rank;
    String p1_r, p2_r, p3_r, p4_r, p5_r, p6_r, p7_r, p8_r, p9_r, p10_r, p11_r;

    EditText sub_count;
    String s_c;

    EditText sub1_input_base, sub2_input_base, sub3_input_base, sub4_input_base, sub5_input_base, sub6_input_base, sub7_input_base;
    String s1_b, s2_b, s3_b, s4_b, s5_b, s6_b, s7_b;

    EditText sub1_input_rank, sub2_input_rank, sub3_input_rank, sub4_input_rank, sub5_input_rank, sub6_input_rank, sub7_input_rank;
    String s1_r, s2_r, s3_r, s4_r, s5_r, s6_r, s7_r;

    MaterialCardView btn_sub;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calculator, container, false);
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

        player1_input_rank = getView().findViewById(R.id.player1_input_rank);
        player2_input_rank = getView().findViewById(R.id.player2_input_rank);
        player3_input_rank = getView().findViewById(R.id.player3_input_rank);
        player4_input_rank = getView().findViewById(R.id.player4_input_rank);
        player5_input_rank = getView().findViewById(R.id.player5_input_rank);
        player6_input_rank = getView().findViewById(R.id.player6_input_rank);
        player7_input_rank = getView().findViewById(R.id.player7_input_rank);
        player8_input_rank = getView().findViewById(R.id.player8_input_rank);
        player9_input_rank = getView().findViewById(R.id.player9_input_rank);
        player10_input_rank = getView().findViewById(R.id.player10_input_rank);
        player11_input_rank = getView().findViewById(R.id.player11_input_rank);

        p1_r = player1_input_rank.getText().toString();
        p2_r = player2_input_rank.getText().toString();
        p3_r = player3_input_rank.getText().toString();
        p4_r = player4_input_rank.getText().toString();
        p5_r = player5_input_rank.getText().toString();
        p6_r = player6_input_rank.getText().toString();
        p7_r = player7_input_rank.getText().toString();
        p8_r = player8_input_rank.getText().toString();
        p9_r = player9_input_rank.getText().toString();
        p10_r = player10_input_rank.getText().toString();
        p11_r = player11_input_rank.getText().toString();

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

        sub1_input_rank = getView().findViewById(R.id.sub1_input_rank);
        sub2_input_rank = getView().findViewById(R.id.sub2_input_rank);
        sub3_input_rank = getView().findViewById(R.id.sub3_input_rank);
        sub4_input_rank = getView().findViewById(R.id.sub4_input_rank);
        sub5_input_rank = getView().findViewById(R.id.sub5_input_rank);
        sub6_input_rank = getView().findViewById(R.id.sub6_input_rank);
        sub7_input_rank = getView().findViewById(R.id.sub7_input_rank);

        s1_r = sub1_input_rank.getText().toString();
        s2_r = sub2_input_rank.getText().toString();
        s3_r = sub3_input_rank.getText().toString();
        s4_r = sub4_input_rank.getText().toString();
        s5_r = sub5_input_rank.getText().toString();
        s6_r = sub6_input_rank.getText().toString();
        s7_r = sub7_input_rank.getText().toString();

        txt_needed_base_with_sub = getView().findViewById(R.id.txt_needed_base_with_sub);
        txt_needed_rank_with_sub = getView().findViewById(R.id.txt_needed_rank_with_sub);
        om_ovr = getView().findViewById(R.id.om_ovr);
    }

    public void btn_sub() {
        player_data();

        if (TextUtils.isEmpty(p1_b) || TextUtils.isEmpty(p2_b) || TextUtils.isEmpty(p3_b) || TextUtils.isEmpty(p4_b) || TextUtils.isEmpty(p5_b) || TextUtils.isEmpty(p6_b) || TextUtils.isEmpty(p7_b) || TextUtils.isEmpty(p8_b) || TextUtils.isEmpty(p9_b) || TextUtils.isEmpty(p10_b) || TextUtils.isEmpty(p11_b) || TextUtils.isEmpty(p1_r) || TextUtils.isEmpty(p2_r) || TextUtils.isEmpty(p3_r) || TextUtils.isEmpty(p4_r) || TextUtils.isEmpty(p5_r) || TextUtils.isEmpty(p6_r) || TextUtils.isEmpty(p7_r) || TextUtils.isEmpty(p8_r) || TextUtils.isEmpty(p9_r) || TextUtils.isEmpty(p10_r) || TextUtils.isEmpty(p11_r)) {
            Snackbar snackbar = Snackbar.make(getActivity().findViewById(android.R.id.content), "First Team Info Error", Snackbar.LENGTH_SHORT);
            snackbar.show();
        } else if (TextUtils.isEmpty(s_c)) {
            Snackbar snackbar = Snackbar.make(getActivity().findViewById(android.R.id.content), "Input Total Sub Players Count", Snackbar.LENGTH_SHORT);
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

            int p1_rank = Integer.parseInt(p1_r);
            int p2_rank = Integer.parseInt(p2_r);
            int p3_rank = Integer.parseInt(p3_r);
            int p4_rank = Integer.parseInt(p4_r);
            int p5_rank = Integer.parseInt(p5_r);
            int p6_rank = Integer.parseInt(p6_r);
            int p7_rank = Integer.parseInt(p7_r);
            int p8_rank = Integer.parseInt(p8_r);
            int p9_rank = Integer.parseInt(p9_r);
            int p10_rank = Integer.parseInt(p10_r);
            int p11_rank = Integer.parseInt(p11_r);

            int total_base = p1_base + p2_base + p3_base + p4_base + p5_base + p6_base + p7_base + p8_base + p9_base + p10_base + p11_base;
            double real_avg_base = (total_base / 11.0);
            int avg_base = (int) Math.ceil(real_avg_base);

            int total_rank = p1_rank + p2_rank + p3_rank + p4_rank + p5_rank + p6_rank + p7_rank + p8_rank + p9_rank + p10_rank + p11_rank;
            double real_avg_rank = (total_rank / 11.0);
            int avg_rank = (int) Math.ceil(real_avg_rank);

            int sub_c = Integer.parseInt(s_c);

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
            if (TextUtils.isEmpty(s1_r)) {
                s1_r = "0";
            }
            if (TextUtils.isEmpty(s2_r)) {
                s2_r = "0";
            }
            if (TextUtils.isEmpty(s3_r)) {
                s3_r = "0";
            }
            if (TextUtils.isEmpty(s4_r)) {
                s4_r = "0";
            }
            if (TextUtils.isEmpty(s5_r)) {
                s5_r = "0";
            }
            if (TextUtils.isEmpty(s6_r)) {
                s6_r = "0";
            }
            if (TextUtils.isEmpty(s7_r)) {
                s7_r = "0";
            }

            int s1_base = Integer.parseInt(s1_b);
            int s2_base = Integer.parseInt(s2_b);
            int s3_base = Integer.parseInt(s3_b);
            int s4_base = Integer.parseInt(s4_b);
            int s5_base = Integer.parseInt(s5_b);
            int s6_base = Integer.parseInt(s6_b);
            int s7_base = Integer.parseInt(s7_b);

            int s1_rank = Integer.parseInt(s1_r);
            int s2_rank = Integer.parseInt(s2_r);
            int s3_rank = Integer.parseInt(s3_r);
            int s4_rank = Integer.parseInt(s4_r);
            int s5_rank = Integer.parseInt(s5_r);
            int s6_rank = Integer.parseInt(s6_r);
            int s7_rank = Integer.parseInt(s7_r);

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

            int s_round_base = (int) Math.ceil(total_base + s_total_base);
            int s_final_base = (int) Math.ceil(s_round_base / (sub_c + 11.0));

            int s_total_rank = 0;

            switch (s_c) {
                case "1":
                    s_total_rank = s1_rank;
                    break;
                case "2":
                    s_total_rank = s1_rank + s2_rank;
                    break;
                case "3":
                    s_total_rank = s1_rank + s2_rank + s3_rank;
                    break;
                case "4":
                    s_total_rank = s1_rank + s2_rank + s3_rank + s4_rank;
                    break;
                case "5":
                    s_total_rank = s1_rank + s2_rank + s3_rank + s4_rank + s5_rank;
                    break;
                case "6":
                    s_total_rank = s1_rank + s2_rank + s3_rank + s4_rank + s5_rank + s6_rank;
                    break;
                case "7":
                    s_total_rank = s1_rank + s2_rank + s3_rank + s4_rank + s5_rank + s6_rank + s7_rank;
                    break;
            }

            int s_round_rank = (int) Math.ceil(total_rank + s_total_rank);
            int s_final_rank = (int) Math.ceil(s_round_rank / (sub_c + 11.0));

            int s_final_ovr = s_final_base + s_final_rank;
            om_ovr.setText(String.valueOf(s_final_ovr));

            int s_need_base = (int) ((avg_base - real_avg_base) * (11 + sub_c) + 1);
            int s_need_rank = (int) ((avg_rank - real_avg_rank) * (11 + sub_c) + 1);

            txt_needed_base_with_sub.setText(String.valueOf(s_need_base));
            txt_needed_rank_with_sub.setText(String.valueOf(s_need_rank));

            AppBarLayout appBarLayout = getView().findViewById(R.id.appBarlayout);
            appBarLayout.setExpanded(true);
        }
    }

}