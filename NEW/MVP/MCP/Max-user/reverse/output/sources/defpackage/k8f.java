package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class k8f {
    public final eh0 a;
    public final int b;
    public final long c;
    public final mwf d;
    public int f;
    public long g;
    public long h;
    public int k;
    public long l;
    public final ao6 e = new ao6(4, (byte) 0);
    public long i = Long.MIN_VALUE;
    public long j = Long.MIN_VALUE;

    public k8f(qr4 qr4Var) {
        this.a = (eh0) qr4Var.c;
        this.b = qr4Var.a;
        this.c = qr4Var.b;
        this.d = (mwf) qr4Var.d;
    }

    public final void a(int i, long j, long j2) {
        if (j2 != Long.MIN_VALUE) {
            if (i == 0 && j == 0 && j2 == this.j) {
                return;
            }
            this.j = j2;
            this.e.i(i, j, j2);
        }
    }

    public final void b() {
        hsi.g(this.f > 0);
        this.d.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = (int) (jElapsedRealtime - this.g);
        if (j > 0) {
            eh0 eh0Var = this.a;
            eh0Var.a(this.h, 1000 * j);
            int i = this.k + 1;
            this.k = i;
            if (i > this.b && this.l > this.c) {
                this.i = eh0Var.b();
            }
            a((int) j, this.h, this.i);
            this.g = jElapsedRealtime;
            this.h = 0L;
        }
        this.f--;
    }
}
