package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class irg {
    public final n5g a;
    public final s5g b;
    public final List c;
    public final int d;

    public irg(n5g n5gVar, n5g n5gVar2, List list, int i) {
        this.a = n5gVar;
        this.b = n5gVar2;
        this.c = list;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irg)) {
            return false;
        }
        irg irgVar = (irg) obj;
        return this.a.equals(irgVar.a) && fni.a(this.b, irgVar.b) && this.c.equals(irgVar.c) && this.d == irgVar.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.c) * 31;
        s5g s5gVar = this.b;
        return az1.v(this.d) + xrf.l(this.c, (iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SheetState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", buttons=");
        sb.append(this.c);
        sb.append(", buttonType=");
        int i = this.d;
        sb.append(i != 1 ? i != 2 ? "null" : "BLOCK_REASON" : "STATUS");
        sb.append(")");
        return sb.toString();
    }
}
