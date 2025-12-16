package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class hpa implements ui8 {
    public final k18 a;
    public final tcf b;

    public hpa(k18 k18Var, k18 k18Var2, k18 k18Var3) {
        this.a = k18Var;
        tcf tcfVarA = ucf.a(dpa.c);
        this.b = tcfVarA;
        yh0 yh0Var = new yh0(tcfVarA, 11);
        int i = s65.d;
        zs0.e(gw0.u(new g56(zs0.g(yh0Var, v9j.h(100, y65.MILLISECONDS)), new gpa(this, null), 1), ((q2b) ((lzf) k18Var2.getValue())).b()), (nxg) k18Var3.getValue());
    }

    public final Object a(bt5 bt5Var) {
        this.b.m(null, dpa.c);
        wna wnaVar = (wna) this.a.getValue();
        Object objB = k7j.b(wnaVar.a, new bm4(9, wnaVar), bt5Var);
        return objB == g84.a ? objB : qqg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.q44 r14) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hpa.b(q44):java.lang.Object");
    }

    @Override // defpackage.ui8
    public final void c() {
        this.b.m(null, dpa.c);
    }

    public final Object d(long j, at5 at5Var) {
        tcf tcfVar;
        Object value;
        ArrayList arrayList;
        ArrayList arrayList2;
        do {
            tcfVar = this.b;
            value = tcfVar.getValue();
            dpa dpaVar = (dpa) value;
            List list = dpaVar.a;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (((lt5) obj).a != j) {
                    arrayList.add(obj);
                }
            }
            List list2 = dpaVar.b;
            arrayList2 = new ArrayList();
            Iterator it = list2.iterator();
            if (it.hasNext()) {
                throw ctd.h(it);
            }
        } while (!tcfVar.c(value, new dpa(arrayList, arrayList2)));
        wna wnaVar = (wna) this.a.getValue();
        Object objB = k7j.b(wnaVar.a, new us5(wnaVar, j, 2), at5Var);
        return objB == g84.a ? objB : qqg.a;
    }
}
