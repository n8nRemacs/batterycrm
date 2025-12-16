package defpackage;

/* loaded from: classes2.dex */
public final class b7f extends f7f {
    public final long c;

    public b7f(long j) {
        super(j, 3);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b7f) && this.c == ((b7f) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return a9h.d(this.c, "ChatId(chatId=", ")");
    }
}
