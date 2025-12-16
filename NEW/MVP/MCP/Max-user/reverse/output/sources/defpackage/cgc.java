package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class cgc extends id0 {
    public final s5g b;
    public final s5g c;
    public final List d;

    public cgc(s5g s5gVar, s5g s5gVar2, List list) {
        super(14);
        this.b = s5gVar;
        this.c = s5gVar2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgc)) {
            return false;
        }
        cgc cgcVar = (cgc) obj;
        return fni.a(this.b, cgcVar.b) && fni.a(this.c, cgcVar.c) && fni.a(this.d, cgcVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        s5g s5gVar = this.c;
        return this.d.hashCode() + ((iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmation(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", buttons=");
        return az1.j(sb, this.d, ")");
    }
}
