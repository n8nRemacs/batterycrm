package defpackage;

/* loaded from: classes2.dex */
public final class y2a {
    public final long a;

    public y2a(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y2a) && this.a == ((y2a) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "MovieId(id=", ")");
    }
}
