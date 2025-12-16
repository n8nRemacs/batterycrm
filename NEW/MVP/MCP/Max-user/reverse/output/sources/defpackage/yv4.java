package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class yv4 extends qj0 {
    public static final /* synthetic */ int o = 0;
    public cm6 a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final sk8 d;

    public yv4(Context context) {
        super(context);
        this.a = new ps3(16);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        float f = 8;
        appCompatTextView.setPadding(0, kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(vw4.d().getDisplayMetrics().density * f));
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setTextAlignment(4);
        appCompatTextView.setTextColor(getTitleColor());
        dpg.f.b(appCompatTextView, t75.b);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView2.setGravity(1);
        appCompatTextView2.setTextAlignment(4);
        appCompatTextView2.setTextColor(getSubtitleColor());
        dpg.j.b(appCompatTextView2, t75.b);
        this.c = appCompatTextView2;
        sk8 sk8Var = new sk8(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        sk8Var.setPadding(0, kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(f * vw4.d().getDisplayMetrics().density));
        sk8Var.setLayoutParams(layoutParams2);
        sk8Var.setTextAlignment(4);
        f8j.d(sk8Var, 300L, new j6(23, this));
        this.d = sk8Var;
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(sk8Var);
        onThemeChanged(a93.s0.x(context).k());
    }

    private final int getSubtitleColor() {
        return a93.s0.y(this).getText().g;
    }

    private final int getTitleColor() {
        return a93.s0.y(this).getText().e;
    }

    @Override // defpackage.qj0, defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        super.onThemeChanged(yebVar);
        this.b.setTextColor(getTitleColor());
        this.c.setTextColor(getSubtitleColor());
    }
}
