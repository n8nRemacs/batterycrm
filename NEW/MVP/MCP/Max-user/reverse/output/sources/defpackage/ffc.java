package defpackage;

/* loaded from: classes2.dex */
public final class ffc implements jfc {
    public final long a;

    public ffc(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ffc) && this.a == ((ffc) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "ChatUpdate(requestId=", ")");
    }
}
