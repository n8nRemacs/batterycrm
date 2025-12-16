package defpackage;

/* loaded from: classes2.dex */
public final class qt0 {
    public final int a;
    public final int b;
    public final int c;

    public qt0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt0)) {
            return false;
        }
        qt0 qt0Var = (qt0) obj;
        return this.a == qt0Var.a && this.b == qt0Var.b && this.c == qt0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ho7.j(wy1.k("BubbleBackgroundBotButtonColors(default=", this.a, ", loading=", this.b, ", pressed="), this.c, ")");
    }
}
