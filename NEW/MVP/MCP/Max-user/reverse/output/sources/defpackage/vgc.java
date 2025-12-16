package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vgc extends dtf implements sm6 {
    public final /* synthetic */ fhc X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgc(fhc fhcVar, Continuation continuation) {
        super(2, continuation);
        this.X = fhcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vgc vgcVar = (vgc) l((a95) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vgcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vgc vgcVar = new vgc(this.X, continuation);
        vgcVar.o = obj;
        return vgcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        a95 a95Var = (a95) this.o;
        fhc fhcVar = this.X;
        fhcVar.t0.setValue(a95Var.a);
        fhcVar.Z.setValue(a95Var.b);
        return qqg.a;
    }
}
