package defpackage;

/* loaded from: classes2.dex */
public final class r21 implements s21 {
    public final long a;
    public final boolean b;

    public r21(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r21)) {
            return false;
        }
        r21 r21Var = (r21) obj;
        return this.a == r21Var.a && this.b == r21Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = xc0.j(this.a, "OneToOne(opponentId=", ", isVideo=", this.b);
        sbJ.append(")");
        return sbJ.toString();
    }
}
