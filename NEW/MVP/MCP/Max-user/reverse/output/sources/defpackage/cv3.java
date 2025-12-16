package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cv3 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ d53 Y;
    public final /* synthetic */ iv3 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv3(d53 d53Var, Continuation continuation, iv3 iv3Var) {
        super(2, continuation);
        this.Y = d53Var;
        this.Z = iv3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cv3) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cv3 cv3Var = new cv3(this.Y, continuation, this.Z);
        cv3Var.X = obj;
        return cv3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            ld2 ld2Var = new ld2((z26) this.X, this.Z, 3);
            this.o = 1;
            Object objD = this.Y.d(ld2Var, this);
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
