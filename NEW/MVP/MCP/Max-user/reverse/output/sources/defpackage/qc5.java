package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qc5 extends dtf implements sm6 {
    public final /* synthetic */ uc5 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc5(uc5 uc5Var, Continuation continuation) {
        super(2, continuation);
        this.X = uc5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qc5 qc5Var = (qc5) l((cjg) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qc5Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qc5 qc5Var = new qc5(this.X, continuation);
        qc5Var.o = obj;
        return qc5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r36v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i;
        ob5 ob5VarT;
        ?? r36;
        Object obj2;
        Iterator it;
        List list;
        long j;
        vh vhVar;
        Object next;
        g8j.b(obj);
        cjg cjgVar = (cjg) this.o;
        List list2 = (List) cjgVar.a;
        List list3 = (List) cjgVar.b;
        List list4 = (List) cjgVar.c;
        uc5 uc5Var = this.X;
        yy7[] yy7VarArr = uc5.u0;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list3.iterator();
        while (true) {
            i = 0;
            ob5VarT = null;
            if (!it2.hasNext()) {
                break;
            }
            scd scdVar = (scd) it2.next();
            hdd hddVar = scdVar.a;
            if (hddVar == hdd.EMOJI && (scdVar instanceof wb5)) {
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (fni.a(((ob5) next).c, ((wb5) scdVar).c)) {
                        break;
                    }
                }
                ob5 ob5Var = (ob5) next;
                if (ob5Var != null) {
                    ob5VarT = new ob5(la5.o.a, -ob5Var.b, ob5Var.c, ob5Var.d, ob5Var.o, ob5Var.X);
                }
            } else if (hddVar == hdd.ANIMOJI && (vhVar = (vh) ((wj) uc5Var.o.getValue()).i(scdVar.b).getValue()) != null) {
                ob5VarT = uc5Var.t(list2, vhVar, la5.o.a, 0);
            }
            if (ob5VarT != null) {
                arrayList.add(ob5VarT);
            }
        }
        String name = uc5.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ho7.g("Load emoji. Finish. emojis:", list2.size(), list3.size(), ", recent:"), null);
            }
        }
        uc5 uc5Var2 = this.X;
        tcf tcfVar = uc5Var2.X;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : list2) {
            Integer numValueOf = Integer.valueOf(((ob5) obj3).a);
            Object arrayList2 = linkedHashMap.get(numValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList2);
            }
            ((List) arrayList2).add(obj3);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        Iterator it4 = linkedHashMap.entrySet().iterator();
        while (true) {
            r36 = ob5VarT;
            if (!it4.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it4.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list5 = (List) entry.getValue();
            tha thaVar = la5.d;
            int iIntValue2 = ((Number) entry.getKey()).intValue();
            thaVar.getClass();
            la5 la5VarN = tha.n(iIntValue2);
            int iIntValue3 = ((Number) entry.getKey()).intValue();
            arrayList3.add(new e62(iIntValue, list5, !(arrayList.isEmpty() && list4.isEmpty() && ((sc5) tcfVar.getValue()).a == Integer.MIN_VALUE) ? ((sc5) tcfVar.getValue()).a != ((Number) entry.getKey()).intValue() : ((Number) entry.getKey()).intValue() != la5.X.a, la5VarN, (String) null, (String) null, (r5g) null, iIntValue3 == la5.o.a ? Long.MIN_VALUE : iIntValue3 - Long.MAX_VALUE, 496));
            ob5VarT = r36;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        if (!list4.isEmpty()) {
            int i2 = 0;
            for (Iterator it5 = list4.iterator(); it5.hasNext(); it5 = it) {
                Object next2 = it5.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ve3.p();
                    throw r36;
                }
                bk bkVar = (bk) next2;
                boolean zIsEmpty = arrayList.isEmpty();
                ArrayList arrayList5 = new ArrayList();
                int i4 = la5.Y.a + i2;
                int size = bkVar.d.size();
                while (i < size) {
                    arrayList5.add(uc5Var2.t(list2, (vh) bkVar.d.get(i), i4, i));
                    i++;
                }
                la5 la5Var = la5.Y;
                r5g r5gVar = new r5g(bkVar.a);
                String str = bkVar.b;
                String str2 = bkVar.c;
                if (i4 == la5.o.a) {
                    it = it5;
                    list = list2;
                    j = Long.MIN_VALUE;
                } else {
                    it = it5;
                    list = list2;
                    j = i4 - Long.MAX_VALUE;
                }
                arrayList4.add(0, new e62(i4, arrayList5, !(zIsEmpty && ((sc5) tcfVar.getValue()).a == Integer.MIN_VALUE) ? ((sc5) tcfVar.getValue()).a != i4 : i2 != 0, la5Var, str, str2, r5gVar, j, 384));
                i = 0;
                i2 = i3;
                list2 = list;
            }
        }
        int i5 = i;
        if (arrayList.isEmpty()) {
            obj2 = r36;
        } else {
            int i6 = la5.o.a;
            la5.d.getClass();
            obj2 = r36;
            arrayList4.add(i5, new e62(i6, (List) arrayList, (boolean) ((((sc5) tcfVar.getValue()).a != Integer.MIN_VALUE ? 1 : i5) ^ 1), tha.n(i6), (String) null, (String) null, (r5g) null, Long.MIN_VALUE, 496));
        }
        o98 o98VarD = ve3.d();
        Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            e62 e62Var = (e62) it6.next();
            o98VarD.add(e62Var);
            o98VarD.addAll(e62Var.b);
        }
        this.X.s0.m(obj2, new rc5(arrayList4, ve3.a(o98VarD)));
        return qqg.a;
    }
}
