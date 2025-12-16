package defpackage;

/* loaded from: classes2.dex */
public final class vt0 {
    public final int a;
    public final int b;

    public vt0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt0)) {
            return false;
        }
        vt0 vt0Var = (vt0) obj;
        return this.a == vt0Var.a && this.b == vt0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("BubbleBackgroundFocusTransparentColors(max=", this.a, ", min=", this.b, ")");
    }
}
