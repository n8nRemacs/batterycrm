package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fs0 extends dtf implements sm6 {
    public final /* synthetic */ is0 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs0(is0 is0Var, Continuation continuation) {
        super(2, continuation);
        this.X = is0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fs0) l((f03) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fs0(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        this.o = 1;
        Object objA = is0.a(this.X, this);
        g84 g84Var = g84.a;
        return objA == g84Var ? g84Var : objA;
    }
}
