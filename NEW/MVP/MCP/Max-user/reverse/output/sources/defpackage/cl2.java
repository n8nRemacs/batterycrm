package defpackage;

/* loaded from: classes2.dex */
public final class cl2 implements fl2 {
    public final long a;

    public cl2(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cl2) && this.a == ((cl2) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "DownloadError(messageId=", ")");
    }
}
