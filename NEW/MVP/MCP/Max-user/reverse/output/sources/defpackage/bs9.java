package defpackage;

/* loaded from: classes2.dex */
public final class bs9 implements cs9 {
    public final long a;

    public bs9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs9) && this.a == ((bs9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "SetRepliedMessage(messageId=", ")");
    }
}
