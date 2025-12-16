package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fv7 extends dtf implements sm6 {
    public final /* synthetic */ iv7 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv7(iv7 iv7Var, Continuation continuation) {
        super(2, continuation);
        this.o = iv7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fv7 fv7Var = (fv7) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fv7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fv7(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        iv7 iv7Var = this.o;
        hwa hwaVar = (hwa) iv7Var.c.getValue();
        String str = iv7Var.b;
        hwaVar.getClass();
        iv7Var.d = (str == null || vmf.F(str)) ? 0L : hwa.q(hwaVar, new yq1(hwaVar.t().a.k(), str, 1));
        return qqg.a;
    }
}
