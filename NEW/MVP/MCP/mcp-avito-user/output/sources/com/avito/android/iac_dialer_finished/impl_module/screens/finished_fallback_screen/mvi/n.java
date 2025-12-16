package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: IacFinishedFallbackScreenReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenInternalAction;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenState;", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements u<IacFinishedFallbackScreenInternalAction, IacFinishedFallbackScreenState> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final IacFinishedFallbackScreenState a(IacFinishedFallbackScreenInternalAction iacFinishedFallbackScreenInternalAction, IacFinishedFallbackScreenState iacFinishedFallbackScreenState) {
        IacFinishedFallbackScreenInternalAction iacFinishedFallbackScreenInternalAction2 = iacFinishedFallbackScreenInternalAction;
        IacFinishedFallbackScreenState iacFinishedFallbackScreenState2 = iacFinishedFallbackScreenState;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacFinishedFallbackScreenReducer", "reduce: " + iacFinishedFallbackScreenInternalAction2, null);
        if (iacFinishedFallbackScreenInternalAction2 instanceof IacFinishedFallbackScreenInternalAction.HandleClosingActionInterceptorLink) {
            return IacFinishedFallbackScreenState.copy$default(iacFinishedFallbackScreenState2, null, true, 1, null);
        }
        if (iacFinishedFallbackScreenInternalAction2 instanceof IacFinishedFallbackScreenInternalAction.CloseScreen ? true : iacFinishedFallbackScreenInternalAction2 instanceof IacFinishedFallbackScreenInternalAction.HandleDeeplink ? true : iacFinishedFallbackScreenInternalAction2 instanceof IacFinishedFallbackScreenInternalAction.HandleGsmLink ? true : iacFinishedFallbackScreenInternalAction2 instanceof IacFinishedFallbackScreenInternalAction.OnNeedToEmitClosingAction ? true : iacFinishedFallbackScreenInternalAction2 instanceof IacFinishedFallbackScreenInternalAction.OnBootstrap) {
            return iacFinishedFallbackScreenState2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
