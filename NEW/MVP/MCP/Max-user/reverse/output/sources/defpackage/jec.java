package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jec extends dtf implements sm6 {
    public final /* synthetic */ rec X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jec(rec recVar, Continuation continuation) {
        super(2, continuation);
        this.X = recVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jec jecVar = (jec) l((imb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jecVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jec jecVar = new jec(this.X, continuation);
        jecVar.o = obj;
        return jecVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        imb imbVar = (imb) this.o;
        pb2 pb2Var = (pb2) imbVar.a;
        ku3 ku3Var = (ku3) imbVar.b;
        rec recVar = this.X;
        if (!recVar.y0) {
            recVar.w0.m(null, rec.t(recVar, pb2Var, ku3Var, false));
        }
        return qqg.a;
    }
}
