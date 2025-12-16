package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nq6 extends dtf implements sm6 {
    public final /* synthetic */ tq6 X;
    public final /* synthetic */ Set Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq6(tq6 tq6Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.X = tq6Var;
        this.Y = set;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nq6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nq6(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        tq6 tq6Var = this.X;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            d53 d53Var = new d53(tq6Var.v0, 16);
            this.o = 1;
            if (gw0.p(d53Var, this) != g84Var) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        this.o = 2;
        Object objI = svi.i(((q2b) tq6Var.v()).f(), new zp6(tq6Var, this.Y, null), this);
        if (objI != g84Var) {
            objI = qqgVar;
        }
        return objI == g84Var ? g84Var : qqgVar;
    }
}
