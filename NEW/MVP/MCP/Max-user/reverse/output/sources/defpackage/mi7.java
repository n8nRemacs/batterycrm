package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mi7 extends dtf implements sm6 {
    public final /* synthetic */ bj7 X;
    public final /* synthetic */ vo6 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi7(bj7 bj7Var, vo6 vo6Var, Continuation continuation) {
        super(2, continuation);
        this.X = bj7Var;
        this.Y = vo6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mi7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mi7(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        vo6 vo6Var = this.Y;
        if (i == 0) {
            g8j.b(obj);
            uo6 uo6Var = vo6Var.a;
            this.o = 1;
            obj = bj7.a(this.X, uo6Var, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return vo6.a(vo6Var, ((Number) obj).intValue(), 13);
    }
}
