package singh.anmol.uiviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ImageButton imageButton;
    private CheckBox checkBox;
    private RadioGroup radioGroup;
    private  RadioButton radioButton1, radioButton2;
    private Switch aSwitch;
    private ToggleButton toggleButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button2);
        imageButton = findViewById(R.id.imageButton3);
        checkBox = findViewById(R.id.checkBox3);
        radioGroup = findViewById(R.id.radiogroup);
        radioButton1 = findViewById(R.id.radioButton14);
        radioButton2 = findViewById(R.id.radioButton15);
        aSwitch = findViewById(R.id.switch3);
        toggleButton = findViewById(R.id.toggleButton5);
    }
}
