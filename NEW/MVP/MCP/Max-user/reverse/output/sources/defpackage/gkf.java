package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gkf extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ ikf Y;
    public final /* synthetic */ em6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkf(em6 em6Var, long j, ikf ikfVar, Continuation continuation) {
        super(2, continuation);
        this.o = em6Var;
        this.X = j;
        this.Y = ikfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gkf gkfVar = (gkf) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gkfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gkf(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f62 f62Var;
        tcf tcfVar = this.Y.Z;
        g8j.b(obj);
        long j = this.X;
        em6 em6Var = this.o;
        if (em6Var != null) {
            em6Var.invoke(new Long(j));
        }
        List<f62> list = ((rjf) tcfVar.getValue()).a;
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        for (f62 f62Var2 : list) {
            dgf dgfVar = f62Var2.b;
            long j2 = f62Var2.a;
            if (dgfVar.a == j) {
                f62Var = new f62(j2, dgf.l(dgfVar, null, true, false, 191));
            } else if (dgfVar.Y) {
                f62Var = new f62(j2, dgf.l(dgfVar, null, false, false, 191));
            } else {
                arrayList.add(f62Var2);
            }
            f62Var2 = f62Var;
            arrayList.add(f62Var2);
        }
        tcfVar.m(null, new rjf(arrayList, ((rjf) tcfVar.getValue()).b));
        return qqg.a;
    }
}
