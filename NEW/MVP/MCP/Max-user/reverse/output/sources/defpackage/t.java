package defpackage;

/* loaded from: classes.dex */
public final class t extends cda {
    public final long b;

    public t(long j) {
        super(qqg.a);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.b == ((t) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return a9h.d(this.b, "OpenChat(chatId=", ")");
    }
}
