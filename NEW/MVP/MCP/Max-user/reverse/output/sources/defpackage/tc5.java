package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tc5 extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ uc5 Y;
    public final /* synthetic */ em6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc5(em6 em6Var, int i, uc5 uc5Var, Continuation continuation) {
        super(2, continuation);
        this.o = em6Var;
        this.X = i;
        this.Y = uc5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tc5 tc5Var = (tc5) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tc5Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tc5(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int i = this.X;
        em6 em6Var = this.o;
        if (em6Var != null) {
            em6Var.invoke(new Integer(i));
        }
        uc5 uc5Var = this.Y;
        List<e62> list = ((rc5) uc5Var.t0.a.getValue()).a;
        ArrayList arrayList = new ArrayList(we3.q(list, 10));
        for (e62 e62VarL : list) {
            if (e62VarL.a == i) {
                e62VarL = e62.l(e62VarL, true);
            } else if (e62VarL.c) {
                e62VarL = e62.l(e62VarL, false);
            }
            arrayList.add(e62VarL);
        }
        tcf tcfVar = uc5Var.s0;
        tcfVar.m(null, new rc5(arrayList, ((rc5) tcfVar.getValue()).b));
        return qqg.a;
    }
}
