package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a58 extends qk0 {
    public static final int z0 = m5d.Widget_MaterialComponents_LinearProgressIndicator;

    @Override // defpackage.qk0
    public final rk0 a(Context context) {
        int i = dvc.linearProgressIndicatorStyle;
        int i2 = z0;
        b58 b58Var = new b58(i, i2, context);
        int[] iArr = z5d.LinearProgressIndicator;
        int i3 = dvc.linearProgressIndicatorStyle;
        d7g.a(context, null, i3, i2);
        d7g.b(context, null, iArr, i3, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, i3, i2);
        b58Var.h = typedArrayObtainStyledAttributes.getInt(z5d.LinearProgressIndicator_indeterminateAnimationType, 1);
        b58Var.i = typedArrayObtainStyledAttributes.getInt(z5d.LinearProgressIndicator_indicatorDirectionLinear, 0);
        b58Var.k = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.LinearProgressIndicator_trackStopIndicatorSize, 0), b58Var.a);
        typedArrayObtainStyledAttributes.recycle();
        b58Var.a();
        b58Var.j = b58Var.i == 1;
        return b58Var;
    }

    @Override // defpackage.qk0
    public final void b(int i) {
        rk0 rk0Var = this.a;
        if (rk0Var != null && ((b58) rk0Var).h == 0 && isIndeterminate()) {
            return;
        }
        super.b(i);
    }

    public int getIndeterminateAnimationType() {
        return ((b58) this.a).h;
    }

    public int getIndicatorDirection() {
        return ((b58) this.a).i;
    }

    public int getTrackStopIndicatorSize() {
        return ((b58) this.a).k;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        rk0 rk0Var = this.a;
        b58 b58Var = (b58) rk0Var;
        boolean z2 = true;
        if (((b58) rk0Var).i != 1) {
            WeakHashMap weakHashMap = hfh.a;
            if ((getLayoutDirection() != 1 || ((b58) rk0Var).i != 2) && (getLayoutDirection() != 0 || ((b58) rk0Var).i != 3)) {
                z2 = false;
            }
        }
        b58Var.j = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        pj7 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        ou4 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        rk0 rk0Var = this.a;
        if (((b58) rk0Var).h == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((b58) rk0Var).h = i;
        ((b58) rk0Var).a();
        if (i == 0) {
            pj7 indeterminateDrawable = getIndeterminateDrawable();
            s48 s48Var = new s48((b58) rk0Var);
            indeterminateDrawable.w0 = s48Var;
            s48Var.b = indeterminateDrawable;
        } else {
            pj7 indeterminateDrawable2 = getIndeterminateDrawable();
            u48 u48Var = new u48(getContext(), (b58) rk0Var);
            indeterminateDrawable2.w0 = u48Var;
            u48Var.b = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // defpackage.qk0
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((b58) this.a).a();
    }

    public void setIndicatorDirection(int i) {
        rk0 rk0Var = this.a;
        ((b58) rk0Var).i = i;
        b58 b58Var = (b58) rk0Var;
        boolean z = true;
        if (i != 1) {
            WeakHashMap weakHashMap = hfh.a;
            if ((getLayoutDirection() != 1 || ((b58) rk0Var).i != 2) && (getLayoutDirection() != 0 || i != 3)) {
                z = false;
            }
        }
        b58Var.j = z;
        invalidate();
    }

    @Override // defpackage.qk0
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((b58) this.a).a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        rk0 rk0Var = this.a;
        if (((b58) rk0Var).k != i) {
            ((b58) rk0Var).k = Math.min(i, ((b58) rk0Var).a);
            ((b58) rk0Var).a();
            invalidate();
        }
    }
}
