package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rr extends dtf implements sm6 {
    public final /* synthetic */ xr o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(xr xrVar, Continuation continuation) {
        super(2, continuation);
        this.o = xrVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rr) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rr(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        af2 af2Var = new af2();
        af2Var.e = Collections.singletonMap(new Long(1L), new Long(1L));
        rf2 rf2Var = new rf2(af2Var);
        xr xrVar = this.o;
        pb2 pb2VarA = ((vg2) xrVar.Y.getValue()).a(0L, 2L, rf2Var, null, null, null);
        pb2VarA.t0((qv3) xrVar.s0.getValue());
        return pb2VarA;
    }
}
