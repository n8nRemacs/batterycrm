package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class su extends sm implements j1g {
    public final int d;
    public final long o;

    public su(int i, long j, long j2) {
        super(j);
        this.d = i;
        this.o = j2;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        tu tuVar = (tu) l0gVar;
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        vu vuVar = (vu) tmVar.u.getValue();
        int i = this.d;
        vuVar.getClass();
        wqi.c("vu", "onAssetsUpdate", new Object[0]);
        if (i == 0) {
            i = 2;
        }
        ArrayList arrayList = new ArrayList();
        List list = Collections.EMPTY_LIST;
        if (!tuVar.d.isEmpty()) {
            List<y7e> list2 = tuVar.d;
            m4e m4eVar = vuVar.f;
            ArrayList arrayList2 = new ArrayList();
            for (y7e y7eVar : list2) {
                qha qhaVar = y7eVar.a;
                if (qhaVar == qha.B0) {
                    arrayList2.add(new xhf(y7eVar.b, y7eVar.d));
                } else if (qhaVar == qha.C0) {
                    arrayList2.add(new lgf(y7eVar.g, y7eVar.b, y7eVar.e));
                } else if (qhaVar == qha.D0) {
                    ArrayList arrayListI = po8.i(y7eVar.k);
                    arrayListI.addAll(po8.n(y7eVar.l, m4eVar));
                    arrayList2.add(new ldd(y7eVar.b, arrayListI));
                } else {
                    wqi.e("po8", "Unknown section " + y7eVar, null);
                }
            }
            tef tefVar = vuVar.a;
            tefVar.getClass();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                z7e z7eVar = (z7e) it.next();
                int iV = az1.v(z7eVar.a);
                if (iV == 1) {
                    arrayList3.addAll(tefVar.c(((xhf) z7eVar).c));
                } else if (iV == 3) {
                    arrayList3.addAll(tefVar.c((List) new ora(new ora(vqa.i(((ldd) z7eVar).c).g(new ycd(25)), new kce(20, pff.class), 5), new ycd(26), 5).s().e()));
                }
            }
            arrayList.addAll(arrayList3);
            list = arrayList2;
        }
        int i2 = 0;
        if (!list.isEmpty()) {
            tef tefVar2 = vuVar.a;
            synchronized (tefVar2) {
                tefVar2.h(list);
                tefVar2.g(list);
                bwd.a(new pef(tefVar2, i2), new ycd(19), tefVar2.h);
            }
        }
        if (i == 2) {
            vuVar.b.a.D(tuVar.c);
        } else if (i == 5 || i == 4) {
            wqi.c("vu", "onAssetsUpdate: set favorites sync=%d", Long.valueOf(tuVar.c));
            vuVar.b.a.z(tuVar.c);
            vr5 vr5Var = vuVar.d;
            List<y7e> list3 = tuVar.d;
            vr5Var.getClass();
            for (y7e y7eVar2 : list3) {
                if ("FAVORITE_STICKER_SETS".equals(y7eVar2.b)) {
                    List list4 = y7eVar2.e;
                    long j = y7eVar2.j;
                    long j2 = y7eVar2.g;
                    wqi.c("vr5", "onAssetsUpdate: sets=%s, marker=%d, updateTime=%d", list4, Long.valueOf(j2), Long.valueOf(j));
                    vr5Var.h(j);
                    qk3 qk3VarH = new ik3(vr5Var.a(), 2, new oh2(6, list4)).h((j0e) vr5Var.d.getValue());
                    qu1 qu1Var = new qu1(new er5(7), 0, new yl4(1));
                    qk3VarH.f(qu1Var);
                    vr5Var.Z.a(qu1Var);
                    if (j2 != 0) {
                        vr5Var.b(j2);
                    }
                }
            }
            ps5 ps5Var = vuVar.e;
            List<y7e> list5 = tuVar.d;
            ps5Var.getClass();
            wqi.c("ps5", "onAssetsUpdate size=" + list5.size(), new Object[0]);
            for (y7e y7eVar3 : list5) {
                if ("FAVORITE_STICKERS".equals(y7eVar3.b)) {
                    List list6 = y7eVar3.d;
                    long j3 = y7eVar3.g;
                    long j4 = y7eVar3.j;
                    wqi.c("ps5", "onAssetsUpdate: stickers=%s, marker=%d, updateTime=%d", list6, Long.valueOf(j3), Long.valueOf(j4));
                    ps5Var.i(j4);
                    qk3 qk3VarH2 = new ik3(((kr5) ps5Var.a.get()).a(), 2, new oh2(3, list6)).h((j0e) ps5Var.c.get());
                    qu1 qu1Var2 = new qu1(new oh2(12, list6), 0, new mr5(2, list6));
                    qk3VarH2.f(qu1Var2);
                    ps5Var.Z.a(qu1Var2);
                    if (j3 != 0) {
                        ps5Var.b(j3);
                    }
                }
            }
        } else if (i == 10) {
            wj wjVar = vuVar.g;
            List list7 = tuVar.d;
            Map map = tuVar.Z;
            ((w4e) wjVar.c).C(tuVar.c);
            wjVar.l.O(wjVar, wj.p[1], svi.e(wjVar.j, null, i84.b, new pj(wjVar, list7, map, null), 1));
        }
        if (!tuVar.o.isEmpty()) {
            for (Map.Entry entry : tuVar.o.entrySet()) {
                tef tefVar3 = vuVar.a;
                Long l = (Long) entry.getKey();
                l.getClass();
                jef jefVar = (jef) tefVar3.a.get(l);
                if (jefVar == null || jefVar.o < ((Long) entry.getValue()).longValue()) {
                    arrayList.add((Long) entry.getKey());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            jqi.i(arrayList);
            Iterator it2 = jqi.j(arrayList).iterator();
            while (it2.hasNext()) {
                vuVar.c.b(2, (List) it2.next());
            }
        }
        Map map2 = tuVar.X;
        if (!map2.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            List list8 = (List) vuVar.d.Y.u();
            if (!jqi.f(list8)) {
                for (Map.Entry entry2 : map2.entrySet()) {
                    Long l2 = (Long) entry2.getKey();
                    Iterator it3 = list8.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            arrayList4.add(l2);
                            break;
                        } else {
                            sff sffVar = (sff) it3.next();
                            if (sffVar.a != l2.longValue() || sffVar.f < ((Long) entry2.getValue()).longValue()) {
                            }
                        }
                    }
                }
            } else {
                arrayList4.addAll(map2.keySet());
            }
            if (!arrayList4.isEmpty()) {
                vuVar.c.b(3, arrayList4);
            }
        }
        tm tmVar2 = this.c;
        (tmVar2 != null ? tmVar2 : null).b().c(new uu(this.a, 0));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        tmVar.b().c(new rj0(this.a, pzfVar));
    }

    @Override // defpackage.sm
    public final n2 i() {
        return new wua(this.d, this.o);
    }
}
