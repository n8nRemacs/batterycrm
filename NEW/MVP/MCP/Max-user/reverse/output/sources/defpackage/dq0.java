package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class dq0 {
    public final /* synthetic */ int a;
    public long b;
    public long c;

    public double a(long j, long j2) {
        double millis;
        long j3 = j - this.b;
        if (j3 < 0) {
            j3 = 0;
        }
        long j4 = this.c;
        if (j4 == 0) {
            millis = Double.NaN;
        } else {
            long j5 = j2 - j4;
            if (j5 < 1) {
                j5 = 1;
            }
            millis = (TimeUnit.SECONDS.toMillis(1L) * j3) / j5;
        }
        this.b = j;
        this.c = j2;
        return millis * 8;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return this.b + "/" + this.c;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ dq0(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public dq0() {
        this.a = 7;
        this.b = -9223372036854775807L;
        this.c = -9223372036854775807L;
    }

    public dq0(long j, long j2, long j3) {
        this.a = 3;
        this.b = j2;
        this.c = j3;
    }
}
