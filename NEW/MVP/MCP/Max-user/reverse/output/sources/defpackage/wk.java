package defpackage;

/* loaded from: classes.dex */
public final class wk {
    public final long a;

    public wk(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wk) && s65.e(this.a, ((wk) obj).a);
    }

    public final int hashCode() {
        int i = s65.d;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return ho7.i("AnrConfig(timeout=", s65.n(this.a), ")");
    }
}
