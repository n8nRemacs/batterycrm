package defpackage;

/* loaded from: classes2.dex */
public final class a7f extends f7f {
    public final long c;

    public a7f(long j) {
        super(j, 4);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7f) && this.c == ((a7f) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return a9h.d(this.c, "ChannelId(channelId=", ")");
    }
}
