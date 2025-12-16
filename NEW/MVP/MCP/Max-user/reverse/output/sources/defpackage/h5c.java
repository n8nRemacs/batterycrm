package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h5c extends l0 {
    public final int h;
    public final int i;
    public final int[] j;
    public final int[] k;
    public final s9g[] l;
    public final Object[] m;
    public final HashMap n;

    public h5c(s9g[] s9gVarArr, Object[] objArr, hze hzeVar) {
        super(hzeVar);
        int length = s9gVarArr.length;
        this.l = s9gVarArr;
        this.j = new int[length];
        this.k = new int[length];
        this.m = objArr;
        this.n = new HashMap();
        int length2 = s9gVarArr.length;
        int i = 0;
        int iO = 0;
        int iH = 0;
        int i2 = 0;
        while (i < length2) {
            s9g s9gVar = s9gVarArr[i];
            this.l[i2] = s9gVar;
            this.k[i2] = iO;
            this.j[i2] = iH;
            iO += s9gVar.o();
            iH += this.l[i2].h();
            this.n.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
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

    /* JADX WARN: Illegal instructions before constructor call */
    public h5c(ArrayList arrayList, hze hzeVar) {
        s9g[] s9gVarArr = new s9g[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            s9gVarArr[i2] = ((p99) it.next()).a();
            i2++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((p99) it2.next()).getUid();
            i++;
        }
        this(s9gVarArr, objArr, hzeVar);
    }
}
