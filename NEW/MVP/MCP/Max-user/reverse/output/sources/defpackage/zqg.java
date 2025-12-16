package defpackage;

/* loaded from: classes2.dex */
public final class zqg {
    public final long a;

    public zqg(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqg) && this.a == ((zqg) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "UnknownContactState(contactId=", ")");
    }
}
