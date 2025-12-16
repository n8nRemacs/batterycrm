package defpackage;

/* loaded from: classes2.dex */
public final class jf0 {
    public final int a;
    public final int b;

    public jf0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf0)) {
            return false;
        }
        jf0 jf0Var = (jf0) obj;
        return this.a == jf0Var.a && this.b == jf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("BackgroundLocalChipsColors(active=", this.a, ", default=", this.b, ")");
    }
}
