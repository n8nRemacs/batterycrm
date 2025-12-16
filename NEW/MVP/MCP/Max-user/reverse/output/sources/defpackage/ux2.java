package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ux2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ d53 Y;
    public final /* synthetic */ zx2 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux2(d53 d53Var, Continuation continuation, zx2 zx2Var) {
        super(2, continuation);
        this.Y = d53Var;
        this.Z = zx2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ux2) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ux2 ux2Var = new ux2(this.Y, continuation, this.Z);
        ux2Var.X = obj;
        return ux2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            ld2 ld2Var = new ld2((z26) this.X, this.Z, 2);
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
