package by.it.trudnitski.traineeapplication;


import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BlankFragment extends Fragment {

    private TextView textView;
    private EditText editText;

    public BlankFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_blank, null);
        editText = (EditText) v.findViewById(R.id.someText);
        textView = (TextView) v.findViewById(R.id.watch_someText);
        textView.setVisibility(View.GONE);
        editText.addTextChangedListener(textWatch);

        return v;
    }

    private TextWatcher textWatch = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            textView.setVisibility(View.VISIBLE);
        }

        @Override
        public void afterTextChanged(Editable s) {
            if (s.length()==0){
                textView.setVisibility(View.GONE);
            } else {
                textView.setText(editText.getText());
                Toast.makeText(getActivity(), editText.getText(), Toast.LENGTH_SHORT).show();
            }
        }
    };

}
