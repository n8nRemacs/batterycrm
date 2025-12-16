package defpackage;

/* loaded from: classes2.dex */
public final class ype extends id0 {
    public final s5g b;
    public final Integer c;

    public ype(s5g s5gVar, Integer num) {
        super(19);
        this.b = s5gVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ype)) {
            return false;
        }
        ype ypeVar = (ype) obj;
        return fni.a(this.b, ypeVar.b) && fni.a(this.c, ypeVar.c);
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
