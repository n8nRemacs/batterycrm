package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ow9 extends dtf implements em6 {
    public final /* synthetic */ yw9 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow9(yw9 yw9Var, Continuation continuation) {
        super(1, continuation);
        this.X = yw9Var;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        return new ow9(this.X, (Continuation) obj).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        yw9 yw9Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = yw9.o;
            yw9Var.i().b(yw9Var.h().e(), "MESS_GROUP_NOTIF");
            dt2 dt2Var = (dt2) yw9Var.c.getValue();
            this.o = 1;
            Object objD = dt2Var.d(this);
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
        yw9Var.n.a();
        return qqg.a;
    }
}
