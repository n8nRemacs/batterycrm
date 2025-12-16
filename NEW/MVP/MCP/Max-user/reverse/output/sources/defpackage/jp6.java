package defpackage;

/* loaded from: classes2.dex */
public final class jp6 implements lp6 {
    public final int a;

    public jp6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jp6) && this.a == ((jp6) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "UpdateCameraLayoutParams(size=", ")");
    }
}
