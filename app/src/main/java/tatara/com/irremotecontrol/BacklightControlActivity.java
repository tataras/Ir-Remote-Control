package tatara.com.irremotecontrol;

import android.content.Context;
import android.hardware.ConsumerIrManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class BacklightControlActivity extends AppCompatActivity {

    ConsumerIrManager mCIR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backlight_control);

        mCIR = (ConsumerIrManager) getSystemService(Context.CONSUMER_IR_SERVICE);
    }

    public void switchOn(View view) {
        mCIR.transmit(38400, IrPattern.ON);
    }

    public void switchOff(View view) {
        mCIR.transmit(38400, IrPattern.OFF);
    }

    public void brighter(View view) {
        mCIR.transmit(38400, IrPattern.BRIGHTER);
    }

    public void darker(View view) {
        mCIR.transmit(38400, IrPattern.DARKER);
    }

    public void setColorRed(View view) {
        mCIR.transmit(38400, IrPattern.RED);
    }

    public void setColorGreen(View view) {
        mCIR.transmit(38400, IrPattern.GREEN);
    }

    public void setColorBlue(View view) {
        mCIR.transmit(38400, IrPattern.BLUE);
    }

    public void setColorWhite(View view) {
        mCIR.transmit(38400, IrPattern.WHITE);
    }

    public void setColorRed1(View view) {
        mCIR.transmit(38400, IrPattern.RED_1);
    }

    public void setColorRed2(View view) {
        mCIR.transmit(38400, IrPattern.RED_2);
    }

    public void setColorRed3(View view) {
        mCIR.transmit(38400, IrPattern.RED_3);
    }

    public void setColorRed4(View view) {
        mCIR.transmit(38400, IrPattern.RED_4);
    }

    public void setColorGreen1(View view) {
        mCIR.transmit(38400, IrPattern.GREEN_1);
    }

    public void setColorGreen2(View view) {
        mCIR.transmit(38400, IrPattern.GREEN_2);
    }

    public void setColorGreen3(View view) {
        mCIR.transmit(38400, IrPattern.GREEN_3);
    }

    public void setColorGreen4(View view) {
        mCIR.transmit(38400, IrPattern.GREEN_4);
    }

    public void setColorBlue1(View view) {
        mCIR.transmit(38400, IrPattern.BLUE_1);
    }

    public void setColorBlue2(View view) {
        mCIR.transmit(38400, IrPattern.BLUE_2);
    }

    public void setColorBlue3(View view) {
        mCIR.transmit(38400, IrPattern.BLUE_3);
    }

    public void setColorBlue4(View view) {
        mCIR.transmit(38400, IrPattern.BLUE_4);
    }

    public void flash(View view) {
        mCIR.transmit(38400, IrPattern.FLASH);
    }

    public void strobe(View view) {
        mCIR.transmit(38400, IrPattern.STROBE);
    }

    public void fade(View view) {
        mCIR.transmit(38400, IrPattern.FADE);
    }

    public void smooth(View view) {
        mCIR.transmit(38400, IrPattern.SMOOTH);
    }
}
