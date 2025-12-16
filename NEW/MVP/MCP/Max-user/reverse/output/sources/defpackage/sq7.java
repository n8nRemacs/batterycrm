package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class sq7 extends LinearLayout implements u6g {
    public final AppCompatImageView a;
    public final AppCompatTextView b;
    public final RippleDrawable c;

    public sq7(Context context) {
        super(context, null);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        float f = 24;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        float f2 = 18;
        layoutParams.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f2));
        appCompatImageView.setLayoutParams(layoutParams);
        addView(appCompatImageView);
        this.a = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        dpg.f.b(appCompatTextView, t75.b);
        addView(appCompatTextView);
        this.b = appCompatTextView;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        v1a v1aVar = a93.s0;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(v1aVar.y(this).b().h), null, shapeDrawable);
        this.c = rippleDrawable;
        setLayoutParams(new LinearLayout.LayoutParams(-1, kti.d(56 * vw4.d().getDisplayMetrics().density)));
        setGravity(16);
        float f3 = 12;
        setPadding(kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        setBackground(rippleDrawable);
        setClipChildren(false);
        setClipToOutline(false);
        onThemeChanged(v1aVar.y(this));
    }

    public final Drawable getIcon() {
        return this.a.getDrawable();
    }

    public final CharSequence getText() {
        return this.b.getText();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(a93.s0.y(this));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.a.setImageTintList(ColorStateList.valueOf(yebVar.getText().j));
        this.b.setTextColor(yebVar.getText().j);
        this.c.setColor(ColorStateList.valueOf(yebVar.c().a.a.i));
    }

    public final void setIcon(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
