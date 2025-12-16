package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* loaded from: classes.dex */
public final class nl8 extends dtf implements sm6 {
    public final /* synthetic */ MainActivity o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl8(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.o = mainActivity;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nl8 nl8Var = (nl8) l((ph8) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nl8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nl8(this.o, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b8  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl8.n(java.lang.Object):java.lang.Object");
    }
}
