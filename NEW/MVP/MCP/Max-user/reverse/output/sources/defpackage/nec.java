package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nec extends dtf implements sm6 {
    public final /* synthetic */ rec o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nec(rec recVar, Continuation continuation) {
        super(2, continuation);
        this.o = recVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nec necVar = (nec) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        necVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nec(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        rec recVar = this.o;
        long j = recVar.c;
        yy7[] yy7VarArr = rec.E0;
        pb2 pb2VarV = recVar.v();
        boolean z = false;
        if (pb2VarV != null && pb2VarV.d0(j)) {
            z = true;
        }
        if (((w4e) ((pb3) recVar.v0.getValue())).s() != j && !z) {
            xfh.r(recVar.A0, new bec(new n5g(u8b.X0), new Integer(ivd.p1)));
        }
        return qqg.a;
    }
}
