package defpackage;

/* loaded from: classes2.dex */
public final class ucg {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ucg(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucg)) {
            return false;
        }
        ucg ucgVar = (ucg) obj;
        return this.a == ucgVar.a && this.b == ucgVar.b && this.c == ucgVar.c && this.d == ucgVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xrf.k(this.c, xrf.k(-855638017, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return xc0.i(wy1.k("TopbarBackgroundDefaultColors(neutral=", this.a, ", neutralFade=", this.b, ", primary=-855638017, themed="), this.c, ", topbar=", this.d, ")");
    }
}
