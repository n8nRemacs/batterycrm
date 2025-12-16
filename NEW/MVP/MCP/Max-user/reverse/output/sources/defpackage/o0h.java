package defpackage;

/* loaded from: classes2.dex */
public final class o0h {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public o0h(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0h)) {
            return false;
        }
        o0h o0hVar = (o0h) obj;
        return this.a == o0hVar.a && this.b == o0hVar.b && this.c == o0hVar.c && this.d == o0hVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return xc0.i(wy1.k("VfxEmptyBlockHaloColors(bubble1=", this.a, ", bubble2=", this.b, ", bubble3="), this.c, ", bubble4=", this.d, ")");
    }
}
