package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.twofa.creation.onboarding.TwoFAOnboardingScreen;

/* loaded from: classes2.dex */
public final class xmg extends dtf implements sm6 {
    public final /* synthetic */ TwoFAOnboardingScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xmg(Continuation continuation, TwoFAOnboardingScreen twoFAOnboardingScreen) {
        super(2, continuation);
        this.X = twoFAOnboardingScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xmg xmgVar = (xmg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xmgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xmg xmgVar = new xmg(continuation, this.X);
        xmgVar.o = obj;
        return xmgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof ei4) {
            omg.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
