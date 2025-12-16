package defpackage;

/* loaded from: classes2.dex */
public final class bx0 {
    public final int a;
    public final int b;

    public bx0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx0)) {
            return false;
        }
        bx0 bx0Var = (bx0) obj;
        return this.a == bx0Var.a && this.b == bx0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("ButtonPaddings(horizontalPaddings=", this.a, ", verticalPaddings=", this.b, ")");
    }
}
