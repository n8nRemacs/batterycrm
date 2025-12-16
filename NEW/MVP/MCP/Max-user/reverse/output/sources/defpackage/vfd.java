package defpackage;

/* loaded from: classes2.dex */
public final class vfd implements wfd {
    public final long a;

    public vfd(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfd) && this.a == ((vfd) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "VideoMsg(duration=", ")");
    }
}
