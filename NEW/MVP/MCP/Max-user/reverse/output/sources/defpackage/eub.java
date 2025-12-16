package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class eub extends dtf implements sm6 {
    public final /* synthetic */ kub X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eub(kub kubVar, Continuation continuation) {
        super(2, continuation);
        this.X = kubVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((eub) l(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new eub(this.X, continuation);
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
        this.o = 1;
        Object objD = d7j.d(new fub(this.X, null), this);
        g84 g84Var = g84.a;
        if (objD != g84Var) {
            objD = qqgVar;
        }
        return objD == g84Var ? g84Var : qqgVar;
    }
}
