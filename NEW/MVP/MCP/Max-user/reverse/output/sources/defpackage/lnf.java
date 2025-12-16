package defpackage;

/* loaded from: classes2.dex */
public final class lnf {
    public final int a;
    public final int b;
    public final int c;

    public lnf(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnf)) {
            return false;
        }
        lnf lnfVar = (lnf) obj;
        return this.a == lnfVar.a && this.b == lnfVar.b && this.c == lnfVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ho7.j(wy1.k("StrokeSeparatorColors(contrast=", this.a, ", primary=", this.b, ", secondary="), this.c, ")");
    }
}
