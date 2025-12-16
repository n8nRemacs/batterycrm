package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d33 extends dtf implements sm6 {
    public final /* synthetic */ b43 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d33(b43 b43Var, Continuation continuation) {
        super(2, continuation);
        this.X = b43Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((d33) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new d33(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        yy7[] yy7VarArr = b43.W0;
        w63 w63VarV = this.X.v();
        this.o = 1;
        ve2 ve2VarI = w63VarV.i();
        ve2VarI.getClass();
        Object objA = si2.a(ve2VarI, this);
        g84 g84Var = g84.a;
        if (objA != g84Var) {
            objA = qqgVar;
        }
        return objA == g84Var ? g84Var : qqgVar;
    }
}
