package defpackage;

/* loaded from: classes2.dex */
public final class s18 implements u18 {
    public final int a;
    public final int b;
    public final int c;

    public s18(int i, int i2, int i3) {
        i2 = (i3 & 2) != 0 ? 0 : i2;
        int i4 = (i3 & 4) != 0 ? 1 : 2;
        this.a = i;
        this.b = i2;
        this.c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s18)) {
            return false;
        }
        s18 s18Var = (s18) obj;
        return this.a == s18Var.a && this.b == s18Var.b && this.c == s18Var.c;
    }

    public final int hashCode() {
        return az1.v(this.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("Icon(res=", this.a, ", tintColor=", this.b, ", scaleType=");
        int i = this.c;
        sbK.append(i != 1 ? i != 2 ? "null" : "CENTER_INSIDE" : "DEFAULT");
        sbK.append(")");
        return sbK.toString();
    }
}
