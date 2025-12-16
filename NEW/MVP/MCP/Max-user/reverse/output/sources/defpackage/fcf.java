package defpackage;

/* loaded from: classes2.dex */
public final class fcf {
    public final long a;
    public final long b;
    public final hg8 c;

    public fcf(long j, long j2, hg8 hg8Var) {
        this.a = j;
        this.b = j2;
        this.c = hg8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcf)) {
            return false;
        }
        fcf fcfVar = (fcf) obj;
        return this.a == fcfVar.a && this.b == fcfVar.b && fni.a(this.c, fcfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a9h.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "StatEntity(id=", ", timestamp=");
        sbL.append(this.b);
        sbL.append(", data=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
