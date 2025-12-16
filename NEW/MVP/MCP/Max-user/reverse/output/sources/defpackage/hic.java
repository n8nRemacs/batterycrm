package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hic extends dtf implements sm6 {
    public final /* synthetic */ qic X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hic(qic qicVar, Continuation continuation) {
        super(2, continuation);
        this.X = qicVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hic hicVar = (hic) l((mhc) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hicVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hic hicVar = new hic(this.X, continuation);
        hicVar.o = obj;
        return hicVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        mhc mhcVar = (mhc) this.o;
        if (mhcVar instanceof khc) {
            Long l = ((khc) mhcVar).a;
            qic qicVar = this.X;
            if (l.longValue() == qicVar.z0.get()) {
                xfh.r(qicVar.F0, new whc(yud.A, new n5g(x8b.W0)));
            }
        }
        return qqg.a;
    }
}
