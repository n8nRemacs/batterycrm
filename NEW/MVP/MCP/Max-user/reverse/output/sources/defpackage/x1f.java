package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x1f extends dtf implements sm6 {
    public final /* synthetic */ z1f X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1f(z1f z1fVar, Continuation continuation) {
        super(2, continuation);
        this.X = z1fVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((x1f) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new x1f(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objF = z1f.f(this.X, this);
            g84 g84Var = g84.a;
            if (objF == g84Var) {
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
