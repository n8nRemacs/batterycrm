package defpackage;

/* loaded from: classes2.dex */
public final class hq0 implements iq0 {
    public final long a;

    public hq0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hq0) && this.a == ((hq0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "Error(requestId=", ")");
    }
}
