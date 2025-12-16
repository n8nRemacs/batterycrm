package defpackage;

/* loaded from: classes2.dex */
public final class xfc extends id0 {
    public final long b;

    public xfc(long j) {
        super(14);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xfc) && this.b == ((xfc) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return a9h.d(this.b, "OpenChat(chatId=", ")");
    }
}
