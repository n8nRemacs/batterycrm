package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jse extends dtf implements sm6 {
    public final /* synthetic */ nse o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jse(nse nseVar, Continuation continuation) {
        super(2, continuation);
        this.o = nseVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jse jseVar = (jse) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jseVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new jse(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        List<ttg> list;
        List list2;
        Object value;
        g8j.b(obj);
        nse nseVar = this.o;
        qv5 qv5Var = (qv5) nseVar.o.getValue();
        qv5Var.getClass();
        ve2 ve2Var = qv5Var.c;
        qi9 qi9Var = qv5Var.d;
        gwg gwgVar = qv5Var.e;
        bn9 bn9Var = qv5Var.f;
        u2h u2hVar = qv5Var.g;
        quf qufVar = qv5Var.h;
        znd zndVar = new znd();
        HashSet hashSet = new HashSet();
        zndVar.a = hashSet;
        try {
            vvg vvgVar = vvg.UNKNOWN;
            list = (List) gwgVar.g().c(Collections.EMPTY_LIST);
        } catch (Throwable th) {
            wqi.e("znd", "getUploadsFromRepository: failed", th);
            list = Collections.EMPTY_LIST;
        }
        for (ttg ttgVar : list) {
            znd.b(hashSet, ttgVar.a.a);
            znd.b(hashSet, ttgVar.b);
        }
        HashSet hashSet2 = (HashSet) zndVar.a;
        try {
            list2 = (List) bn9Var.a().c(Collections.EMPTY_LIST);
        } catch (Throwable th2) {
            wqi.e("znd", "getMessageUploads: failed", th2);
            list2 = Collections.EMPTY_LIST;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            znd.b(hashSet2, ((um9) it.next()).b);
        }
        ((HashSet) zndVar.a).addAll((List) new ora(new ora(vqa.i(ve2Var.O(ve2.I)).g(new o9g(29)), new fwg(0), 4), new fwg(1), 5).s().e());
        HashSet hashSet3 = (HashSet) zndVar.a;
        List list3 = xi9.b;
        Iterator it2 = qi9Var.o().iterator();
        while (it2.hasNext()) {
            si9 si9Var = (si9) it2.next();
            if (si9Var.t()) {
                for (int i = 0; i < si9Var.e(); i++) {
                    znd.b(hashSet3, ((w10) si9Var.g().get(i)).s);
                }
            }
        }
        HashSet hashSet4 = (HashSet) zndVar.a;
        Iterator it3 = Collections.unmodifiableSet(u2hVar.i.keySet()).iterator();
        while (it3.hasNext()) {
            znd.b(hashSet4, ((l2h) it3.next()).a);
        }
        HashSet hashSet5 = (HashSet) zndVar.a;
        Iterator it4 = ue3.h0(qufVar.g.keySet()).iterator();
        while (it4.hasNext()) {
            znd.b(hashSet5, ((l2h) it4.next()).a);
        }
        qv5Var.k.getClass();
        jdc jdcVarA = qv5Var.a(new y6i(16, zndVar));
        ArrayList arrayList = new ArrayList();
        zg5 zg5Var = sy0.A0;
        zg5Var.getClass();
        f2 f2Var = new f2(0, zg5Var);
        long j = 0;
        while (f2Var.hasNext()) {
            sy0 sy0Var = (sy0) f2Var.next();
            zy0 zy0VarC = axi.c(sy0Var);
            Iterator it5 = ((ArrayList) jdcVarA.b).iterator();
            long j2 = 0;
            while (it5.hasNext()) {
                my0 my0Var = (my0) it5.next();
                if (zy0VarC == zy0.a || my0Var.d == zy0VarC) {
                    j2 += my0Var.b;
                }
            }
            if (j2 != 0) {
                arrayList.add(new ry0(sy0Var, j2));
                j += j2;
            }
        }
        if (arrayList.size() > 1) {
            ze3.s(new vs6(22), arrayList);
        }
        tcf tcfVar = nseVar.Y;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, new yy0(j, arrayList)));
        return qqg.a;
    }
}
