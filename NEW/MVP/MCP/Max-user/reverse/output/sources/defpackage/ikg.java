package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.twofa.password.TwoFACheckPassScreen;

/* loaded from: classes2.dex */
public final class ikg extends dtf implements sm6 {
    public final /* synthetic */ TwoFACheckPassScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikg(Continuation continuation, TwoFACheckPassScreen twoFACheckPassScreen) {
        super(2, continuation);
        this.X = twoFACheckPassScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ikg ikgVar = (ikg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ikgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ikg ikgVar = new ikg(continuation, this.X);
        ikgVar.o = obj;
        return ikgVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = TwoFACheckPassScreen.t0;
        ((sp7) this.X.o.getValue()).a.D();
        return qqg.a;
    }
}
