package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y43 extends dtf implements sm6 {
    public final /* synthetic */ k53 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y43(k53 k53Var, Continuation continuation) {
        super(2, continuation);
        this.X = k53Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        y43 y43Var = (y43) l((v03) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        y43Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        y43 y43Var = new y43(this.X, continuation);
        y43Var.o = obj;
        return y43Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y43.n(java.lang.Object):java.lang.Object");
    }
}
