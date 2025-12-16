package defpackage;

/* loaded from: classes2.dex */
public final class yk6 {
    public final int a;
    public final long b;

    public yk6(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk6)) {
            return false;
        }
        yk6 yk6Var = (yk6) obj;
        return this.a == yk6Var.a && this.b == yk6Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbM = u45.m(this.a, this.b, "FreezeStat(freezeCount=", ", totalFreezeDuration=");
        sbM.append(")");
        return sbM.toString();
    }
}
