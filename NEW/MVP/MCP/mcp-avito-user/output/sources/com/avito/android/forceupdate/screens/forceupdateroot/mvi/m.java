package com.avito.android.forceupdate.screens.forceupdateroot.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ForceUpdateRootReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "LOE/c;", "<init>", "()V", "_avito_force-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements u<ForceUpdateRootInternalAction, OE.c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final OE.c a(ForceUpdateRootInternalAction forceUpdateRootInternalAction, OE.c cVar) {
        ForceUpdateRootInternalAction forceUpdateRootInternalAction2 = forceUpdateRootInternalAction;
        return forceUpdateRootInternalAction2 instanceof ForceUpdateRootInternalAction.SetUpdateSourceType ? new OE.c(((ForceUpdateRootInternalAction.SetUpdateSourceType) forceUpdateRootInternalAction2).f158593b) : cVar;
    }
}
