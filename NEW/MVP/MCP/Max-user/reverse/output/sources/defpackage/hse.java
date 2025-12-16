package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hse extends dtf implements sm6 {
    public final /* synthetic */ sy0 X;
    public final /* synthetic */ nse Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hse(sy0 sy0Var, nse nseVar, Continuation continuation) {
        super(2, continuation);
        this.X = sy0Var;
        this.Y = nseVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hse) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new hse(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        List<ttg> list;
        List list2;
        Object next;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            sy0 sy0Var = sy0.t0;
            sy0 sy0Var2 = this.X;
            nse nseVar = this.Y;
            if (sy0Var2 == sy0Var || sy0Var2 == sy0.w0) {
                ((b8a) ((l7a) nseVar.X.getValue())).s();
            }
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
                    for (int i2 = 0; i2 < si9Var.e(); i2++) {
                        znd.b(hashSet3, ((w10) si9Var.g().get(i2)).s);
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
            qv5Var.a(new y6i(16, zndVar)).h(Collections.singletonList(axi.c(sy0Var2)));
            yy0 yy0Var = (yy0) nseVar.Y.getValue();
            Long l = null;
            if (yy0Var != null) {
                Iterator it5 = yy0Var.b.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it5.next();
                    if (((ry0) next).a == sy0Var2) {
                        break;
                    }
                }
                ry0 ry0Var = (ry0) next;
                if (ry0Var != null) {
                    l = new Long(ry0Var.b);
                }
            }
            if (l != null) {
                nse.t(nseVar, l.longValue());
            }
            this.o = 1;
            Object objU = nse.u(nseVar, this);
            g84 g84Var = g84.a;
            if (objU == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
