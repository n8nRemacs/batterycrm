package defpackage;

/* loaded from: classes2.dex */
public final class ykh extends wa2 {
    public final long c;

    public ykh(long j) {
        super(Long.valueOf(j), 1);
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
        return (obj instanceof ykh) && this.c == ((ykh) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return a9h.d(this.c, "DialogUserId(sourceId=", ")");
    }
}
