package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class kq7 {
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;

    public kq7(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
    }

    public final void a(Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "kq7", ho7.f(collection.size(), "invalidateChatsInternal, contactsIds.size() = "), null);
            }
        }
        List<pb2> listO = ((ve2) this.a.getValue()).O(ve2.I);
        c7c c7cVar = (c7c) this.c.getValue();
        ve2 ve2Var = (ve2) this.a.getValue();
        c7cVar.getClass();
        xs xsVar = new xs(collection);
        wqi.c("c7c", "invalidatePreprocessedDataByContacts, contactIds = %d", Integer.valueOf(xsVar.c));
        ArrayList arrayList = new ArrayList();
        xs xsVar2 = new xs(0);
        Iterator it = c7cVar.c.entrySet().iterator();
        while (it.hasNext()) {
            si9 si9Var = ((d7c) ((Map.Entry) it.next()).getValue()).d;
            if (xsVar.contains(Long.valueOf(si9Var.o))) {
                arrayList.add(si9Var);
                xsVar2.add(Long.valueOf(si9Var.a));
            }
            si9 si9Var2 = si9Var.A0;
            if (si9Var2 != null && xsVar.contains(Long.valueOf(si9Var2.o))) {
                arrayList.add(si9Var);
                xsVar2.add(Long.valueOf(si9Var.a));
            }
            d10 d10VarK = si9Var.k();
            if (d10VarK != null) {
                if (!xsVar.contains(Long.valueOf(d10VarK.b))) {
                    Iterator it2 = d10VarK.c.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (xsVar.contains((Long) it2.next())) {
                            arrayList.add(si9Var);
                            xsVar2.add(Long.valueOf(si9Var.a));
                            break;
                        }
                    }
                } else {
                    arrayList.add(si9Var);
                    xsVar2.add(Long.valueOf(si9Var.a));
                }
            }
        }
        wqi.c("c7c", "invalidated messages count = %d", Integer.valueOf(arrayList.size()));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            si9 si9Var3 = (si9) it3.next();
            pb2 pb2VarM = ve2Var.M(si9Var3.Z);
            if (pb2VarM == null) {
                wqi.q("c7c", "don't create and put preprocessed data, because chat is null", new Object[0]);
            } else {
                c7cVar.b(pb2VarM, si9Var3);
                c7cVar.a.c(new itg(si9Var3.Z, si9Var3.a, false));
                c7cVar = c7cVar;
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(xsVar2);
        n8a n8aVar = new n8a((Object) null);
        for (pb2 pb2Var : listO) {
            ArrayList arrayListL = pb2Var.l();
            xs xsVar3 = new xs(0);
            Iterator it4 = arrayListL.iterator();
            while (it4.hasNext()) {
                xsVar3.add(Long.valueOf(((ku3) it4.next()).p()));
            }
            if (!Collections.disjoint(collection, xsVar3)) {
                n8aVar.a(pb2Var.b.a);
                pb2Var.t0((qv3) this.b.getValue());
            }
            eh9 eh9Var = pb2Var.c;
            if (eh9Var != null && setUnmodifiableSet.contains(Long.valueOf(eh9Var.a.a))) {
                ((ve2) this.a.getValue()).s0(pb2Var.a, pb2Var.c.a, true);
                n8aVar.a(pb2Var.b.a);
            }
        }
        if (n8aVar.j()) {
            ((y7b) this.d.getValue()).f(n8aVar);
        }
    }
}
