package kw.com.ridewithme;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class QR_Generator extends AppCompatActivity {

    EditText amount;
    Button gen_btn;
    ImageView QR_Code;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr__generator);
        amount = (EditText)findViewById(R.id.amount);
        gen_btn = (Button)findViewById(R.id.gen_btn);
        QR_Code = (ImageView)findViewById(R.id.QR_Code);

        gen_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                try{
                    BitMatrix bitMatrix = multiFormatWriter.encode(amount.getText().toString().trim(), BarcodeFormat.QR_CODE,200,200);
                    BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                    Bitmap bitmap = barcodeEncoder.createBitmap(bitMatrix);
                    QR_Code.setImageBitmap(bitmap);
                }
                catch (WriterException e)
                {
                   e.printStackTrace();
                }
            }
        });


    }
}
