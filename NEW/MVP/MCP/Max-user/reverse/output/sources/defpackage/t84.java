package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class t84 extends AppCompatTextView implements u6g {
    public long u0;
    public final ValueAnimator v0;
    public final x93 w0;

    public t84(Context context) {
        super(context, null);
        this.v0 = ValueAnimator.ofFloat(360.0f, 0.0f);
        x93 x93Var = new x93();
        v1a v1aVar = a93.s0;
        x93Var.a.setColor(v1aVar.y(this).i().c);
        this.w0 = x93Var;
        setBackground(x93Var);
        dpg.k.b(this, t75.b);
        setTextAlignment(4);
        v1aVar.y(this).getText();
        setTextColor(-1);
        setGravity(17);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j = this.u0;
        ValueAnimator valueAnimator = this.v0;
        valueAnimator.setDuration(j);
        valueAnimator.addUpdateListener(new q00(9, this));
        valueAnimator.start();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0.cancel();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.w0.a.setColor(yebVar.i().c);
        setTextColor(-1);
    }

    public final void setMaxValue(long j) {
        this.u0 = j;
    }
}
