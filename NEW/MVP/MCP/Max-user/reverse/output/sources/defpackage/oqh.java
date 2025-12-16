package defpackage;

/* loaded from: classes2.dex */
public final class oqh extends pqh {
    public final long a;

    public oqh(long j) {
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
        return (obj instanceof oqh) && this.a == ((oqh) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "Error(requestId=", ")");
    }
}
