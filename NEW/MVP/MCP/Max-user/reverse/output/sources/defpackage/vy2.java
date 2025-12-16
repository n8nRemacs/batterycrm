package defpackage;

/* loaded from: classes2.dex */
public final class vy2 extends id0 {
    public final long b;

    public vy2(long j) {
        super(5);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vy2) && this.b == ((vy2) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return a9h.d(this.b, "OpenChangeChannelTypeAndUpdateBackstack(chatId=", ")");
    }
}
