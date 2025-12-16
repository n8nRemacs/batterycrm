package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yld extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sm6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yld(sm6 sm6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = sm6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yld) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yld yldVar = new yld(this.Y, continuation);
        yldVar.X = obj;
        return yldVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            this.o = 1;
            Object objInvoke = this.Y.invoke(f84Var, this);
            g84 g84Var = g84.a;
            if (objInvoke == g84Var) {
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
