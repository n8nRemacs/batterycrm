package defpackage;

/* loaded from: classes2.dex */
public final class jnf {
    public final int a;

    public jnf(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jnf) && this.a == ((jnf) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "StrokeLocalTabBarColors(primary=", ")");
    }
}
