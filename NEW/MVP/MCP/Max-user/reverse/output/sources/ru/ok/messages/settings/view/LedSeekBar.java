package ru.ok.messages.settings.view;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.SeekBar;
import defpackage.hvd;
import defpackage.q6;
import defpackage.rw4;
import defpackage.so;
import defpackage.t1b;
import defpackage.y18;
import defpackage.zm;

/* loaded from: classes2.dex */
public class LedSeekBar extends so implements SeekBar.OnSeekBarChangeListener {
    public final int b;
    public final int[] c;
    public final ShapeDrawable d;

    public LedSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = ((t1b) zm.a()).j().c.l();
        getContext();
        rw4 rw4VarA = rw4.a();
        int i = rw4VarA.l;
        this.b = rw4VarA.b;
        int dimension = (int) getResources().getDimension(hvd.d);
        setPadding(dimension, 0, dimension, 0);
        setProgressDrawable(new q6(this));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.d = shapeDrawable;
        shapeDrawable.setBounds(0, 0, i, i);
        this.d.setIntrinsicHeight(i);
        this.d.setIntrinsicWidth(i);
        setThumb(this.d);
        setThumbOffset(i / 2);
        setOnSeekBarChangeListener(this);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int[] iArr = this.c;
        int length = (int) ((iArr.length / getMax()) * i);
        if (length > iArr.length - 1) {
            length = iArr.length - 1;
        }
        this.d.getPaint().setColor(this.c[length]);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        int progress = getProgress();
        int[] iArr = this.c;
        int length = (int) ((iArr.length / getMax()) * progress);
        if (length > iArr.length - 1) {
            length = iArr.length - 1;
        }
        float max = getMax() / this.c.length;
        setProgress((int) ((max / 2.0f) + (length * max)));
    }

    public void setColor(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i3 >= iArr.length) {
                break;
            }
            if (i == iArr[i3]) {
                i2 = i3;
                break;
            }
            i3++;
        }
        float max = getMax() / this.c.length;
        setProgress((int) ((max / 2.0f) + (i2 * max)));
    }

    public void setListener(y18 y18Var) {
    }
}
