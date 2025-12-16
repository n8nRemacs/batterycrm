package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class uhc extends xhc {
    public final n5g a;
    public final n5g b;
    public final List c;

    public uhc(n5g n5gVar, n5g n5gVar2, List list) {
        this.a = n5gVar;
        this.b = n5gVar2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uhc)) {
            return false;
        }
        uhc uhcVar = (uhc) obj;
        return this.a.equals(uhcVar.a) && this.b.equals(uhcVar.b) && fni.a(this.c, uhcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.k(this.b.c, Integer.hashCode(this.a.c) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowBottomSheet(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return az1.j(sb, this.c, ")");
    }
}
