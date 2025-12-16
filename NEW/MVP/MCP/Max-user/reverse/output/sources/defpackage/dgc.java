package defpackage;

/* loaded from: classes2.dex */
public final class dgc extends id0 {
    public final s5g b;
    public final Integer c;

    public dgc(s5g s5gVar, Integer num) {
        super(14);
        this.b = s5gVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgc)) {
            return false;
        }
        dgc dgcVar = (dgc) obj;
        return fni.a(this.b, dgcVar.b) && fni.a(this.c, dgcVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.b + ", icon=" + this.c + ")";
    }
}
