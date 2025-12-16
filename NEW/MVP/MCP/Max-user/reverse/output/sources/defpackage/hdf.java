package defpackage;

/* loaded from: classes2.dex */
public final class hdf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public hdf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdf)) {
            return false;
        }
        hdf hdfVar = (hdf) obj;
        return this.a == hdfVar.a && this.b == hdfVar.b && this.c == hdfVar.c && this.d == hdfVar.d && this.e == hdfVar.e && this.f == hdfVar.f && this.g == hdfVar.g && this.h == hdfVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("StatesIconDisabledColors(contrast=", this.a, ", contrastStatic=", this.b, ", negative=");
        hf3.g(sbK, this.c, ", neutralThemed=", this.d, ", positive=");
        hf3.g(sbK, this.e, ", primary=", this.f, ", primaryStatic=");
        return xc0.i(sbK, this.g, ", themed=", this.h, ")");
    }
}
