package defpackage;

/* loaded from: classes2.dex */
public final class iwb implements jwb {
    public final long a;

    public iwb(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwb) && this.a == ((iwb) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "OpenChat(chatId=", ")");
    }
}
