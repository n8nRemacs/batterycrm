package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ymc extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ pnc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymc(pnc pncVar, long j, Continuation continuation) {
        super(2, continuation);
        this.o = pncVar;
        this.X = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ymc ymcVar = (ymc) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ymcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ymc(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pnc pncVar = this.o;
        ald.a((ald) pncVar.X.getValue(), this.X);
        xfh.r(pncVar.F0, xkc.b);
        return qqg.a;
    }
}
