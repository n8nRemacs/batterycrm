package defpackage;

/* loaded from: classes2.dex */
public final class jx6 {
    public final int a;
    public final int b;

    public jx6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx6)) {
            return false;
        }
        jx6 jx6Var = (jx6) obj;
        return this.a == jx6Var.a && this.b == jx6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("GradientsLoadingIconNeutralThemedColors(filled=", this.a, ", transparent=", this.b, ")");
    }
}
