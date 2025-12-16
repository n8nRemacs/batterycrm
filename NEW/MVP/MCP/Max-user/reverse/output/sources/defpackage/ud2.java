package defpackage;

/* loaded from: classes2.dex */
public final class ud2 extends sj0 {
    public final long b;

    public ud2(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ud2) && this.b == ((ud2) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    @Override // defpackage.sj0
    public final String toString() {
        return a9h.d(this.b, "ChatClearEvent(chatId=", ")");
    }
}
