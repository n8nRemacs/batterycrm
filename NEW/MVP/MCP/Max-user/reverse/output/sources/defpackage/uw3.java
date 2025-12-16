package defpackage;

/* loaded from: classes2.dex */
public final class uw3 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final zv3 e;

    public uw3(long j, long j2, int i, int i2, zv3 zv3Var) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = zv3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uw3)) {
            return false;
        }
        uw3 uw3Var = (uw3) obj;
        return this.a == uw3Var.a && this.b == uw3Var.b && this.c == uw3Var.c && this.d == uw3Var.d && fni.a(this.e, uw3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + xrf.k(this.d, xrf.k(this.c, a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "ContactEntity(id=", ", serverId=");
        utb.n(sbL, this.b, ", presence=", this.c);
        sbL.append(", presenceType=");
        sbL.append(this.d);
        sbL.append(", contactData=");
        sbL.append(this.e);
        sbL.append(")");
        return sbL.toString();
    }
}
