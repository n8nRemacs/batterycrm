package ru.ok.messages.settings.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import defpackage.bwf;
import defpackage.nca;
import defpackage.q00;
import defpackage.q1g;
import defpackage.rw4;
import defpackage.so;
import defpackage.uga;
import defpackage.zob;

/* loaded from: classes2.dex */
public class BrightnessSeekBar extends so {
    public static final /* synthetic */ int t0 = 0;
    public final rw4 b;
    public final int c;
    public final GradientDrawable d;
    public float o;
    public ValueAnimator s0;

    public BrightnessSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = -1.0f;
        getContext();
        rw4 rw4VarA = rw4.a();
        this.b = rw4VarA;
        this.c = rw4VarA.e;
        Context context2 = getContext();
        bwf bwfVar = q1g.a0;
        q1g q1gVarD = nca.d(context2);
        this.d = uga.d(Integer.valueOf(q1gVarD.m), Integer.valueOf(zob.b(q1gVarD.k, 0.5f)), Integer.valueOf(this.b.b));
    }

    @Override // defpackage.so, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.o != -1.0f && this.d != null) {
            int measuredWidth = (int) (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) * this.o);
            Rect bounds = getThumb().getBounds();
            GradientDrawable gradientDrawable = this.d;
            int i = measuredWidth - this.c;
            int iCenterY = bounds.centerY();
            int i2 = this.c;
            gradientDrawable.setBounds(i, iCenterY - i2, measuredWidth + i2, bounds.centerY() + this.c);
            int iSave = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            this.d.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    public void setBrightnessThumbProgress(float f) {
        ValueAnimator valueAnimator = this.s0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.s0.cancel();
        }
        float f2 = this.o;
        if (f2 == -1.0f) {
            this.o = f;
            invalidate();
        } else {
            ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(500L);
            this.s0 = duration;
            duration.addUpdateListener(new q00(5, this));
            this.s0.start();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        super.setProgress(i);
    }
}
