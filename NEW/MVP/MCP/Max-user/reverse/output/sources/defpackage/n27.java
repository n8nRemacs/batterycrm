package defpackage;

/* loaded from: classes2.dex */
public final class n27 implements pr9 {
    public final long a;

    public n27(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n27) && this.a == ((n27) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "HideMessageContextMenu(messageId=", ")");
    }
}
