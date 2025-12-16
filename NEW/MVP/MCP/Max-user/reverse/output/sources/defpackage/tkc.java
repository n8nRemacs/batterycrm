package defpackage;

/* loaded from: classes2.dex */
public final class tkc extends id0 {
    public final long b;

    public tkc(long j) {
        super(16);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tkc) && this.b == ((tkc) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return a9h.d(this.b, "InviteByLink(chatId=", ")");
    }
}
