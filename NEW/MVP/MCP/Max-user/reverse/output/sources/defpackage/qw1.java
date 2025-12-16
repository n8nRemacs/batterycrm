package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qw1 extends dtf implements sm6 {
    public final /* synthetic */ sw1 X;
    public final /* synthetic */ r51 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw1(sw1 sw1Var, r51 r51Var, Continuation continuation) {
        super(2, continuation);
        this.X = sw1Var;
        this.Y = r51Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qw1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qw1(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            jve jveVar = this.X.a;
            z91 z91Var = new z91(this.Y);
            this.o = 1;
            Object objA = jveVar.a(z91Var, this);
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
