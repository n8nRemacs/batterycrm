package defpackage;

/* loaded from: classes2.dex */
public final class wsg {
    public final long a;
    public final jdc b;
    public final int c;

    public wsg(long j, jdc jdcVar, int i) {
        this.a = j;
        this.b = jdcVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsg)) {
            return false;
        }
        wsg wsgVar = (wsg) obj;
        return this.a == wsgVar.a && fni.a(this.b, wsgVar.b) && this.c == wsgVar.c;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        jdc jdcVar = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (jdcVar == null ? 0 : jdcVar.hashCode())) * 31);
    }

    public final String toString() {
        return "UpdateAttachesEntity(id=" + this.a + ", attaches=" + this.b + ", mediaType=" + this.c + ")";
    }
}
