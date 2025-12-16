package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class z92 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ aa2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z92(aa2 aa2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = aa2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((z92) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        z92 z92Var = new z92(this.Y, continuation);
        z92Var.X = obj;
        return z92Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            z26 z26Var = (z26) this.X;
            this.o = 1;
            Object objN = this.Y.n(z26Var, this);
            g84 g84Var = g84.a;
            if (objN == g84Var) {
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
