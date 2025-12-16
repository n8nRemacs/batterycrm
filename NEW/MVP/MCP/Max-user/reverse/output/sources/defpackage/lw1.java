package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class lw1 extends dtf implements sm6 {
    public final /* synthetic */ nw1 X;
    public final /* synthetic */ l58 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw1(nw1 nw1Var, l58 l58Var, Continuation continuation) {
        super(2, continuation);
        this.X = nw1Var;
        this.Y = l58Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lw1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new lw1(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            jve jveVar = this.X.b;
            n71 n71Var = new n71(this.Y);
            this.o = 1;
            Object objA = jveVar.a(n71Var, this);
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
