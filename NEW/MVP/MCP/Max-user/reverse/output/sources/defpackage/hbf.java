package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hbf extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ nbf Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbf(nbf nbfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = nbfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((hbf) l((nx3) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hbf hbfVar = new hbf(this.Y, continuation);
        hbfVar.X = obj;
        return hbfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
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
        nx3 nx3Var = (nx3) this.X;
        tcf tcfVar = this.Y.u0;
        this.o = 1;
        tcfVar.setValue(nx3Var);
        g84 g84Var = g84.a;
        return qqgVar == g84Var ? g84Var : qqgVar;
    }
}
