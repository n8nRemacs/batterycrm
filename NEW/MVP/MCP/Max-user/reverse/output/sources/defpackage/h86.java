package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h86 extends dtf implements sm6 {
    public final /* synthetic */ j86 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h86(j86 j86Var, Continuation continuation) {
        super(2, continuation);
        this.X = j86Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((h86) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new h86(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            j86 j86Var = this.X;
            y83 y83VarB = j86Var.c.b();
            jve jveVar = j86Var.a;
            this.o = 1;
            Object objD = y83VarB.d(jveVar, this);
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
