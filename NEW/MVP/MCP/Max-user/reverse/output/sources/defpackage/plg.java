package defpackage;

import android.widget.ScrollView;
import kotlin.coroutines.Continuation;
import one.me.settings.twofa.creation.TwoFACreationScreen;

/* loaded from: classes2.dex */
public final class plg extends dtf implements sm6 {
    public final /* synthetic */ TwoFACreationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plg(Continuation continuation, TwoFACreationScreen twoFACreationScreen) {
        super(2, continuation);
        this.X = twoFACreationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        plg plgVar = (plg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        plgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        plg plgVar = new plg(continuation, this.X);
        plgVar.o = obj;
        return plgVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (((Boolean) this.o).booleanValue()) {
            TwoFACreationScreen twoFACreationScreen = this.X;
            ((ScrollView) twoFACreationScreen.s0.D(twoFACreationScreen, TwoFACreationScreen.w0[1])).post(new bee(28, twoFACreationScreen));
        }
        return qqg.a;
    }
}
