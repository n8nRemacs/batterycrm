package defpackage;

/* loaded from: classes2.dex */
public final class lx9 {
    public final long a;
    public final boolean b;

    public lx9(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx9)) {
            return false;
        }
        lx9 lx9Var = (lx9) obj;
        return this.a == lx9Var.a && this.b == lx9Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = xc0.j(this.a, "AnchorState(anchor=", ", byChatReadMark=", this.b);
        sbJ.append(")");
        return sbJ.toString();
    }
}
