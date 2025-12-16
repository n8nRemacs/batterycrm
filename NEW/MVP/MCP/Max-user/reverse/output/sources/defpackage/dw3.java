package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dw3 extends dtf implements sm6 {
    public final /* synthetic */ tw3 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw3(tw3 tw3Var, Continuation continuation) {
        super(2, continuation);
        this.X = tw3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dw3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dw3(this.X, continuation);
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
        tw3 tw3Var = this.X;
        ou3 ou3Var = (ou3) tw3Var.x.getValue();
        long j = tw3Var.n;
        this.o = 1;
        ou3Var.a(j);
        g84 g84Var = g84.a;
        return qqgVar == g84Var ? g84Var : qqgVar;
    }
}
