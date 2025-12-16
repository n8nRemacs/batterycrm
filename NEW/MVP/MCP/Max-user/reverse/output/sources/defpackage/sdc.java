package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.settings.twofa.restore.ProfileDeletionInfoScreen;

/* loaded from: classes2.dex */
public final class sdc extends dtf implements sm6 {
    public final /* synthetic */ ProfileDeletionInfoScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sdc(Continuation continuation, ProfileDeletionInfoScreen profileDeletionInfoScreen) {
        super(2, continuation);
        this.X = profileDeletionInfoScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        sdc sdcVar = (sdc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sdcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sdc sdcVar = new sdc(continuation, this.X);
        sdcVar.o = obj;
        return sdcVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        wdc wdcVar = (wdc) this.o;
        ProfileDeletionInfoScreen profileDeletionInfoScreen = this.X;
        ((TextView) profileDeletionInfoScreen.d.D(profileDeletionInfoScreen, ProfileDeletionInfoScreen.X[0])).setText(wdcVar.a.b(profileDeletionInfoScreen.getContext()));
        return qqg.a;
    }
}
