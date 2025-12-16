package defpackage;

/* loaded from: classes2.dex */
public final class s6i {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public s6i(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6i)) {
            return false;
        }
        s6i s6iVar = (s6i) obj;
        return this.a == s6iVar.a && this.b == s6iVar.b && this.c == s6iVar.c && this.d == s6iVar.d && this.e == s6iVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("WritebarIconColors(neutral=", this.a, ", neutralSecondary=", this.b, ", neutralTertiary=");
        hf3.g(sbK, this.c, ", themed=", this.d, ", verificationReplyTo=");
        return ho7.j(sbK, this.e, ")");
    }
}
