package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lsg extends dtf implements sm6 {
    public final /* synthetic */ psg X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ List Z;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsg(psg psgVar, long j, List list, Continuation continuation) {
        super(2, continuation);
        this.X = psgVar;
        this.Y = j;
        this.Z = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lsg lsgVar = (lsg) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lsgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lsg lsgVar = new lsg(this.X, this.Y, this.Z, continuation);
        lsgVar.o = obj;
        return lsgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        long[] jArrE0 = ue3.e0(this.Z);
        psg psgVar = this.X;
        psgVar.getClass();
        svi.e(f84Var, null, null, new hsg(psgVar, this.Y, jArrE0, null), 3);
        return qqg.a;
    }
}
