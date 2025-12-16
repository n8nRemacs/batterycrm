package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tc9 extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc9(long j, Continuation continuation) {
        super(2, continuation);
        this.X = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tc9) l((ku3) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tc9 tc9Var = new tc9(this.X, continuation);
        tc9Var.o = obj;
        return tc9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ku3 ku3Var = (ku3) this.o;
        long jP = ku3Var.p();
        String strE = ku3Var.e();
        String str = strE == null ? "" : strE;
        String strR = ku3Var.r(il0.a);
        return new kyb(this.X, jP, ku3Var.o(), str, strR == null ? "" : strR);
    }
}
