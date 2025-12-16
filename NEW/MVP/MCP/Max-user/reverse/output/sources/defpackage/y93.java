package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* loaded from: classes.dex */
public abstract class y93 extends qk0 {
    public static final int z0 = m5d.Widget_MaterialComponents_CircularProgressIndicator;

    @Override // defpackage.qk0
    public final rk0 a(Context context) throws Resources.NotFoundException {
        int i = dvc.circularProgressIndicatorStyle;
        int i2 = z0;
        z93 z93Var = new z93(i, i2, context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(dwc.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(dwc.mtrl_progress_circular_inset_medium);
        int[] iArr = z5d.CircularProgressIndicator;
        d7g.a(context, null, i, i2);
        d7g.b(context, null, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, i, i2);
        z93Var.h = Math.max(gti.d(context, typedArrayObtainStyledAttributes, z5d.CircularProgressIndicator_indicatorSize, dimensionPixelSize), z93Var.a * 2);
        z93Var.i = gti.d(context, typedArrayObtainStyledAttributes, z5d.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        z93Var.j = typedArrayObtainStyledAttributes.getInt(z5d.CircularProgressIndicator_indicatorDirectionCircular, 0);
        typedArrayObtainStyledAttributes.recycle();
        z93Var.a();
        return z93Var;
    }

    public int getIndicatorDirection() {
        return ((z93) this.a).j;
    }

    public int getIndicatorInset() {
        return ((z93) this.a).i;
    }

    public int getIndicatorSize() {
        return ((z93) this.a).h;
    }

    public void setIndicatorDirection(int i) {
        ((z93) this.a).j = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        rk0 rk0Var = this.a;
        if (((z93) rk0Var).i != i) {
            ((z93) rk0Var).i = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        rk0 rk0Var = this.a;
        if (((z93) rk0Var).h != iMax) {
            ((z93) rk0Var).h = iMax;
            ((z93) rk0Var).a();
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.qk0
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((z93) this.a).a();
    }
}
