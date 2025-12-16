package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ci0 extends dtf implements sm6 {
    public final /* synthetic */ hi0 X;
    public final /* synthetic */ b73 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci0(hi0 hi0Var, b73 b73Var, Continuation continuation) {
        super(2, continuation);
        this.X = hi0Var;
        this.Y = b73Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ci0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ci0(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objD = d7j.d(new gi0(this.X, this.Y, null), this);
            g84 g84Var = g84.a;
            if (objD != g84Var) {
                objD = qqgVar;
            }
            if (objD == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqgVar;
    }
}
