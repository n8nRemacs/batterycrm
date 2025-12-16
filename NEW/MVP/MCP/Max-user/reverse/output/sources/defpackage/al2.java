package defpackage;

/* loaded from: classes2.dex */
public final class al2 implements fl2 {
    public final long a;

    public al2(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof al2) && this.a == ((al2) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "Add(messageId=", ")");
    }
}
