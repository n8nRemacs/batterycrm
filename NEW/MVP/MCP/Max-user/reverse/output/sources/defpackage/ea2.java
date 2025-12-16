package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ea2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ fa2 Y;
    public final /* synthetic */ z26 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea2(fa2 fa2Var, z26 z26Var, Continuation continuation) {
        super(2, continuation);
        this.Y = fa2Var;
        this.Z = z26Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ea2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ea2 ea2Var = new ea2(this.Y, this.Z, continuation);
        ea2Var.X = obj;
        return ea2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            uid uidVar = new uid();
            fa2 fa2Var = this.Y;
            x26 x26Var = fa2Var.d;
            x92 x92Var = new x92(uidVar, f84Var, fa2Var, this.Z, 1);
            this.o = 1;
            Object objD = x26Var.d(x92Var, this);
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
