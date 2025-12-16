package defpackage;

import android.widget.ScrollView;
import kotlin.coroutines.Continuation;
import one.me.settings.twofa.creation.TwoFACreationScreen;

/* loaded from: classes2.dex */
public final class klg extends dtf implements sm6 {
    public final /* synthetic */ TwoFACreationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klg(Continuation continuation, TwoFACreationScreen twoFACreationScreen) {
        super(2, continuation);
        this.X = twoFACreationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        klg klgVar = (klg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        klgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        klg klgVar = new klg(continuation, this.X);
        klgVar.o = obj;
        return klgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        log logVar = (log) this.o;
        yy7[] yy7VarArr = TwoFACreationScreen.w0;
        TwoFACreationScreen twoFACreationScreen = this.X;
        twoFACreationScreen.A0().f(logVar);
        if (logVar.b()) {
            ((ScrollView) twoFACreationScreen.s0.D(twoFACreationScreen, TwoFACreationScreen.w0[1])).post(new bee(28, twoFACreationScreen));
        }
        return qqg.a;
    }
}
