package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.SettingsListScreen;

/* loaded from: classes2.dex */
public final class fpe extends dtf implements sm6 {
    public final /* synthetic */ SettingsListScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpe(Continuation continuation, SettingsListScreen settingsListScreen) {
        super(2, continuation);
        this.X = settingsListScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fpe fpeVar = (fpe) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fpeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fpe fpeVar = new fpe(continuation, this.X);
        fpeVar.o = obj;
        return fpeVar;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xh5 xh5Var = (xh5) this.o;
        ape apeVar = xh5Var instanceof ape ? (ape) xh5Var : null;
        boolean z = apeVar instanceof xoe;
        SettingsListScreen settingsListScreen = this.X;
        if (z) {
            xoe xoeVar = (xoe) apeVar;
            xb3.a(settingsListScreen.getContext(), xoeVar.a);
            CharSequence charSequenceB = xoeVar.b.b(settingsListScreen.getContext());
            if (charSequenceB != null && xb3.b()) {
                ccb ccbVar = (ccb) settingsListScreen.t0.getValue();
                ccbVar.e(new qcb(yud.s));
                ccbVar.h(charSequenceB);
                ccbVar.i();
            }
        } else if (apeVar instanceof zoe) {
            ((mx3) settingsListScreen.X.getValue()).a(settingsListScreen.getContext(), ((zoe) apeVar).a);
        } else if (fni.a(apeVar, yoe.a)) {
            settingsListScreen.z0().x0(0);
            in inVar = settingsListScreen.x0;
            if (inVar != null) {
                inVar.f(true, true, true);
            }
        }
        return qqg.a;
    }
}
