package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class s84 extends dtf implements sm6 {
    public final /* synthetic */ l42 X;
    public final /* synthetic */ Callable o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s84(Callable callable, l42 l42Var, Continuation continuation) {
        super(2, continuation);
        this.o = callable;
        this.X = l42Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        s84 s84Var = (s84) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        s84Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new s84(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        l42 l42Var = this.X;
        g8j.b(obj);
        try {
            l42Var.resumeWith(this.o.call());
        } catch (Throwable th) {
            l42Var.resumeWith(new ipd(th));
        }
        return qqg.a;
    }
}
