package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ajf extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ bjf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajf(bjf bjfVar, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.o = bjfVar;
        this.X = j;
        this.Y = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ajf ajfVar = (ajf) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ajfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ajf(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object next;
        g8j.b(obj);
        bjf bjfVar = this.o;
        ci5 ci5Var = bjfVar.Y;
        Iterator it = ((Iterable) bjfVar.o.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            h8e h8eVar = (h8e) next;
            if ((h8eVar instanceof f8e) && ((f8e) h8eVar).a == this.X) {
                break;
            }
        }
        f8e f8eVar = next instanceof f8e ? (f8e) next : null;
        qqg qqgVar = qqg.a;
        if (f8eVar != null) {
            String str = f8eVar.o;
            int i = udb.k;
            int i2 = this.Y;
            if (i2 == i) {
                xfh.r(ci5Var, new mne(str));
                return qqgVar;
            }
            if (i2 == udb.l) {
                xfh.r(ci5Var, new nne(str));
                return qqgVar;
            }
            if (i2 == udb.i) {
                xb3.a(bjfVar.b, str);
                qne qneVar = xb3.b() ? new qne(yud.u, new n5g(vdb.g)) : null;
                if (qneVar != null) {
                    xfh.r(ci5Var, qneVar);
                    return qqgVar;
                }
            } else if (i2 == udb.j) {
                bjfVar.x0 = Long.valueOf(f8eVar.a);
                xfh.r(ci5Var, new one(new n5g(vdb.k), new n5g(vdb.j), ve3.j(new pq3(udb.b, new n5g(vdb.h), 1, 56), new pq3(udb.a, new n5g(vdb.i), 2, 56))));
            }
        }
        return qqgVar;
    }
}
