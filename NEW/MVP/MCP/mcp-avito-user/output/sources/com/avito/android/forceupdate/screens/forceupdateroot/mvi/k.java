package com.avito.android.forceupdate.screens.forceupdateroot.mvi;

import OE.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ForceUpdateRootOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "LOE/b;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k implements t<ForceUpdateRootInternalAction, OE.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final OE.b b(ForceUpdateRootInternalAction forceUpdateRootInternalAction) {
        OE.b cVar;
        ForceUpdateRootInternalAction forceUpdateRootInternalAction2 = forceUpdateRootInternalAction;
        if (forceUpdateRootInternalAction2 instanceof ForceUpdateRootInternalAction.ShowProposalDialog) {
            return b.h.f12089a;
        }
        if (forceUpdateRootInternalAction2 instanceof ForceUpdateRootInternalAction.OpenUpdateRequiredScreen) {
            cVar = new b.e(((ForceUpdateRootInternalAction.OpenUpdateRequiredScreen) forceUpdateRootInternalAction2).f158591b);
        } else {
            if (!(forceUpdateRootInternalAction2 instanceof ForceUpdateRootInternalAction.OpenMarket)) {
                if (forceUpdateRootInternalAction2 instanceof ForceUpdateRootInternalAction.DownloadStarted) {
                    return b.g.f12088a;
                }
                if (forceUpdateRootInternalAction2 instanceof ForceUpdateRootInternalAction.RequestPermission) {
                    return b.f.f12087a;
                }
                if (forceUpdateRootInternalAction2.equals(ForceUpdateRootInternalAction.DismissDialog.f158586b)) {
                    return b.a.f12082a;
                }
                if (forceUpdateRootInternalAction2.equals(ForceUpdateRootInternalAction.Finish.f158588b)) {
                    return b.C0780b.f12083a;
                }
                if (forceUpdateRootInternalAction2.equals(ForceUpdateRootInternalAction.OpenMavInWebView.f158590b)) {
                    return b.d.f12085a;
                }
                if (forceUpdateRootInternalAction2.equals(ForceUpdateRootInternalAction.TrackShownDialog.f158598b)) {
                    return b.l.f12093a;
                }
                if (forceUpdateRootInternalAction2.equals(ForceUpdateRootInternalAction.TrackClosedWithUpdate.f158597b)) {
                    return b.k.f12092a;
                }
                if (forceUpdateRootInternalAction2.equals(ForceUpdateRootInternalAction.TrackClosedWithRefuse.f158596b)) {
                    return b.j.f12091a;
                }
                if (forceUpdateRootInternalAction2.equals(ForceUpdateRootInternalAction.TrackClosedWithNoPermission.f158595b)) {
                    return b.i.f12090a;
                }
                if (forceUpdateRootInternalAction2.equals(ForceUpdateRootInternalAction.TrackWebViewGoToMavWithForceRedirect.f158599b)) {
                    return b.m.f12094a;
                }
                if (forceUpdateRootInternalAction2 instanceof ForceUpdateRootInternalAction.SetUpdateSourceType) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            cVar = new b.c(((ForceUpdateRootInternalAction.OpenMarket) forceUpdateRootInternalAction2).f158589b);
        }
        return cVar;
    }
}
