package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wgc extends dtf implements sm6 {
    public final /* synthetic */ fhc X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgc(fhc fhcVar, Continuation continuation) {
        super(2, continuation);
        this.X = fhcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wgc wgcVar = (wgc) l((cda) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wgcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wgc wgcVar = new wgc(this.X, continuation);
        wgcVar.o = obj;
        return wgcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xfh.r(this.X.v0, (cda) this.o);
        return qqg.a;
    }
}
