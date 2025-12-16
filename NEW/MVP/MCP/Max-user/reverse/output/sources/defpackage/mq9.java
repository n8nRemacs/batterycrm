package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mq9 extends dtf implements sm6 {
    public final /* synthetic */ sq9 X;
    public final /* synthetic */ oj9 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq9(sq9 sq9Var, oj9 oj9Var, Continuation continuation) {
        super(2, continuation);
        this.X = sq9Var;
        this.Y = oj9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mq9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mq9(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            jve jveVar = this.X.d;
            this.o = 1;
            Object objA = jveVar.a(this.Y, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
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
