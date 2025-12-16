package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class di0 extends dtf implements sm6 {
    public final /* synthetic */ hi0 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di0(hi0 hi0Var, Continuation continuation) {
        super(2, continuation);
        this.X = hi0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((di0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new di0(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            l24 l24Var = (l24) this.X.b.getValue();
            this.o = 1;
            obj = l24Var.d();
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
        return Boolean.valueOf(((Number) obj).intValue() == 0);
    }
}
