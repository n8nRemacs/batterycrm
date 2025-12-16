package defpackage;

/* loaded from: classes2.dex */
public final class k21 {
    public final ti1 a;
    public final Long b;

    public k21(ti1 ti1Var, Long l) {
        this.a = ti1Var;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k21)) {
            return false;
        }
        k21 k21Var = (k21) obj;
        return fni.a(this.a, k21Var.a) && fni.a(this.b, k21Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "CallAsrInfo(initiatorId=" + this.a + ", movieId=" + this.b + ")";
    }
}
