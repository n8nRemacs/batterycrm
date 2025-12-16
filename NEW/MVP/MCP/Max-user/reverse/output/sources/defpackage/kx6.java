package defpackage;

/* loaded from: classes2.dex */
public final class kx6 {
    public final int a;
    public final int b;

    public kx6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx6)) {
            return false;
        }
        kx6 kx6Var = (kx6) obj;
        return this.a == kx6Var.a && this.b == kx6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("GradientsLoadingIconPrimaryColors(filled=", this.a, ", transparent=", this.b, ")");
    }
}
