package defpackage;

/* loaded from: classes2.dex */
public final class r1e {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public r1e(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1e)) {
            return false;
        }
        r1e r1eVar = (r1e) obj;
        return this.a == r1eVar.a && this.b == r1eVar.b && this.c == r1eVar.c && this.d == r1eVar.d && this.e == r1eVar.e && this.f == r1eVar.f && this.g == r1eVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + a9h.b(a9h.b(xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("ScreenInfo(realHeight=", this.a, ", realWidth=", this.b, ", topInset=");
        hf3.g(sbK, this.c, ", bottomInset=", this.d, ", isWeakDevice=");
        az1.t(", isLong=", ", isWide=", sbK, this.e, this.f);
        return az1.k(sbK, this.g, ")");
    }
}
