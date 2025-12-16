package defpackage;

/* loaded from: classes2.dex */
public final class owb implements qwb {
    public final long a;

    public owb(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof owb) && this.a == ((owb) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a9h.d(this.a, "Fail(requestId=", ")");
    }
}
