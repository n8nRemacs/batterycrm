package defpackage;

/* loaded from: classes2.dex */
public final class nb7 {
    public final tb7 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public nb7(tb7 tb7Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a = tb7Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb7)) {
            return false;
        }
        nb7 nb7Var = (nb7) obj;
        return this.a.equals(nb7Var.a) && this.b == nb7Var.b && this.c == nb7Var.c && this.d == nb7Var.d && this.e == nb7Var.e && this.f == nb7Var.f && this.g == nb7Var.g && this.h == nb7Var.h && this.i == nb7Var.i && this.j == nb7Var.j && this.k == nb7Var.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + xrf.k(this.j, xrf.k(this.i, xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(-1, xrf.k(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconColors(local=");
        sb.append(this.a);
        sb.append(", contrast=");
        sb.append(this.b);
        sb.append(", contrastStatic=-1, negative=");
        hf3.g(sb, this.c, ", neutralThemed=", this.d, ", positive=");
        hf3.g(sb, this.e, ", primary=", this.f, ", primaryStatic=");
        hf3.g(sb, this.g, ", quaternary=", this.h, ", secondary=");
        hf3.g(sb, this.i, ", tertiary=", this.j, ", themed=");
        return ho7.j(sb, this.k, ")");
    }
}
