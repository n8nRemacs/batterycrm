package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.Appearance;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.InvitingState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReason;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.i;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import shark.AndroidResourceIdNames;

/* compiled from: TerminateCallInAvCallsAndTelecomAction.kt */
@P
@s0
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u00060\u0002j\u0002`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0010\u001a\u00060\u0002j\u0002`\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0005\u001a\u00060\u0002j\u0002`\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001b\u0010\u0005\u001a\u00060\u0002j\u0002`\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b \u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006#"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/TerminateCallInAvCallsAndTelecomAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/init/TerminateCallInAvCallsAndTelecomAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFrom", "getCallId", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "getReason", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TerminateCallInAvCallsAndTelecomAction implements IacAction {
    public static final int $stable = 0;

    @k
    private final String callId;

    @k
    private final String from;

    @l
    private final TerminateReason reason;

    public TerminateCallInAvCallsAndTelecomAction(@k String str, @k String str2, @l TerminateReason terminateReason) {
        this.from = str;
        this.callId = str2;
        this.reason = terminateReason;
    }

    public static /* synthetic */ TerminateCallInAvCallsAndTelecomAction copy$default(TerminateCallInAvCallsAndTelecomAction terminateCallInAvCallsAndTelecomAction, String str, String str2, TerminateReason terminateReason, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = terminateCallInAvCallsAndTelecomAction.from;
        }
        if ((i12 & 2) != 0) {
            str2 = terminateCallInAvCallsAndTelecomAction.callId;
        }
        if ((i12 & 4) != 0) {
            terminateReason = terminateCallInAvCallsAndTelecomAction.reason;
        }
        return terminateCallInAvCallsAndTelecomAction.copy(str, str2, terminateReason);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final TerminateReason getReason() {
        return this.reason;
    }

    @k
    public final TerminateCallInAvCallsAndTelecomAction copy(@k String from, @k String callId, @l TerminateReason reason) {
        return new TerminateCallInAvCallsAndTelecomAction(from, callId, reason);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TerminateCallInAvCallsAndTelecomAction)) {
            return false;
        }
        TerminateCallInAvCallsAndTelecomAction terminateCallInAvCallsAndTelecomAction = (TerminateCallInAvCallsAndTelecomAction) other;
        return L.f(this.from, terminateCallInAvCallsAndTelecomAction.from) && L.f(this.callId, terminateCallInAvCallsAndTelecomAction.callId) && L.f(this.reason, terminateCallInAvCallsAndTelecomAction.reason);
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    @k
    public final String getFrom() {
        return this.from;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    @l
    public final TerminateReason getReason() {
        return this.reason;
    }

    public int hashCode() {
        int iD2 = H.d(this.from.hashCode() * 31, 31, this.callId);
        TerminateReason terminateReason = this.reason;
        return iD2 + (terminateReason == null ? 0 : terminateReason.hashCode());
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        CallInit.Telecom disconnected;
        IacState iacStateCopy$default;
        CallInit callInitA = i.a(iacActionProcessing.getState(), this.callId);
        if (callInitA == null) {
            IacActionOutput out = iacActionProcessing.getOut();
            String str = this.callId;
            TerminateReason terminateReason = this.reason;
            if (terminateReason == null) {
                terminateReason = TerminateReason.InternalError.INSTANCE;
            }
            iacActionProcessing.plusAssign(out, new IacEvent.AvCalls.TerminateCall(str, terminateReason));
            IacActionOutput out2 = iacActionProcessing.getOut();
            String str2 = this.callId;
            TerminateReason terminateReason2 = this.reason;
            if (terminateReason2 == null) {
                terminateReason2 = TerminateReason.InternalError.INSTANCE;
            }
            iacActionProcessing.plusAssign(out2, new IacEvent.Telecom.Registered.Disconnect(str2, terminateReason2, true));
            return;
        }
        InvitingState avCalls = callInitA.getAvCalls();
        if (avCalls != null && !avCalls.isTerminal()) {
            IacActionOutput out3 = iacActionProcessing.getOut();
            String str3 = this.callId;
            TerminateReason terminateReason3 = this.reason;
            if (terminateReason3 == null) {
                terminateReason3 = TerminateReason.InternalError.INSTANCE;
            }
            iacActionProcessing.plusAssign(out3, new IacEvent.AvCalls.TerminateCall(str3, terminateReason3));
            return;
        }
        if (callInitA.getTelecom().isTerminal()) {
            return;
        }
        IacActionOutput out4 = iacActionProcessing.getOut();
        String str4 = this.callId;
        TerminateReason terminateReason4 = this.reason;
        if (terminateReason4 == null) {
            terminateReason4 = TerminateReason.InternalError.INSTANCE;
        }
        iacActionProcessing.plusAssign(out4, new IacEvent.Telecom.Registered.Disconnect(str4, terminateReason4, true));
        if ((callInitA.getTelecom() instanceof CallInit.Telecom.Creating) || (callInitA.getTelecom() instanceof CallInit.Telecom.Disconnecting) || (callInitA.getTelecom() instanceof CallInit.Telecom.Disconnected)) {
            TerminateReason terminateReason5 = this.reason;
            if (terminateReason5 == null) {
                terminateReason5 = TerminateReason.InternalError.INSTANCE;
            }
            disconnected = new CallInit.Telecom.Disconnected(terminateReason5, true);
        } else {
            TerminateReason terminateReason6 = this.reason;
            if (terminateReason6 == null) {
                terminateReason6 = TerminateReason.InternalError.INSTANCE;
            }
            disconnected = new CallInit.Telecom.Disconnecting(terminateReason6, true);
        }
        CallInit.Telecom telecom = disconnected;
        IacActionOutput out5 = iacActionProcessing.getOut();
        IacState state = iacActionProcessing.getState();
        String str5 = this.callId;
        CallInit callInitCopy$default = CallInit.copy$default(callInitA, telecom, null, false, null, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
        if (callInitCopy$default == null) {
            if (state instanceof IacState.Idle) {
                IacState.Idle idle = (IacState.Idle) state;
                Appearance appearance = idle.getAppearance();
                iacStateCopy$default = IacState.Idle.copy$default(idle, appearance.copy((261631 & 1) != 0 ? appearance.callInits : P0.i(appearance.getCallInits(), str5), (261631 & 2) != 0 ? appearance.service : null, (261631 & 4) != 0 ? appearance.screen : null, (261631 & 8) != 0 ? appearance.app : null, (261631 & 16) != 0 ? appearance.micPerm : null, (261631 & 32) != 0 ? appearance.cameraPerm : null, (261631 & 64) != 0 ? appearance.notifications : null, (261631 & 128) != 0 ? appearance.ringingMode : null, (261631 & 256) != 0 ? appearance.camera : null, (261631 & 512) != 0 ? appearance.isGsmBusy : false, (261631 & 1024) != 0 ? appearance.network : null, (261631 & 2048) != 0 ? appearance.connectionQuality : null, (261631 & 4096) != 0 ? appearance.power : null, (261631 & 8192) != 0 ? appearance.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance.isMiui : false, (261631 & 32768) != 0 ? appearance.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance.config : null, (261631 & 131072) != 0 ? appearance.stringResources : null), null, 2, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching = (IacState.InUse.Alive.Outgoing.Launching) state;
                Appearance appearance2 = launching.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching, null, null, appearance2.copy((261631 & 1) != 0 ? appearance2.callInits : P0.i(appearance2.getCallInits(), str5), (261631 & 2) != 0 ? appearance2.service : null, (261631 & 4) != 0 ? appearance2.screen : null, (261631 & 8) != 0 ? appearance2.app : null, (261631 & 16) != 0 ? appearance2.micPerm : null, (261631 & 32) != 0 ? appearance2.cameraPerm : null, (261631 & 64) != 0 ? appearance2.notifications : null, (261631 & 128) != 0 ? appearance2.ringingMode : null, (261631 & 256) != 0 ? appearance2.camera : null, (261631 & 512) != 0 ? appearance2.isGsmBusy : false, (261631 & 1024) != 0 ? appearance2.network : null, (261631 & 2048) != 0 ? appearance2.connectionQuality : null, (261631 & 4096) != 0 ? appearance2.power : null, (261631 & 8192) != 0 ? appearance2.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance2.isMiui : false, (261631 & 32768) != 0 ? appearance2.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance2.config : null, (261631 & 131072) != 0 ? appearance2.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) state;
                Appearance appearance3 = resolving.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving, null, null, null, appearance3.copy((261631 & 1) != 0 ? appearance3.callInits : P0.i(appearance3.getCallInits(), str5), (261631 & 2) != 0 ? appearance3.service : null, (261631 & 4) != 0 ? appearance3.screen : null, (261631 & 8) != 0 ? appearance3.app : null, (261631 & 16) != 0 ? appearance3.micPerm : null, (261631 & 32) != 0 ? appearance3.cameraPerm : null, (261631 & 64) != 0 ? appearance3.notifications : null, (261631 & 128) != 0 ? appearance3.ringingMode : null, (261631 & 256) != 0 ? appearance3.camera : null, (261631 & 512) != 0 ? appearance3.isGsmBusy : false, (261631 & 1024) != 0 ? appearance3.network : null, (261631 & 2048) != 0 ? appearance3.connectionQuality : null, (261631 & 4096) != 0 ? appearance3.power : null, (261631 & 8192) != 0 ? appearance3.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance3.isMiui : false, (261631 & 32768) != 0 ? appearance3.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance3.config : null, (261631 & 131072) != 0 ? appearance3.stringResources : null), 7, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting = (IacState.InUse.Alive.Outgoing.Waiting) state;
                Appearance appearance4 = waiting.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting, null, null, appearance4.copy((261631 & 1) != 0 ? appearance4.callInits : P0.i(appearance4.getCallInits(), str5), (261631 & 2) != 0 ? appearance4.service : null, (261631 & 4) != 0 ? appearance4.screen : null, (261631 & 8) != 0 ? appearance4.app : null, (261631 & 16) != 0 ? appearance4.micPerm : null, (261631 & 32) != 0 ? appearance4.cameraPerm : null, (261631 & 64) != 0 ? appearance4.notifications : null, (261631 & 128) != 0 ? appearance4.ringingMode : null, (261631 & 256) != 0 ? appearance4.camera : null, (261631 & 512) != 0 ? appearance4.isGsmBusy : false, (261631 & 1024) != 0 ? appearance4.network : null, (261631 & 2048) != 0 ? appearance4.connectionQuality : null, (261631 & 4096) != 0 ? appearance4.power : null, (261631 & 8192) != 0 ? appearance4.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance4.isMiui : false, (261631 & 32768) != 0 ? appearance4.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance4.config : null, (261631 & 131072) != 0 ? appearance4.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting2 = (IacState.InUse.Alive.Incoming.Waiting) state;
                Appearance appearance5 = waiting2.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting2, null, null, appearance5.copy((261631 & 1) != 0 ? appearance5.callInits : P0.i(appearance5.getCallInits(), str5), (261631 & 2) != 0 ? appearance5.service : null, (261631 & 4) != 0 ? appearance5.screen : null, (261631 & 8) != 0 ? appearance5.app : null, (261631 & 16) != 0 ? appearance5.micPerm : null, (261631 & 32) != 0 ? appearance5.cameraPerm : null, (261631 & 64) != 0 ? appearance5.notifications : null, (261631 & 128) != 0 ? appearance5.ringingMode : null, (261631 & 256) != 0 ? appearance5.camera : null, (261631 & 512) != 0 ? appearance5.isGsmBusy : false, (261631 & 1024) != 0 ? appearance5.network : null, (261631 & 2048) != 0 ? appearance5.connectionQuality : null, (261631 & 4096) != 0 ? appearance5.power : null, (261631 & 8192) != 0 ? appearance5.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance5.isMiui : false, (261631 & 32768) != 0 ? appearance5.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance5.config : null, (261631 & 131072) != 0 ? appearance5.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving2 = (IacState.InUse.Alive.Incoming.Resolving) state;
                Appearance appearance6 = resolving2.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving2, null, null, null, appearance6.copy((261631 & 1) != 0 ? appearance6.callInits : P0.i(appearance6.getCallInits(), str5), (261631 & 2) != 0 ? appearance6.service : null, (261631 & 4) != 0 ? appearance6.screen : null, (261631 & 8) != 0 ? appearance6.app : null, (261631 & 16) != 0 ? appearance6.micPerm : null, (261631 & 32) != 0 ? appearance6.cameraPerm : null, (261631 & 64) != 0 ? appearance6.notifications : null, (261631 & 128) != 0 ? appearance6.ringingMode : null, (261631 & 256) != 0 ? appearance6.camera : null, (261631 & 512) != 0 ? appearance6.isGsmBusy : false, (261631 & 1024) != 0 ? appearance6.network : null, (261631 & 2048) != 0 ? appearance6.connectionQuality : null, (261631 & 4096) != 0 ? appearance6.power : null, (261631 & 8192) != 0 ? appearance6.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance6.isMiui : false, (261631 & 32768) != 0 ? appearance6.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance6.config : null, (261631 & 131072) != 0 ? appearance6.stringResources : null), 7, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting = (IacState.InUse.Alive.Incoming.Accepting) state;
                Appearance appearance7 = accepting.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting, null, null, appearance7.copy((261631 & 1) != 0 ? appearance7.callInits : P0.i(appearance7.getCallInits(), str5), (261631 & 2) != 0 ? appearance7.service : null, (261631 & 4) != 0 ? appearance7.screen : null, (261631 & 8) != 0 ? appearance7.app : null, (261631 & 16) != 0 ? appearance7.micPerm : null, (261631 & 32) != 0 ? appearance7.cameraPerm : null, (261631 & 64) != 0 ? appearance7.notifications : null, (261631 & 128) != 0 ? appearance7.ringingMode : null, (261631 & 256) != 0 ? appearance7.camera : null, (261631 & 512) != 0 ? appearance7.isGsmBusy : false, (261631 & 1024) != 0 ? appearance7.network : null, (261631 & 2048) != 0 ? appearance7.connectionQuality : null, (261631 & 4096) != 0 ? appearance7.power : null, (261631 & 8192) != 0 ? appearance7.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance7.isMiui : false, (261631 & 32768) != 0 ? appearance7.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance7.config : null, (261631 & 131072) != 0 ? appearance7.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking = (IacState.InUse.Alive.Talking) state;
                Appearance appearance8 = talking.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking, null, null, appearance8.copy((261631 & 1) != 0 ? appearance8.callInits : P0.i(appearance8.getCallInits(), str5), (261631 & 2) != 0 ? appearance8.service : null, (261631 & 4) != 0 ? appearance8.screen : null, (261631 & 8) != 0 ? appearance8.app : null, (261631 & 16) != 0 ? appearance8.micPerm : null, (261631 & 32) != 0 ? appearance8.cameraPerm : null, (261631 & 64) != 0 ? appearance8.notifications : null, (261631 & 128) != 0 ? appearance8.ringingMode : null, (261631 & 256) != 0 ? appearance8.camera : null, (261631 & 512) != 0 ? appearance8.isGsmBusy : false, (261631 & 1024) != 0 ? appearance8.network : null, (261631 & 2048) != 0 ? appearance8.connectionQuality : null, (261631 & 4096) != 0 ? appearance8.power : null, (261631 & 8192) != 0 ? appearance8.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance8.isMiui : false, (261631 & 32768) != 0 ? appearance8.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance8.config : null, (261631 & 131072) != 0 ? appearance8.stringResources : null), 3, null);
            } else {
                if (!(state instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished = (IacState.InUse.Finished) state;
                Appearance appearance9 = finished.getAppearance();
                iacStateCopy$default = IacState.InUse.Finished.copy$default(finished, null, null, appearance9.copy((261631 & 1) != 0 ? appearance9.callInits : P0.i(appearance9.getCallInits(), str5), (261631 & 2) != 0 ? appearance9.service : null, (261631 & 4) != 0 ? appearance9.screen : null, (261631 & 8) != 0 ? appearance9.app : null, (261631 & 16) != 0 ? appearance9.micPerm : null, (261631 & 32) != 0 ? appearance9.cameraPerm : null, (261631 & 64) != 0 ? appearance9.notifications : null, (261631 & 128) != 0 ? appearance9.ringingMode : null, (261631 & 256) != 0 ? appearance9.camera : null, (261631 & 512) != 0 ? appearance9.isGsmBusy : false, (261631 & 1024) != 0 ? appearance9.network : null, (261631 & 2048) != 0 ? appearance9.connectionQuality : null, (261631 & 4096) != 0 ? appearance9.power : null, (261631 & 8192) != 0 ? appearance9.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance9.isMiui : false, (261631 & 32768) != 0 ? appearance9.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance9.config : null, (261631 & 131072) != 0 ? appearance9.stringResources : null), 3, null);
            }
            if (iacStateCopy$default == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState");
            }
        } else {
            if (state instanceof IacState.Idle) {
                IacState.Idle idle2 = (IacState.Idle) state;
                Appearance appearance10 = idle2.getAppearance();
                iacStateCopy$default = IacState.Idle.copy$default(idle2, appearance10.copy((261631 & 1) != 0 ? appearance10.callInits : f.p(str5, callInitCopy$default, appearance10.getCallInits()), (261631 & 2) != 0 ? appearance10.service : null, (261631 & 4) != 0 ? appearance10.screen : null, (261631 & 8) != 0 ? appearance10.app : null, (261631 & 16) != 0 ? appearance10.micPerm : null, (261631 & 32) != 0 ? appearance10.cameraPerm : null, (261631 & 64) != 0 ? appearance10.notifications : null, (261631 & 128) != 0 ? appearance10.ringingMode : null, (261631 & 256) != 0 ? appearance10.camera : null, (261631 & 512) != 0 ? appearance10.isGsmBusy : false, (261631 & 1024) != 0 ? appearance10.network : null, (261631 & 2048) != 0 ? appearance10.connectionQuality : null, (261631 & 4096) != 0 ? appearance10.power : null, (261631 & 8192) != 0 ? appearance10.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance10.isMiui : false, (261631 & 32768) != 0 ? appearance10.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance10.config : null, (261631 & 131072) != 0 ? appearance10.stringResources : null), null, 2, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching2 = (IacState.InUse.Alive.Outgoing.Launching) state;
                Appearance appearance11 = launching2.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching2, null, null, appearance11.copy((261631 & 1) != 0 ? appearance11.callInits : f.p(str5, callInitCopy$default, appearance11.getCallInits()), (261631 & 2) != 0 ? appearance11.service : null, (261631 & 4) != 0 ? appearance11.screen : null, (261631 & 8) != 0 ? appearance11.app : null, (261631 & 16) != 0 ? appearance11.micPerm : null, (261631 & 32) != 0 ? appearance11.cameraPerm : null, (261631 & 64) != 0 ? appearance11.notifications : null, (261631 & 128) != 0 ? appearance11.ringingMode : null, (261631 & 256) != 0 ? appearance11.camera : null, (261631 & 512) != 0 ? appearance11.isGsmBusy : false, (261631 & 1024) != 0 ? appearance11.network : null, (261631 & 2048) != 0 ? appearance11.connectionQuality : null, (261631 & 4096) != 0 ? appearance11.power : null, (261631 & 8192) != 0 ? appearance11.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance11.isMiui : false, (261631 & 32768) != 0 ? appearance11.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance11.config : null, (261631 & 131072) != 0 ? appearance11.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving3 = (IacState.InUse.Alive.Outgoing.Resolving) state;
                Appearance appearance12 = resolving3.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving3, null, null, null, appearance12.copy((261631 & 1) != 0 ? appearance12.callInits : f.p(str5, callInitCopy$default, appearance12.getCallInits()), (261631 & 2) != 0 ? appearance12.service : null, (261631 & 4) != 0 ? appearance12.screen : null, (261631 & 8) != 0 ? appearance12.app : null, (261631 & 16) != 0 ? appearance12.micPerm : null, (261631 & 32) != 0 ? appearance12.cameraPerm : null, (261631 & 64) != 0 ? appearance12.notifications : null, (261631 & 128) != 0 ? appearance12.ringingMode : null, (261631 & 256) != 0 ? appearance12.camera : null, (261631 & 512) != 0 ? appearance12.isGsmBusy : false, (261631 & 1024) != 0 ? appearance12.network : null, (261631 & 2048) != 0 ? appearance12.connectionQuality : null, (261631 & 4096) != 0 ? appearance12.power : null, (261631 & 8192) != 0 ? appearance12.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance12.isMiui : false, (261631 & 32768) != 0 ? appearance12.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance12.config : null, (261631 & 131072) != 0 ? appearance12.stringResources : null), 7, null);
            } else if (state instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting3 = (IacState.InUse.Alive.Outgoing.Waiting) state;
                Appearance appearance13 = waiting3.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting3, null, null, appearance13.copy((261631 & 1) != 0 ? appearance13.callInits : f.p(str5, callInitCopy$default, appearance13.getCallInits()), (261631 & 2) != 0 ? appearance13.service : null, (261631 & 4) != 0 ? appearance13.screen : null, (261631 & 8) != 0 ? appearance13.app : null, (261631 & 16) != 0 ? appearance13.micPerm : null, (261631 & 32) != 0 ? appearance13.cameraPerm : null, (261631 & 64) != 0 ? appearance13.notifications : null, (261631 & 128) != 0 ? appearance13.ringingMode : null, (261631 & 256) != 0 ? appearance13.camera : null, (261631 & 512) != 0 ? appearance13.isGsmBusy : false, (261631 & 1024) != 0 ? appearance13.network : null, (261631 & 2048) != 0 ? appearance13.connectionQuality : null, (261631 & 4096) != 0 ? appearance13.power : null, (261631 & 8192) != 0 ? appearance13.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance13.isMiui : false, (261631 & 32768) != 0 ? appearance13.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance13.config : null, (261631 & 131072) != 0 ? appearance13.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting4 = (IacState.InUse.Alive.Incoming.Waiting) state;
                Appearance appearance14 = waiting4.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting4, null, null, appearance14.copy((261631 & 1) != 0 ? appearance14.callInits : f.p(str5, callInitCopy$default, appearance14.getCallInits()), (261631 & 2) != 0 ? appearance14.service : null, (261631 & 4) != 0 ? appearance14.screen : null, (261631 & 8) != 0 ? appearance14.app : null, (261631 & 16) != 0 ? appearance14.micPerm : null, (261631 & 32) != 0 ? appearance14.cameraPerm : null, (261631 & 64) != 0 ? appearance14.notifications : null, (261631 & 128) != 0 ? appearance14.ringingMode : null, (261631 & 256) != 0 ? appearance14.camera : null, (261631 & 512) != 0 ? appearance14.isGsmBusy : false, (261631 & 1024) != 0 ? appearance14.network : null, (261631 & 2048) != 0 ? appearance14.connectionQuality : null, (261631 & 4096) != 0 ? appearance14.power : null, (261631 & 8192) != 0 ? appearance14.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance14.isMiui : false, (261631 & 32768) != 0 ? appearance14.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance14.config : null, (261631 & 131072) != 0 ? appearance14.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving4 = (IacState.InUse.Alive.Incoming.Resolving) state;
                Appearance appearance15 = resolving4.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving4, null, null, null, appearance15.copy((261631 & 1) != 0 ? appearance15.callInits : f.p(str5, callInitCopy$default, appearance15.getCallInits()), (261631 & 2) != 0 ? appearance15.service : null, (261631 & 4) != 0 ? appearance15.screen : null, (261631 & 8) != 0 ? appearance15.app : null, (261631 & 16) != 0 ? appearance15.micPerm : null, (261631 & 32) != 0 ? appearance15.cameraPerm : null, (261631 & 64) != 0 ? appearance15.notifications : null, (261631 & 128) != 0 ? appearance15.ringingMode : null, (261631 & 256) != 0 ? appearance15.camera : null, (261631 & 512) != 0 ? appearance15.isGsmBusy : false, (261631 & 1024) != 0 ? appearance15.network : null, (261631 & 2048) != 0 ? appearance15.connectionQuality : null, (261631 & 4096) != 0 ? appearance15.power : null, (261631 & 8192) != 0 ? appearance15.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance15.isMiui : false, (261631 & 32768) != 0 ? appearance15.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance15.config : null, (261631 & 131072) != 0 ? appearance15.stringResources : null), 7, null);
            } else if (state instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting2 = (IacState.InUse.Alive.Incoming.Accepting) state;
                Appearance appearance16 = accepting2.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting2, null, null, appearance16.copy((261631 & 1) != 0 ? appearance16.callInits : f.p(str5, callInitCopy$default, appearance16.getCallInits()), (261631 & 2) != 0 ? appearance16.service : null, (261631 & 4) != 0 ? appearance16.screen : null, (261631 & 8) != 0 ? appearance16.app : null, (261631 & 16) != 0 ? appearance16.micPerm : null, (261631 & 32) != 0 ? appearance16.cameraPerm : null, (261631 & 64) != 0 ? appearance16.notifications : null, (261631 & 128) != 0 ? appearance16.ringingMode : null, (261631 & 256) != 0 ? appearance16.camera : null, (261631 & 512) != 0 ? appearance16.isGsmBusy : false, (261631 & 1024) != 0 ? appearance16.network : null, (261631 & 2048) != 0 ? appearance16.connectionQuality : null, (261631 & 4096) != 0 ? appearance16.power : null, (261631 & 8192) != 0 ? appearance16.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance16.isMiui : false, (261631 & 32768) != 0 ? appearance16.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance16.config : null, (261631 & 131072) != 0 ? appearance16.stringResources : null), 3, null);
            } else if (state instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking2 = (IacState.InUse.Alive.Talking) state;
                Appearance appearance17 = talking2.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking2, null, null, appearance17.copy((261631 & 1) != 0 ? appearance17.callInits : f.p(str5, callInitCopy$default, appearance17.getCallInits()), (261631 & 2) != 0 ? appearance17.service : null, (261631 & 4) != 0 ? appearance17.screen : null, (261631 & 8) != 0 ? appearance17.app : null, (261631 & 16) != 0 ? appearance17.micPerm : null, (261631 & 32) != 0 ? appearance17.cameraPerm : null, (261631 & 64) != 0 ? appearance17.notifications : null, (261631 & 128) != 0 ? appearance17.ringingMode : null, (261631 & 256) != 0 ? appearance17.camera : null, (261631 & 512) != 0 ? appearance17.isGsmBusy : false, (261631 & 1024) != 0 ? appearance17.network : null, (261631 & 2048) != 0 ? appearance17.connectionQuality : null, (261631 & 4096) != 0 ? appearance17.power : null, (261631 & 8192) != 0 ? appearance17.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance17.isMiui : false, (261631 & 32768) != 0 ? appearance17.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance17.config : null, (261631 & 131072) != 0 ? appearance17.stringResources : null), 3, null);
            } else {
                if (!(state instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished2 = (IacState.InUse.Finished) state;
                Appearance appearance18 = finished2.getAppearance();
                iacStateCopy$default = IacState.InUse.Finished.copy$default(finished2, null, null, appearance18.copy((261631 & 1) != 0 ? appearance18.callInits : f.p(str5, callInitCopy$default, appearance18.getCallInits()), (261631 & 2) != 0 ? appearance18.service : null, (261631 & 4) != 0 ? appearance18.screen : null, (261631 & 8) != 0 ? appearance18.app : null, (261631 & 16) != 0 ? appearance18.micPerm : null, (261631 & 32) != 0 ? appearance18.cameraPerm : null, (261631 & 64) != 0 ? appearance18.notifications : null, (261631 & 128) != 0 ? appearance18.ringingMode : null, (261631 & 256) != 0 ? appearance18.camera : null, (261631 & 512) != 0 ? appearance18.isGsmBusy : false, (261631 & 1024) != 0 ? appearance18.network : null, (261631 & 2048) != 0 ? appearance18.connectionQuality : null, (261631 & 4096) != 0 ? appearance18.power : null, (261631 & 8192) != 0 ? appearance18.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance18.isMiui : false, (261631 & 32768) != 0 ? appearance18.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance18.config : null, (261631 & 131072) != 0 ? appearance18.stringResources : null), 3, null);
            }
            if (iacStateCopy$default == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState");
            }
        }
        iacActionProcessing.plusAssign(out5, iacStateCopy$default);
    }

    @k
    public String toString() {
        return "TerminateCallInAvCallsAndTelecomAction(from=" + this.from + ", callId=" + this.callId + ", reason=" + this.reason + ')';
    }

    public /* synthetic */ TerminateCallInAvCallsAndTelecomAction(String str, String str2, TerminateReason terminateReason, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : terminateReason);
    }
}
