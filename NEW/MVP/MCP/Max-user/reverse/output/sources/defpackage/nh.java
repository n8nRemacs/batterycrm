package defpackage;

/* loaded from: classes2.dex */
public final class nh extends sh {
    public final int a;

    public nh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nh) && this.a == ((nh) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "Color(value=", ")");
    }
}
