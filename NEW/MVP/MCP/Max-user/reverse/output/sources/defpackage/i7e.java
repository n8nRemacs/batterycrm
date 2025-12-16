package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class i7e implements k7e {
    public final ve2 a;
    public final qv3 b;
    public final v04 c;
    public final o7e d;

    public i7e(ve2 ve2Var, qv3 qv3Var, v04 v04Var, o7e o7eVar) {
        this.a = ve2Var;
        this.b = qv3Var;
        this.c = v04Var;
        this.d = o7eVar;
    }

    @Override // defpackage.k7e
    public final List a(String str) {
        o7e o7eVar;
        n8a n8aVar = new n8a((Object) null);
        List listO = this.a.O(ve2.I);
        ArrayList arrayList = new ArrayList();
        Iterator it = listO.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            o7eVar = this.d;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            if (o7eVar.g((pb2) next, str)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 1) {
            ze3.s(new vs6(20), arrayList);
        }
        ArrayList arrayList2 = new ArrayList(we3.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            pb2 pb2Var = (pb2) it2.next();
            ku3 ku3VarN = pb2Var.n();
            if (ku3VarN != null) {
                n8aVar.a(ku3VarN.p());
            }
            arrayList2.add(o7eVar.a(pb2Var, str));
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        List listK = this.b.k();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : listK) {
            ku3 ku3Var = (ku3) obj;
            if (!n8aVar.d(ku3Var.p()) && o7eVar.h(ku3Var, str)) {
                arrayList4.add(obj);
            }
        }
        v04 v04Var = this.c;
        v04Var.getClass();
        ze3.s(new dj3(3, v04Var), arrayList4);
        ArrayList arrayList5 = new ArrayList(we3.q(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(o7eVar.b((ku3) it3.next(), str));
        }
        arrayList3.addAll(arrayList5);
        return arrayList3;
    }
}
