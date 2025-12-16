package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b0c extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        b0c b0cVar = (b0c) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        b0cVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        b0c b0cVar = new b0c(2, continuation);
        b0cVar.o = obj;
        return b0cVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        wk7 wk7Var = (wk7) this.o;
        if (wk7Var == null) {
            throw new NoWhenBranchMatchedException();
        }
        k0c.c.p0().b(":link-intercept", gwi.b(new imb("link", wk7Var.a)));
        return qqg.a;
    }
}
