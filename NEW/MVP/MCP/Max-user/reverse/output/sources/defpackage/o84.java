package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class o84 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ lrd Y;
    public final /* synthetic */ z26 Z;
    public int o;
    public final /* synthetic */ String[] s0;
    public final /* synthetic */ Callable t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o84(lrd lrdVar, z26 z26Var, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.Y = lrdVar;
        this.Z = z26Var;
        this.s0 = strArr;
        this.t0 = callable;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((o84) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        o84 o84Var = new o84(this.Y, this.Z, this.s0, this.t0, continuation);
        o84Var.X = obj;
        return o84Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        x74 x74VarA;
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        f84 f84Var = (f84) this.X;
        pv0 pv0VarA = gzi.a(-1, 0, 6);
        n84 n84Var = new n84(this.s0, pv0VarA, 0);
        pv0VarA.g(qqgVar);
        rgg rggVar = (rgg) f84Var.getCoroutineContext().get(rgg.c);
        if (rggVar == null || (x74VarA = rggVar.a) == null) {
            x74VarA = l7j.a(this.Y);
        }
        pv0 pv0VarA2 = gzi.a(0, 0, 7);
        svi.e(f84Var, x74VarA, null, new m84(this.Y, n84Var, pv0VarA, this.t0, pv0VarA2, null), 2);
        this.o = 1;
        Object objA = mw0.a(this.Z, pv0VarA2, true, this);
        g84 g84Var = g84.a;
        if (objA != g84Var) {
            objA = qqgVar;
        }
        return objA == g84Var ? g84Var : qqgVar;
    }
}
