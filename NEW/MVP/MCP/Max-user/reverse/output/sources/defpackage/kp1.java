package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class kp1 {
    public final y6d a;
    public final dj1 b;
    public final xo8 c;
    public final sf1 d;
    public final qf1 e;
    public final xt4 f;
    public final xo8 g;
    public final y8g h;

    public kp1(y6d y6dVar, dj1 dj1Var, xo8 xo8Var, sf1 sf1Var, qf1 qf1Var, xt4 xt4Var, xo8 xo8Var2, y8g y8gVar) {
        this.a = y6dVar;
        this.b = dj1Var;
        this.c = xo8Var;
        this.d = sf1Var;
        this.e = qf1Var;
        this.f = xt4Var;
        this.g = xo8Var2;
        this.h = y8gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.List] */
    public final void a(i0f i0fVar) {
        eje ejeVar = new eje(i0fVar.a);
        pmb uhaVar = new uha(26);
        uha uhaVar2 = new uha(26);
        pmb uhaVar3 = new uha(26);
        pmb uhaVar4 = new uha(26);
        pmb uhaVar5 = new uha(26);
        pmb k5Var = uhaVar2;
        k5 k5Var2 = new k5(i0fVar.b);
        Boolean bool = i0fVar.c;
        if (bool != null) {
            uhaVar = new k5(bool);
        }
        List list = i0fVar.d;
        if (list != null) {
            k5Var = new k5(list);
        }
        List list2 = i0fVar.e;
        if (list2 != null) {
            uhaVar3 = new k5(list2);
        }
        List list3 = i0fVar.f;
        if (list3 != null) {
            uhaVar4 = new k5(list3);
        }
        pmb pmbVar = uhaVar4;
        pmb pmbVar2 = k5Var;
        k5 k5Var3 = new k5(Integer.valueOf(i0fVar.h.intValue()));
        Long l = i0fVar.g;
        Long lMapToLocalTimeMs = l != null ? this.h.mapToLocalTimeMs(l.longValue()) : null;
        cp1 cp1VarP = this.c.p(new x20(ejeVar, k5Var2, uhaVar, pmbVar2, uhaVar3, pmbVar, k5Var3, new k5(i0fVar.m), lMapToLocalTimeMs != null ? new k5(Long.valueOf(lMapToLocalTimeMs.longValue())) : uhaVar5, false));
        if (cp1VarP == null) {
            return;
        }
        eje ejeVar2 = cp1VarP.a;
        List list4 = cp1VarP.d;
        dj1 dj1Var = this.b;
        if (ue3.A(list4, dj1Var.a.a)) {
            dj1Var.o(ejeVar2);
        } else if (fni.a(ejeVar2, dj1Var.j)) {
            dj1Var.o(dje.a);
        }
        g0f g0fVar = i0fVar.l;
        qf1 qf1Var = this.e;
        if (g0fVar != null) {
            xo8 xo8Var = g0fVar.a;
            if (dj1Var.a.b() || fni.a(dj1Var.k, ejeVar2)) {
                dj1Var.g(ejeVar2, xo8Var.b);
                for (vi1 vi1Var : xo8Var.c) {
                    qf1Var.n.onStateChanged(vi1Var.b, vi1Var);
                }
            }
        }
        qf1Var.f.onRoomUpdated(new ip1(ejeVar2, exi.e(cp1VarP)));
    }

    public final void b(boolean z, ti1 ti1Var, eje ejeVar) {
        int i = 26;
        uha uhaVar = new uha(i);
        uha uhaVar2 = new uha(i);
        uha uhaVar3 = new uha(i);
        uha uhaVar4 = new uha(i);
        uha uhaVar5 = new uha(i);
        uha uhaVar6 = new uha(i);
        uha uhaVar7 = new uha(i);
        if (z) {
            ti1Var = null;
        }
        this.c.p(new x20(ejeVar, uhaVar, uhaVar2, uhaVar3, uhaVar4, uhaVar5, uhaVar6, new k5(ti1Var), uhaVar7, true));
    }

    public final void c(boolean z) {
        if (z) {
            ts9 ts9Var = new ts9(this, 26);
            ts9 ts9Var2 = new ts9(this, 27);
            xo8 xo8Var = this.g;
            pze pzeVar = (pze) ((cm6) xo8Var.c).invoke();
            if (pzeVar == null) {
                ts9Var2.invoke(new IllegalStateException("Signaling is not ready or released"));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", "get-rooms");
            pzeVar.j(jSONObject, new wz0(xo8Var, ts9Var2, ts9Var, 2), new e01(xo8Var, ts9Var2, 3));
        }
    }

    public final void d(ije ijeVar) {
        eje ejeVar;
        int i = ijeVar.b;
        i0f i0fVar = ijeVar.c;
        Set set = ijeVar.a;
        if (set.contains(jje.a) && i0fVar != null) {
            a(i0fVar);
        }
        boolean zContains = set.contains(jje.c);
        xo8 xo8Var = this.c;
        if (zContains) {
            eje ejeVar2 = new eje(i);
            int i2 = 26;
            uha uhaVar = new uha(i2);
            uha uhaVar2 = new uha(i2);
            uha uhaVar3 = new uha(i2);
            uha uhaVar4 = new uha(i2);
            uha uhaVar5 = new uha(i2);
            uha uhaVar6 = new uha(i2);
            k5 k5Var = new k5(Boolean.valueOf(!ijeVar.d));
            Long lMapToLocalTimeMs = null;
            Long l = i0fVar != null ? i0fVar.g : null;
            if (l != null) {
                ejeVar = ejeVar2;
                lMapToLocalTimeMs = this.h.mapToLocalTimeMs(l.longValue());
            } else {
                ejeVar = ejeVar2;
            }
            xo8Var.p(new x20(ejeVar, uhaVar, k5Var, uhaVar2, uhaVar3, uhaVar4, uhaVar5, uhaVar6, new k5(lMapToLocalTimeMs), false));
        }
        set.contains(jje.d);
        if (set.contains(jje.b)) {
            eje ejeVar3 = new eje(i);
            dj1 dj1Var = this.b;
            if (fni.a(dj1Var.j, ejeVar3)) {
                dj1Var.o(dje.a);
            }
            ((HashMap) xo8Var.c).remove(ejeVar3);
            ((qf1) xo8Var.b).f.onRoomRemoved(new hp1(ejeVar3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public final void e(j0f j0fVar) {
        qf1 qf1Var;
        fje fjeVar = j0fVar.a;
        ?? r13 = j0fVar.b;
        ArrayList arrayList = new ArrayList(we3.q(r13, 10));
        Iterator it = r13.iterator();
        while (it.hasNext()) {
            arrayList.add(new eje(((i0f) it.next()).a));
        }
        Set setH0 = ue3.h0(arrayList);
        xo8 xo8Var = this.c;
        for (eje ejeVar : ue3.h0(((HashMap) xo8Var.c).keySet())) {
            if (!setH0.contains(ejeVar)) {
                ((HashMap) xo8Var.c).remove(ejeVar);
                ((qf1) xo8Var.b).f.onRoomRemoved(new hp1(ejeVar));
            }
        }
        Iterator it2 = r13.iterator();
        while (it2.hasNext()) {
            a((i0f) it2.next());
        }
        Iterator it3 = r13.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            qf1Var = this.e;
            if (!zHasNext) {
                break;
            }
            i0f i0fVar = (i0f) it3.next();
            qf1Var.g.a(new xt4(i0fVar.i, 8, new eje(i0fVar.a)));
        }
        for (i0f i0fVar2 : r13) {
            qf1Var.q.onUrlSharingInfoUpdated(new es1(new eje(i0fVar2.a), i0fVar2.n));
        }
        for (i0f i0fVar3 : r13) {
            qf1Var.h.a(new i5i(i0fVar3.j, new eje(i0fVar3.a)));
        }
        for (i0f i0fVar4 : r13) {
            this.d.m(i0fVar4.k, new JSONObject(), "CallSessionRoomsManager#applyMuteStates", 2, new eje(i0fVar4.a), true);
        }
        if (fjeVar instanceof dje) {
            return;
        }
        dj1 dj1Var = this.b;
        if (!fni.a(dj1Var.k, fjeVar)) {
            dj1Var.m(fjeVar);
            qf1Var.f.onCurrentParticipantActiveRoomChanged(new fp1(fjeVar, fjeVar instanceof eje ? xo8Var.E((eje) fjeVar) : null));
        }
        this.f.B(new a3b(19, fjeVar), new r84(this, 2, fjeVar), new ts9(this, 25));
    }
}
