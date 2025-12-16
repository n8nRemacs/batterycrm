package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi;

import ZK.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: IacFinishedMicRequestScreenEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction;", "LZK/b;", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements t<IacFinishedMicRequestScreenInternalAction, ZK.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final ZK.b b(IacFinishedMicRequestScreenInternalAction iacFinishedMicRequestScreenInternalAction) {
        IacFinishedMicRequestScreenInternalAction iacFinishedMicRequestScreenInternalAction2 = iacFinishedMicRequestScreenInternalAction;
        if (iacFinishedMicRequestScreenInternalAction2 instanceof IacFinishedMicRequestScreenInternalAction.SendEvent) {
            return ((IacFinishedMicRequestScreenInternalAction.SendEvent) iacFinishedMicRequestScreenInternalAction2).f166777b;
        }
        if (iacFinishedMicRequestScreenInternalAction2 instanceof IacFinishedMicRequestScreenInternalAction.RouteToAppSettings) {
            return b.f.f20108b;
        }
        if (iacFinishedMicRequestScreenInternalAction2 instanceof IacFinishedMicRequestScreenInternalAction.HandleDeeplink) {
            return new b.d(((IacFinishedMicRequestScreenInternalAction.HandleDeeplink) iacFinishedMicRequestScreenInternalAction2).f166773b);
        }
        return null;
    }
}
