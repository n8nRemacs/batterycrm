package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.init;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.TerminateCallInAvCallsAndTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.i;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.CallParams;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.p;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.r;
import com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenArgument;
import com.avito.android.iac_dialer_models.abstract_module.IacCallTime;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: OnCreateAvCallsOutgoingCallSuccessAction.kt */
@P
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/init/OnCreateAvCallsOutgoingCallSuccessAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "call", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/init/OnCreateAvCallsOutgoingCallSuccessAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "getCall", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnCreateAvCallsOutgoingCallSuccessAction implements IacAction {
    public static final int $stable = 8;

    @k
    private final CallState call;

    public OnCreateAvCallsOutgoingCallSuccessAction(@k CallState callState) {
        this.call = callState;
    }

    public static /* synthetic */ OnCreateAvCallsOutgoingCallSuccessAction copy$default(OnCreateAvCallsOutgoingCallSuccessAction onCreateAvCallsOutgoingCallSuccessAction, CallState callState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            callState = onCreateAvCallsOutgoingCallSuccessAction.call;
        }
        return onCreateAvCallsOutgoingCallSuccessAction.copy(callState);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final CallState getCall() {
        return this.call;
    }

    @k
    public final OnCreateAvCallsOutgoingCallSuccessAction copy(@k CallState call) {
        return new OnCreateAvCallsOutgoingCallSuccessAction(call);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnCreateAvCallsOutgoingCallSuccessAction) && L.f(this.call, ((OnCreateAvCallsOutgoingCallSuccessAction) other).call);
    }

    @k
    public final CallState getCall() {
        return this.call;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return this.call.hashCode();
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        Map mapC;
        if (!(iacActionProcessing.getState() instanceof IacState.Idle)) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new p("Can't start outgoing call cause already one IAC call is active"));
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), this.call.getCallId(), null, 4, null));
            return;
        }
        CallInit callInitA = i.a(iacActionProcessing.getState(), this.call.getCallId());
        if (callInitA == null) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), this.call.getCallId(), null, 4, null));
            return;
        }
        if (iacActionProcessing.getState().getAppearance().isGsmBusy() && !L.f(callInitA.isRealTelecomImpl(), Boolean.TRUE)) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new r("Can't start outgoing call cause GSM is busy and 'callInit.isRealTelecomImpl'!=true"));
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), this.call.getCallId(), null, 4, null));
            return;
        }
        if (!(callInitA.getPayload() instanceof CallInit.OutgoingPayload)) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), this.call.getCallId(), null, 4, null));
            return;
        }
        iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.ActivityLauncher.Launch(new IacCallScreenArgument.WithoutAction(new IacCallScreenArgument.WithoutAction.From.Other(getName()))));
        IacActionOutput out = iacActionProcessing.getOut();
        IacState.Idle idle = (IacState.Idle) iacActionProcessing.getState();
        CallParams.Companion companion = CallParams.INSTANCE;
        IacCallTime iacCallTime = new IacCallTime(iacActionProcessing.getCurrentTime(), 0L, iacActionProcessing.getCurrentTime(), 0L, 0L, 0L, 58, null);
        Map<String, String> analyticsExtraParams = ((CallInit.OutgoingPayload) callInitA.getPayload()).getInput().getAnalyticsExtraParams();
        if (L.f(callInitA.isRealTelecomImpl(), Boolean.TRUE)) {
            IacFinalLinkInteractor.a.f165997a.getClass();
            Q<String, String> q12 = IacFinalLinkInteractor.a.f166000d;
            mapC = Collections.singletonMap(q12.f406619b, q12.f406620c);
        } else {
            mapC = P0.c();
        }
        Map map = mapC;
        companion.getClass();
        iacActionProcessing.plusAssign(out, idle.toOutgoing(new CallParams(iacCallTime, false, false, false, false, map, analyticsExtraParams, false), this.call));
    }

    @k
    public String toString() {
        return "OnCreateAvCallsOutgoingCallSuccessAction(call=" + this.call + ')';
    }
}
