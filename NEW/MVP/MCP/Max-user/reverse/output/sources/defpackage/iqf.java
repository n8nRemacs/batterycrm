package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class iqf extends dtf implements sm6 {
    public final /* synthetic */ mqf X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqf(mqf mqfVar, Continuation continuation) {
        super(2, continuation);
        this.X = mqfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        iqf iqfVar = (iqf) l((String) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        iqfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        iqf iqfVar = new iqf(this.X, continuation);
        iqfVar.o = obj;
        return iqfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        Object value2;
        Object value3;
        g8j.b(obj);
        String str = (String) this.o;
        mqf mqfVar = this.X;
        int iIntValue = ((Number) mqfVar.G0.getValue()).intValue();
        tcf tcfVar = mqfVar.H0;
        if (str == null || vmf.F(str)) {
            qt7 qt7Var = (qt7) mqfVar.L0.D(mqfVar, mqf.S0[0]);
            if (qt7Var != null) {
                qt7Var.cancel(null);
            }
            tcf tcfVar2 = mqfVar.B0;
            do {
                value = tcfVar2.getValue();
            } while (!tcfVar2.c(value, null));
            do {
                value2 = tcfVar.getValue();
            } while (!tcfVar.c(value2, null));
        } else {
            fqf fqfVar = (fqf) tcfVar.getValue();
            if (fqfVar != null && !vmf.s(str, fqfVar.l(), false)) {
                do {
                    value3 = tcfVar.getValue();
                } while (!tcfVar.c(value3, null));
            }
            mqfVar.u(iIntValue, str.toString());
        }
        return qqg.a;
    }
}
