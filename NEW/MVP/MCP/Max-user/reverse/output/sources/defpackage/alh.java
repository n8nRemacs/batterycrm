package defpackage;

/* loaded from: classes2.dex */
public final class alh extends wa2 {
    public final long c;

    public alh(long j) {
        super(Long.valueOf(j), 5);
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
        return (obj instanceof alh) && this.c == ((alh) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return a9h.d(this.c, "Folder(sourceId=", ")");
    }
}
