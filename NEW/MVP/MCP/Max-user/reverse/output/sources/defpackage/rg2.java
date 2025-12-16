package defpackage;

/* loaded from: classes2.dex */
public final class rg2 {
    public final long a;
    public final long b;
    public final rf2 c;
    public final long d;
    public final long e;
    public final long f;

    public rg2(long j, long j2, rf2 rf2Var, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = rf2Var;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg2)) {
            return false;
        }
        rg2 rg2Var = (rg2) obj;
        return this.a == rg2Var.a && this.b == rg2Var.b && fni.a(this.c, rg2Var.c) && this.d == rg2Var.d && this.e == rg2Var.e && this.f == rg2Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + a9h.a(a9h.a((this.c.hashCode() + a9h.a(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "ChatEntity(id=", ", serverId=");
        sbL.append(this.b);
        sbL.append(", chatData=");
        sbL.append(this.c);
        az1.r(this.d, ", favouriteIndex=", ", sortTime=", sbL);
        sbL.append(this.e);
        return u45.i(this.f, ", cid=", ")", sbL);
    }
}
