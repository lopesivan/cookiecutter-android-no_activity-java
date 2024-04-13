package {{ cookiecutter.package_name }};

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class {{ cookiecutter.main_activity }} extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Define o layout da UI para activity_main.xml
        setContentView(R.layout.activity_main);
    }
}
