package defpackage;

/* loaded from: classes2.dex */
public final class pi3 {
    public final int a;
    public final int b;

    public pi3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi3)) {
            return false;
        }
        pi3 pi3Var = (pi3) obj;
        return this.a == pi3Var.a && this.b == pi3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("CommonStrokeSeparatorColors(primary=", this.a, ", secondary=", this.b, ")");
    }
}
