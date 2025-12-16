package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class s33 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ x26 Y;
    public final /* synthetic */ icd Z;
    public int o;
    public final /* synthetic */ b43 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s33(x26 x26Var, Continuation continuation, icd icdVar, b43 b43Var) {
        super(2, continuation);
        this.Y = x26Var;
        this.Z = icdVar;
        this.s0 = b43Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((s33) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        s33 s33Var = new s33(this.Y, continuation, this.Z, this.s0);
        s33Var.X = obj;
        return s33Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            z26 z26Var = (z26) this.X;
            x92 x92Var = new x92(new rid(), z26Var, (Object) this.Z, (Object) this.s0, 2);
            this.o = 1;
            Object objD = this.Y.d(x92Var, this);
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
