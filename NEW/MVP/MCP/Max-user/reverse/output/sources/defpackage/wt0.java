package defpackage;

/* loaded from: classes2.dex */
public final class wt0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public wt0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt0)) {
            return false;
        }
        wt0 wt0Var = (wt0) obj;
        return this.a == wt0Var.a && this.b == wt0Var.b && this.c == wt0Var.c && this.d == wt0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return xc0.i(wy1.k("BubbleBackgroundReactionColors(insideMy=", this.a, ", insideOthers=", this.b, ", outsideMy="), this.c, ", outsideOthers=", this.d, ")");
    }
}
