package defpackage;

/* loaded from: classes2.dex */
public final class ihc {
    public final Long a;
    public final s5g b;

    public ihc(Long l, s5g s5gVar) {
        this.a = l;
        this.b = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihc)) {
            return false;
        }
        ihc ihcVar = (ihc) obj;
        return fni.a(this.a, ihcVar.a) && fni.a(this.b, ihcVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}
