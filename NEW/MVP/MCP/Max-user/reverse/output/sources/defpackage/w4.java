package defpackage;

/* loaded from: classes2.dex */
public final class w4 {
    public final int a;
    public final int b;
    public final int c;

    public w4(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w4)) {
            return false;
        }
        w4 w4Var = (w4) obj;
        return this.a == w4Var.a && this.b == w4Var.b && this.c == w4Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ho7.j(wy1.k("AccentColors(red=", this.a, ", secondary=", this.b, ", themed="), this.c, ")");
    }
}
