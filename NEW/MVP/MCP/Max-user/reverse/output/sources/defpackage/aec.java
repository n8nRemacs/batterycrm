package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class aec implements cec {
    public final s5g a;
    public final s5g b;
    public final List c;

    public aec(s5g s5gVar, p5g p5gVar, List list) {
        this.a = s5gVar;
        this.b = p5gVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aec)) {
            return false;
        }
        aec aecVar = (aec) obj;
        return fni.a(this.a, aecVar.a) && fni.a(this.b, aecVar.b) && fni.a(this.c, aecVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        s5g s5gVar = this.b;
        return this.c.hashCode() + ((iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowConfirmation(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", buttons=");
        return az1.j(sb, this.c, ")");
    }
}
