package defpackage;

/* loaded from: classes2.dex */
public final class z05 implements c15 {
    public final boolean a;

    public z05(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z05) && this.a == ((z05) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("FileDownloadInterrupted(shouldRetry=", ")", this.a);
    }
}
