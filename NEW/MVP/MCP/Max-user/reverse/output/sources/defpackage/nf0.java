package defpackage;

/* loaded from: classes2.dex */
public final class nf0 {
    public final int a;
    public final int b;

    public nf0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf0)) {
            return false;
        }
        nf0 nf0Var = (nf0) obj;
        return this.a == nf0Var.a && this.b == nf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("BackgroundLocalTopBarColors(primary=", this.a, ", secondary=", this.b, ")");
    }
}
