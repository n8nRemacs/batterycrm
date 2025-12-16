package defpackage;

/* loaded from: classes2.dex */
public final class huh implements avh {
    public final int a;

    public huh(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof huh) && this.a == ((huh) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "OpenFileManager(mode=", ")");
    }
}
