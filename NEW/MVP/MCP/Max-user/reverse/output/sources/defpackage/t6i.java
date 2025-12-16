package defpackage;

/* loaded from: classes2.dex */
public final class t6i {
    public final int a;
    public final int b;
    public final int c;

    public t6i(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6i)) {
            return false;
        }
        t6i t6iVar = (t6i) obj;
        return this.a == t6iVar.a && this.b == t6iVar.b && this.c == t6iVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ho7.j(wy1.k("WritebarStrokeColors(areaSeparator=", this.a, ", input=", this.b, ", themed="), this.c, ")");
    }
}
