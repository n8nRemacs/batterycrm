package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ew4 extends dtf implements sm6 {
    public final /* synthetic */ fw4 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew4(fw4 fw4Var, Continuation continuation) {
        super(2, continuation);
        this.o = fw4Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ew4 ew4Var = (ew4) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ew4Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ew4(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = fw4.Z;
        fw4 fw4Var = this.o;
        k18 k18Var = fw4Var.c;
        int i = ((sxg) k18Var.getValue()).m() == 1 ? 0 : 1;
        String str = i != 1 ? i != 2 ? "ON" : "REPLY" : "OFF";
        sxg sxgVar = (sxg) k18Var.getValue();
        sxgVar.g(i, "app.notification.dialogs.show");
        sxgVar.j.f(Integer.valueOf(i));
        hwa hwaVar = (hwa) fw4Var.b.getValue();
        oxg oxgVar = new oxg();
        oxgVar.c = str;
        hwaVar.o(new qxg(oxgVar));
        fw4Var.o.setValue(fw4Var.t());
        return qqg.a;
    }
}
