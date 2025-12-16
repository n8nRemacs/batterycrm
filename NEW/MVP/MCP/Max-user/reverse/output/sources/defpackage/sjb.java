package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sjb extends dtf implements sm6 {
    public final /* synthetic */ tjb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjb(tjb tjbVar, Continuation continuation) {
        super(2, continuation);
        this.o = tjbVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        sjb sjbVar = (sjb) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sjbVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new sjb(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = tjb.Z;
        tjb tjbVar = this.o;
        k18 k18Var = tjbVar.c;
        boolean z = !((sxg) k18Var.getValue()).g.getBoolean("app.notification.show.new.users", true);
        ((sxg) k18Var.getValue()).f("app.notification.show.new.users", z);
        hwa hwaVar = (hwa) tjbVar.b.getValue();
        oxg oxgVar = new oxg();
        oxgVar.a = Boolean.valueOf(z);
        hwaVar.o(new qxg(oxgVar));
        tjbVar.o.setValue(tjbVar.t());
        return qqg.a;
    }
}
