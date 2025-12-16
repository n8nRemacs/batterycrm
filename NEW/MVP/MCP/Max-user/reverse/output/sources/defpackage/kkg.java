package defpackage;

import android.widget.ScrollView;
import kotlin.coroutines.Continuation;
import one.me.settings.twofa.password.TwoFACheckPassScreen;

/* loaded from: classes2.dex */
public final class kkg extends dtf implements sm6 {
    public final /* synthetic */ TwoFACheckPassScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkg(Continuation continuation, TwoFACheckPassScreen twoFACheckPassScreen) {
        super(2, continuation);
        this.X = twoFACheckPassScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kkg kkgVar = (kkg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kkgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kkg kkgVar = new kkg(continuation, this.X);
        kkgVar.o = obj;
        return kkgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (((Boolean) this.o).booleanValue()) {
            TwoFACheckPassScreen twoFACheckPassScreen = this.X;
            ((ScrollView) twoFACheckPassScreen.Y.D(twoFACheckPassScreen, TwoFACheckPassScreen.t0[1])).post(new bee(27, twoFACheckPassScreen));
        }
        return qqg.a;
    }
}
