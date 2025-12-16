package defpackage;

import android.widget.ScrollView;
import kotlin.coroutines.Continuation;
import one.me.settings.twofa.password.TwoFACheckPassScreen;

/* loaded from: classes2.dex */
public final class gkg extends dtf implements sm6 {
    public final /* synthetic */ TwoFACheckPassScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkg(Continuation continuation, TwoFACheckPassScreen twoFACheckPassScreen) {
        super(2, continuation);
        this.X = twoFACheckPassScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gkg gkgVar = (gkg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gkgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gkg gkgVar = new gkg(continuation, this.X);
        gkgVar.o = obj;
        return gkgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        log logVar = (log) this.o;
        TwoFACheckPassScreen twoFACheckPassScreen = this.X;
        bbd bbdVar = twoFACheckPassScreen.X;
        yy7[] yy7VarArr = TwoFACheckPassScreen.t0;
        ((pog) bbdVar.D(twoFACheckPassScreen, yy7VarArr[0])).f(logVar);
        if (logVar.b()) {
            ((ScrollView) twoFACheckPassScreen.Y.D(twoFACheckPassScreen, yy7VarArr[1])).post(new bee(27, twoFACheckPassScreen));
        }
        return qqg.a;
    }
}
