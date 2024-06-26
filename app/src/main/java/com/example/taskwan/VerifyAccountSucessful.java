package com.example.taskwan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VerifyAccountSucessful#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VerifyAccountSucessful extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VerifyAccountSucessful() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VerifyAccountSucessful.
     */
    // TODO: Rename and change types and number of parameters
    public static VerifyAccountSucessful newInstance(String param1, String param2) {
        VerifyAccountSucessful fragment = new VerifyAccountSucessful();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View verifyAccountSucessFul = inflater.inflate(R.layout.fragment_verify_account_sucessful, container, false);
        TextView goBackToDashboardBtn = (TextView) verifyAccountSucessFul.findViewById(R.id.go_to_dashboard_btn);
        if (goBackToDashboardBtn != null) {
            goBackToDashboardBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getParentFragmentManager()
                            .beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragment_container_view, LoginForm.class, null)
                            .commit();
                }
            });
        }

        return verifyAccountSucessFul;
    }
}