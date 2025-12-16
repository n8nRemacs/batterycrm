package defpackage;

/* loaded from: classes2.dex */
public final class cdg {
    public final int a;
    public final int b;

    public cdg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdg)) {
            return false;
        }
        cdg cdgVar = (cdg) obj;
        return this.a == cdgVar.a && this.b == cdgVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("TopbarStrokeSeparatorDefaultColors(primary=", this.a, ", secondary=", this.b, ")");
    }
}
