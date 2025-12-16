package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final class t2e extends FrameLayout implements u6g {
    public final ImageView a;
    public final w2b b;

    public t2e(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        float f = 44;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        layoutParams.gravity = 83;
        imageView.setLayoutParams(layoutParams);
        u45.n(12, vw4.d().getDisplayMetrics().density, imageView);
        imageView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        this.a = imageView;
        w2b w2bVar = new w2b(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 53;
        w2bVar.setVisibility(8);
        w2bVar.setLayoutParams(layoutParams2);
        this.b = w2bVar;
        setLayoutParams(new FrameLayout.LayoutParams(-2, kti.d(46 * vw4.d().getDisplayMetrics().density)));
        addView(imageView);
        addView(w2bVar);
        onThemeChanged(a93.s0.y(this));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        ImageView imageView = this.a;
        Drawable background = imageView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(2, yebVar.i().b.c);
        }
        Drawable background2 = imageView.getBackground();
        GradientDrawable gradientDrawable2 = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setColor(a93.s0.y(this).a().G().b.i);
        }
        imageView.setImageTintList(ColorStateList.valueOf(yebVar.getIcon().f));
        this.b.f(yebVar);
    }

    public final void setCounter(int i) {
        int i2 = i > 0 ? 0 : 8;
        w2b w2bVar = this.b;
        w2bVar.setVisibility(i2);
        w2bVar.g(i, true);
    }

    public final void setImageDrawable(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }
}
