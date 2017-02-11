package temperature.android.csulb.edu.temperatureconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView temperature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temperature = (TextView) findViewById(R.id.editText);
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button:
                RadioButton celsiusButton = (RadioButton) findViewById(R.id.radioButton1);
                RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radioButton2);
                if (temperature.getText().length()==0){
                    Toast.makeText(this, "Please enter a valid number",Toast.LENGTH_LONG).show();
                    return;
                }
                float inputValue = Float.parseFloat(temperature.getText().toString());
                if (celsiusButton.isChecked()) {
                    temperature.setText(String.valueOf(ConverterUtil.convertFahrenheitToCelsius(inputValue)));
                    celsiusButton.setChecked(false);
                    fahrenheitButton.setChecked(true);       }
                else {         temperature.setText(String.valueOf(ConverterUtil.convertCelsiusToFahrenheit(inputValue)));
                    fahrenheitButton.setChecked(false);
                    celsiusButton.setChecked(true);       }
                break;
        }
    }
}
