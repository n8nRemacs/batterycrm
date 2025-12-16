package defpackage;

/* loaded from: classes2.dex */
public final class e9f {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final int i;
    public final long j;

    public e9f(long j, long j2, int i, long j3, long j4, int i2, long j5, long j6, int i3) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = j3;
        this.e = j4;
        this.f = i2;
        this.g = j5;
        this.h = j6;
        this.i = i3;
        this.j = j5 + j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9f)) {
            return false;
        }
        e9f e9fVar = (e9f) obj;
        e9fVar.getClass();
        return this.a == e9fVar.a && this.b == e9fVar.b && this.c == e9fVar.c && this.d == e9fVar.d && this.e == e9fVar.e && this.f == e9fVar.f && this.g == e9fVar.g && this.h == e9fVar.h && this.i == e9fVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + a9h.a(a9h.a(xrf.k(this.f, a9h.a(a9h.a(xrf.k(this.c, a9h.a(a9h.a(xrf.k(0, a9h.a(a9h.a(xrf.k(0, a9h.a(a9h.a(-2122704610, 31, 0L), 31, 0L), 31), 31, 0L), 31, 0L), 31), 31, this.a), 31, this.b), 31), 31, this.d), 31, this.e), 31), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "SslProviderStat(DEF_SSL|v=<unknown>|init=0/0_0|scc=0/0_0|sfc=", "/");
        utb.n(sbL, this.b, "_", this.c);
        az1.r(this.g, "|sh=", "/", sbL);
        utb.n(sbL, this.h, "_", this.i);
        az1.r(this.d, "|sv=", "/", sbL);
        utb.n(sbL, this.e, "_", this.f);
        sbL.append(")");
        return sbL.toString();
    }
}
