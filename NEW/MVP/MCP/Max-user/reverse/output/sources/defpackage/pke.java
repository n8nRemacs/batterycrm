package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pke extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k18 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pke(k18 k18Var, Continuation continuation) {
        super(2, continuation);
        this.Y = k18Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pke) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pke pkeVar = new pke(this.Y, continuation);
        pkeVar.X = obj;
        return pkeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            z26 z26Var = (z26) this.X;
            Long l = new Long(((z7c) this.Y.getValue()).a.s());
            this.o = 1;
            Object objA = z26Var.a(l, this);
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
