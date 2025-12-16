package defpackage;

/* loaded from: classes2.dex */
public final class mkc extends id0 {
    public final long b;

    public mkc(long j) {
        super(16);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mkc) && this.b == ((mkc) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return a9h.d(this.b, "AddToFolder(chatId=", ")");
    }
}
