package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ld1 extends dtf implements sm6 {
    public final /* synthetic */ md1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld1(md1 md1Var, Continuation continuation) {
        super(2, continuation);
        this.o = md1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ld1 ld1Var = (ld1) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ld1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ld1(this.o, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld1.n(java.lang.Object):java.lang.Object");
    }
}
