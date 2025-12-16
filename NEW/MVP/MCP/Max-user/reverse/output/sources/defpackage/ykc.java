package defpackage;

/* loaded from: classes2.dex */
public final class ykc extends id0 {
    public final long b;

    public ykc(long j) {
        super(16);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ykc) && this.b == ((ykc) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return a9h.d(this.b, "Search(chatId=", ")");
    }
}
