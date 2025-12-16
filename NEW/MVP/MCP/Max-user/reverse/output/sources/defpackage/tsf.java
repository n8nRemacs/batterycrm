package defpackage;

/* loaded from: classes2.dex */
public final class tsf extends sj0 {
    public final long b;

    public tsf(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tsf) && this.b == ((tsf) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    @Override // defpackage.sj0
    public final String toString() {
        return a9h.d(this.b, "SuspendBotEvent(chatId=", ")");
    }
}
