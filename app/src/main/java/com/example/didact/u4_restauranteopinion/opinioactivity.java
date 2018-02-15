package com.example.didact.u4_restauranteopinion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class opinioactivity extends AppCompatActivity {

    TextView tvnombrerestaurantesegundaactivity,tvvaloracionsegundaactivity,tvopinionsegundaactivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opinioactivity);



        tvnombrerestaurantesegundaactivity=(TextView)findViewById(R.id.tvnombrerestaurantesegundaactivity);
        tvvaloracionsegundaactivity=(TextView)findViewById(R.id.tvvaloracionsegundaactivity);
        tvopinionsegundaactivity=(TextView)findViewById(R.id.tvopinionsegundaactivity);

        Bundle b=getIntent().getExtras();
        if(b!=null){

            String nombre=b.getString ("nombre");
            String opinion=b.getString ("opinion");
            String valoracion=b.getString ("valoracion");

            tvnombrerestaurantesegundaactivity.setText("Has elegido "+nombre);
            tvopinionsegundaactivity.setText("Tu opinión es: "+opinion);
            tvvaloracionsegundaactivity.setText("Tu valoracion es: "+valoracion);






        }







    }
}
