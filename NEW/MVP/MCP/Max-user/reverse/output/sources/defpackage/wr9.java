package defpackage;

/* loaded from: classes2.dex */
public final class wr9 implements xr9 {
    public final long a;

    public wr9(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wr9) && this.a == ((wr9) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "ShowReactions(messageId=", ")");
    }
}
