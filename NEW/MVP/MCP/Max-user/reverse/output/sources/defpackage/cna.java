package defpackage;

/* loaded from: classes2.dex */
public final class cna {
    public final long a;
    public final long b;

    public cna(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cna)) {
            return false;
        }
        cna cnaVar = (cna) obj;
        return this.a == cnaVar.a && this.b == cnaVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ho7.k(az1.l(this.a, "NotificationReadMarkDb(chatServerId=", ", mark="), this.b, ")");
    }
}
