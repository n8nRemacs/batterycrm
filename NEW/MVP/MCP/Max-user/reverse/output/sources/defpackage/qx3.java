package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class qx3 extends sm implements j1g {
    public final int d;

    public qx3(long j, int i) {
        super(j);
        this.d = i;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        List<gx3> list;
        RuntimeException runtimeException;
        List list2;
        List list3 = ((rx3) l0gVar).c;
        if (list3 == null || !list3.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list3) {
                try {
                    if (((gx3) obj) != ex3.z0) {
                        arrayList.add(obj);
                    }
                } finally {
                }
            }
            list = arrayList;
        } else {
            list = Collections.EMPTY_LIST;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (gx3 gx3Var : list) {
            if (m().g(gx3Var.a)) {
                arrayList2.add(gx3Var);
            } else {
                arrayList3.add(gx3Var);
            }
        }
        m().s(arrayList2, yv3.a);
        m().s(arrayList3, yv3.b);
        tw0 tw0VarK = k();
        if (list.isEmpty()) {
            list2 = hd5.a;
        } else {
            ArrayList arrayList4 = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    arrayList4.add(Long.valueOf(((gx3) it.next()).a));
                } finally {
                }
            }
            list2 = arrayList4;
        }
        tw0VarK.c(new ux3(this.d, this.a, list2));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        boolean z = pzfVar instanceof hzf;
        long j = this.a;
        if (z) {
            k().c(new rj0(j, pzfVar));
        } else {
            k().c(new ux3(this.d, j, hd5.a));
        }
    }

    @Override // defpackage.sm
    public final n2 i() {
        fh2 fh2Var = new fh2(null, 20);
        fh2Var.x("status", "BLOCKED");
        int i = this.d;
        if (i > 0) {
            fh2Var.j(i, "from");
        }
        fh2Var.j(40, "count");
        return fh2Var;
    }
}
