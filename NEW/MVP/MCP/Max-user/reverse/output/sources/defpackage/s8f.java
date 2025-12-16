package defpackage;

/* loaded from: classes2.dex */
public final class s8f {
    public final int a;

    public s8f(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8f) && this.a == ((s8f) obj).a && Double.compare(2.8d, 2.8d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(2.8d) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.e(this.a, "SquircleParams(radius=", ", curvature=2.8)");
    }
}
