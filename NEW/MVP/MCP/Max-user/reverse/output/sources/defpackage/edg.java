package defpackage;

/* loaded from: classes2.dex */
public final class edg {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public edg(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edg)) {
            return false;
        }
        edg edgVar = (edg) obj;
        return this.a == edgVar.a && this.b == edgVar.b && this.c == edgVar.c && this.d == edgVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xrf.k(this.c, xrf.k(this.b, xrf.k(-1, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return xc0.i(wy1.k("TopbarTextDefaultColors(contrast=", this.a, ", contrastStatic=-1, primary=", this.b, ", secondary="), this.c, ", themed=", this.d, ")");
    }
}
