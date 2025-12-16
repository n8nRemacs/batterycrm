package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ptg {
    public final long a;
    public final String b;
    public final List c;
    public final jm9 d;

    public ptg(long j, String str, List list, jm9 jm9Var) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = jm9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptg)) {
            return false;
        }
        ptg ptgVar = (ptg) obj;
        return this.a == ptgVar.a && fni.a(this.b, ptgVar.b) && fni.a(this.c, ptgVar.c) && this.d == ptgVar.d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.d.hashCode() + xrf.l(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("UpdateTextEntity(id=", this.a, ", text=", this.b);
        sbN.append(", elements=");
        sbN.append(this.c);
        sbN.append(", status=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
