package defpackage;

/* loaded from: classes2.dex */
public final class ifc implements jfc {
    public final Long a;
    public final s5g b;

    public ifc(Long l, s5g s5gVar) {
        this.a = l;
        this.b = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifc)) {
            return false;
        }
        ifc ifcVar = (ifc) obj;
        return fni.a(this.a, ifcVar.a) && fni.a(this.b, ifcVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}
