package defpackage;

/* loaded from: classes2.dex */
public final class u6i {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public u6i(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
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
        if (!(obj instanceof u6i)) {
            return false;
        }
        u6i u6iVar = (u6i) obj;
        return this.a == u6iVar.a && this.b == u6iVar.b && this.c == u6iVar.c && this.d == u6iVar.d && this.e == u6iVar.e && this.f == u6iVar.f && this.g == u6iVar.g && this.h == u6iVar.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("WritebarTextColors(input=", this.a, ", inputMDLink=", this.b, ", inputPlaceholder=");
        hf3.g(sbK, this.c, ", primary=", this.d, ", replyMessage=");
        hf3.g(sbK, this.e, ", replyTo=", this.f, ", secondary=");
        return xc0.i(sbK, this.g, ", themed=", this.h, ")");
    }
}
