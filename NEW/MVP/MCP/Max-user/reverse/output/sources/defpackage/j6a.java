package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j6a extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ o6a o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6a(o6a o6aVar, long j, Continuation continuation) {
        super(2, continuation);
        this.o = o6aVar;
        this.X = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        j6a j6aVar = (j6a) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        j6aVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new j6a(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Set setF;
        List listA;
        g8j.b(obj);
        tcf tcfVar = this.o.d;
        Set set = ((f6a) tcfVar.getValue()).b;
        boolean zIsEmpty = set.isEmpty();
        long j = this.X;
        if (zIsEmpty) {
            setF = Collections.singleton(new Long(j));
        } else if (set.contains(new Long(j))) {
            setF = ue3.g0(set);
            setF.remove(new Long(j));
        } else {
            setF = gke.f(set, new Long(j));
        }
        if (setF.isEmpty()) {
            listA = hd5.a;
        } else {
            o98 o98VarD = ve3.d();
            o98VarD.add(new vfb(udb.v, vdb.h, yud.x));
            listA = ve3.a(o98VarD);
        }
        tcfVar.m(null, new f6a(true, setF, listA));
        return qqg.a;
    }
}
