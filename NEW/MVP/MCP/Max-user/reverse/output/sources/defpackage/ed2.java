package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ed2 extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ sd2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed2(int i, sd2 sd2Var, Continuation continuation) {
        super(2, continuation);
        this.X = i;
        this.Y = sd2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ed2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ed2(this.X, this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0143 A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed2.n(java.lang.Object):java.lang.Object");
    }
}
