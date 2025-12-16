package defpackage;

/* loaded from: classes2.dex */
public final class m94 implements o94 {
    public final long a;

    public m94(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m94) && this.a == ((m94) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "Fail(requestId=", ")");
    }
}
