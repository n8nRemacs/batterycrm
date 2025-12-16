package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class x extends dtf implements sm6 {
    public final /* synthetic */ a0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.o = a0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        x xVar = (x) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new x(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        a0 a0Var = this.o;
        w63 w63Var = a0Var.c;
        l5c l5cVar = (l5c) a0Var.b;
        l5cVar.getClass();
        pb2 pb2VarN = w63Var.n(l5cVar.m(PmsKey.f148userdebugreport, 0L));
        qqg qqgVar = qqg.a;
        if (pb2VarN == null || !pb2VarN.F()) {
            a0Var.u();
            return qqgVar;
        }
        xfh.r(a0Var.X, new u(qqgVar));
        return qqgVar;
    }
}
