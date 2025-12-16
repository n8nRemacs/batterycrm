package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h5e extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ l5c Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5e(l5c l5cVar, Continuation continuation) {
        super(2, continuation);
        this.Y = l5cVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((h5e) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        h5e h5eVar = new h5e(this.Y, continuation);
        h5eVar.X = obj;
        return h5eVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            z26 z26Var = (z26) this.X;
            Object objK = this.Y.o.k();
            this.o = 1;
            Object objA = z26Var.a(objK, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
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
