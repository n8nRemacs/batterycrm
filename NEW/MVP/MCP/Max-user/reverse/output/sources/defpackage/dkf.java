package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dkf extends dtf implements sm6 {
    public final /* synthetic */ ikf X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkf(ikf ikfVar, Continuation continuation) {
        super(2, continuation);
        this.X = ikfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dkf dkfVar = (dkf) l((pjf) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dkfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dkf dkfVar = new dkf(this.X, continuation);
        dkfVar.o = obj;
        return dkfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        List list;
        List list2;
        cze czeVar;
        boolean z;
        long j;
        dgf dgfVar;
        dgf dgfVar2;
        ikf ikfVar = this.X;
        tcf tcfVar = ikfVar.Z;
        tcf tcfVar2 = ikfVar.u0;
        g8j.b(obj);
        pjf pjfVar = (pjf) this.o;
        List list3 = pjfVar.a;
        if (list3 != null && (list = pjfVar.b) != null && (list2 = pjfVar.c) != null && (czeVar = pjfVar.d) != null) {
            yy7[] yy7VarArr = ikf.z0;
            ArrayList arrayList = new ArrayList();
            if (list3.isEmpty()) {
                z = true;
                j = 0;
                dgfVar = null;
            } else {
                z = true;
                j = 0;
                dgfVar = new dgf(-9223372036854775807L, new n5g(x5b.l), null, Integer.valueOf(yud.X1), ikf.v(-9223372036854775807L, list3), 1, ((qjf) tcfVar2.getValue()).a == 0, false, 132);
            }
            dgf dgfVar3 = !list.isEmpty() ? new dgf(-9223372036854775806L, new n5g(x5b.j), null, Integer.valueOf(yud.L), ikf.v(-9223372036854775806L, list), 2, dgfVar == null ? z : false, false, 132) : null;
            List list4 = czeVar.a;
            dgf dgfVar4 = !list4.isEmpty() ? new dgf(-9223372036854775805L, new n5g(x5b.k), null, Integer.valueOf(v5b.e), ikf.v(-9223372036854775805L, list4), 3, (dgfVar == null && dgfVar3 == null) ? z : false, false, 132) : null;
            List listY = ue3.Y(czeVar.b, 100);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listY) {
                sff sffVar = (sff) obj2;
                if (list2.isEmpty()) {
                    dgfVar2 = dgfVar;
                    arrayList2.add(obj2);
                } else {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        dgfVar2 = dgfVar;
                        sff sffVar2 = sffVar;
                        Iterator it2 = it;
                        if (sffVar.a == ((sff) it.next()).a) {
                            break;
                        }
                        dgfVar = dgfVar2;
                        sffVar = sffVar2;
                        it = it2;
                    }
                    dgfVar2 = dgfVar;
                    arrayList2.add(obj2);
                }
                dgfVar = dgfVar2;
            }
            dgf dgfVar5 = dgfVar;
            o98 o98VarD = ve3.d();
            o98VarD.add(mq5.a);
            if (dgfVar5 != null) {
                ikf.t(o98VarD, dgfVar5, arrayList);
            }
            if (dgfVar3 != null) {
                ikf.t(o98VarD, dgfVar3, arrayList);
            }
            if (dgfVar4 != null) {
                ikf.t(o98VarD, dgfVar4, arrayList);
            }
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                ikf.t(o98VarD, ikf.u((sff) it3.next(), 4), arrayList);
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                dgf dgfVarU = ikf.u((sff) it4.next(), 5);
                arrayList.add(new f62(dgfVarU.a, dgfVarU));
                o98VarD.add(dgfVarU);
            }
            o98 o98VarA = ve3.a(o98VarD);
            wqi.c(ikf.class.getName(), "stickers loaded, sets:" + arrayList.size() + ",content:" + o98VarA.getSize(), new Object[0]);
            tcfVar.m(null, new rjf(arrayList, o98VarA));
            long j2 = j;
            long andSet = ikfVar.t0.getAndSet(j2);
            if (andSet > j2) {
                Iterator it5 = ((rjf) tcfVar.getValue()).a.iterator();
                int i = 0;
                while (true) {
                    if (!it5.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((f62) it5.next()).b.a == andSet) {
                        break;
                    }
                    i++;
                }
                int i2 = i - 1;
                tcfVar2.m(null, new qjf(andSet, 0, i2 < 0 ? 0 : i2, 2));
                ikfVar.w(andSet, null);
            }
        }
        return qqg.a;
    }
}
