package temperature.android.csulb.edu.temperatureconvertor;

/**
 * Created by prernaa on 2/10/2017.
 */

public class ConverterUtil {
    public static float convertFahrenheitToCelsius (float fahrenheit){
        return ((fahrenheit - 32) * 5 / 9);
    }
    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }
}
