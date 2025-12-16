package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t83 extends dtf implements sm6 {
    public final /* synthetic */ a93 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t83(a93 a93Var, Continuation continuation) {
        super(2, continuation);
        this.X = a93Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        t83 t83Var = (t83) l((yeb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        t83Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        t83 t83Var = new t83(this.X, continuation);
        t83Var.o = obj;
        return t83Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yeb yebVar = (yeb) this.o;
        ((tcf) this.X.o).setValue(yebVar);
        String str = (String) this.X.Z;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "big_flow: onEach " + yebVar + ", isEmitted=true", null);
            }
        }
        return qqg.a;
    }
}
