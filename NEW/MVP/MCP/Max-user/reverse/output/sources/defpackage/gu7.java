package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class gu7 {
    public final Executor a;
    public final fu7 b;
    public final eu7 c = new eu7(this, 0);
    public final eu7 d = new eu7(this, 1);
    public ce5 e = null;
    public int f = 0;
    public int g = 1;
    public long h = 0;
    public long i = 0;

    public gu7(Executor executor, fu7 fu7Var) {
        this.a = executor;
        this.b = fu7Var;
    }

    public static boolean d(ce5 ce5Var, int i) {
        return hj0.a(i) || hj0.l(i, 4) || ce5.h0(ce5Var);
    }

    public final void a(long j) {
        eu7 eu7Var = this.d;
        if (j <= 0) {
            eu7Var.run();
            return;
        }
        if (goi.d == null) {
            goi.d = Executors.newSingleThreadScheduledExecutor();
        }
        goi.d.schedule(eu7Var, j, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        boolean z;
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                z = true;
                if (this.g == 4) {
                    jMax = Math.max(this.i + 100, jUptimeMillis);
                    this.h = jUptimeMillis;
                    this.g = 2;
                } else {
                    this.g = 1;
                    jMax = 0;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            a(jMax - jUptimeMillis);
        }
    }

    public final void c() {
        boolean z;
        long j;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (d(this.e, this.f)) {
                    int iV = az1.v(this.g);
                    if (iV != 0) {
                        if (iV == 2) {
                            this.g = 4;
                        }
                        j = 0;
                        z = false;
                    } else {
                        long jMax = Math.max(this.i + 100, jUptimeMillis);
                        this.h = jUptimeMillis;
                        this.g = 2;
                        z = true;
                        j = jMax;
                    }
                    if (z) {
                        a(j - jUptimeMillis);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(ce5 ce5Var, int i) {
        ce5 ce5Var2;
        if (!d(ce5Var, i)) {
            return false;
        }
        synchronized (this) {
            ce5Var2 = this.e;
            this.e = ce5.c(ce5Var);
            this.f = i;
        }
        ce5.d(ce5Var2);
        return true;
    }
}
