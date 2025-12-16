package defpackage;

/* loaded from: classes2.dex */
public final class x15 implements z15 {
    public final boolean a;

    public x15(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x15) && this.a == ((x15) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("FileDownloadInterrupted(shouldRetry=", ")", this.a);
    }
}
