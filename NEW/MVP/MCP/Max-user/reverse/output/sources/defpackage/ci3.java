package defpackage;

/* loaded from: classes2.dex */
public final class ci3 {
    public final int a;
    public final int b;

    public ci3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci3)) {
            return false;
        }
        ci3 ci3Var = (ci3) obj;
        return this.a == ci3Var.a && this.b == ci3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("CommonShadowsElevation2Colors(primary=", this.a, ", secondary=", this.b, ")");
    }
}
