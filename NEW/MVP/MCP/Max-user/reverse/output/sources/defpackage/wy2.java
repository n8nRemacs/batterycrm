package defpackage;

/* loaded from: classes2.dex */
public final class wy2 extends id0 {
    public final long b;

    public wy2(long j) {
        super(5);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy2) && this.b == ((wy2) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return a9h.d(this.b, "OpenChatAndUpdateBackstack(chatId=", ")");
    }
}
