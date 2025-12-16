package defpackage;

/* loaded from: classes2.dex */
public final class ei3 {
    public final int a;

    public ei3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ei3) && this.a == ((ei3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "CommonShadowsWriteBarColors(color=", ")");
    }
}
