package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rw1 extends dtf implements sm6 {
    public final /* synthetic */ sw1 X;
    public final /* synthetic */ rj0 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw1(sw1 sw1Var, rj0 rj0Var, Continuation continuation) {
        super(2, continuation);
        this.X = sw1Var;
        this.Y = rj0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rw1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rw1(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            jve jveVar = this.X.a;
            aa1 aa1Var = new aa1(this.Y.a);
            this.o = 1;
            Object objA = jveVar.a(aa1Var, this);
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
