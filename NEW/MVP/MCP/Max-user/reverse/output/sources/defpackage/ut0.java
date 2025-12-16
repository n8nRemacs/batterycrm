package defpackage;

/* loaded from: classes2.dex */
public final class ut0 {
    public final int a;
    public final int b;

    public ut0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut0)) {
            return false;
        }
        ut0 ut0Var = (ut0) obj;
        return this.a == ut0Var.a && this.b == ut0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("BubbleBackgroundFocusSingleMediaColors(max=", this.a, ", min=", this.b, ")");
    }
}
