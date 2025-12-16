package defpackage;

/* loaded from: classes2.dex */
public final class gtc implements htc {
    public final long a;

    public gtc(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gtc) && s65.e(this.a, ((gtc) obj).a);
    }

    public final int hashCode() {
        int i = s65.d;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return ho7.i("TakePhoto(captureTimeout=", s65.n(this.a), ")");
    }
}
