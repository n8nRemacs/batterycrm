package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReason;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.CallParams;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import mJ.AbstractC43973b;

/* compiled from: OnWaitBottomSheetGsmClickedAction.kt */
@P
@s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/OnWaitBottomSheetGsmClickedAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "LmJ/b;", "dialerScenario", "Lkotlin/G0;", "track4683", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;LmJ/b;)V", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnWaitBottomSheetGsmClickedAction implements IacAction {
    public static final int $stable = 0;

    @k
    public static final OnWaitBottomSheetGsmClickedAction INSTANCE = new OnWaitBottomSheetGsmClickedAction();

    private OnWaitBottomSheetGsmClickedAction() {
    }

    private final void track4683(IacActionProcessing iacActionProcessing, AbstractC43973b abstractC43973b) {
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.Analytics.TrackRedButtonClickedEvent4683(((IacState.InUse) iacActionProcessing.getState()).getCallId(), ((IacState.InUse) iacActionProcessing.getState()).getCall().getMeta().getScenario(), abstractC43973b));
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof OnWaitBottomSheetGsmClickedAction);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return -1411152763;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        IacState iacStateCopy$default;
        if (!(iacActionProcessing.getState() instanceof IacState.InUse.Alive.Outgoing.Waiting)) {
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
            return;
        }
        track4683(iacActionProcessing, AbstractC43973b.e.f414455b);
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.AvCalls.TerminateCall(((IacState.InUse.Alive.Outgoing.Waiting) iacActionProcessing.getState()).getCallId(), TerminateReason.Hangup.INSTANCE));
        IacActionOutput out = iacActionProcessing.getOut();
        IacState.InUse inUse = (IacState.InUse) iacActionProcessing.getState();
        if (inUse instanceof IacState.InUse.Alive.Outgoing.Launching) {
            IacState.InUse.Alive.Outgoing.Launching launching = (IacState.InUse.Alive.Outgoing.Launching) inUse;
            CallParams params = launching.getParams();
            Map<String, String> customParams = params.getCustomParams();
            IacFinalLinkInteractor.a.f165997a.getClass();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching, null, params.copy((251 & 1) != 0 ? params.time : null, (251 & 2) != 0 ? params.wasScreenStarted : false, (251 & 4) != 0 ? params.hideControlsInVideo : false, (251 & 8) != 0 ? params.hideVpnToast : false, (251 & 16) != 0 ? params.dtmfOpened : false, (251 & 32) != 0 ? params.customParams : P0.l(customParams, IacFinalLinkInteractor.a.f165998b), (251 & 64) != 0 ? params.analyticsExtraParams : null, (251 & 128) != 0 ? params.muteRingtone : false), null, 5, null);
        } else if (inUse instanceof IacState.InUse.Alive.Outgoing.Resolving) {
            IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) inUse;
            CallParams params2 = resolving.getParams();
            Map<String, String> customParams2 = params2.getCustomParams();
            IacFinalLinkInteractor.a.f165997a.getClass();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving, null, null, params2.copy((251 & 1) != 0 ? params2.time : null, (251 & 2) != 0 ? params2.wasScreenStarted : false, (251 & 4) != 0 ? params2.hideControlsInVideo : false, (251 & 8) != 0 ? params2.hideVpnToast : false, (251 & 16) != 0 ? params2.dtmfOpened : false, (251 & 32) != 0 ? params2.customParams : P0.l(customParams2, IacFinalLinkInteractor.a.f165998b), (251 & 64) != 0 ? params2.analyticsExtraParams : null, (251 & 128) != 0 ? params2.muteRingtone : false), null, 11, null);
        } else if (inUse instanceof IacState.InUse.Alive.Outgoing.Waiting) {
            IacState.InUse.Alive.Outgoing.Waiting waiting = (IacState.InUse.Alive.Outgoing.Waiting) inUse;
            CallParams params3 = waiting.getParams();
            Map<String, String> customParams3 = params3.getCustomParams();
            IacFinalLinkInteractor.a.f165997a.getClass();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting, null, params3.copy((251 & 1) != 0 ? params3.time : null, (251 & 2) != 0 ? params3.wasScreenStarted : false, (251 & 4) != 0 ? params3.hideControlsInVideo : false, (251 & 8) != 0 ? params3.hideVpnToast : false, (251 & 16) != 0 ? params3.dtmfOpened : false, (251 & 32) != 0 ? params3.customParams : P0.l(customParams3, IacFinalLinkInteractor.a.f165998b), (251 & 64) != 0 ? params3.analyticsExtraParams : null, (251 & 128) != 0 ? params3.muteRingtone : false), null, 5, null);
        } else if (inUse instanceof IacState.InUse.Alive.Incoming.Waiting) {
            IacState.InUse.Alive.Incoming.Waiting waiting2 = (IacState.InUse.Alive.Incoming.Waiting) inUse;
            CallParams params4 = waiting2.getParams();
            Map<String, String> customParams4 = params4.getCustomParams();
            IacFinalLinkInteractor.a.f165997a.getClass();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting2, null, params4.copy((251 & 1) != 0 ? params4.time : null, (251 & 2) != 0 ? params4.wasScreenStarted : false, (251 & 4) != 0 ? params4.hideControlsInVideo : false, (251 & 8) != 0 ? params4.hideVpnToast : false, (251 & 16) != 0 ? params4.dtmfOpened : false, (251 & 32) != 0 ? params4.customParams : P0.l(customParams4, IacFinalLinkInteractor.a.f165998b), (251 & 64) != 0 ? params4.analyticsExtraParams : null, (251 & 128) != 0 ? params4.muteRingtone : false), null, 5, null);
        } else if (inUse instanceof IacState.InUse.Alive.Incoming.Resolving) {
            IacState.InUse.Alive.Incoming.Resolving resolving2 = (IacState.InUse.Alive.Incoming.Resolving) inUse;
            CallParams params5 = resolving2.getParams();
            Map<String, String> customParams5 = params5.getCustomParams();
            IacFinalLinkInteractor.a.f165997a.getClass();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving2, null, null, params5.copy((251 & 1) != 0 ? params5.time : null, (251 & 2) != 0 ? params5.wasScreenStarted : false, (251 & 4) != 0 ? params5.hideControlsInVideo : false, (251 & 8) != 0 ? params5.hideVpnToast : false, (251 & 16) != 0 ? params5.dtmfOpened : false, (251 & 32) != 0 ? params5.customParams : P0.l(customParams5, IacFinalLinkInteractor.a.f165998b), (251 & 64) != 0 ? params5.analyticsExtraParams : null, (251 & 128) != 0 ? params5.muteRingtone : false), null, 11, null);
        } else if (inUse instanceof IacState.InUse.Alive.Incoming.Accepting) {
            IacState.InUse.Alive.Incoming.Accepting accepting = (IacState.InUse.Alive.Incoming.Accepting) inUse;
            CallParams params6 = accepting.getParams();
            Map<String, String> customParams6 = params6.getCustomParams();
            IacFinalLinkInteractor.a.f165997a.getClass();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting, null, params6.copy((251 & 1) != 0 ? params6.time : null, (251 & 2) != 0 ? params6.wasScreenStarted : false, (251 & 4) != 0 ? params6.hideControlsInVideo : false, (251 & 8) != 0 ? params6.hideVpnToast : false, (251 & 16) != 0 ? params6.dtmfOpened : false, (251 & 32) != 0 ? params6.customParams : P0.l(customParams6, IacFinalLinkInteractor.a.f165998b), (251 & 64) != 0 ? params6.analyticsExtraParams : null, (251 & 128) != 0 ? params6.muteRingtone : false), null, 5, null);
        } else if (inUse instanceof IacState.InUse.Alive.Talking) {
            IacState.InUse.Alive.Talking talking = (IacState.InUse.Alive.Talking) inUse;
            CallParams params7 = talking.getParams();
            Map<String, String> customParams7 = params7.getCustomParams();
            IacFinalLinkInteractor.a.f165997a.getClass();
            iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking, null, params7.copy((251 & 1) != 0 ? params7.time : null, (251 & 2) != 0 ? params7.wasScreenStarted : false, (251 & 4) != 0 ? params7.hideControlsInVideo : false, (251 & 8) != 0 ? params7.hideVpnToast : false, (251 & 16) != 0 ? params7.dtmfOpened : false, (251 & 32) != 0 ? params7.customParams : P0.l(customParams7, IacFinalLinkInteractor.a.f165998b), (251 & 64) != 0 ? params7.analyticsExtraParams : null, (251 & 128) != 0 ? params7.muteRingtone : false), null, 5, null);
        } else {
            if (!(inUse instanceof IacState.InUse.Finished)) {
                throw new NoWhenBranchMatchedException();
            }
            IacState.InUse.Finished finished = (IacState.InUse.Finished) inUse;
            CallParams params8 = finished.getParams();
            Map<String, String> customParams8 = params8.getCustomParams();
            IacFinalLinkInteractor.a.f165997a.getClass();
            iacStateCopy$default = IacState.InUse.Finished.copy$default(finished, null, params8.copy((251 & 1) != 0 ? params8.time : null, (251 & 2) != 0 ? params8.wasScreenStarted : false, (251 & 4) != 0 ? params8.hideControlsInVideo : false, (251 & 8) != 0 ? params8.hideVpnToast : false, (251 & 16) != 0 ? params8.dtmfOpened : false, (251 & 32) != 0 ? params8.customParams : P0.l(customParams8, IacFinalLinkInteractor.a.f165998b), (251 & 64) != 0 ? params8.analyticsExtraParams : null, (251 & 128) != 0 ? params8.muteRingtone : false), null, 5, null);
        }
        if (iacStateCopy$default == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Outgoing.Waiting");
        }
        iacActionProcessing.plusAssign(out, (IacState.InUse.Alive.Outgoing.Waiting) iacStateCopy$default);
    }

    @k
    public String toString() {
        return "OnWaitBottomSheetGsmClickedAction";
    }
}
