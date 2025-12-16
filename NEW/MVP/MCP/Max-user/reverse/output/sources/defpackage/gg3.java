package defpackage;

/* loaded from: classes2.dex */
public final class gg3 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public gg3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg3)) {
            return false;
        }
        gg3 gg3Var = (gg3) obj;
        return this.a == gg3Var.a && this.b == gg3Var.b && this.c == gg3Var.c && this.d == gg3Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return xc0.i(wy1.k("CommonActionBackgroundColors(error=", this.a, ", neutral=", this.b, ", themed="), this.c, ", themedFade=", this.d, ")");
    }
}
