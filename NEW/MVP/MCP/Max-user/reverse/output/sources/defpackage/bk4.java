package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final /* synthetic */ class bk4 {
    public final /* synthetic */ dk4 a;

    public final void a(int i) {
        dk4 dk4Var = this.a;
        synchronized (dk4Var) {
            int i2 = dk4Var.i;
            if (i2 == 0 || dk4Var.e) {
                if (i2 == i) {
                    return;
                }
                dk4Var.i = i;
                if (i != 1 && i != 0 && i != 8) {
                    dk4Var.l = dk4Var.b(i);
                    dk4Var.d.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    dk4Var.c(dk4Var.f > 0 ? (int) (jElapsedRealtime - dk4Var.g) : 0, dk4Var.h, dk4Var.l);
                    dk4Var.g = jElapsedRealtime;
                    dk4Var.h = 0L;
                    dk4Var.k = 0L;
                    dk4Var.j = 0L;
                    s4f s4fVar = dk4Var.c;
                    s4fVar.c.clear();
                    s4fVar.d = -1;
                    s4fVar.e = 0;
                    s4fVar.f = 0;
                }
            }
        }
    }
}
