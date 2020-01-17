package by.it.trudnitski.traineeapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FragmentView extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_view);

        final EditText editText = (EditText) findViewById(R.id.someText);

        Button buttonShowToast = (Button) findViewById(R.id.show_toast);
        buttonShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FragmentView.this, editText.getText(), Toast.LENGTH_SHORT).show();
            }
        });


    }


}
