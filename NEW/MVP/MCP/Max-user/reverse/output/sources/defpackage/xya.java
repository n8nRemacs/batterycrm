package defpackage;

/* loaded from: classes2.dex */
public final class xya implements yya {
    public final int a;

    public xya(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xya) && this.a == ((xya) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "Resource(iconRes=", ")");
    }
}
