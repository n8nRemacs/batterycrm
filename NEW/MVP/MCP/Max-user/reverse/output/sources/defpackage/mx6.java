package defpackage;

/* loaded from: classes2.dex */
public final class mx6 {
    public final int a;
    public final int b;

    public mx6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx6)) {
            return false;
        }
        mx6 mx6Var = (mx6) obj;
        return this.a == mx6Var.a && this.b == mx6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("GradientsLoadingIconThemedColors(filled=", this.a, ", transparent=", this.b, ")");
    }
}
