package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fvh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public int o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fvh) l((zlb) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fvh fvhVar = new fvh(2, continuation);
        fvhVar.X = obj;
        return fvhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zlb zlbVar = (zlb) this.X;
            g8j.b(obj);
            return zlbVar;
        }
        g8j.b(obj);
        zlb zlbVar2 = (zlb) this.X;
        if (zlbVar2 instanceof xlb) {
            this.X = zlbVar2;
            this.o = 1;
            Object objC = s8j.c(600L, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
        }
        return zlbVar2;
    }
}
