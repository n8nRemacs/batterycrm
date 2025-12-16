package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dnc extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ pnc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnc(pnc pncVar, long j, Continuation continuation) {
        super(2, continuation);
        this.o = pncVar;
        this.X = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dnc dncVar = (dnc) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dncVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new dnc(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = pnc.X0;
        pnc pncVar = this.o;
        pncVar.v().i().Z(this.X);
        xfh.r(pncVar.F0, xkc.b);
        return qqg.a;
    }
}
