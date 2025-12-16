package defpackage;

/* loaded from: classes2.dex */
public final class wkh extends wa2 {
    public final long c;

    public wkh(long j) {
        super(Long.valueOf(j), 3);
        this.c = j;
    }

    @Override // defpackage.wa2
    public final Long a() {
        return Long.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wkh) && this.c == ((wkh) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return a9h.d(this.c, "ChatId(sourceId=", ")");
    }
}
