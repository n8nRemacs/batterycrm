package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final /* synthetic */ class o1b implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ r1b c;

    public /* synthetic */ o1b(r1b r1bVar, Context context) {
        this.a = 4;
        this.c = r1bVar;
        this.b = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                r1b r1bVar = this.c;
                int i = r1bVar.H0;
                ?? r2 = r1bVar.J0;
                TextView textView = new TextView(this.b);
                textView.setId(zud.B);
                kt3 kt3Var = new kt3(0, -2);
                kt3Var.t = 0;
                kt3Var.i = 0;
                ?? r0 = r1bVar.K0;
                kt3Var.u = r0.e() ? ((ImageView) r0.getValue()).getId() : 0;
                kt3Var.k = r2.e() ? ((TextView) r2.getValue()).getId() : 0;
                kt3Var.setMarginStart(i);
                ((ViewGroup.MarginLayoutParams) kt3Var).topMargin = i;
                kt3Var.setMarginEnd(i);
                textView.setLayoutParams(kt3Var);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                dpg.x.b(textView, t75.b);
                a93.s0.y(textView).getText();
                textView.setTextColor(-1);
                return textView;
            case 1:
                r1b r1bVar2 = this.c;
                ?? r1 = r1bVar2.K0;
                int i2 = r1bVar2.H0;
                TextView textView2 = new TextView(this.b);
                textView2.setId(zud.A);
                kt3 kt3Var2 = new kt3(0, -2);
                kt3Var2.t = 0;
                ?? r5 = r1bVar2.I0;
                kt3Var2.j = r5.e() ? ((TextView) r5.getValue()).getId() : 0;
                kt3Var2.u = r1.e() ? ((ImageView) r1.getValue()).getId() : 0;
                kt3Var2.l = 0;
                kt3Var2.setMarginStart(i2);
                ((ViewGroup.MarginLayoutParams) kt3Var2).topMargin = r1bVar2.F0;
                kt3Var2.setMarginEnd(i2);
                ((ViewGroup.MarginLayoutParams) kt3Var2).bottomMargin = i2;
                textView2.setLayoutParams(kt3Var2);
                textView2.setMaxLines(2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                dpg.l.b(textView2, t75.b);
                a93.s0.y(textView2).getText();
                textView2.setTextColor(v4j.c(-1, 0.7f));
                return textView2;
            case 2:
                return r1b.v(this.c, this.b);
            case 3:
                FrameLayout frameLayout = new FrameLayout(this.b);
                frameLayout.setId(zud.z);
                float f = r1b.Y0;
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

    public /* synthetic */ o1b(Context context, r1b r1bVar, int i) {
        this.a = i;
        this.b = context;
        this.c = r1bVar;
    }
}
