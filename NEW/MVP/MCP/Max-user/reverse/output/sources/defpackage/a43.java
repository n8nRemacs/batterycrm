package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class a43 extends dtf implements sm6 {
    public final /* synthetic */ b43 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a43(b43 b43Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = b43Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((a43) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new a43(this.X, this.Y, continuation);
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
        Object objF = si2.f(ve2VarI, this.Y, ve2VarI.o.a.j(), this);
        g84 g84Var = g84.a;
        if (objF != g84Var) {
            objF = qqgVar;
        }
        return objF == g84Var ? g84Var : qqgVar;
    }
}
