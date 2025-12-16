package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class p84 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ lrd Y;
    public final /* synthetic */ String[] Z;
    public int o;
    public final /* synthetic */ Callable s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p84(lrd lrdVar, String[] strArr, Callable callable, Continuation continuation) {
        super(2, continuation);
        this.Y = lrdVar;
        this.Z = strArr;
        this.s0 = callable;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((p84) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        p84 p84Var = new p84(this.Y, this.Z, this.s0, continuation);
        p84Var.X = obj;
        return p84Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            o84 o84Var = new o84(this.Y, (z26) this.X, this.Z, this.s0, null);
            this.o = 1;
            Object objD = d7j.d(o84Var, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
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
