package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes2.dex */
public final class yo8 extends FrameLayout {
    public final GradientDrawable a;
    public final AppCompatImageView b;

    public yo8(Context context) {
        super(context, null);
        float f = vw4.d().getDisplayMetrics().density * 20.0f;
        GradientDrawable gradientDrawableF = uga.f(null, null, null, new float[]{f, f, f, f, f, f, f, f});
        this.a = gradientDrawableF;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        appCompatImageView.setLayoutParams(layoutParams);
        this.b = appCompatImageView;
        setBackground(gradientDrawableF);
        float f2 = 24;
        setLayoutParams(new ViewGroup.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density)));
        appCompatImageView.setForegroundGravity(17);
    }

    @Override // android.view.View
    public Drawable getBackground() {
        Drawable background = super.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        return gradientDrawable != null ? gradientDrawable : this.a;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable instanceof GradientDrawable) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.a.setColor(ColorStateList.valueOf(i));
    }

    public final void setIcon(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.b;
        appCompatImageView.setImageDrawable(drawable);
        addView(appCompatImageView);
    }

    public final void setIconColor(int i) {
        this.b.setImageTintList(ColorStateList.valueOf(i));
    }

    public final void setIcon(int i) {
        setIcon(r34.b(getContext(), i).mutate());
    }
}
