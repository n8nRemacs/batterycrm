package defpackage;

/* loaded from: classes2.dex */
public final class kb8 extends lb8 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;

    static {
        new kb8(50000L, 50000L, 1000L, 2000L, false);
    }

    public kb8(long j, long j2, long j3, long j4, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = zxg.U(j);
        this.g = zxg.U(j2);
        this.h = zxg.U(j3);
        this.i = zxg.U(j4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb8)) {
            return false;
        }
        kb8 kb8Var = (kb8) obj;
        return this.a == kb8Var.a && this.b == kb8Var.b && this.c == kb8Var.c && this.d == kb8Var.d && this.e == kb8Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + a9h.a(a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "Default(minBufferMs=", ", maxBufferMs=");
        sbL.append(this.b);
        az1.r(this.c, ", bufferForPlaybackMs=", ", bufferForPlaybackAfterRebufferMs=", sbL);
        sbL.append(this.d);
        sbL.append(", prioritizeTimeOverSizeThresholds=");
        sbL.append(this.e);
        sbL.append(")");
        return sbL.toString();
    }
}
