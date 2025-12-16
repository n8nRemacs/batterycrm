package defpackage;

/* loaded from: classes2.dex */
public final class fi3 {
    public final int a;

    public fi3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fi3) && this.a == ((fi3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "CommonStatesBackgroundActiveActionColors(themed=", ")");
    }
}
