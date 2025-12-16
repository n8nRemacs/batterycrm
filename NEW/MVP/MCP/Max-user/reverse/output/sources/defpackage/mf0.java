package defpackage;

/* loaded from: classes2.dex */
public final class mf0 {
    public final int a;

    public mf0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf0) && this.a == ((mf0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "BackgroundLocalTabBarColors(primary=", ")");
    }
}
