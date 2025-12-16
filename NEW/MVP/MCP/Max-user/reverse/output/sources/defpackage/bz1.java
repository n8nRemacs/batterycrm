package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class bz1 {
    public long a = -9223372036854775807L;
    public long b = -9223372036854775807L;
    public Object c;

    public int a() {
        if (!((dz1) this.c).c()) {
            return 700;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.b == -1) {
            this.b = jUptimeMillis;
        }
        long j = jUptimeMillis - this.b;
        if (j <= 120000) {
            return 1000;
        }
        if (j <= 300000) {
            return 2000;
        }
        return q0f.CLOSE_SOCKET_CODE_TIMEOUT;
    }

    public int b() {
        long j = this.a;
        if (((dz1) this.c).c()) {
            if (j > 0) {
                return Math.min((int) j, 1800000);
            }
            return 1800000;
        }
        if (j > 0) {
            return Math.min((int) j, 10000);
        }
        return 10000;
    }

    public void c(Exception exc) {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.a == -9223372036854775807L) {
            synchronized (ak4.l0) {
                z = ak4.n0 > 0;
            }
            if (!z) {
                this.a = 200 + jElapsedRealtime;
            }
        }
        long j = this.a;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.c;
        this.c = null;
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        throw exc3;
    }
}
