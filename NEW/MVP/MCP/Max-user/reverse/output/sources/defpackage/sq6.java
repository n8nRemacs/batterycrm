package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sq6 extends dtf implements sm6 {
    public final /* synthetic */ tq6 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq6(tq6 tq6Var, Continuation continuation) {
        super(2, continuation);
        this.o = tq6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        sq6 sq6Var = (sq6) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sq6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new sq6(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        wqi.c("tq6", "updateUiItemsBySelections()", new Object[0]);
        tq6 tq6Var = this.o;
        Iterable<op6> iterable = (Iterable) tq6Var.v0.getValue();
        ArrayList arrayList = new ArrayList(we3.q(iterable, 10));
        for (op6 op6Var : iterable) {
            int iW = tq6Var.w(op6Var.c);
            arrayList.add(op6.b(op6Var, null, null, null, iW, !((Boolean) tq6Var.u0.getValue()).booleanValue() || iW > 0, 0, null, 1855));
        }
        tq6Var.v0.m(null, arrayList);
        return qqg.a;
    }
}
