package defpackage;

/* loaded from: classes2.dex */
public final class u3g {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public u3g(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3g)) {
            return false;
        }
        u3g u3gVar = (u3g) obj;
        return this.a == u3gVar.a && this.b == u3gVar.b && this.c == u3gVar.c && this.d == u3gVar.d && this.e == u3gVar.e && this.f == u3gVar.f && this.g == u3gVar.g && this.h == u3gVar.h && this.i == u3gVar.i && this.j == u3gVar.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + xrf.k(this.i, xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, xrf.k(-520093697, xrf.k(-1, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("TextColors(contrast=", this.a, ", contrastStatic=-1, fileType=-520093697, negative=", this.b, ", neutralThemed=");
        hf3.g(sbK, this.c, ", positive=", this.d, ", primary=");
        hf3.g(sbK, this.e, ", primaryStatic=", this.f, ", secondary=");
        hf3.g(sbK, this.g, ", subhead=", this.h, ", tertiary=");
        return xc0.i(sbK, this.i, ", themed=", this.j, ")");
    }
}
