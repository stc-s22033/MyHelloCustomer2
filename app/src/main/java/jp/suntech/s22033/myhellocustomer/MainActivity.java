package jp.suntech.s22033.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btHyo =findViewById(R.id.btHyouji);
        Button btSuCl=findViewById(R.id.btSumaiClear);
        Button btNaCl=findViewById(R.id.btNameClear);

        btHyo.setOnClickListener(new HyoButtonClickListener());
        btSuCl.setOnClickListener(new SuButtonClickListener());
        btNaCl.setOnClickListener(new NaButtonClickListener());

    }
    private class HyoButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText name=findViewById(R.id.etName);
            EditText sumai=findViewById(R.id.etSumai);

            String Name=name.getText().toString();
            String Sumai=sumai.getText().toString();
            Toast.makeText(v.getContext(),Sumai+"にお住いの"+Name+"さん、こんにちは！",Toast.LENGTH_LONG).show();
        }
    }
    private class SuButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText sumai=findViewById(R.id.etSumai);
            sumai.setText("");
        }
    }
    private class NaButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText name=findViewById(R.id.etName);
            name.setText("");
        }
    }
}