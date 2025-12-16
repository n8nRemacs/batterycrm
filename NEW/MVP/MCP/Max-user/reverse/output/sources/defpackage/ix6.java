package defpackage;

/* loaded from: classes2.dex */
public final class ix6 {
    public final int a;
    public final int b;

    public ix6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix6)) {
            return false;
        }
        ix6 ix6Var = (ix6) obj;
        return this.a == ix6Var.a && this.b == ix6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("GradientsLoadingIconNegativeColors(filled=", this.a, ", transparent=", this.b, ")");
    }
}
