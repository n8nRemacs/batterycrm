package defpackage;

/* loaded from: classes2.dex */
public final class yle implements bme {
    public final long a;

    public yle(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yle) && this.a == ((yle) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "Error(requestId=", ")");
    }
}
