package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes2.dex */
public final class ox5 {
    public float c;
    public float d;
    public final float e;
    public float f;
    public float g;
    public float h;
    public float k;
    public final /* synthetic */ px5 m;
    public final float a = 1.0f / ((float) Math.sqrt(2.0f));
    public final int b = kti.d(vw4.d().getDisplayMetrics().density * 2);
    public float i = 1.0f;
    public int j = -1;
    public final AccelerateDecelerateInterpolator l = new AccelerateDecelerateInterpolator();

    public ox5(px5 px5Var) {
        this.m = px5Var;
        this.e = kti.d(r3 * vw4.d().getDisplayMetrics().density);
    }

    public final String toString() {
        return yxg.h("(%.1f, %.1f, %.1f)", Float.valueOf(this.f), Float.valueOf(this.g), Float.valueOf(this.h));
    }
}
