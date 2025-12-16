package defpackage;

/* loaded from: classes2.dex */
public final class zq3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;
    public final int h;

    public zq3(long j, long j2, long j3, long j4, long j5, String str, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = str;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq3)) {
            return false;
        }
        zq3 zq3Var = (zq3) obj;
        return this.a == zq3Var.a && this.b == zq3Var.b && this.c == zq3Var.c && this.d == zq3Var.d && this.e == zq3Var.e && fni.a(this.f, zq3Var.f) && this.g == zq3Var.g && this.h == zq3Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + xrf.k(this.g, u45.e(a9h.a(a9h.a(a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionStat(n=");
        sb.append(this.h);
        sb.append("|");
        sb.append(this.f);
        sb.append(":");
        sb.append(this.g);
        sb.append("|total=");
        sb.append(this.b);
        az1.r(this.c, "|dns=", "|tcp=", sb);
        sb.append(this.d);
        return u45.i(this.e, "|tls=", ")", sb);
    }
}
