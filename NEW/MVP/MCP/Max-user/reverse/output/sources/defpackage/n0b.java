package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class n0b extends LinearLayout implements u6g, rqd {
    public final ShapeDrawable a;
    public final AppCompatImageView b;
    public final AppCompatTextView c;

    public n0b(Context context) {
        super(context, null);
        this.a = new ShapeDrawable();
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        float f = 28;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        float f2 = 18;
        layoutParams.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f2));
        appCompatImageView.setLayoutParams(layoutParams);
        addView(appCompatImageView);
        this.b = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        dpg.f.b(appCompatTextView, t75.b);
        addView(appCompatTextView);
        this.c = appCompatTextView;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(16);
        setMinimumHeight(kti.d(56 * vw4.d().getDisplayMetrics().density));
        setPadding(kti.d(f2 * vw4.d().getDisplayMetrics().density), getPaddingTop(), kti.d(12 * vw4.d().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(a93.s0.y(this));
    }

    public final Drawable getIcon() {
        return this.b.getDrawable();
    }

    public final CharSequence getText() {
        return this.c.getText();
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.b.setImageTintList(ColorStateList.valueOf(yebVar.getText().j));
        this.c.setTextColor(yebVar.getText().j);
        setBackground(new RippleDrawable(ColorStateList.valueOf(yebVar.c().a.a.i), null, this.a));
    }

    public final void setIcon(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    @Override // defpackage.rqd
    public void setRippleMask(Shape shape) {
        this.a.setShape(shape);
    }

    public final void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
