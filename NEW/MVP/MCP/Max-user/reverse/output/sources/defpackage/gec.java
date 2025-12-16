package defpackage;

/* loaded from: classes2.dex */
public final class gec extends cda {
    public final long b;

    public gec(long j) {
        super(qqg.a);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gec) && this.b == ((gec) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return a9h.d(this.b, "BackToChat(chatId=", ")");
    }
}
