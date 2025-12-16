package defpackage;

/* loaded from: classes2.dex */
public final class kdf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public kdf(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdf)) {
            return false;
        }
        kdf kdfVar = (kdf) obj;
        return this.a == kdfVar.a && this.b == kdfVar.b && this.c == kdfVar.c && this.d == kdfVar.d && this.e == kdfVar.e && this.f == kdfVar.f && this.g == kdfVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("StatesTextDisabledColors(contrast=", this.a, ", contrastStatic=", this.b, ", negative=");
        hf3.g(sbK, this.c, ", neutralThemed=", this.d, ", primary=");
        hf3.g(sbK, this.e, ", primaryStatic=", this.f, ", themed=");
        return ho7.j(sbK, this.g, ")");
    }
}
