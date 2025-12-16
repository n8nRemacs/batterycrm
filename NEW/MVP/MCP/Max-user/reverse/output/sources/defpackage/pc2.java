package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class pc2 {
    public final Context a;
    public final t5g b;

    public pc2(Context context) {
        this.a = context;
        t5g t5gVar = dpg.a;
        this.b = dpg.Q;
    }

    public static int a(int i, oc2 oc2Var) {
        int iD = (i - (kti.d(6 * vw4.d().getDisplayMetrics().density) * 2)) - kti.d(66 * vw4.d().getDisplayMetrics().density);
        int i2 = oc2Var.a;
        if (i2 > 0 || oc2Var.c) {
            iD = u45.q((i2 < 0 || i2 >= 10) ? (10 > i2 || i2 >= 100) ? 48 : 40 : 32, vw4.d().getDisplayMetrics().density, iD);
        }
        if (oc2Var.b) {
            iD = u45.q(68, vw4.d().getDisplayMetrics().density, iD);
        }
        return u45.q(12, vw4.d().getDisplayMetrics().density, iD);
    }
}
