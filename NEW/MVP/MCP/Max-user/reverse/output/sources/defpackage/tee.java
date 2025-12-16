package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class tee implements ree, iz0 {
    public final String a;
    public final s9j b;
    public final int c;
    public final HashSet d;
    public final String[] e;
    public final ree[] f;
    public final List[] g;
    public final boolean[] h;
    public final Map i;
    public final ree[] j;
    public final bwf k;

    public tee(String str, s9j s9jVar, int i, List list, da3 da3Var) {
        this.a = str;
        this.b = s9jVar;
        this.c = i;
        ArrayList arrayList = da3Var.b;
        this.d = ue3.b0(arrayList);
        int i2 = 0;
        this.e = (String[]) arrayList.toArray(new String[0]);
        this.f = ofi.b(da3Var.d);
        this.g = (List[]) da3Var.e.toArray(new List[0]);
        ArrayList arrayList2 = da3Var.f;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.h = zArr;
        zs zsVar = new zs(2, new m2(2, this.e));
        ArrayList arrayList3 = new ArrayList(we3.q(zsVar, 10));
        Iterator it2 = zsVar.iterator();
        while (true) {
            z55 z55Var = (z55) it2;
            if (!z55Var.b.hasNext()) {
                this.i = to8.r(arrayList3);
                this.j = ofi.b(list);
                this.k = new bwf(new prd(12, this));
                return;
            }
            uj7 uj7Var = (uj7) z55Var.next();
            arrayList3.add(new imb(uj7Var.b, Integer.valueOf(uj7Var.a)));
        }
    }

    @Override // defpackage.ree
    public final String a() {
        return this.a;
    }

    @Override // defpackage.iz0
    public final Set b() {
        return this.d;
    }

    @Override // defpackage.ree
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ree
    public final int d(String str) {
        Integer num = (Integer) this.i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.ree
    public final s9j e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tee) {
            ree reeVar = (ree) obj;
            if (fni.a(this.a, reeVar.a()) && Arrays.equals(this.j, ((tee) obj).j)) {
                int iF = reeVar.f();
                int i = this.c;
                if (i == iF) {
                    for (int i2 = 0; i2 < i; i2++) {
                        ree[] reeVarArr = this.f;
                        if (fni.a(reeVarArr[i2].a(), reeVar.i(i2).a()) && fni.a(reeVarArr[i2].e(), reeVar.i(i2).e())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ree
    public final int f() {
        return this.c;
    }

    @Override // defpackage.ree
    public final String g(int i) {
        return this.e[i];
    }

    @Override // defpackage.ree
    public final List getAnnotations() {
        return hd5.a;
    }

    @Override // defpackage.ree
    public final List h(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.ree
    public final ree i(int i) {
        return this.f[i];
    }

    @Override // defpackage.ree
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.ree
    public final boolean j(int i) {
        return this.h[i];
    }

    public final String toString() {
        return ue3.N(n7j.h(0, this.c), ", ", u45.l(new StringBuilder(), this.a, '('), ")", new iqb(25, this), 24);
    }
}
