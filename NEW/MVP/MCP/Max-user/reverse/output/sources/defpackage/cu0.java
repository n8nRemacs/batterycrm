package defpackage;

/* loaded from: classes2.dex */
public final class cu0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public cu0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu0)) {
            return false;
        }
        cu0 cu0Var = (cu0) obj;
        return this.a == cu0Var.a && this.b == cu0Var.b && this.c == cu0Var.c && this.d == cu0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return xc0.i(wy1.k("BubbleTextReactionColors(insideMy=", this.a, ", insideOthers=", this.b, ", outsideMy="), this.c, ", outsideOthers=", this.d, ")");
    }
}
