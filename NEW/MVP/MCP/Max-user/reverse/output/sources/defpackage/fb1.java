package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* loaded from: classes.dex */
public final class fb1 extends dtf implements sm6 {
    public final /* synthetic */ CallIncomingScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb1(Continuation continuation, CallIncomingScreen callIncomingScreen) {
        super(2, continuation);
        this.X = callIncomingScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fb1 fb1Var = (fb1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fb1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fb1 fb1Var = new fb1(continuation, this.X);
        fb1Var.o = obj;
        return fb1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb1.n(java.lang.Object):java.lang.Object");
    }
}
