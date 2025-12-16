package defpackage;

/* loaded from: classes2.dex */
public final class oye implements pr9 {
    public final long a;

    public oye(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oye) && this.a == ((oye) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "ShowReply(messageId=", ")");
    }
}
