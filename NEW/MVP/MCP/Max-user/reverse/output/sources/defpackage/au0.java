package defpackage;

/* loaded from: classes2.dex */
public final class au0 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public au0(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au0)) {
            return false;
        }
        au0 au0Var = (au0) obj;
        return this.a == au0Var.a && this.b == au0Var.b && this.c == au0Var.c && this.d == au0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return xc0.i(wy1.k("BubbleStrokeColors(action=", this.a, ", neutralSecondary=", this.b, ", reply="), this.c, ", replyOutside=", this.d, ")");
    }
}
