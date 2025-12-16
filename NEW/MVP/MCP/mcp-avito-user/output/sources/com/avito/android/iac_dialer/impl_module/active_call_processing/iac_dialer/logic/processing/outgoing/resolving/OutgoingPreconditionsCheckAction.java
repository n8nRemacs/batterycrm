package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.resolving;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallMeta;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.OutgoingPreconditions;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenArgument;
import com.avito.android.iac_dialer.impl_module.timer_interactor.IacTimerInteractor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: OutgoingPreconditionsCheckAction.kt */
@P
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0007J\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/resolving/OutgoingPreconditionsCheckAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/resolving/BasePreconditionsCheckAction;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "requestCameraPermission", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "waitingBeforeStartOutgoingCall", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/OutgoingPreconditions$Step;", "step", "movePreconditionStepTo", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/OutgoingPreconditions$Step;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "movePreconditionStepToWaitingForScreenToRequestPermissions", "movePreconditionStepToMicPermissionRequesting", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OutgoingPreconditionsCheckAction implements BasePreconditionsCheckAction {
    public static final int $stable = 0;

    @k
    public static final OutgoingPreconditionsCheckAction INSTANCE = new OutgoingPreconditionsCheckAction();

    private OutgoingPreconditionsCheckAction() {
    }

    private final IacState movePreconditionStepTo(IacActionProcessing iacActionProcessing, OutgoingPreconditions.Step step) {
        return IacState.InUse.Alive.Outgoing.Resolving.copy$default((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState(), OutgoingPreconditions.copy$default(((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getPreconditions(), step, 0, 2, null), null, null, null, 14, null);
    }

    private final IacState requestCameraPermission(IacActionProcessing iacActionProcessing) {
        if (!((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getCall().isVideo() || iacActionProcessing.getState().getAppearance().getCameraPerm().b()) {
            return null;
        }
        if (iacActionProcessing.getState().getAppearance().getScreen().getIsAtLeastStarted()) {
            IacActionOutput out = iacActionProcessing.getOut();
            String callId = ((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getCallId();
            String scenario = ((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getCall().getMeta().getScenario();
            CallMeta.Item item = ((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getCall().getMeta().getItem();
            iacActionProcessing.plusAssign(out, new IacEvent.CallScreen.RequestCameraPermission(false, callId, scenario, item != null ? Long.valueOf(item.getId()).toString() : null, ((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getCall().getDirection()));
            return movePreconditionStepTo(iacActionProcessing, OutgoingPreconditions.Step.CameraPermissionRequesting.INSTANCE);
        }
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.ActivityLauncher.Launch(new IacCallScreenArgument.WithoutAction(new IacCallScreenArgument.WithoutAction.From.Other(getName() + ".Camera"))));
        return movePreconditionStepToWaitingForScreenToRequestPermissions(iacActionProcessing);
    }

    private final IacState waitingBeforeStartOutgoingCall(IacActionProcessing iacActionProcessing) {
        Long startCallDelayMs = ((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getCall().getMeta().getStartCallDelayMs();
        long jLongValue = (startCallDelayMs != null ? startCallDelayMs.longValue() : 0L) - (iacActionProcessing.getCurrentTime() - ((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getParams().getTime().f166846c);
        if (jLongValue <= 0) {
            return null;
        }
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.TimerInteractor.StartTimer(new IacTimerInteractor.Timer.OutgoingCallStartPause(jLongValue, ((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).getCallId())));
        return movePreconditionStepTo(iacActionProcessing, OutgoingPreconditions.Step.WaitingBeforeStartCall.INSTANCE);
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof OutgoingPreconditionsCheckAction);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckAction, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return 1764749962;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckAction
    @k
    public IacState movePreconditionStepToMicPermissionRequesting(@k IacActionProcessing iacActionProcessing) {
        return movePreconditionStepTo(iacActionProcessing, OutgoingPreconditions.Step.MicPermissionRequesting.INSTANCE);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckAction
    @k
    public IacState movePreconditionStepToWaitingForScreenToRequestPermissions(@k IacActionProcessing iacActionProcessing) {
        return movePreconditionStepTo(iacActionProcessing, OutgoingPreconditions.Step.WaitingForScreenToRequestPermissions.INSTANCE);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        if (!(iacActionProcessing.getState() instanceof IacState.InUse.Alive.Outgoing.Resolving)) {
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
            return;
        }
        IacState iacStateRequestMicPermission = requestMicPermission(iacActionProcessing);
        if (iacStateRequestMicPermission == null && (iacStateRequestMicPermission = requestCameraPermission(iacActionProcessing)) == null && (iacStateRequestMicPermission = waitingBeforeStartOutgoingCall(iacActionProcessing)) == null) {
            iacStateRequestMicPermission = movePreconditionStepTo(iacActionProcessing, OutgoingPreconditions.Step.Resolved.INSTANCE);
        }
        IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) iacStateRequestMicPermission;
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving, OutgoingPreconditions.copy$default(resolving.getPreconditions(), null, iacActionProcessing.getState().getAppearance().getScreen().getId(), 1, null), null, null, null, 14, null));
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.resolving.BasePreconditionsCheckAction
    @l
    public IacState requestMicPermission(@k IacActionProcessing iacActionProcessing) {
        return BasePreconditionsCheckAction.a.a(this, iacActionProcessing);
    }

    @k
    public String toString() {
        return "OutgoingPreconditionsCheckAction";
    }
}
