package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class z85 extends dtf implements sm6 {
    public final /* synthetic */ b95 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z85(b95 b95Var, Continuation continuation) {
        super(2, continuation);
        this.X = b95Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        z85 z85Var = (z85) l((e95) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        z85Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        z85 z85Var = new z85(this.X, continuation);
        z85Var.o = obj;
        return z85Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        xec xecVar;
        Object value2;
        g8j.b(obj);
        e95 e95Var = (e95) this.o;
        b95 b95Var = this.X;
        tcf tcfVar = b95Var.b;
        e95 e95Var2 = (e95) b95Var.i.getValue();
        boolean z = false;
        boolean z2 = e95Var2 != null && e95Var2.a(e95Var);
        e95 e95Var3 = b95Var.k;
        if (e95Var3 != null && e95Var3.b(e95Var)) {
            z = true;
        }
        b95Var.k = e95Var;
        do {
            value = tcfVar.getValue();
            xecVar = (xec) tcfVar.getValue();
        } while (!tcfVar.c(value, xecVar != null ? xec.a(xecVar, null, z2, 111) : null));
        if (z) {
            tcf tcfVar2 = b95Var.c;
            do {
                value2 = tcfVar2.getValue();
            } while (!tcfVar2.c(value2, b95Var.f().a(b95Var)));
        }
        return qqg.a;
    }
}
