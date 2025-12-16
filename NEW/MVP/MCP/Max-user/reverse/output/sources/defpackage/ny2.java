package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ny2 extends dtf implements sm6 {
    public final /* synthetic */ py2 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny2(py2 py2Var, Continuation continuation) {
        super(2, continuation);
        this.X = py2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ny2 ny2Var = (ny2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ny2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ny2 ny2Var = new ny2(this.X, continuation);
        ny2Var.o = obj;
        return ny2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        if (!((Boolean) this.X.d.invoke()).booleanValue()) {
            return qqgVar;
        }
        this.X.j = false;
        x9f x9fVar = this.X.f;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        py2 py2Var = this.X;
        py2Var.f = svi.e(f84Var, py2Var.l, null, new ky2(py2Var, null), 2);
        py2 py2Var2 = this.X;
        x3 x3Var = new x3(new d53(py2Var2.c.j(py2Var2.a), 12), this.X, 22);
        int i = s65.d;
        gw0.w(new m36(new g56(gw0.k(x3Var, s8j.f(v9j.h(10, y65.SECONDS))), new ly2(this.X, null), 1), new w41(3, null, 1)), f84Var);
        return qqgVar;
    }
}
