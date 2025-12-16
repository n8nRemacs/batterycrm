package defpackage;

/* loaded from: classes2.dex */
public final class rx6 {
    public final int a;

    public rx6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx6) && this.a == ((rx6) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "GradientsSkeletonGradientGridColors(staticBackground=", ")");
    }
}
