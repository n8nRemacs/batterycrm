package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class iff extends dtf implements sm6 {
    public final /* synthetic */ off o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iff(off offVar, Continuation continuation) {
        super(2, continuation);
        this.o = offVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        iff iffVar = (iff) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        iffVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new iff(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g8j.b(obj);
        pb2 pb2Var = (pb2) ((w63) this.o.Z.getValue()).j(this.o.b).a.getValue();
        if (pb2Var == null) {
            return qqgVar;
        }
        tcf tcfVar = this.o.x0;
        pb2Var.p0();
        tcfVar.setValue(pb2Var.t0);
        return qqgVar;
    }
}
