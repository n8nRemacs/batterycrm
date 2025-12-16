package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class fu extends sm implements j1g {
    public final int d;
    public final long[] o;

    public fu(int i, long j, long[] jArr) {
        super(j);
        this.d = i;
        this.o = jArr;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        gu guVar = (gu) l0gVar;
        int i = this.d;
        int iV = az1.v(i);
        int i2 = 1;
        if (iV == 1) {
            tm tmVar = this.c;
            if (tmVar == null) {
                tmVar = null;
            }
            tef tefVar = (tef) tmVar.p.getValue();
            List list = guVar.c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(po8.p((kef) it.next()));
            }
            tefVar.e(arrayList);
            tm tmVar2 = this.c;
            if (tmVar2 == null) {
                tmVar2 = null;
            }
            vr5 vr5Var = (vr5) tmVar2.s.getValue();
            List list2 = guVar.c;
            ArrayList arrayList2 = new ArrayList(we3.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(((kef) it2.next()).k));
            }
            vr5Var.e(arrayList2);
        } else if (iV == 2) {
            tm tmVar3 = this.c;
            if (tmVar3 == null) {
                tmVar3 = null;
            }
            igf igfVar = (igf) tmVar3.q.getValue();
            List<tff> list3 = guVar.d;
            igfVar.getClass();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (tff tffVar : list3) {
                arrayList3.addAll(igfVar.b.c(tffVar.h));
                arrayList4.add(igf.e(tffVar));
            }
            if (!arrayList3.isEmpty()) {
                jqi.i(arrayList3);
                Iterator it3 = jqi.j(arrayList3).iterator();
                while (it3.hasNext()) {
                    igfVar.c.b(2, (List) it3.next());
                }
            }
            if (!arrayList4.isEmpty()) {
                kgf kgfVar = igfVar.a;
                kgfVar.getClass();
                azi.b(new ik3(new ora(vqa.i(arrayList4), new vef(13), 5).s(), 2, new ggf(kgfVar, i2)).i(), pdf.e, new oh2(23, arrayList4), new mr5(6, arrayList4));
            }
            tm tmVar4 = this.c;
            if (tmVar4 == null) {
                tmVar4 = null;
            }
            vr5 vr5Var2 = (vr5) tmVar4.s.getValue();
            List list4 = guVar.d;
            ArrayList arrayList5 = new ArrayList(we3.q(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList5.add(Long.valueOf(((tff) it4.next()).a));
            }
            vr5Var2.e(arrayList5);
        }
        tm tmVar5 = this.c;
        (tmVar5 != null ? tmVar5 : null).b().c(new hu(i, this.a, ys.C(this.o)));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        wqi.e("fu", pzfVar.toString(), null);
    }

    @Override // defpackage.sm
    public final n2 i() {
        return new wua(this.d, this.o);
    }
}
