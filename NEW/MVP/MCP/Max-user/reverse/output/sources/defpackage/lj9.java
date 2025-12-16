package defpackage;

/* loaded from: classes2.dex */
public final class lj9 implements mj9 {
    public final long a;
    public final long b;

    public lj9(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj9)) {
            return false;
        }
        lj9 lj9Var = (lj9) obj;
        return this.a == lj9Var.a && this.b == lj9Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ho7.k(az1.l(this.a, "ByRange(startTime=", ", endTime="), this.b, ")");
    }
}
