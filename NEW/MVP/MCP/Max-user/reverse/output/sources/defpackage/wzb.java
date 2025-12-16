package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wzb extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n8b Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzb(n8b n8bVar, Continuation continuation) {
        super(2, continuation);
        this.Y = n8bVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wzb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wzb wzbVar = new wzb(this.Y, continuation);
        wzbVar.X = obj;
        return wzbVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.X;
            this.X = f84Var;
            this.o = 1;
            Object objC = s8j.c(600L, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f84Var = (f84) this.X;
            g8j.b(obj);
        }
        if (d7j.f(f84Var)) {
            this.Y.setShimmerEnabled(true);
        }
        return qqg.a;
    }
}
