package defpackage;

/* loaded from: classes.dex */
public final class cb1 {
    public final int a;
    public final int b;
    public final bb1 c;

    public cb1(int i, int i2, bb1 bb1Var) {
        this.a = i;
        this.b = i2;
        this.c = bb1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb1)) {
            return false;
        }
        cb1 cb1Var = (cb1) obj;
        return this.a == cb1Var.a && this.b == cb1Var.b && this.c == cb1Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.k(0, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("CallHistoryTabState(id=", this.a, ", nameRes=", this.b, ", count=0, type=");
        sbK.append(this.c);
        sbK.append(")");
        return sbK.toString();
    }
}
