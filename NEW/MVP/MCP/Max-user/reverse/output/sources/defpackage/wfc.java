package defpackage;

/* loaded from: classes2.dex */
public final class wfc extends id0 {
    public final long b;

    public wfc(long j) {
        super(14);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wfc) && this.b == ((wfc) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return a9h.d(this.b, "InviteByLink(id=", ")");
    }
}
