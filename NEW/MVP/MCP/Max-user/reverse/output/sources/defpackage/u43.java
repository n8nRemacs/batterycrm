package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u43 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public int o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((u43) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        u43 u43Var = new u43(2, continuation);
        u43Var.X = obj;
        return u43Var;
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
