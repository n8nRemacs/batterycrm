package com.avito.android.forceupdate.screens.forceupdaterequired.mvi;

import ME.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ForceUpdateRequiredOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "LME/b;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements t<ForceUpdateRequiredInternalAction, ME.b> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final ME.b b(ForceUpdateRequiredInternalAction forceUpdateRequiredInternalAction) {
        ForceUpdateRequiredInternalAction forceUpdateRequiredInternalAction2 = forceUpdateRequiredInternalAction;
        if (forceUpdateRequiredInternalAction2 instanceof ForceUpdateRequiredInternalAction.OpenMarket) {
            return new b.a(((ForceUpdateRequiredInternalAction.OpenMarket) forceUpdateRequiredInternalAction2).f158505b);
        }
        if (forceUpdateRequiredInternalAction2.equals(ForceUpdateRequiredInternalAction.OpenMavInWebView.f158506b)) {
            return b.C0666b.f10487a;
        }
        if (forceUpdateRequiredInternalAction2.equals(ForceUpdateRequiredInternalAction.DownloadStarted.f158504b)) {
            return b.d.f10489a;
        }
        if (forceUpdateRequiredInternalAction2.equals(ForceUpdateRequiredInternalAction.RequestPermission.f158507b)) {
            return b.c.f10488a;
        }
        if (forceUpdateRequiredInternalAction2.equals(ForceUpdateRequiredInternalAction.TrackShownBlocking.f158512b)) {
            return b.h.f10493a;
        }
        if (forceUpdateRequiredInternalAction2.equals(ForceUpdateRequiredInternalAction.TrackClosedWithUpdate.f158511b)) {
            return b.g.f10492a;
        }
        if (forceUpdateRequiredInternalAction2.equals(ForceUpdateRequiredInternalAction.TrackClosedWithNoPermission.f158510b)) {
            return b.f.f10491a;
        }
        if (forceUpdateRequiredInternalAction2.equals(ForceUpdateRequiredInternalAction.TrackClosedWithGoingToMav.f158509b)) {
            return b.e.f10490a;
        }
        if (forceUpdateRequiredInternalAction2.equals(ForceUpdateRequiredInternalAction.TrackWebViewGoToMavManually.f158513b)) {
            return b.i.f10494a;
        }
        if (forceUpdateRequiredInternalAction2 instanceof ForceUpdateRequiredInternalAction.SetUpdateSourceType) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
