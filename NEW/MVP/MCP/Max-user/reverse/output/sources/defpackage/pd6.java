package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class pd6 extends n2 {
    public final n8a X;
    public final n8a Y;
    public final Set Z;
    public final String d;
    public final String o;
    public final Set s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd6(String str, String str2, n8a n8aVar, n8a n8aVar2, Set set, Set set2, int i) {
        super(xhb.M2);
        n8aVar = (i & 8) != 0 ? dk8.a : n8aVar;
        n8aVar2 = (i & 16) != 0 ? dk8.a : n8aVar2;
        set = (i & 32) != 0 ? da6.o : set;
        set2 = (i & 64) != 0 ? ra6.b : set2;
        this.d = str;
        this.o = str2;
        this.X = n8aVar;
        this.Y = n8aVar2;
        this.Z = set;
        this.s0 = set2;
        x("id", str);
        x("title", str2);
        if (n8aVar.j()) {
            ((us) this.b).put("include", n8aVar);
        }
        if (n8aVar2.j()) {
            ((us) this.b).put("favorites", n8aVar2);
        }
        ArrayList arrayList = new ArrayList(we3.q(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((da6) it.next()).a));
        }
        if (!arrayList.isEmpty()) {
            o("filters", arrayList);
        }
        Set set3 = this.s0;
        ArrayList arrayList2 = new ArrayList(we3.q(set3, 10));
        Iterator it2 = set3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((ra6) it2.next()).a));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        o("options", arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd6)) {
            return false;
        }
        pd6 pd6Var = (pd6) obj;
        return fni.a(this.d, pd6Var.d) && fni.a(this.o, pd6Var.o) && fni.a(this.X, pd6Var.X) && fni.a(this.Y, pd6Var.Y) && fni.a(this.Z, pd6Var.Z) && fni.a(this.s0, pd6Var.s0);
    }

    public final int hashCode() {
        return this.s0.hashCode() + ((this.Z.hashCode() + ((this.Y.hashCode() + ((this.X.hashCode() + u45.e(this.d.hashCode() * 31, 961, this.o)) * 31)) * 31)) * 31);
    }
}
