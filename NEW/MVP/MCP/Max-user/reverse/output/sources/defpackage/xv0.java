package defpackage;

/* loaded from: classes2.dex */
public final class xv0 {
    public final long a;
    public final boolean b;

    public xv0(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv0)) {
            return false;
        }
        xv0 xv0Var = (xv0) obj;
        return this.a == xv0Var.a && this.b == xv0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = xc0.j(this.a, "BufferingState(messageId=", ", isBuffering=", this.b);
        sbJ.append(")");
        return sbJ.toString();
    }
}
