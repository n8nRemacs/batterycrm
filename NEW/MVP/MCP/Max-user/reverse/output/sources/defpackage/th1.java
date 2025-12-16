package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class th1 extends dtf implements sm6 {
    public final /* synthetic */ ci1 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th1(ci1 ci1Var, Continuation continuation) {
        super(2, continuation);
        this.X = ci1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        th1 th1Var = (th1) l((n41) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        th1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        th1 th1Var = new th1(this.X, continuation);
        th1Var.o = obj;
        return th1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        mi1 mi1Var;
        CharSequence charSequence;
        g8j.b(obj);
        n41 n41Var = (n41) this.o;
        tcf tcfVar = this.X.y0;
        do {
            value = tcfVar.getValue();
            mi1Var = (mi1) value;
            charSequence = n41Var.c;
            if (charSequence == null) {
                charSequence = "";
            }
        } while (!tcfVar.c(value, mi1.a(mi1Var, null, null, null, false, charSequence, false, 47)));
        return qqg.a;
    }
}
