package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mec extends dtf implements sm6 {
    public final /* synthetic */ rec o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mec(rec recVar, Continuation continuation) {
        super(2, continuation);
        this.o = recVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        mec mecVar = (mec) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mecVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mec(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = rec.E0;
        rec recVar = this.o;
        long jS = ((w4e) ((pb3) recVar.v0.getValue())).s();
        long j = recVar.c;
        qqg qqgVar = qqg.a;
        if (jS == j) {
            xfh.r(recVar.A0, new bec(new n5g(u8b.W0), null));
            return qqgVar;
        }
        ci5 ci5Var = recVar.z0;
        rfc.c.getClass();
        xc0.l(":profile?id=" + j + "&type=contact", ci5Var);
        return qqgVar;
    }
}
