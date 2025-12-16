package defpackage;

/* loaded from: classes.dex */
public final class s54 implements v54 {
    public final int a;

    public s54(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s54) && this.a == ((s54) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "Seeking(progress=", ")");
    }
}
