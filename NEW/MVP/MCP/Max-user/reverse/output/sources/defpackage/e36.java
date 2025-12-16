package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class e36 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ dtf Y;
    public final /* synthetic */ z26 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e36(um6 um6Var, z26 z26Var, Continuation continuation) {
        super(2, continuation);
        this.Y = (dtf) um6Var;
        this.Z = z26Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((e36) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dtf, um6] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        e36 e36Var = new e36(this.Y, this.Z, continuation);
        e36Var.X = obj;
        return e36Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dtf, um6] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            this.o = 1;
            Object objInvoke = this.Y.invoke(f84Var, this.Z, this);
            g84 g84Var = g84.a;
            if (objInvoke == g84Var) {
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
