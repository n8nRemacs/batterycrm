package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving;

import Y61.k;
import Y61.l;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallMeta;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenArgument;
import kotlin.Metadata;

/* compiled from: BasePreconditionsCheckAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H&J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H&J\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/resolving/BasePreconditionsCheckAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "movePreconditionStepToMicPermissionRequesting", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "movePreconditionStepToWaitingForScreenToRequestPermissions", "requestMicPermission", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface BasePreconditionsCheckAction extends IacAction {

    /* compiled from: BasePreconditionsCheckAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @l
        public static IacState a(@k BasePreconditionsCheckAction basePreconditionsCheckAction, @k IacActionProcessing iacActionProcessing) {
            if (iacActionProcessing.getState().getAppearance().getMicPerm().b()) {
                return null;
            }
            if (iacActionProcessing.getState().getAppearance().getScreen().getIsAtLeastStarted()) {
                IacActionOutput out = iacActionProcessing.getOut();
                String callId = ((IacState.InUse.Alive) iacActionProcessing.getState()).getCallId();
                String scenario = ((IacState.InUse.Alive) iacActionProcessing.getState()).getCall().getMeta().getScenario();
                CallMeta.Item item = ((IacState.InUse.Alive) iacActionProcessing.getState()).getCall().getMeta().getItem();
                iacActionProcessing.plusAssign(out, new IacEvent.CallScreen.RequestMicPermission(callId, scenario, item != null ? Long.valueOf(item.getId()).toString() : null, ((IacState.InUse.Alive) iacActionProcessing.getState()).getCall().getDirection()));
                return basePreconditionsCheckAction.movePreconditionStepToMicPermissionRequesting(iacActionProcessing);
            }
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.ActivityLauncher.Launch(new IacCallScreenArgument.WithoutAction(new IacCallScreenArgument.WithoutAction.From.Other(basePreconditionsCheckAction.getName() + ".Mic"))));
            return basePreconditionsCheckAction.movePreconditionStepToWaitingForScreenToRequestPermissions(iacActionProcessing);
        }
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    /* synthetic */ String getName();

    @k
    IacState movePreconditionStepToMicPermissionRequesting(@k IacActionProcessing iacActionProcessing);

    @k
    IacState movePreconditionStepToWaitingForScreenToRequestPermissions(@k IacActionProcessing iacActionProcessing);

    @l
    IacState requestMicPermission(@k IacActionProcessing iacActionProcessing);
}
