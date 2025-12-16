package defpackage;

/* loaded from: classes.dex */
public final class aa1 implements ba1 {
    public final long a;

    public aa1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa1) && this.a == ((aa1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "Error(requestId=", ")");
    }
}
