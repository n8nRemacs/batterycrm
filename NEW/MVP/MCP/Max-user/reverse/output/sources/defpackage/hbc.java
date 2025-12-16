package defpackage;

/* loaded from: classes2.dex */
public final class hbc implements jbc {
    public final int a;

    public hbc(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbc) && this.a == ((hbc) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "SetMainPhoto(index=", ")");
    }
}
