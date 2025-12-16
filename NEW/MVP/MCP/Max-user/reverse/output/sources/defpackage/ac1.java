package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ac1 extends dtf implements sm6 {
    public final /* synthetic */ cc1 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac1(cc1 cc1Var, Continuation continuation) {
        super(2, continuation);
        this.X = cc1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ac1 ac1Var = (ac1) l((Long) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ac1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ac1 ac1Var = new ac1(this.X, continuation);
        ac1Var.o = obj;
        return ac1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        String strH;
        g8j.b(obj);
        Long l = (Long) this.o;
        cc1 cc1Var = this.X;
        tcf tcfVar = cc1Var.Y;
        do {
            value = tcfVar.getValue();
            if (l != null) {
                cc1Var.d.getClass();
                strH = wy1.h("· ", mr1.f(l));
            } else {
                strH = null;
            }
            if (strH == null) {
                strH = "";
            }
        } while (!tcfVar.c(value, strH));
        return qqg.a;
    }
}
