package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.pip.PipScreen;

/* loaded from: classes.dex */
public final class y1c extends dtf implements sm6 {
    public final /* synthetic */ PipScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1c(PipScreen pipScreen, Continuation continuation) {
        super(2, continuation);
        this.X = pipScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        y1c y1cVar = (y1c) l((xib) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        y1cVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        y1c y1cVar = new y1c(this.X, continuation);
        y1cVar.o = obj;
        return y1cVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xib xibVar = (xib) this.o;
        yy7[] yy7VarArr = PipScreen.o;
        qj1 qj1Var = ((r1c) this.X.c.getValue()).c;
        if (qj1Var != null) {
            qj1Var.d(xibVar);
        }
        return qqg.a;
    }
}
