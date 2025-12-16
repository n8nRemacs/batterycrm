package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class ju1 extends LinearLayout {
    public final Object a;

    public ju1(Context context) {
        super(context, null);
        this.a = ipi.b(3, new m3(context, 20, this));
        mfh.j(this, vw4.d().getDisplayMetrics().density * 20.0f);
        setOrientation(1);
        setBackground(getAnimatedBackground());
        ImageView imageView = new ImageView(context);
        float f = 48;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        setGravity(17);
        v1a v1aVar = a93.s0;
        yeb yebVar = v1aVar.B(imageView).c;
        imageView.setImageTintList(ColorStateList.valueOf(-1));
        imageView.setImageResource(i0b.p0);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setGravity(17);
        dpg.c.b(textView, t75.b);
        yeb yebVar2 = v1aVar.B(textView).c;
        textView.setTextColor(-1);
        textView.setText(m0b.m0);
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        textView.setPadding(iD, iD, iD, iD);
        addView(imageView);
        addView(textView);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final owe getAnimatedBackground() {
        return (owe) this.a.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        owe background = getBackground();
        if (background != null) {
            background.onThemeChanged(a93.s0.B(this).c);
        }
        owe background2 = getBackground();
        if (background2 != null) {
            background2.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        owe background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        owe background;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (background = getBackground()) != null) {
            background.a((i3 - i) / 2);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        owe background;
        return super.verifyDrawable(drawable) || ((background = getBackground()) != null && background.c(drawable));
    }

    @Override // android.view.View
    public owe getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof owe) {
            return (owe) background;
        }
        return null;
    }
}
