package com.avito.android.forceupdate.screens.forceupdaterequired.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredInternalAction;
import com.avito.android.forceupdate.screens.forceupdaterequired.mvi.entity.ForceUpdateRequiredState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ForceUpdateRequiredReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredInternalAction;", "Lcom/avito/android/forceupdate/screens/forceupdaterequired/mvi/entity/ForceUpdateRequiredState;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements u<ForceUpdateRequiredInternalAction, ForceUpdateRequiredState> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final ForceUpdateRequiredState a(ForceUpdateRequiredInternalAction forceUpdateRequiredInternalAction, ForceUpdateRequiredState forceUpdateRequiredState) {
        ForceUpdateRequiredInternalAction forceUpdateRequiredInternalAction2 = forceUpdateRequiredInternalAction;
        return forceUpdateRequiredInternalAction2 instanceof ForceUpdateRequiredInternalAction.SetUpdateSourceType ? new ForceUpdateRequiredState(((ForceUpdateRequiredInternalAction.SetUpdateSourceType) forceUpdateRequiredInternalAction2).f158508b) : forceUpdateRequiredState;
    }
}
