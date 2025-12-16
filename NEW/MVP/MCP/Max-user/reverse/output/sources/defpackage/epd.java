package defpackage;

/* loaded from: classes2.dex */
public final class epd {
    public final long a;

    public epd(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof epd) && this.a == ((epd) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "RestrictionsInfo(expiration=", ")");
    }
}
