package defpackage;

/* loaded from: classes2.dex */
public final class e08 {
    public final int a;

    public e08(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e08) && this.a == ((e08) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "StateConfig(titleTextColor=", ")");
    }
}
