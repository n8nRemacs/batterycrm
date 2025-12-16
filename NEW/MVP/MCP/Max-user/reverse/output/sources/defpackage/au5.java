package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class au5 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public int o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((au5) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        au5 au5Var = new au5(2, continuation);
        au5Var.X = obj;
        return au5Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        z26 z26Var = (z26) this.X;
        this.o = 1;
        Object objA = z26Var.a(qqgVar, this);
        g84 g84Var = g84.a;
        return objA == g84Var ? g84Var : qqgVar;
    }
}
