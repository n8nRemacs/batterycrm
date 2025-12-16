package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qz2 extends dtf implements sm6 {
    public final /* synthetic */ sz2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz2(sz2 sz2Var, Continuation continuation) {
        super(2, continuation);
        this.o = sz2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qz2 qz2Var = (qz2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qz2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qz2(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        sz2 sz2Var = this.o;
        AtomicLong atomicLong = sz2Var.A0;
        hwa hwaVar = (hwa) sz2Var.o.getValue();
        atomicLong.set(hwa.q(hwaVar, new i58(hwaVar.t().a.k(), sz2Var.F0, sz2Var.G0)));
        return qqg.a;
    }
}
