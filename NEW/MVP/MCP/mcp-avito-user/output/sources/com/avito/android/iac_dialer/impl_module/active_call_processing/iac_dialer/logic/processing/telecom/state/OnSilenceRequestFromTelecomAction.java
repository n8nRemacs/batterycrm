package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.telecom.state;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.TerminateCallInAvCallsAndTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.i;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.CallParams;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.p;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: OnSilenceRequestFromTelecomAction.kt */
@P
@s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/telecom/state/OnSilenceRequestFromTelecomAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "<init>", "(Ljava/lang/String;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/telecom/state/OnSilenceRequestFromTelecomAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnSilenceRequestFromTelecomAction implements IacAction {
    public static final int $stable = 0;

    @k
    private final String callId;

    public OnSilenceRequestFromTelecomAction(@k String str) {
        this.callId = str;
    }

    public static /* synthetic */ OnSilenceRequestFromTelecomAction copy$default(OnSilenceRequestFromTelecomAction onSilenceRequestFromTelecomAction, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = onSilenceRequestFromTelecomAction.callId;
        }
        return onSilenceRequestFromTelecomAction.copy(str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @k
    public final OnSilenceRequestFromTelecomAction copy(@k String callId) {
        return new OnSilenceRequestFromTelecomAction(callId);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnSilenceRequestFromTelecomAction) && L.f(this.callId, ((OnSilenceRequestFromTelecomAction) other).callId);
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return this.callId.hashCode();
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        IacState iacStateCopy$default;
        if (!(iacActionProcessing.getState() instanceof IacState.InUse) || !L.f(((IacState.InUse) iacActionProcessing.getState()).getCallId(), this.callId)) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), this.callId, null, 4, null));
            return;
        }
        if (i.a(iacActionProcessing.getState(), this.callId) == null) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), this.callId, null, 4, null));
            return;
        }
        IacState.InUse inUse = (IacState.InUse) iacActionProcessing.getState();
        if (inUse instanceof IacState.InUse.Alive.Outgoing ? true : inUse instanceof IacState.InUse.Finished) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), this.callId, null, 4, null));
            return;
        }
        if (!(inUse instanceof IacState.InUse.Alive.Incoming)) {
            boolean z12 = inUse instanceof IacState.InUse.Alive.Talking;
            return;
        }
        if (iacActionProcessing.getState().getAppearance().isMiui() && !iacActionProcessing.getState().getAppearance().getScreen().getIsAtLeastStarted()) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new p("Skip silent request cause isMiui and screen is not started"));
            return;
        }
        IacActionOutput out = iacActionProcessing.getOut();
        IacState.InUse inUse2 = (IacState.InUse) iacActionProcessing.getState();
        if (inUse2 instanceof IacState.InUse.Alive.Outgoing.Launching) {
            IacState.InUse.Alive.Outgoing.Launching launching = (IacState.InUse.Alive.Outgoing.Launching) inUse2;
            CallParams params = launching.getParams();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching, null, params.copy((251 & 1) != 0 ? params.time : null, (251 & 2) != 0 ? params.wasScreenStarted : false, (251 & 4) != 0 ? params.hideControlsInVideo : false, (251 & 8) != 0 ? params.hideVpnToast : false, (251 & 16) != 0 ? params.dtmfOpened : false, (251 & 32) != 0 ? params.customParams : null, (251 & 64) != 0 ? params.analyticsExtraParams : null, (251 & 128) != 0 ? params.muteRingtone : true), null, 5, null);
        } else if (inUse2 instanceof IacState.InUse.Alive.Outgoing.Resolving) {
            IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) inUse2;
            CallParams params2 = resolving.getParams();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving, null, null, params2.copy((251 & 1) != 0 ? params2.time : null, (251 & 2) != 0 ? params2.wasScreenStarted : false, (251 & 4) != 0 ? params2.hideControlsInVideo : false, (251 & 8) != 0 ? params2.hideVpnToast : false, (251 & 16) != 0 ? params2.dtmfOpened : false, (251 & 32) != 0 ? params2.customParams : null, (251 & 64) != 0 ? params2.analyticsExtraParams : null, (251 & 128) != 0 ? params2.muteRingtone : true), null, 11, null);
        } else if (inUse2 instanceof IacState.InUse.Alive.Outgoing.Waiting) {
            IacState.InUse.Alive.Outgoing.Waiting waiting = (IacState.InUse.Alive.Outgoing.Waiting) inUse2;
            CallParams params3 = waiting.getParams();
            iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting, null, params3.copy((251 & 1) != 0 ? params3.time : null, (251 & 2) != 0 ? params3.wasScreenStarted : false, (251 & 4) != 0 ? params3.hideControlsInVideo : false, (251 & 8) != 0 ? params3.hideVpnToast : false, (251 & 16) != 0 ? params3.dtmfOpened : false, (251 & 32) != 0 ? params3.customParams : null, (251 & 64) != 0 ? params3.analyticsExtraParams : null, (251 & 128) != 0 ? params3.muteRingtone : true), null, 5, null);
        } else if (inUse2 instanceof IacState.InUse.Alive.Incoming.Waiting) {
            IacState.InUse.Alive.Incoming.Waiting waiting2 = (IacState.InUse.Alive.Incoming.Waiting) inUse2;
            CallParams params4 = waiting2.getParams();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting2, null, params4.copy((251 & 1) != 0 ? params4.time : null, (251 & 2) != 0 ? params4.wasScreenStarted : false, (251 & 4) != 0 ? params4.hideControlsInVideo : false, (251 & 8) != 0 ? params4.hideVpnToast : false, (251 & 16) != 0 ? params4.dtmfOpened : false, (251 & 32) != 0 ? params4.customParams : null, (251 & 64) != 0 ? params4.analyticsExtraParams : null, (251 & 128) != 0 ? params4.muteRingtone : true), null, 5, null);
        } else if (inUse2 instanceof IacState.InUse.Alive.Incoming.Resolving) {
            IacState.InUse.Alive.Incoming.Resolving resolving2 = (IacState.InUse.Alive.Incoming.Resolving) inUse2;
            CallParams params5 = resolving2.getParams();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving2, null, null, params5.copy((251 & 1) != 0 ? params5.time : null, (251 & 2) != 0 ? params5.wasScreenStarted : false, (251 & 4) != 0 ? params5.hideControlsInVideo : false, (251 & 8) != 0 ? params5.hideVpnToast : false, (251 & 16) != 0 ? params5.dtmfOpened : false, (251 & 32) != 0 ? params5.customParams : null, (251 & 64) != 0 ? params5.analyticsExtraParams : null, (251 & 128) != 0 ? params5.muteRingtone : true), null, 11, null);
        } else if (inUse2 instanceof IacState.InUse.Alive.Incoming.Accepting) {
            IacState.InUse.Alive.Incoming.Accepting accepting = (IacState.InUse.Alive.Incoming.Accepting) inUse2;
            CallParams params6 = accepting.getParams();
            iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting, null, params6.copy((251 & 1) != 0 ? params6.time : null, (251 & 2) != 0 ? params6.wasScreenStarted : false, (251 & 4) != 0 ? params6.hideControlsInVideo : false, (251 & 8) != 0 ? params6.hideVpnToast : false, (251 & 16) != 0 ? params6.dtmfOpened : false, (251 & 32) != 0 ? params6.customParams : null, (251 & 64) != 0 ? params6.analyticsExtraParams : null, (251 & 128) != 0 ? params6.muteRingtone : true), null, 5, null);
        } else if (inUse2 instanceof IacState.InUse.Alive.Talking) {
            IacState.InUse.Alive.Talking talking = (IacState.InUse.Alive.Talking) inUse2;
            CallParams params7 = talking.getParams();
            iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking, null, params7.copy((251 & 1) != 0 ? params7.time : null, (251 & 2) != 0 ? params7.wasScreenStarted : false, (251 & 4) != 0 ? params7.hideControlsInVideo : false, (251 & 8) != 0 ? params7.hideVpnToast : false, (251 & 16) != 0 ? params7.dtmfOpened : false, (251 & 32) != 0 ? params7.customParams : null, (251 & 64) != 0 ? params7.analyticsExtraParams : null, (251 & 128) != 0 ? params7.muteRingtone : true), null, 5, null);
        } else {
            if (!(inUse2 instanceof IacState.InUse.Finished)) {
                throw new NoWhenBranchMatchedException();
            }
            IacState.InUse.Finished finished = (IacState.InUse.Finished) inUse2;
            CallParams params8 = finished.getParams();
            iacStateCopy$default = IacState.InUse.Finished.copy$default(finished, null, params8.copy((251 & 1) != 0 ? params8.time : null, (251 & 2) != 0 ? params8.wasScreenStarted : false, (251 & 4) != 0 ? params8.hideControlsInVideo : false, (251 & 8) != 0 ? params8.hideVpnToast : false, (251 & 16) != 0 ? params8.dtmfOpened : false, (251 & 32) != 0 ? params8.customParams : null, (251 & 64) != 0 ? params8.analyticsExtraParams : null, (251 & 128) != 0 ? params8.muteRingtone : true), null, 5, null);
        }
        if (iacStateCopy$default == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming");
        }
        iacActionProcessing.plusAssign(out, (IacState.InUse.Alive.Incoming) iacStateCopy$default);
    }

    @k
    public String toString() {
        return C22026a.c(new StringBuilder("OnSilenceRequestFromTelecomAction(callId="), this.callId, ')');
    }
}
