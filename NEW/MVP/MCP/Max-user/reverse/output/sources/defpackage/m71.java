package defpackage;

/* loaded from: classes.dex */
public final class m71 implements u71 {
    public final long a;

    public m71(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m71) && this.a == ((m71) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "Error(requestId=", ")");
    }
}
