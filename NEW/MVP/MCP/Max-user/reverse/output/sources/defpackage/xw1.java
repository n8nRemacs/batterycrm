package defpackage;

import java.util.UUID;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xw1 extends dtf implements sm6 {
    public final /* synthetic */ zw1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw1(zw1 zw1Var, Continuation continuation) {
        super(2, continuation);
        this.o = zw1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xw1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xw1(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        String string = UUID.randomUUID().toString();
        hwa hwaVar = (hwa) this.o.c.getValue();
        return new Long(hwa.q(hwaVar, new yq1(hwaVar.t().a.k(), string, 0)));
    }
}
