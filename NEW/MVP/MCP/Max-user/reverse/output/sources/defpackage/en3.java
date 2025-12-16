package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class en3 extends l0 {
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final s9g[] l;
    public final Object[] m;
    public final HashMap n;

    public en3(ArrayList arrayList, hze hzeVar) {
        super(hzeVar);
        int size = arrayList.size();
        this.j = new int[size];
        this.k = new int[size];
        this.l = new s9g[size];
        this.m = new Object[size];
        this.n = new HashMap();
        Iterator it = arrayList.iterator();
        int iO = 0;
        int iH = 0;
        int i = 0;
        while (it.hasNext()) {
            hn3 hn3Var = (hn3) it.next();
            s9g[] s9gVarArr = this.l;
            rp8 rp8Var = hn3Var.a.o;
            s9gVarArr[i] = rp8Var;
            this.k[i] = iO;
            this.j[i] = iH;
            iO += rp8Var.e.o();
            iH += this.l[i].h();
            Object[] objArr = this.m;
            Object obj = hn3Var.b;
            objArr[i] = obj;
            this.n.put(obj, Integer.valueOf(i));
            i++;
        }
        this.h = iO;
        this.i = iH;
    }

    @Override // defpackage.s9g
    public final int h() {
        return this.i;
    }

    @Override // defpackage.s9g
    public final int o() {
        return this.h;
    }

    @Override // defpackage.l0
    public final int q(Object obj) {
        Integer num = (Integer) this.n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // defpackage.l0
    public final int r(int i) {
        return zxg.d(this.j, i + 1, false, false);
    }

    @Override // defpackage.l0
    public final int s(int i) {
        return zxg.d(this.k, i + 1, false, false);
    }

    @Override // defpackage.l0
    public final Object t(int i) {
        return this.m[i];
    }

    @Override // defpackage.l0
    public final int u(int i) {
        return this.j[i];
    }

    @Override // defpackage.l0
    public final int v(int i) {
        return this.k[i];
    }

    @Override // defpackage.l0
    public final s9g y(int i) {
        return this.l[i];
    }
}
