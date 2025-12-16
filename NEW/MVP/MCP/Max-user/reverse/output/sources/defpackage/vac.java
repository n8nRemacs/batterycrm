package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class vac {
    public final bbc a;
    public final List b;
    public final List c;

    public vac(bbc bbcVar, List list, List list2) {
        this.a = bbcVar;
        this.b = list;
        this.c = list2;
    }

    public static vac a(vac vacVar, bbc bbcVar, List list, int i) {
        if ((i & 2) != 0) {
            list = vacVar.b;
        }
        return new vac(bbcVar, list, vacVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vac)) {
            return false;
        }
        vac vacVar = (vac) obj;
        return fni.a(this.a, vacVar.a) && fni.a(this.b, vacVar.b) && fni.a(this.c, vacVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.l(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(appBarState=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", commonItems=");
        return az1.j(sb, this.c, ")");
    }

    public /* synthetic */ vac(bbc bbcVar, o98 o98Var) {
        this(bbcVar, o98Var, hd5.a);
    }
}
