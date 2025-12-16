package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xt6 extends dtf implements sm6 {
    public final /* synthetic */ zt6 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt6(zt6 zt6Var, Continuation continuation) {
        super(2, continuation);
        this.X = zt6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xt6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xt6(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        w6g w6gVar = (w6g) this.X.g.getValue();
        this.o = 1;
        k18 k18Var = w6gVar.a;
        k18 k18Var2 = w6gVar.b;
        wb8 wb8Var = (wb8) k18Var.getValue();
        Context context = (Context) k18Var2.getValue();
        int i2 = of0.b;
        Object objA = wb8.a(wb8Var, context, jui.b(h5b.d.a, a93.s0.x((Context) k18Var2.getValue()).l()), this);
        g84 g84Var = g84.a;
        return objA == g84Var ? g84Var : objA;
    }
}
