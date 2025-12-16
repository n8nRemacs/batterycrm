package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class g38 extends dtf implements sm6 {
    public final /* synthetic */ uy5 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g38(uy5 uy5Var, Continuation continuation) {
        super(2, continuation);
        this.X = uy5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((g38) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new g38(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            uy5 uy5Var = this.X;
            jkc jkcVar = new jkc((k18) uy5Var.d, (k18) uy5Var.o, (k18) uy5Var.X);
            this.o = 1;
            Object objT = jkcVar.t(this);
            g84 g84Var = g84.a;
            if (objT == g84Var) {
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
