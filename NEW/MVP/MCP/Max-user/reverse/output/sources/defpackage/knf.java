package defpackage;

/* loaded from: classes2.dex */
public final class knf {
    public final int a;

    public knf(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof knf) && this.a == ((knf) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "StrokeLocalTopBarColors(primary=", ")");
    }
}
