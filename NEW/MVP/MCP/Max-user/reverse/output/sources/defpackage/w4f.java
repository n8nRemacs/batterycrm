package defpackage;

import android.os.SystemClock;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w4f implements eh0 {
    public final ArrayDeque a;
    public final ycd b;
    public final mwf c;
    public double d;
    public double e;

    public w4f() {
        ycd ycdVar = new ycd(11);
        this.a = new ArrayDeque();
        this.b = ycdVar;
        this.c = mwf.a;
    }

    @Override // defpackage.eh0
    public final void a(long j, long j2) {
        while (true) {
            this.b.getClass();
            ArrayDeque arrayDeque = this.a;
            if (arrayDeque.size() < 10) {
                double dSqrt = Math.sqrt(j);
                long j3 = (j * 8000000) / j2;
                this.c.getClass();
                SystemClock.elapsedRealtime();
                arrayDeque.add(new v4f(j3, dSqrt));
                this.d = (j3 * dSqrt) + this.d;
                this.e += dSqrt;
                return;
            }
            v4f v4fVar = (v4f) arrayDeque.remove();
            double d = this.d;
            double d2 = v4fVar.a;
            double d3 = v4fVar.b;
            this.d = d - (d2 * d3);
            this.e -= d3;
        }
    }

    @Override // defpackage.eh0
    public final long b() {
        if (this.a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        return (long) (this.d / this.e);
    }

    @Override // defpackage.eh0
    public final void reset() {
        this.a.clear();
        this.d = 0.0d;
        this.e = 0.0d;
    }
}
