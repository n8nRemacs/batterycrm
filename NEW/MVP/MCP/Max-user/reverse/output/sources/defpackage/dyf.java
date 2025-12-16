package defpackage;

/* loaded from: classes2.dex */
public final class dyf {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public dyf(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyf)) {
            return false;
        }
        dyf dyfVar = (dyf) obj;
        return this.a == dyfVar.a && this.b == dyfVar.b && this.c == dyfVar.c && this.d == dyfVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("StateConfig(startIconColor=", this.a, ", titleTextColor=", this.b, ", endIconColor=");
        sbK.append(this.c);
        sbK.append(", isEndIconVisible=");
        sbK.append(this.d);
        sbK.append(")");
        return sbK.toString();
    }
}
