package defpackage;

/* loaded from: classes2.dex */
public final class ue6 {
    public final int a;

    public static String a(int i) {
        return i == -1 ? "Progress(indeterminate)" : i == 0 ? "Progress(none)" : wy1.e(i, "Progress(", "%)");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ue6) {
            return this.a == ((ue6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
