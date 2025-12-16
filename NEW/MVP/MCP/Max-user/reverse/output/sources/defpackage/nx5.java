package defpackage;

import android.view.animation.AccelerateInterpolator;

/* loaded from: classes2.dex */
public final class nx5 {
    public long a;
    public long b;
    public long c;
    public long d;
    public final float e = vw4.d().getDisplayMetrics().density * 1.5f;
    public long f = bhi.a(-1, -1);
    public final AccelerateInterpolator g = new AccelerateInterpolator();
    public float h = 1.0f;
    public float i;
    public float j;
    public final /* synthetic */ px5 k;

    public nx5(px5 px5Var) {
        this.k = px5Var;
        float f = 0;
        this.a = m26.a(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f));
        this.b = m26.a(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f));
        float f2 = 8;
        this.c = m26.a(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f));
        this.d = m26.a(kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density));
    }

    public final String toString() {
        return yxg.h("(%.1f, %.1f, %.1f)", Float.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.h));
    }
}
