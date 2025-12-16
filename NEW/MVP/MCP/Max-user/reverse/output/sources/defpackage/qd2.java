package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qd2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sd2 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd2(sd2 sd2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = sd2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qd2) l((String) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qd2 qd2Var = new qd2(this.Y, continuation);
        qd2Var.X = obj;
        return qd2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd2.n(java.lang.Object):java.lang.Object");
    }
}
