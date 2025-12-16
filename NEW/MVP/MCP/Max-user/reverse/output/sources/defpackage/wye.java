package defpackage;

/* loaded from: classes2.dex */
public final class wye implements pr9 {
    public final long a;

    public wye(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wye) && this.a == ((wye) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "ShowUnpinCancelableSnackbar(messageId=", ")");
    }
}
