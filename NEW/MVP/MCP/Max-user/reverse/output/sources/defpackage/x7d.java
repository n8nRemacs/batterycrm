package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class x7d extends TextView implements Checkable {
    public final GradientDrawable a;
    public boolean b;

    public x7d(Context context) {
        super(context, null, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vw4.d().getDisplayMetrics().density * 20.0f);
        this.a = gradientDrawable;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(a93.s0.y(this).c().a.a.i), gradientDrawable, null);
        float f = 12;
        float f2 = 10;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        setClickable(true);
        setFocusable(true);
        setBackground(rippleDrawable);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.b;
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.b) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, new int[]{R.attr.state_checked});
        }
        return iArrOnCreateDrawableState;
    }

    public final void setBackgroundColors(ColorStateList colorStateList) {
        t35.h(this.a, colorStateList);
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.b = z;
        refreshDrawableState();
    }

    public final void setTextColors(ColorStateList colorStateList) {
        setTextColor(colorStateList);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.b = !this.b;
    }
}
