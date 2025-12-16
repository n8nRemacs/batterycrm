package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class d03 extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d03(long j, Continuation continuation) {
        super(2, continuation);
        this.X = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((d03) l((pb2) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        d03 d03Var = new d03(this.X, continuation);
        d03Var.o = obj;
        return d03Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pb2 pb2Var = (pb2) this.o;
        long j = this.X;
        long jH = pb2Var.h();
        String strS = pb2Var.s();
        String strI = pb2Var.i(il0.a, hl0.a);
        if (strI == null) {
            strI = "";
        }
        String str = strI;
        pb2Var.q0();
        return new kyb(j, jH, pb2Var.w0, strS, str);
    }
}
