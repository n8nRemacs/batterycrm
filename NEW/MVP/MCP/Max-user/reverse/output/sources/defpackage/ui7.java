package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ui7 extends dtf implements sm6 {
    public final /* synthetic */ bj7 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui7(bj7 bj7Var, Continuation continuation) {
        super(2, continuation);
        this.X = bj7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ui7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ui7(this.X, continuation);
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
        String str = bj7.D0;
        Object objD = d7j.d(new oi7(this.X, null), this);
        g84 g84Var = g84.a;
        if (objD != g84Var) {
            objD = qqgVar;
        }
        return objD == g84Var ? g84Var : qqgVar;
    }
}
