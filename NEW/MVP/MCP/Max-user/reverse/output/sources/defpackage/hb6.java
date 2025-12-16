package defpackage;

/* loaded from: classes2.dex */
public final class hb6 {
    public final int a;
    public final int b;
    public final int c;

    public hb6(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb6)) {
            return false;
        }
        hb6 hb6Var = (hb6) obj;
        return this.a == hb6Var.a && this.b == hb6Var.b && this.c == hb6Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ho7.j(wy1.k("WidthConstraints(scrollThresholdItemCount=", this.a, ", min=", this.b, ", max="), this.c, ")");
    }
}
