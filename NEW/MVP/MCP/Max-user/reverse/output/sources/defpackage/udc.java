package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.twofa.restore.ProfileDeletionInfoScreen;

/* loaded from: classes2.dex */
public final class udc extends dtf implements sm6 {
    public final /* synthetic */ ProfileDeletionInfoScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public udc(Continuation continuation, ProfileDeletionInfoScreen profileDeletionInfoScreen) {
        super(2, continuation);
        this.X = profileDeletionInfoScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        udc udcVar = (udc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        udcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        udc udcVar = new udc(continuation, this.X);
        udcVar.o = obj;
        return udcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        nmg nmgVar = (nmg) this.o;
        ProfileDeletionInfoScreen profileDeletionInfoScreen = this.X;
        bbd bbdVar = profileDeletionInfoScreen.o;
        yy7[] yy7VarArr = ProfileDeletionInfoScreen.X;
        if (nmgVar instanceof lmg) {
            ccb ccbVar = new ccb(profileDeletionInfoScreen);
            lmg lmgVar = (lmg) nmgVar;
            ccbVar.e(new qcb(lmgVar.b));
            ccbVar.g(lmgVar.a);
            ccbVar.i();
            ((OneMeButton) bbdVar.D(profileDeletionInfoScreen, ProfileDeletionInfoScreen.X[1])).setProgressEnabled(false);
        } else if (nmgVar instanceof mmg) {
            ((OneMeButton) bbdVar.D(profileDeletionInfoScreen, ProfileDeletionInfoScreen.X[1])).setProgressEnabled(((mmg) nmgVar).a);
        }
        return qqg.a;
    }
}
