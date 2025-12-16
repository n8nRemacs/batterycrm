package defpackage;

/* loaded from: classes2.dex */
public final class vb7 {
    public final int a;
    public final int b;

    public vb7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb7)) {
            return false;
        }
        vb7 vb7Var = (vb7) obj;
        return this.a == vb7Var.a && this.b == vb7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("IconLocalTabbarColors(active=", this.a, ", inactive=", this.b, ")");
    }
}
