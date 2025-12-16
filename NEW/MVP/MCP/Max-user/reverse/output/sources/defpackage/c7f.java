package defpackage;

/* loaded from: classes2.dex */
public final class c7f extends f7f {
    public final long c;

    public c7f(long j) {
        super(j, 2);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7f) && this.c == ((c7f) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return a9h.d(this.c, "DialogBotId(botId=", ")");
    }
}
