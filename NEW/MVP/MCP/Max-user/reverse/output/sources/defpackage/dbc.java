package defpackage;

/* loaded from: classes2.dex */
public final class dbc extends sj0 {
    public final long b;
    public final long c;

    public dbc(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbc)) {
            return false;
        }
        dbc dbcVar = (dbc) obj;
        return this.b == dbcVar.b && this.c == dbcVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    @Override // defpackage.sj0
    public final String toString() {
        return ho7.k(az1.l(this.b, "ProfileAvatarUpdatedEvent(requestId=", ", photoId="), this.c, ")");
    }
}
