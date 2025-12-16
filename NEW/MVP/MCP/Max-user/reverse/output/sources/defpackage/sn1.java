package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sn1 extends dtf implements sm6 {
    public /* synthetic */ Object o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        sn1 sn1Var = (sn1) l((Collection) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sn1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sn1 sn1Var = new sn1(2, continuation);
        sn1Var.o = obj;
        return sn1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ((e9a) ((oy4) e51.a.getAccessor().c(21)).d.getValue()).h((Collection) this.o);
        return qqg.a;
    }
}
