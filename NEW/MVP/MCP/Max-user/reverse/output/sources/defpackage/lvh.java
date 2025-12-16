package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lvh extends dtf implements sm6 {
    public final /* synthetic */ uvh X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lvh(uvh uvhVar, Continuation continuation) {
        super(2, continuation);
        this.X = uvhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lvh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new lvh(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            uvh uvhVar = this.X;
            o92 o92Var = new o92((pv0) uvhVar.J0.f);
            tw twVar = new tw(12, uvhVar);
            this.o = 1;
            Object objD = o92Var.d(twVar, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
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
