package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class st2 extends dtf implements sm6 {
    public final /* synthetic */ bu2 X;
    public final /* synthetic */ pb2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st2(bu2 bu2Var, pb2 pb2Var, Continuation continuation) {
        super(2, continuation);
        this.X = bu2Var;
        this.Y = pb2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((st2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new st2(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            k1a k1aVar = (k1a) ((k18) this.X.o.getValue()).getValue();
            this.o = 1;
            Object objO = k1aVar.o(this.Y, this);
            g84 g84Var = g84.a;
            if (objO == g84Var) {
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
