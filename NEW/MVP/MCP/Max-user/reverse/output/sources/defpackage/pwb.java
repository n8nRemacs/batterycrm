package defpackage;

/* loaded from: classes2.dex */
public final class pwb implements qwb {
    public final long a;

    public pwb(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pwb) && this.a == ((pwb) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "Success(requestId=", ")");
    }
}
