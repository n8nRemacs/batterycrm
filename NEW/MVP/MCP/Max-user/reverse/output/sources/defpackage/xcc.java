package defpackage;

/* loaded from: classes2.dex */
public final class xcc extends ddc {
    public final long b;

    public xcc(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xcc) && this.b == ((xcc) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return a9h.d(this.b, "OpenAddSubscribersAndUpdateBackstack(id=", ")");
    }
}
