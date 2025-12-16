package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ff9 extends dtf implements sm6 {
    public final /* synthetic */ hf9 X;
    public final /* synthetic */ pb2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff9(hf9 hf9Var, pb2 pb2Var, Continuation continuation) {
        super(2, continuation);
        this.X = hf9Var;
        this.Y = pb2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ff9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ff9(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        hf9 hf9Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objV = hf9.v(hf9Var, this.Y, this);
            g84 g84Var = g84.a;
            if (objV == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        hf9.t(hf9Var);
        return qqg.a;
    }
}
