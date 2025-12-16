package defpackage;

/* loaded from: classes2.dex */
public final class nqh extends pqh {
    public final long a;

    public nqh(long j) {
        this.a = j;
    }

    @Override // defpackage.pqh
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqh) && this.a == ((nqh) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "Completed(requestId=", ")");
    }
}
