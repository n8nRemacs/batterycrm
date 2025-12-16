package defpackage;

/* loaded from: classes2.dex */
public final class gx6 {
    public final int a;
    public final int b;

    public gx6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx6)) {
            return false;
        }
        gx6 gx6Var = (gx6) obj;
        return this.a == gx6Var.a && this.b == gx6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("GradientsLoadingIconContrastColors(filled=", this.a, ", transparent=", this.b, ")");
    }
}
