package defpackage;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class dj1 {
    public final yi1 a;
    public final qf1 b;
    public final xo8 c;
    public final y6d d;
    public final i8 e;
    public final HashMap f;
    public final HashMap g;
    public final LongSparseArray h;
    public ti1 i;
    public fje j;
    public fje k;

    public dj1(yi1 yi1Var, qf1 qf1Var, xo8 xo8Var, y6d y6dVar) {
        this.a = yi1Var;
        this.b = qf1Var;
        this.c = xo8Var;
        this.d = y6dVar;
        i8 i8Var = new i8();
        i8Var.a = rd5.a;
        this.e = i8Var;
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new LongSparseArray();
        dje djeVar = dje.a;
        this.j = djeVar;
        this.k = djeVar;
    }

    public final vd a(bnb bnbVar, fje fjeVar) {
        boolean z;
        pmb pmbVar;
        fje fjeVar2;
        boolean z2;
        ti1 ti1Var = bnbVar.a;
        pmb pmbVar2 = bnbVar.i;
        pmb pmbVar3 = bnbVar.h;
        pmb pmbVar4 = bnbVar.g;
        pmb pmbVar5 = bnbVar.f;
        pmb pmbVar6 = bnbVar.e;
        pmb pmbVar7 = bnbVar.d;
        pmb pmbVar8 = bnbVar.c;
        pmb pmbVar9 = bnbVar.b;
        yi1 yi1VarJ = j(ti1Var);
        HashMap map = this.f;
        HashMap map2 = this.g;
        LongSparseArray longSparseArray = this.h;
        if (yi1VarJ == null) {
            yi1VarJ = new yi1(ti1Var, (imb) pmbVar9.t(), (p8a) pmbVar8.t(), (r8a) pmbVar7.t());
            ti1 ti1Var2 = yi1VarJ.a;
            if (ti1Var2 != null) {
                Object linkedHashMap = map.get(fjeVar);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    map.put(fjeVar, linkedHashMap);
                }
                ((Map) linkedHashMap).put(ti1Var2, yi1VarJ);
                map2.put(ti1Var2, fjeVar);
                long j = ti1Var2.a;
                Set linkedHashSet = (Set) longSparseArray.get(j);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    longSparseArray.put(j, linkedHashSet);
                }
                linkedHashSet.add(ti1Var2);
            }
            fjeVar2 = null;
            pmbVar = pmbVar2;
            z = true;
            z2 = true;
        } else {
            if (pmbVar9.q()) {
                yi1VarJ.g((imb) pmbVar9.d());
            }
            if (pmbVar8.q()) {
                p8a p8aVar = (p8a) pmbVar8.d();
                p8a p8aVar2 = yi1VarJ.b;
                z = true;
                p8aVar2.a = p8aVar.a;
                p8aVar2.b = p8aVar.b;
                p8aVar2.c = p8aVar.c;
                p8aVar2.d = p8aVar.d;
            } else {
                z = true;
            }
            if (pmbVar7.q()) {
                r8a r8aVar = (r8a) pmbVar7.d();
                r8a r8aVar2 = yi1VarJ.c;
                boolean z3 = r8aVar2.e;
                boolean z4 = r8aVar.e;
                if (z3 == z4) {
                    pmbVar = pmbVar2;
                    if (r8aVar2.f != r8aVar.f || r8aVar2.b != r8aVar.b || r8aVar2.g != r8aVar.g || r8aVar2.c != r8aVar.c || r8aVar2.d != r8aVar.d) {
                    }
                } else {
                    pmbVar = pmbVar2;
                }
                r8aVar2.e = z4;
                r8aVar2.f = r8aVar.f;
                r8aVar2.b = r8aVar.b;
                r8aVar2.g = r8aVar.g;
                r8aVar2.c = r8aVar.c;
                r8aVar2.d = r8aVar.d;
                r8aVar2.a();
            } else {
                pmbVar = pmbVar2;
            }
            fjeVar2 = (fje) map2.get(ti1Var);
            if (fjeVar2 == null) {
                fjeVar2 = this.k;
            }
            z2 = !fni.a(fjeVar2, fjeVar);
            if (!fni.a(fjeVar2, fjeVar)) {
                b(ti1Var, fjeVar2);
                ti1 ti1Var3 = yi1VarJ.a;
                if (ti1Var3 != null) {
                    Object linkedHashMap2 = map.get(fjeVar);
                    if (linkedHashMap2 == null) {
                        linkedHashMap2 = new LinkedHashMap();
                        map.put(fjeVar, linkedHashMap2);
                    }
                    ((Map) linkedHashMap2).put(ti1Var3, yi1VarJ);
                    map2.put(ti1Var3, fjeVar);
                    long j2 = ti1Var3.a;
                    Set linkedHashSet2 = (Set) longSparseArray.get(j2);
                    if (linkedHashSet2 == null) {
                        linkedHashSet2 = new LinkedHashSet();
                        longSparseArray.put(j2, linkedHashSet2);
                    }
                    linkedHashSet2.add(ti1Var3);
                }
            }
        }
        if (ti1Var == this.i) {
            yi1VarJ.p = z;
        }
        if (pmbVar6.q()) {
            List list = (List) pmbVar6.d();
            ArrayList arrayList = yi1VarJ.d;
            arrayList.clear();
            arrayList.addAll(list);
        }
        if (pmbVar5.q()) {
            yi1VarJ.q = (o81) pmbVar5.d();
        }
        if (pmbVar4.q()) {
            yi1VarJ.r = (List) pmbVar4.d();
        }
        if (pmbVar3.q()) {
            yi1VarJ.s = ((Number) pmbVar3.d()).intValue();
        }
        if (pmbVar.q()) {
            yi1VarJ.g = (xi1) pmbVar.d();
        }
        return new vd(yi1VarJ, z2, fjeVar2);
    }

    public final yi1 b(ti1 ti1Var, fje fjeVar) {
        HashMap map = this.g;
        fje fjeVar2 = (fje) map.get(ti1Var);
        if (fjeVar2 == null) {
            return null;
        }
        if (!fjeVar2.equals(fjeVar)) {
            this.d.log("CallParticipants", "Tried to remove " + ti1Var + " from " + fjeVar + " but participant is in " + fjeVar2);
            return null;
        }
        long j = ti1Var.a;
        LongSparseArray longSparseArray = this.h;
        Set set = (Set) longSparseArray.get(j);
        if (set != null) {
            set.remove(ti1Var);
            if (set.isEmpty()) {
                longSparseArray.remove(j);
            }
        }
        map.remove(ti1Var);
        HashMap map2 = this.f;
        Object linkedHashMap = map2.get(fjeVar);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            map2.put(fjeVar, linkedHashMap);
        }
        return (yi1) ((Map) linkedHashMap).remove(ti1Var);
    }

    public final fje c(ti1 ti1Var) {
        fje fjeVar = (fje) this.g.get(ti1Var);
        return fjeVar == null ? fni.a(ti1Var, this.a.a) ? this.k : dje.a : fjeVar;
    }

    public final Map d(fje fjeVar) {
        HashMap map = this.f;
        Object linkedHashMap = map.get(fjeVar);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            map.put(fjeVar, linkedHashMap);
        }
        return (Map) linkedHashMap;
    }

    public final void e(fje fjeVar, List list) {
        boolean zA = fni.a(fjeVar, this.k);
        qf1 qf1Var = this.b;
        if (zA) {
            qf1Var.a.onActiveParticipantsChanged(new q01(list, d(this.k).values()));
        }
        qf1Var.c.onCallParticipantsChanged(new fj1(list));
    }

    public final yi1 f(bnb bnbVar, fje fjeVar) {
        return (yi1) ue3.G(g(fjeVar, Collections.singletonList(bnbVar)));
    }

    public final ArrayList g(fje fjeVar, List list) {
        List list2;
        qf1 qf1Var = this.b;
        lnb lnbVar = qf1Var.c;
        s7 s7Var = qf1Var.a;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bnb bnbVar = (bnb) it.next();
            fje fjeVarC = fjeVar == null ? c(bnbVar.a) : fjeVar;
            vd vdVarA = a(bnbVar, fjeVarC);
            fje fjeVar2 = (fje) vdVarA.d;
            yi1 yi1Var = (yi1) vdVarA.c;
            arrayList.add(yi1Var);
            if (vdVarA.b) {
                Object arrayList2 = linkedHashMap.get(fjeVarC);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(fjeVarC, arrayList2);
                }
                ((List) arrayList2).add(yi1Var);
            } else {
                Object arrayList3 = linkedHashMap2.get(fjeVarC);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap2.put(fjeVarC, arrayList3);
                }
                ((List) arrayList3).add(yi1Var);
            }
            if (fjeVar2 != null && !fjeVar2.equals(fjeVarC)) {
                Object arrayList4 = linkedHashMap3.get(fjeVar2);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap3.put(fjeVar2, arrayList4);
                }
                ((List) arrayList4).add(yi1Var);
            }
        }
        Iterator it2 = linkedHashMap3.keySet().iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            list2 = hd5.a;
            if (!zHasNext) {
                break;
            }
            fje fjeVar3 = (fje) it2.next();
            List list3 = (List) linkedHashMap3.get(fjeVar3);
            if (list3 != null) {
                list2 = list3;
            }
            if (fni.a(fjeVar3, this.k)) {
                s7Var.onActiveParticipantsRemoved(new s01(list2, d(this.k).values()));
            }
            lnbVar.onCallParticipantsRemoved(new hj1(list2));
        }
        for (fje fjeVar4 : linkedHashMap.keySet()) {
            List list4 = (List) linkedHashMap.get(fjeVar4);
            if (list4 == null) {
                list4 = list2;
            }
            if (fni.a(fjeVar4, this.k)) {
                s7Var.onActiveParticipantsAdded(new p01(list4, d(this.k).values()));
            }
            lnbVar.onCallParticipantsAdded(new ej1(fjeVar4, list4));
        }
        for (fje fjeVar5 : linkedHashMap2.keySet()) {
            List list5 = (List) linkedHashMap2.get(fjeVar5);
            if (list5 == null) {
                list5 = list2;
            }
            e(fjeVar5, list5);
        }
        return arrayList;
    }

    public final void h() {
        ArrayList arrayList = new ArrayList(d(this.k).values());
        this.e.a = rd5.a;
        this.i = null;
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.b.a.onActiveParticipantsRemoved(new s01(arrayList, hd5.a));
        this.c.r();
    }

    public final Collection i() {
        return d(this.k).values();
    }

    public final yi1 j(ti1 ti1Var) {
        yi1 yi1Var = this.a;
        ti1 ti1Var2 = yi1Var.a;
        if (ti1Var2 != null && ti1Var2.equals(ti1Var)) {
            return yi1Var;
        }
        fje fjeVar = (fje) this.g.get(ti1Var);
        if (fjeVar != null) {
            return (yi1) d(fjeVar).get(ti1Var);
        }
        return null;
    }

    public final void k(ti1 ti1Var, imb imbVar, String str, String str2) {
        yi1 yi1VarJ = j(ti1Var);
        if (yi1VarJ != null) {
            HashMap map = yi1VarJ.f;
            if (imbVar != null) {
                boolean zIsEmpty = map.isEmpty();
                map.put(imbVar, new imb(str, str2));
                imb imbVar2 = yi1VarJ.k;
                if (imbVar2 != null && Objects.equals(imbVar2.a, imbVar.a)) {
                    this.d.log("CallParticipant", "update accepted call peer by peer registered: " + imbVar2 + " -> " + imbVar);
                    yi1VarJ.k = imbVar;
                }
                if (Objects.equals(imbVar2, imbVar)) {
                    yi1VarJ.m = str;
                    yi1VarJ.l = str2;
                }
                if (zIsEmpty && imbVar2 == null) {
                    fje fjeVar = (fje) this.g.get(ti1Var);
                    if (fjeVar == null) {
                        fjeVar = this.k;
                    }
                    e(fjeVar, Collections.singletonList(yi1VarJ));
                }
            }
        }
    }

    public final ArrayList l(fje fjeVar, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ti1 ti1Var = (ti1) it.next();
            fje fjeVarC = fjeVar == null ? c(ti1Var) : fjeVar;
            yi1 yi1VarB = b(ti1Var, fjeVarC);
            if (yi1VarB != null) {
                Object arrayList = linkedHashMap.get(fjeVarC);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(fjeVarC, arrayList);
                }
                ((List) arrayList).add(yi1VarB);
            }
        }
        for (fje fjeVar2 : linkedHashMap.keySet()) {
            List list2 = (List) linkedHashMap.get(fjeVar2);
            if (list2 == null) {
                list2 = hd5.a;
            }
            boolean zA = fni.a(fjeVar2, this.k);
            qf1 qf1Var = this.b;
            if (zA) {
                qf1Var.a.onActiveParticipantsRemoved(new s01(list2, d(this.k).values()));
            }
            qf1Var.c.onCallParticipantsRemoved(new hj1(list2));
        }
        return we3.r(linkedHashMap.values());
    }

    public final void m(fje fjeVar) {
        fje fjeVar2 = this.k;
        this.k = fjeVar;
        if (fni.a(fjeVar2, fjeVar)) {
            return;
        }
        this.b.a.onActiveParticipantUpdated(new t01(d(fjeVar2).values(), d(fjeVar).values(), fjeVar, fjeVar instanceof eje ? this.c.E((eje) fjeVar) : null, this.a));
    }

    public final void n(ti1 ti1Var) {
        if (ti1Var == this.i) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ti1 ti1Var2 = this.i;
        yi1 yi1VarJ = ti1Var2 != null ? j(ti1Var2) : null;
        if (yi1VarJ != null) {
            boolean zE = yi1VarJ.e();
            yi1VarJ.p = false;
            if (zE != yi1VarJ.e()) {
                arrayList.add(yi1VarJ);
            }
        }
        yi1 yi1VarJ2 = ti1Var != null ? j(ti1Var) : null;
        if (yi1VarJ2 != null) {
            boolean zE2 = yi1VarJ2.e();
            yi1VarJ2.p = true;
            if (zE2 != yi1VarJ2.e()) {
                arrayList.add(yi1VarJ2);
            }
        }
        e(this.k, arrayList);
        this.i = ti1Var;
    }

    public final void o(fje fjeVar) {
        fje fjeVar2 = this.j;
        this.j = fjeVar;
        if (fni.a(fjeVar2, fjeVar)) {
            return;
        }
        this.b.f.onCurrentParticipantInvitedToRoom(new gp1(this.a, fjeVar, fjeVar instanceof eje ? this.c.E((eje) fjeVar) : null));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    public final void p(List list) {
        Map mapD = d(this.k);
        HashSet hashSet = new HashSet(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            yi1 yi1Var = (yi1) mapD.get((ti1) it.next());
            if (yi1Var != null) {
                boolean zF = yi1Var.f();
                yi1Var.o = true;
                if (zF != yi1Var.f()) {
                    arrayList.add(yi1Var);
                }
            }
        }
        i8 i8Var = this.e;
        for (Object obj : i8Var.a) {
            yi1 yi1Var2 = (yi1) mapD.get(obj);
            if (yi1Var2 != null && !hashSet.contains(obj)) {
                boolean zF2 = yi1Var2.f();
                yi1Var2.o = false;
                if (zF2 != yi1Var2.f()) {
                    arrayList.add(yi1Var2);
                }
            }
        }
        i8Var.a = hashSet;
        e(this.k, arrayList);
    }

    public final int q() {
        Map map = (Map) this.f.get(this.k);
        if (map != null) {
            return map.size();
        }
        return 0;
    }
}
