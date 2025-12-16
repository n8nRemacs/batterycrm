package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mu0 extends dtf implements sm6 {
    public final /* synthetic */ ru0 X;
    public final /* synthetic */ List Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu0(ru0 ru0Var, List list, Continuation continuation) {
        super(2, continuation);
        this.X = ru0Var;
        this.Y = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mu0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mu0(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            cg8 cg8Var = this.X.d;
            this.o = 1;
            Object objInvoke = cg8Var.invoke(this.Y, this);
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
