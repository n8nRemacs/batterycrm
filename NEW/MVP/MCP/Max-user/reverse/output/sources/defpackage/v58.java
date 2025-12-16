package defpackage;

/* loaded from: classes2.dex */
public final class v58 extends y58 {
    public final long a;

    public v58(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v58) && this.a == ((v58) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "ScrollToMessage(localMessageId=", ")");
    }
}
