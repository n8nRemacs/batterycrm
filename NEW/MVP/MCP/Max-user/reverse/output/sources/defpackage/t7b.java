package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final /* synthetic */ class t7b implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ v7b c;

    public /* synthetic */ t7b(v7b v7bVar, Context context) {
        this.a = 4;
        this.c = v7bVar;
        this.b = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                v7b v7bVar = this.c;
                int i = v7bVar.H0;
                ?? r2 = v7bVar.J0;
                TextView textView = new TextView(this.b);
                textView.setId(zud.e0);
                kt3 kt3Var = new kt3(0, -2);
                kt3Var.t = 0;
                kt3Var.i = 0;
                ?? r0 = v7bVar.K0;
                kt3Var.u = r0.e() ? ((ImageView) r0.getValue()).getId() : 0;
                kt3Var.k = r2.e() ? ((TextView) r2.getValue()).getId() : 0;
                kt3Var.setMarginStart(i);
                ((ViewGroup.MarginLayoutParams) kt3Var).topMargin = kti.d(26 * vw4.d().getDisplayMetrics().density);
                kt3Var.setMarginEnd(i);
                textView.setLayoutParams(kt3Var);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                a93.s0.y(textView).getText();
                textView.setTextColor(-1);
                dpg.v.b(textView, t75.b);
                return textView;
            case 1:
                v7b v7bVar2 = this.c;
                int i2 = v7bVar2.H0;
                ?? r22 = v7bVar2.K0;
                TextView textView2 = new TextView(this.b);
                textView2.setId(zud.d0);
                kt3 kt3Var2 = new kt3(0, -2);
                kt3Var2.t = 0;
                ?? r5 = v7bVar2.I0;
                kt3Var2.j = r5.e() ? ((TextView) r5.getValue()).getId() : 0;
                kt3Var2.u = r22.e() ? ((ImageView) r22.getValue()).getId() : 0;
                kt3Var2.l = 0;
                kt3Var2.setMarginStart(i2);
                ((ViewGroup.MarginLayoutParams) kt3Var2).topMargin = v7bVar2.F0;
                kt3Var2.setMarginEnd(i2);
                ((ViewGroup.MarginLayoutParams) kt3Var2).bottomMargin = kti.d(26 * vw4.d().getDisplayMetrics().density);
                textView2.setLayoutParams(kt3Var2);
                textView2.setMaxLines(2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                a93.s0.y(textView2).getText();
                textView2.setTextColor(v4j.c(-1, 0.7f));
                dpg.l.b(textView2, t75.b);
                return textView2;
            case 2:
                return v7b.v(this.c, this.b);
            case 3:
                FrameLayout frameLayout = new FrameLayout(this.b);
                frameLayout.setId(zud.c0);
                float f = 60;
                kt3 kt3Var3 = new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                kt3Var3.i = 0;
                kt3Var3.v = 0;
                kt3Var3.l = 0;
                kt3Var3.setMarginEnd(kti.d(24 * vw4.d().getDisplayMetrics().density));
                frameLayout.setLayoutParams(kt3Var3);
                frameLayout.setBackground(this.c.M0);
                return frameLayout;
            default:
                Drawable drawableMutate = r34.b(this.c.getContext(), y9b.r).mutate();
                drawableMutate.setTint(ctd.f(a93.s0, this.b).f);
                return drawableMutate;
        }
    }

    public /* synthetic */ t7b(Context context, v7b v7bVar, int i) {
        this.a = i;
        this.b = context;
        this.c = v7bVar;
    }
}
