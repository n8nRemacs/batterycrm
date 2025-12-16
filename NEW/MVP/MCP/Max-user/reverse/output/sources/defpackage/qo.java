package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* loaded from: classes.dex */
public final class qo extends RatingBar {
    public final xo8 a;

    /* JADX WARN: Illegal instructions before constructor call */
    public qo(Context context, AttributeSet attributeSet) {
        int i = fvc.ratingBarStyle;
        super(context, attributeSet, i);
        j7g.a(this, getContext());
        xo8 xo8Var = new xo8(1, this);
        this.a = xo8Var;
        xo8Var.F(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.a.c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
