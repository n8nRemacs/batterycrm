package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xc2 extends dtf implements sm6 {
    public final /* synthetic */ sd2 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc2(sd2 sd2Var, Continuation continuation) {
        super(2, continuation);
        this.X = sd2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xc2 xc2Var = (xc2) l((x82) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xc2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xc2 xc2Var = new xc2(this.X, continuation);
        xc2Var.o = obj;
        return xc2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        x82 x82Var = (x82) this.o;
        sd2 sd2Var = this.X;
        tcf tcfVar = sd2Var.c;
        v82 v82Var = (v82) tcfVar.getValue();
        v82 v82VarA = null;
        if (v82Var != null) {
            x82 x82Var2 = (x82) sd2Var.h.getValue();
            boolean z = false;
            boolean z2 = x82Var2 != null && x82Var2.b(x82Var);
            w82 w82Var = x82Var != null ? x82Var.b : null;
            int i = w82Var == null ? -1 : wc2.$EnumSwitchMapping$0[w82Var.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    String str = x82Var.c;
                    if (str != null && str.length() != 0 && !x82Var.f) {
                    }
                } else if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                z = true;
            }
            v82VarA = v82.a(v82Var, z2, z, sd2Var.A.get(), 1);
        }
        tcfVar.setValue(v82VarA);
        sd2Var.d.setValue(((o82) sd2Var.g.getValue()).a(sd2Var));
        return qqg.a;
    }
}
