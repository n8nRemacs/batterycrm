package defpackage;

/* loaded from: classes2.dex */
public final class idf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public idf(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idf)) {
            return false;
        }
        idf idfVar = (idf) obj;
        idfVar.getClass();
        return this.a == idfVar.a && this.b == idfVar.b && this.c == idfVar.c && this.d == idfVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xrf.k(this.c, xrf.k(this.b, xrf.k(this.a, Integer.hashCode(-4473925) * 31, 31), 31), 31);
    }

    public final String toString() {
        return xc0.i(wy1.k("StatesTextActiveColors(contrastStatic=-4473925, negative=", this.a, ", neutralThemed=", this.b, ", primary="), this.c, ", themed=", this.d, ")");
    }
}
