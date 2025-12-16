package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x3c extends dtf implements sm6 {
    public final /* synthetic */ qs3 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3c(qs3 qs3Var, Continuation continuation) {
        super(2, continuation);
        this.X = qs3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        x3c x3cVar = (x3c) l((p0a) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        x3cVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        x3c x3cVar = new x3c(this.X, continuation);
        x3cVar.o = obj;
        return x3cVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        cbh cbhVar;
        qs3 qs3Var = this.X;
        f50 f50Var = (f50) qs3Var.b;
        tcf tcfVar = (tcf) qs3Var.X;
        j35 j35Var = (j35) qs3Var.c;
        g8j.b(obj);
        p0a p0aVar = (p0a) this.o;
        o0a o0aVar = p0aVar instanceof o0a ? (o0a) p0aVar : null;
        int i = o0aVar != null ? o0aVar.f : 0;
        int i2 = i == 0 ? -1 : w3c.$EnumSwitchMapping$0[az1.v(i)];
        if (i2 == -1) {
            tcfVar.setValue(p0aVar);
        } else if (i2 == 1) {
            v7h v7hVar = (v7h) j35Var.d;
            cbh cbhVar2 = v7hVar.f;
            if (((cbhVar2 != null && cbhVar2.d()) || ((cbhVar = v7hVar.f) != null && cbhVar.y0())) && ((o0a) p0aVar).d) {
                j35Var.b();
            }
            if (((o0a) p0aVar).g) {
                qs3Var.d = f50Var;
                tcfVar.setValue(p0aVar);
            }
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            b8a b8aVar = (b8a) f50Var.c;
            if ((b8aVar.H0 || b8aVar.G0) && ((o0a) p0aVar).d) {
                f50Var.b();
            }
            if (((o0a) p0aVar).g) {
                qs3Var.d = j35Var;
                tcfVar.setValue(p0aVar);
            }
        }
        return qqg.a;
    }
}
