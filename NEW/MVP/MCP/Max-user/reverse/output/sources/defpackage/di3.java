package defpackage;

/* loaded from: classes2.dex */
public final class di3 {
    public final int a;

    public di3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof di3) && this.a == ((di3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "CommonShadowsTopBarColors(color=", ")");
    }
}
