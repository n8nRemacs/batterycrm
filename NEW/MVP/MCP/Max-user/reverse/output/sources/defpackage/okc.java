package defpackage;

/* loaded from: classes2.dex */
public final class okc extends id0 {
    public final long b;

    public okc(long j) {
        super(16);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof okc) && this.b == ((okc) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return a9h.d(this.b, "ChatAttaches(chatId=", ")");
    }
}
