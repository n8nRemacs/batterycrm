package defpackage;

/* loaded from: classes2.dex */
public final class d7f extends f7f {
    public final long c;

    public d7f(long j) {
        super(j, 1);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d7f) && this.c == ((d7f) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return a9h.d(this.c, "DialogUserId(contactId=", ")");
    }
}
