package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cd9 extends dtf implements sm6 {
    public final /* synthetic */ ed9 X;
    public final /* synthetic */ t24 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd9(ed9 ed9Var, t24 t24Var, Continuation continuation) {
        super(2, continuation);
        this.X = ed9Var;
        this.Y = t24Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cd9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cd9(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            jve jveVar = this.X.a;
            xc9 xc9Var = new xc9(ue3.d0(this.Y.b));
            this.o = 1;
            Object objA = jveVar.a(xc9Var, this);
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
