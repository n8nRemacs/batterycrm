package defpackage;

/* loaded from: classes2.dex */
public final class upe extends id0 {
    public final long b;

    public upe(long j) {
        super(19);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof upe) && this.b == ((upe) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return a9h.d(this.b, "EditProfile(id=", ")");
    }
}
