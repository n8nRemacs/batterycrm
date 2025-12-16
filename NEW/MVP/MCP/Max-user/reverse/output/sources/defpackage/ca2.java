package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ca2 extends dtf implements sm6 {
    public final /* synthetic */ fa2 X;
    public final /* synthetic */ z26 Y;
    public final /* synthetic */ Object Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca2(fa2 fa2Var, z26 z26Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.X = fa2Var;
        this.Y = z26Var;
        this.Z = obj;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ca2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ca2(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [dtf, um6] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            ?? r3 = this.X.o;
            this.o = 1;
            Object objInvoke = r3.invoke(this.Y, this.Z, this);
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
