package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class au2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ d53 Y;
    public final /* synthetic */ f84 Z;
    public int o;
    public final /* synthetic */ bu2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au2(d53 d53Var, Continuation continuation, f84 f84Var, bu2 bu2Var) {
        super(2, continuation);
        this.Y = d53Var;
        this.Z = f84Var;
        this.s0 = bu2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((au2) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        au2 au2Var = new au2(this.Y, continuation, this.Z, this.s0);
        au2Var.X = obj;
        return au2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            zt2 zt2Var = new zt2((z26) this.X, this.Z, this.s0);
            this.o = 1;
            Object objD = this.Y.d(zt2Var, this);
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
