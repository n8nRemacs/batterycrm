package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class g0e implements Runnable {
    public long X;
    public final /* synthetic */ h0e Y;
    public final Object a;
    public final n42 b;
    public final long c;
    public long d;
    public long o;

    public g0e(h0e h0eVar, long j, Runnable runnable, long j2, n42 n42Var, long j3) {
        this.Y = h0eVar;
        this.a = runnable;
        this.b = n42Var;
        this.c = j3;
        this.o = j2;
        this.X = j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        this.a.run();
        n42 n42Var = this.b;
        if (n42Var.e()) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        h0e h0eVar = this.Y;
        h0eVar.getClass();
        long jA = h0e.a(timeUnit);
        long j2 = j0e.b;
        long j3 = jA + j2;
        long j4 = this.o;
        long j5 = this.c;
        if (j3 < j4 || jA >= j4 + j5 + j2) {
            j = jA + j5;
            long j6 = this.d + 1;
            this.d = j6;
            this.X = j - (j5 * j6);
        } else {
            long j7 = this.X;
            long j8 = this.d + 1;
            this.d = j8;
            j = (j8 * j5) + j7;
        }
        this.o = jA;
        ty4.d(n42Var, h0eVar.c(this, j - jA, timeUnit));
    }
}
