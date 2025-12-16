package defpackage;

/* loaded from: classes2.dex */
public final class as9 implements cs9 {
    public final long a;

    public as9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof as9) && this.a == ((as9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "SetEditedMessage(messageId=", ")");
    }
}
