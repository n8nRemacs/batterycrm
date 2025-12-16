package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.avcalls;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.TerminateCallInAvCallsAndTelecomAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.Appearance;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.InvitingState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.t;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.u;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.i;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.CallParams;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.p;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.m0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: OnAvCallsCallStateChangedAction.kt */
@P
@s0
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\n*\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/avcalls/OnAvCallsCallStateChangedAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "newCallState", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "calculateNewState", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "Lkotlin/G0;", "printCallStateDiff", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "scheduleTelecomDisconnectIfNeeded", "process", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/avcalls/OnAvCallsCallStateChangedAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "getNewCallState", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnAvCallsCallStateChangedAction implements IacAction {
    public static final int $stable = 8;

    @k
    private final CallState newCallState;

    /* compiled from: OnAvCallsCallStateChangedAction.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f165458l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "State";
        }
    }

    public OnAvCallsCallStateChangedAction(@k CallState callState) {
        this.newCallState = callState;
    }

    private final IacState calculateNewState(IacActionProcessing iacActionProcessing) {
        IacState state = iacActionProcessing.getState();
        if (state instanceof IacState.Idle) {
            return calculateNewState$wrongState(iacActionProcessing, this);
        }
        if (state instanceof IacState.InUse.Alive.Outgoing) {
            IacState.InUse.Alive.Outgoing outgoing = (IacState.InUse.Alive.Outgoing) iacActionProcessing.getState();
            if (outgoing instanceof IacState.InUse.Alive.Outgoing.Launching) {
                InvitingState invitingState = this.newCallState.getInvitingState();
                if (L.f(invitingState, InvitingState.Allocating.INSTANCE)) {
                    return iacActionProcessing.getState();
                }
                if (L.f(invitingState, InvitingState.Allocated.INSTANCE)) {
                    return iacActionProcessing.getState();
                }
                if (L.f(invitingState, InvitingState.Ringing.INSTANCE)) {
                    return calculateNewState$wrongState(iacActionProcessing, this);
                }
                if (L.f(invitingState, InvitingState.Active.INSTANCE)) {
                    return calculateNewState$wrongState(iacActionProcessing, this);
                }
                if (invitingState instanceof InvitingState.Terminated) {
                    return ((IacState.InUse.Alive.Outgoing.Launching) iacActionProcessing.getState()).toFinished();
                }
                if (invitingState instanceof InvitingState.Terminating) {
                    return ((IacState.InUse.Alive.Outgoing.Launching) iacActionProcessing.getState()).toFinished();
                }
                throw new NoWhenBranchMatchedException();
            }
            if (outgoing instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                InvitingState invitingState2 = this.newCallState.getInvitingState();
                if (L.f(invitingState2, InvitingState.Allocating.INSTANCE)) {
                    return calculateNewState$wrongState(iacActionProcessing, this);
                }
                if (L.f(invitingState2, InvitingState.Allocated.INSTANCE)) {
                    return iacActionProcessing.getState();
                }
                if (L.f(invitingState2, InvitingState.Ringing.INSTANCE)) {
                    return calculateNewState$wrongState(iacActionProcessing, this);
                }
                if (L.f(invitingState2, InvitingState.Active.INSTANCE)) {
                    return calculateNewState$wrongState(iacActionProcessing, this);
                }
                if (invitingState2 instanceof InvitingState.Terminated) {
                    return ((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).toFinished();
                }
                if (invitingState2 instanceof InvitingState.Terminating) {
                    return ((IacState.InUse.Alive.Outgoing.Resolving) iacActionProcessing.getState()).toFinished();
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(outgoing instanceof IacState.InUse.Alive.Outgoing.Waiting)) {
                throw new NoWhenBranchMatchedException();
            }
            InvitingState invitingState3 = this.newCallState.getInvitingState();
            if (L.f(invitingState3, InvitingState.Allocating.INSTANCE)) {
                return calculateNewState$wrongState(iacActionProcessing, this);
            }
            if (L.f(invitingState3, InvitingState.Allocated.INSTANCE)) {
                return iacActionProcessing.getState();
            }
            if (L.f(invitingState3, InvitingState.Ringing.INSTANCE)) {
                return iacActionProcessing.getState();
            }
            if (L.f(invitingState3, InvitingState.Active.INSTANCE)) {
                return ((IacState.InUse.Alive.Outgoing.Waiting) iacActionProcessing.getState()).toTalking();
            }
            if (invitingState3 instanceof InvitingState.Terminated) {
                return ((IacState.InUse.Alive.Outgoing.Waiting) iacActionProcessing.getState()).toFinished();
            }
            if (invitingState3 instanceof InvitingState.Terminating) {
                return ((IacState.InUse.Alive.Outgoing.Waiting) iacActionProcessing.getState()).toFinished();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(state instanceof IacState.InUse.Alive.Incoming)) {
            if (!(state instanceof IacState.InUse.Alive.Talking)) {
                if (state instanceof IacState.InUse.Finished) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            InvitingState invitingState4 = this.newCallState.getInvitingState();
            if (L.f(invitingState4, InvitingState.Allocating.INSTANCE)) {
                return calculateNewState$wrongState(iacActionProcessing, this);
            }
            if (L.f(invitingState4, InvitingState.Allocated.INSTANCE)) {
                return calculateNewState$wrongState(iacActionProcessing, this);
            }
            if (L.f(invitingState4, InvitingState.Ringing.INSTANCE)) {
                return calculateNewState$wrongState(iacActionProcessing, this);
            }
            if (L.f(invitingState4, InvitingState.Active.INSTANCE)) {
                return iacActionProcessing.getState();
            }
            if (invitingState4 instanceof InvitingState.Terminated) {
                return ((IacState.InUse.Alive.Talking) iacActionProcessing.getState()).toFinished();
            }
            if (invitingState4 instanceof InvitingState.Terminating) {
                return ((IacState.InUse.Alive.Talking) iacActionProcessing.getState()).toFinished();
            }
            throw new NoWhenBranchMatchedException();
        }
        IacState.InUse.Alive.Incoming incoming = (IacState.InUse.Alive.Incoming) iacActionProcessing.getState();
        if (incoming instanceof IacState.InUse.Alive.Incoming.Waiting) {
            InvitingState invitingState5 = this.newCallState.getInvitingState();
            if (L.f(invitingState5, InvitingState.Allocating.INSTANCE)) {
                return calculateNewState$wrongState(iacActionProcessing, this);
            }
            if (L.f(invitingState5, InvitingState.Allocated.INSTANCE)) {
                return iacActionProcessing.getState();
            }
            if (L.f(invitingState5, InvitingState.Ringing.INSTANCE)) {
                return iacActionProcessing.getState();
            }
            if (L.f(invitingState5, InvitingState.Active.INSTANCE)) {
                return calculateNewState$wrongState(iacActionProcessing, this);
            }
            if (invitingState5 instanceof InvitingState.Terminated) {
                return ((IacState.InUse.Alive.Incoming.Waiting) iacActionProcessing.getState()).toFinished();
            }
            if (invitingState5 instanceof InvitingState.Terminating) {
                return ((IacState.InUse.Alive.Incoming.Waiting) iacActionProcessing.getState()).toFinished();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (incoming instanceof IacState.InUse.Alive.Incoming.Resolving) {
            InvitingState invitingState6 = this.newCallState.getInvitingState();
            if (L.f(invitingState6, InvitingState.Allocating.INSTANCE)) {
                return calculateNewState$wrongState(iacActionProcessing, this);
            }
            if (L.f(invitingState6, InvitingState.Allocated.INSTANCE)) {
                return iacActionProcessing.getState();
            }
            if (L.f(invitingState6, InvitingState.Ringing.INSTANCE)) {
                return iacActionProcessing.getState();
            }
            if (L.f(invitingState6, InvitingState.Active.INSTANCE)) {
                return calculateNewState$wrongState(iacActionProcessing, this);
            }
            if (invitingState6 instanceof InvitingState.Terminated) {
                return ((IacState.InUse.Alive.Incoming.Resolving) iacActionProcessing.getState()).toFinished();
            }
            if (invitingState6 instanceof InvitingState.Terminating) {
                return ((IacState.InUse.Alive.Incoming.Resolving) iacActionProcessing.getState()).toFinished();
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(incoming instanceof IacState.InUse.Alive.Incoming.Accepting)) {
            throw new NoWhenBranchMatchedException();
        }
        InvitingState invitingState7 = this.newCallState.getInvitingState();
        if (L.f(invitingState7, InvitingState.Allocating.INSTANCE)) {
            return calculateNewState$wrongState(iacActionProcessing, this);
        }
        if (L.f(invitingState7, InvitingState.Allocated.INSTANCE)) {
            return iacActionProcessing.getState();
        }
        if (L.f(invitingState7, InvitingState.Ringing.INSTANCE)) {
            return iacActionProcessing.getState();
        }
        if (L.f(invitingState7, InvitingState.Active.INSTANCE)) {
            return ((IacState.InUse.Alive.Incoming.Accepting) iacActionProcessing.getState()).toTalking();
        }
        if (invitingState7 instanceof InvitingState.Terminated) {
            return ((IacState.InUse.Alive.Incoming.Accepting) iacActionProcessing.getState()).toFinished();
        }
        if (invitingState7 instanceof InvitingState.Terminating) {
            return ((IacState.InUse.Alive.Incoming.Accepting) iacActionProcessing.getState()).toFinished();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState calculateNewState$wrongState(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing r11, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.avcalls.OnAvCallsCallStateChangedAction r12) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.avcalls.OnAvCallsCallStateChangedAction.calculateNewState$wrongState(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.avcalls.OnAvCallsCallStateChangedAction):com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState");
    }

    public static /* synthetic */ OnAvCallsCallStateChangedAction copy$default(OnAvCallsCallStateChangedAction onAvCallsCallStateChangedAction, CallState callState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            callState = onAvCallsCallStateChangedAction.newCallState;
        }
        return onAvCallsCallStateChangedAction.copy(callState);
    }

    private final void printCallStateDiff(IacActionProcessing iacActionProcessing) {
        CallState call;
        IacState state = iacActionProcessing.getState();
        if (state instanceof IacState.InUse) {
            call = ((IacState.InUse) state).getCall();
        } else {
            if (!(state instanceof IacState.Idle)) {
                throw new NoWhenBranchMatchedException();
            }
            call = null;
        }
        if (call == null) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new p("AvCalls.CallState.diff: first CallState"));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        t tVar = t.f165565b;
        CallState callState = this.newCallState;
        tVar.getClass();
        t.d(sb2, null, call, callState);
        String string = sb2.toString();
        if (string.length() == 0) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new p("AvCalls.CallState.diff: no changes"));
        } else {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new p("AvCalls.CallState.diff: ".concat(string)));
        }
    }

    private final void scheduleTelecomDisconnectIfNeeded(IacActionProcessing iacActionProcessing) {
        String callId = this.newCallState.getCallId();
        CallInit callInitA = i.a(iacActionProcessing.getState(), callId);
        if (callInitA == null) {
            return;
        }
        InvitingState avCalls = callInitA.getAvCalls();
        if ((avCalls == null || !avCalls.isTerminal()) && (this.newCallState.getInvitingState() instanceof u)) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), callId, ((u) this.newCallState.getInvitingState()).getReason()));
        }
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final CallState getNewCallState() {
        return this.newCallState;
    }

    @k
    public final OnAvCallsCallStateChangedAction copy(@k CallState newCallState) {
        return new OnAvCallsCallStateChangedAction(newCallState);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnAvCallsCallStateChangedAction) && L.f(this.newCallState, ((OnAvCallsCallStateChangedAction) other).newCallState);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    @k
    public final CallState getNewCallState() {
        return this.newCallState;
    }

    public int hashCode() {
        return this.newCallState.hashCode();
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        IacState iacStateCopy$default;
        IacState iacStateCopy$default2;
        IacState iacStateCopy$default3;
        IacState iacStateCopy$default4;
        String callId = this.newCallState.getCallId();
        CallInit callInitA = i.a(iacActionProcessing.getState(), callId);
        if (callInitA == null) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new TerminateCallInAvCallsAndTelecomAction(getName(), callId, null, 4, null));
            return;
        }
        scheduleTelecomDisconnectIfNeeded(iacActionProcessing);
        CallInit callInitCopy$default = CallInit.copy$default(callInitA, null, null, false, this.newCallState.getInvitingState(), false, null, null, 119, null);
        if (iacActionProcessing.getState() instanceof IacState.Idle) {
            IacActionOutput out = iacActionProcessing.getOut();
            IacState state = iacActionProcessing.getState();
            if (callInitCopy$default == null) {
                if (state instanceof IacState.Idle) {
                    IacState.Idle idle = (IacState.Idle) state;
                    Appearance appearance = idle.getAppearance();
                    iacStateCopy$default4 = IacState.Idle.copy$default(idle, appearance.copy((261631 & 1) != 0 ? appearance.callInits : P0.i(appearance.getCallInits(), callId), (261631 & 2) != 0 ? appearance.service : null, (261631 & 4) != 0 ? appearance.screen : null, (261631 & 8) != 0 ? appearance.app : null, (261631 & 16) != 0 ? appearance.micPerm : null, (261631 & 32) != 0 ? appearance.cameraPerm : null, (261631 & 64) != 0 ? appearance.notifications : null, (261631 & 128) != 0 ? appearance.ringingMode : null, (261631 & 256) != 0 ? appearance.camera : null, (261631 & 512) != 0 ? appearance.isGsmBusy : false, (261631 & 1024) != 0 ? appearance.network : null, (261631 & 2048) != 0 ? appearance.connectionQuality : null, (261631 & 4096) != 0 ? appearance.power : null, (261631 & 8192) != 0 ? appearance.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance.isMiui : false, (261631 & 32768) != 0 ? appearance.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance.config : null, (261631 & 131072) != 0 ? appearance.stringResources : null), null, 2, null);
                } else if (state instanceof IacState.InUse.Alive.Outgoing.Launching) {
                    IacState.InUse.Alive.Outgoing.Launching launching = (IacState.InUse.Alive.Outgoing.Launching) state;
                    Appearance appearance2 = launching.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching, null, null, appearance2.copy((261631 & 1) != 0 ? appearance2.callInits : P0.i(appearance2.getCallInits(), callId), (261631 & 2) != 0 ? appearance2.service : null, (261631 & 4) != 0 ? appearance2.screen : null, (261631 & 8) != 0 ? appearance2.app : null, (261631 & 16) != 0 ? appearance2.micPerm : null, (261631 & 32) != 0 ? appearance2.cameraPerm : null, (261631 & 64) != 0 ? appearance2.notifications : null, (261631 & 128) != 0 ? appearance2.ringingMode : null, (261631 & 256) != 0 ? appearance2.camera : null, (261631 & 512) != 0 ? appearance2.isGsmBusy : false, (261631 & 1024) != 0 ? appearance2.network : null, (261631 & 2048) != 0 ? appearance2.connectionQuality : null, (261631 & 4096) != 0 ? appearance2.power : null, (261631 & 8192) != 0 ? appearance2.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance2.isMiui : false, (261631 & 32768) != 0 ? appearance2.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance2.config : null, (261631 & 131072) != 0 ? appearance2.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                    IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) state;
                    Appearance appearance3 = resolving.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving, null, null, null, appearance3.copy((261631 & 1) != 0 ? appearance3.callInits : P0.i(appearance3.getCallInits(), callId), (261631 & 2) != 0 ? appearance3.service : null, (261631 & 4) != 0 ? appearance3.screen : null, (261631 & 8) != 0 ? appearance3.app : null, (261631 & 16) != 0 ? appearance3.micPerm : null, (261631 & 32) != 0 ? appearance3.cameraPerm : null, (261631 & 64) != 0 ? appearance3.notifications : null, (261631 & 128) != 0 ? appearance3.ringingMode : null, (261631 & 256) != 0 ? appearance3.camera : null, (261631 & 512) != 0 ? appearance3.isGsmBusy : false, (261631 & 1024) != 0 ? appearance3.network : null, (261631 & 2048) != 0 ? appearance3.connectionQuality : null, (261631 & 4096) != 0 ? appearance3.power : null, (261631 & 8192) != 0 ? appearance3.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance3.isMiui : false, (261631 & 32768) != 0 ? appearance3.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance3.config : null, (261631 & 131072) != 0 ? appearance3.stringResources : null), 7, null);
                } else if (state instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                    IacState.InUse.Alive.Outgoing.Waiting waiting = (IacState.InUse.Alive.Outgoing.Waiting) state;
                    Appearance appearance4 = waiting.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting, null, null, appearance4.copy((261631 & 1) != 0 ? appearance4.callInits : P0.i(appearance4.getCallInits(), callId), (261631 & 2) != 0 ? appearance4.service : null, (261631 & 4) != 0 ? appearance4.screen : null, (261631 & 8) != 0 ? appearance4.app : null, (261631 & 16) != 0 ? appearance4.micPerm : null, (261631 & 32) != 0 ? appearance4.cameraPerm : null, (261631 & 64) != 0 ? appearance4.notifications : null, (261631 & 128) != 0 ? appearance4.ringingMode : null, (261631 & 256) != 0 ? appearance4.camera : null, (261631 & 512) != 0 ? appearance4.isGsmBusy : false, (261631 & 1024) != 0 ? appearance4.network : null, (261631 & 2048) != 0 ? appearance4.connectionQuality : null, (261631 & 4096) != 0 ? appearance4.power : null, (261631 & 8192) != 0 ? appearance4.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance4.isMiui : false, (261631 & 32768) != 0 ? appearance4.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance4.config : null, (261631 & 131072) != 0 ? appearance4.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Incoming.Waiting) {
                    IacState.InUse.Alive.Incoming.Waiting waiting2 = (IacState.InUse.Alive.Incoming.Waiting) state;
                    Appearance appearance5 = waiting2.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting2, null, null, appearance5.copy((261631 & 1) != 0 ? appearance5.callInits : P0.i(appearance5.getCallInits(), callId), (261631 & 2) != 0 ? appearance5.service : null, (261631 & 4) != 0 ? appearance5.screen : null, (261631 & 8) != 0 ? appearance5.app : null, (261631 & 16) != 0 ? appearance5.micPerm : null, (261631 & 32) != 0 ? appearance5.cameraPerm : null, (261631 & 64) != 0 ? appearance5.notifications : null, (261631 & 128) != 0 ? appearance5.ringingMode : null, (261631 & 256) != 0 ? appearance5.camera : null, (261631 & 512) != 0 ? appearance5.isGsmBusy : false, (261631 & 1024) != 0 ? appearance5.network : null, (261631 & 2048) != 0 ? appearance5.connectionQuality : null, (261631 & 4096) != 0 ? appearance5.power : null, (261631 & 8192) != 0 ? appearance5.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance5.isMiui : false, (261631 & 32768) != 0 ? appearance5.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance5.config : null, (261631 & 131072) != 0 ? appearance5.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Incoming.Resolving) {
                    IacState.InUse.Alive.Incoming.Resolving resolving2 = (IacState.InUse.Alive.Incoming.Resolving) state;
                    Appearance appearance6 = resolving2.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving2, null, null, null, appearance6.copy((261631 & 1) != 0 ? appearance6.callInits : P0.i(appearance6.getCallInits(), callId), (261631 & 2) != 0 ? appearance6.service : null, (261631 & 4) != 0 ? appearance6.screen : null, (261631 & 8) != 0 ? appearance6.app : null, (261631 & 16) != 0 ? appearance6.micPerm : null, (261631 & 32) != 0 ? appearance6.cameraPerm : null, (261631 & 64) != 0 ? appearance6.notifications : null, (261631 & 128) != 0 ? appearance6.ringingMode : null, (261631 & 256) != 0 ? appearance6.camera : null, (261631 & 512) != 0 ? appearance6.isGsmBusy : false, (261631 & 1024) != 0 ? appearance6.network : null, (261631 & 2048) != 0 ? appearance6.connectionQuality : null, (261631 & 4096) != 0 ? appearance6.power : null, (261631 & 8192) != 0 ? appearance6.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance6.isMiui : false, (261631 & 32768) != 0 ? appearance6.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance6.config : null, (261631 & 131072) != 0 ? appearance6.stringResources : null), 7, null);
                } else if (state instanceof IacState.InUse.Alive.Incoming.Accepting) {
                    IacState.InUse.Alive.Incoming.Accepting accepting = (IacState.InUse.Alive.Incoming.Accepting) state;
                    Appearance appearance7 = accepting.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting, null, null, appearance7.copy((261631 & 1) != 0 ? appearance7.callInits : P0.i(appearance7.getCallInits(), callId), (261631 & 2) != 0 ? appearance7.service : null, (261631 & 4) != 0 ? appearance7.screen : null, (261631 & 8) != 0 ? appearance7.app : null, (261631 & 16) != 0 ? appearance7.micPerm : null, (261631 & 32) != 0 ? appearance7.cameraPerm : null, (261631 & 64) != 0 ? appearance7.notifications : null, (261631 & 128) != 0 ? appearance7.ringingMode : null, (261631 & 256) != 0 ? appearance7.camera : null, (261631 & 512) != 0 ? appearance7.isGsmBusy : false, (261631 & 1024) != 0 ? appearance7.network : null, (261631 & 2048) != 0 ? appearance7.connectionQuality : null, (261631 & 4096) != 0 ? appearance7.power : null, (261631 & 8192) != 0 ? appearance7.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance7.isMiui : false, (261631 & 32768) != 0 ? appearance7.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance7.config : null, (261631 & 131072) != 0 ? appearance7.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Talking) {
                    IacState.InUse.Alive.Talking talking = (IacState.InUse.Alive.Talking) state;
                    Appearance appearance8 = talking.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Alive.Talking.copy$default(talking, null, null, appearance8.copy((261631 & 1) != 0 ? appearance8.callInits : P0.i(appearance8.getCallInits(), callId), (261631 & 2) != 0 ? appearance8.service : null, (261631 & 4) != 0 ? appearance8.screen : null, (261631 & 8) != 0 ? appearance8.app : null, (261631 & 16) != 0 ? appearance8.micPerm : null, (261631 & 32) != 0 ? appearance8.cameraPerm : null, (261631 & 64) != 0 ? appearance8.notifications : null, (261631 & 128) != 0 ? appearance8.ringingMode : null, (261631 & 256) != 0 ? appearance8.camera : null, (261631 & 512) != 0 ? appearance8.isGsmBusy : false, (261631 & 1024) != 0 ? appearance8.network : null, (261631 & 2048) != 0 ? appearance8.connectionQuality : null, (261631 & 4096) != 0 ? appearance8.power : null, (261631 & 8192) != 0 ? appearance8.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance8.isMiui : false, (261631 & 32768) != 0 ? appearance8.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance8.config : null, (261631 & 131072) != 0 ? appearance8.stringResources : null), 3, null);
                } else {
                    if (!(state instanceof IacState.InUse.Finished)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IacState.InUse.Finished finished = (IacState.InUse.Finished) state;
                    Appearance appearance9 = finished.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Finished.copy$default(finished, null, null, appearance9.copy((261631 & 1) != 0 ? appearance9.callInits : P0.i(appearance9.getCallInits(), callId), (261631 & 2) != 0 ? appearance9.service : null, (261631 & 4) != 0 ? appearance9.screen : null, (261631 & 8) != 0 ? appearance9.app : null, (261631 & 16) != 0 ? appearance9.micPerm : null, (261631 & 32) != 0 ? appearance9.cameraPerm : null, (261631 & 64) != 0 ? appearance9.notifications : null, (261631 & 128) != 0 ? appearance9.ringingMode : null, (261631 & 256) != 0 ? appearance9.camera : null, (261631 & 512) != 0 ? appearance9.isGsmBusy : false, (261631 & 1024) != 0 ? appearance9.network : null, (261631 & 2048) != 0 ? appearance9.connectionQuality : null, (261631 & 4096) != 0 ? appearance9.power : null, (261631 & 8192) != 0 ? appearance9.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance9.isMiui : false, (261631 & 32768) != 0 ? appearance9.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance9.config : null, (261631 & 131072) != 0 ? appearance9.stringResources : null), 3, null);
                }
                if (iacStateCopy$default4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.Idle");
                }
            } else {
                if (state instanceof IacState.Idle) {
                    IacState.Idle idle2 = (IacState.Idle) state;
                    Appearance appearance10 = idle2.getAppearance();
                    iacStateCopy$default4 = IacState.Idle.copy$default(idle2, appearance10.copy((261631 & 1) != 0 ? appearance10.callInits : P0.l(appearance10.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance10.service : null, (261631 & 4) != 0 ? appearance10.screen : null, (261631 & 8) != 0 ? appearance10.app : null, (261631 & 16) != 0 ? appearance10.micPerm : null, (261631 & 32) != 0 ? appearance10.cameraPerm : null, (261631 & 64) != 0 ? appearance10.notifications : null, (261631 & 128) != 0 ? appearance10.ringingMode : null, (261631 & 256) != 0 ? appearance10.camera : null, (261631 & 512) != 0 ? appearance10.isGsmBusy : false, (261631 & 1024) != 0 ? appearance10.network : null, (261631 & 2048) != 0 ? appearance10.connectionQuality : null, (261631 & 4096) != 0 ? appearance10.power : null, (261631 & 8192) != 0 ? appearance10.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance10.isMiui : false, (261631 & 32768) != 0 ? appearance10.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance10.config : null, (261631 & 131072) != 0 ? appearance10.stringResources : null), null, 2, null);
                } else if (state instanceof IacState.InUse.Alive.Outgoing.Launching) {
                    IacState.InUse.Alive.Outgoing.Launching launching2 = (IacState.InUse.Alive.Outgoing.Launching) state;
                    Appearance appearance11 = launching2.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching2, null, null, appearance11.copy((261631 & 1) != 0 ? appearance11.callInits : P0.l(appearance11.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance11.service : null, (261631 & 4) != 0 ? appearance11.screen : null, (261631 & 8) != 0 ? appearance11.app : null, (261631 & 16) != 0 ? appearance11.micPerm : null, (261631 & 32) != 0 ? appearance11.cameraPerm : null, (261631 & 64) != 0 ? appearance11.notifications : null, (261631 & 128) != 0 ? appearance11.ringingMode : null, (261631 & 256) != 0 ? appearance11.camera : null, (261631 & 512) != 0 ? appearance11.isGsmBusy : false, (261631 & 1024) != 0 ? appearance11.network : null, (261631 & 2048) != 0 ? appearance11.connectionQuality : null, (261631 & 4096) != 0 ? appearance11.power : null, (261631 & 8192) != 0 ? appearance11.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance11.isMiui : false, (261631 & 32768) != 0 ? appearance11.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance11.config : null, (261631 & 131072) != 0 ? appearance11.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                    IacState.InUse.Alive.Outgoing.Resolving resolving3 = (IacState.InUse.Alive.Outgoing.Resolving) state;
                    Appearance appearance12 = resolving3.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving3, null, null, null, appearance12.copy((261631 & 1) != 0 ? appearance12.callInits : P0.l(appearance12.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance12.service : null, (261631 & 4) != 0 ? appearance12.screen : null, (261631 & 8) != 0 ? appearance12.app : null, (261631 & 16) != 0 ? appearance12.micPerm : null, (261631 & 32) != 0 ? appearance12.cameraPerm : null, (261631 & 64) != 0 ? appearance12.notifications : null, (261631 & 128) != 0 ? appearance12.ringingMode : null, (261631 & 256) != 0 ? appearance12.camera : null, (261631 & 512) != 0 ? appearance12.isGsmBusy : false, (261631 & 1024) != 0 ? appearance12.network : null, (261631 & 2048) != 0 ? appearance12.connectionQuality : null, (261631 & 4096) != 0 ? appearance12.power : null, (261631 & 8192) != 0 ? appearance12.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance12.isMiui : false, (261631 & 32768) != 0 ? appearance12.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance12.config : null, (261631 & 131072) != 0 ? appearance12.stringResources : null), 7, null);
                } else if (state instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                    IacState.InUse.Alive.Outgoing.Waiting waiting3 = (IacState.InUse.Alive.Outgoing.Waiting) state;
                    Appearance appearance13 = waiting3.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting3, null, null, appearance13.copy((261631 & 1) != 0 ? appearance13.callInits : P0.l(appearance13.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance13.service : null, (261631 & 4) != 0 ? appearance13.screen : null, (261631 & 8) != 0 ? appearance13.app : null, (261631 & 16) != 0 ? appearance13.micPerm : null, (261631 & 32) != 0 ? appearance13.cameraPerm : null, (261631 & 64) != 0 ? appearance13.notifications : null, (261631 & 128) != 0 ? appearance13.ringingMode : null, (261631 & 256) != 0 ? appearance13.camera : null, (261631 & 512) != 0 ? appearance13.isGsmBusy : false, (261631 & 1024) != 0 ? appearance13.network : null, (261631 & 2048) != 0 ? appearance13.connectionQuality : null, (261631 & 4096) != 0 ? appearance13.power : null, (261631 & 8192) != 0 ? appearance13.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance13.isMiui : false, (261631 & 32768) != 0 ? appearance13.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance13.config : null, (261631 & 131072) != 0 ? appearance13.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Incoming.Waiting) {
                    IacState.InUse.Alive.Incoming.Waiting waiting4 = (IacState.InUse.Alive.Incoming.Waiting) state;
                    Appearance appearance14 = waiting4.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting4, null, null, appearance14.copy((261631 & 1) != 0 ? appearance14.callInits : P0.l(appearance14.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance14.service : null, (261631 & 4) != 0 ? appearance14.screen : null, (261631 & 8) != 0 ? appearance14.app : null, (261631 & 16) != 0 ? appearance14.micPerm : null, (261631 & 32) != 0 ? appearance14.cameraPerm : null, (261631 & 64) != 0 ? appearance14.notifications : null, (261631 & 128) != 0 ? appearance14.ringingMode : null, (261631 & 256) != 0 ? appearance14.camera : null, (261631 & 512) != 0 ? appearance14.isGsmBusy : false, (261631 & 1024) != 0 ? appearance14.network : null, (261631 & 2048) != 0 ? appearance14.connectionQuality : null, (261631 & 4096) != 0 ? appearance14.power : null, (261631 & 8192) != 0 ? appearance14.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance14.isMiui : false, (261631 & 32768) != 0 ? appearance14.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance14.config : null, (261631 & 131072) != 0 ? appearance14.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Incoming.Resolving) {
                    IacState.InUse.Alive.Incoming.Resolving resolving4 = (IacState.InUse.Alive.Incoming.Resolving) state;
                    Appearance appearance15 = resolving4.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving4, null, null, null, appearance15.copy((261631 & 1) != 0 ? appearance15.callInits : P0.l(appearance15.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance15.service : null, (261631 & 4) != 0 ? appearance15.screen : null, (261631 & 8) != 0 ? appearance15.app : null, (261631 & 16) != 0 ? appearance15.micPerm : null, (261631 & 32) != 0 ? appearance15.cameraPerm : null, (261631 & 64) != 0 ? appearance15.notifications : null, (261631 & 128) != 0 ? appearance15.ringingMode : null, (261631 & 256) != 0 ? appearance15.camera : null, (261631 & 512) != 0 ? appearance15.isGsmBusy : false, (261631 & 1024) != 0 ? appearance15.network : null, (261631 & 2048) != 0 ? appearance15.connectionQuality : null, (261631 & 4096) != 0 ? appearance15.power : null, (261631 & 8192) != 0 ? appearance15.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance15.isMiui : false, (261631 & 32768) != 0 ? appearance15.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance15.config : null, (261631 & 131072) != 0 ? appearance15.stringResources : null), 7, null);
                } else if (state instanceof IacState.InUse.Alive.Incoming.Accepting) {
                    IacState.InUse.Alive.Incoming.Accepting accepting2 = (IacState.InUse.Alive.Incoming.Accepting) state;
                    Appearance appearance16 = accepting2.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting2, null, null, appearance16.copy((261631 & 1) != 0 ? appearance16.callInits : P0.l(appearance16.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance16.service : null, (261631 & 4) != 0 ? appearance16.screen : null, (261631 & 8) != 0 ? appearance16.app : null, (261631 & 16) != 0 ? appearance16.micPerm : null, (261631 & 32) != 0 ? appearance16.cameraPerm : null, (261631 & 64) != 0 ? appearance16.notifications : null, (261631 & 128) != 0 ? appearance16.ringingMode : null, (261631 & 256) != 0 ? appearance16.camera : null, (261631 & 512) != 0 ? appearance16.isGsmBusy : false, (261631 & 1024) != 0 ? appearance16.network : null, (261631 & 2048) != 0 ? appearance16.connectionQuality : null, (261631 & 4096) != 0 ? appearance16.power : null, (261631 & 8192) != 0 ? appearance16.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance16.isMiui : false, (261631 & 32768) != 0 ? appearance16.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance16.config : null, (261631 & 131072) != 0 ? appearance16.stringResources : null), 3, null);
                } else if (state instanceof IacState.InUse.Alive.Talking) {
                    IacState.InUse.Alive.Talking talking2 = (IacState.InUse.Alive.Talking) state;
                    Appearance appearance17 = talking2.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Alive.Talking.copy$default(talking2, null, null, appearance17.copy((261631 & 1) != 0 ? appearance17.callInits : P0.l(appearance17.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance17.service : null, (261631 & 4) != 0 ? appearance17.screen : null, (261631 & 8) != 0 ? appearance17.app : null, (261631 & 16) != 0 ? appearance17.micPerm : null, (261631 & 32) != 0 ? appearance17.cameraPerm : null, (261631 & 64) != 0 ? appearance17.notifications : null, (261631 & 128) != 0 ? appearance17.ringingMode : null, (261631 & 256) != 0 ? appearance17.camera : null, (261631 & 512) != 0 ? appearance17.isGsmBusy : false, (261631 & 1024) != 0 ? appearance17.network : null, (261631 & 2048) != 0 ? appearance17.connectionQuality : null, (261631 & 4096) != 0 ? appearance17.power : null, (261631 & 8192) != 0 ? appearance17.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance17.isMiui : false, (261631 & 32768) != 0 ? appearance17.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance17.config : null, (261631 & 131072) != 0 ? appearance17.stringResources : null), 3, null);
                } else {
                    if (!(state instanceof IacState.InUse.Finished)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IacState.InUse.Finished finished2 = (IacState.InUse.Finished) state;
                    Appearance appearance18 = finished2.getAppearance();
                    iacStateCopy$default4 = IacState.InUse.Finished.copy$default(finished2, null, null, appearance18.copy((261631 & 1) != 0 ? appearance18.callInits : P0.l(appearance18.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance18.service : null, (261631 & 4) != 0 ? appearance18.screen : null, (261631 & 8) != 0 ? appearance18.app : null, (261631 & 16) != 0 ? appearance18.micPerm : null, (261631 & 32) != 0 ? appearance18.cameraPerm : null, (261631 & 64) != 0 ? appearance18.notifications : null, (261631 & 128) != 0 ? appearance18.ringingMode : null, (261631 & 256) != 0 ? appearance18.camera : null, (261631 & 512) != 0 ? appearance18.isGsmBusy : false, (261631 & 1024) != 0 ? appearance18.network : null, (261631 & 2048) != 0 ? appearance18.connectionQuality : null, (261631 & 4096) != 0 ? appearance18.power : null, (261631 & 8192) != 0 ? appearance18.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance18.isMiui : false, (261631 & 32768) != 0 ? appearance18.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance18.config : null, (261631 & 131072) != 0 ? appearance18.stringResources : null), 3, null);
                }
                if (iacStateCopy$default4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.Idle");
                }
            }
            iacActionProcessing.plusAssign(out, (IacState.Idle) iacStateCopy$default4);
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new r("Skip avcalls state changes in Idle state"));
            return;
        }
        if ((iacActionProcessing.getState() instanceof IacState.InUse) && !L.f(((IacState.InUse) iacActionProcessing.getState()).getCallId(), this.newCallState.getCallId())) {
            IacActionOutput out2 = iacActionProcessing.getOut();
            IacState state2 = iacActionProcessing.getState();
            if (callInitCopy$default == null) {
                if (state2 instanceof IacState.Idle) {
                    IacState.Idle idle3 = (IacState.Idle) state2;
                    Appearance appearance19 = idle3.getAppearance();
                    iacStateCopy$default3 = IacState.Idle.copy$default(idle3, appearance19.copy((261631 & 1) != 0 ? appearance19.callInits : P0.i(appearance19.getCallInits(), callId), (261631 & 2) != 0 ? appearance19.service : null, (261631 & 4) != 0 ? appearance19.screen : null, (261631 & 8) != 0 ? appearance19.app : null, (261631 & 16) != 0 ? appearance19.micPerm : null, (261631 & 32) != 0 ? appearance19.cameraPerm : null, (261631 & 64) != 0 ? appearance19.notifications : null, (261631 & 128) != 0 ? appearance19.ringingMode : null, (261631 & 256) != 0 ? appearance19.camera : null, (261631 & 512) != 0 ? appearance19.isGsmBusy : false, (261631 & 1024) != 0 ? appearance19.network : null, (261631 & 2048) != 0 ? appearance19.connectionQuality : null, (261631 & 4096) != 0 ? appearance19.power : null, (261631 & 8192) != 0 ? appearance19.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance19.isMiui : false, (261631 & 32768) != 0 ? appearance19.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance19.config : null, (261631 & 131072) != 0 ? appearance19.stringResources : null), null, 2, null);
                } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Launching) {
                    IacState.InUse.Alive.Outgoing.Launching launching3 = (IacState.InUse.Alive.Outgoing.Launching) state2;
                    Appearance appearance20 = launching3.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching3, null, null, appearance20.copy((261631 & 1) != 0 ? appearance20.callInits : P0.i(appearance20.getCallInits(), callId), (261631 & 2) != 0 ? appearance20.service : null, (261631 & 4) != 0 ? appearance20.screen : null, (261631 & 8) != 0 ? appearance20.app : null, (261631 & 16) != 0 ? appearance20.micPerm : null, (261631 & 32) != 0 ? appearance20.cameraPerm : null, (261631 & 64) != 0 ? appearance20.notifications : null, (261631 & 128) != 0 ? appearance20.ringingMode : null, (261631 & 256) != 0 ? appearance20.camera : null, (261631 & 512) != 0 ? appearance20.isGsmBusy : false, (261631 & 1024) != 0 ? appearance20.network : null, (261631 & 2048) != 0 ? appearance20.connectionQuality : null, (261631 & 4096) != 0 ? appearance20.power : null, (261631 & 8192) != 0 ? appearance20.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance20.isMiui : false, (261631 & 32768) != 0 ? appearance20.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance20.config : null, (261631 & 131072) != 0 ? appearance20.stringResources : null), 3, null);
                } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                    IacState.InUse.Alive.Outgoing.Resolving resolving5 = (IacState.InUse.Alive.Outgoing.Resolving) state2;
                    Appearance appearance21 = resolving5.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving5, null, null, null, appearance21.copy((261631 & 1) != 0 ? appearance21.callInits : P0.i(appearance21.getCallInits(), callId), (261631 & 2) != 0 ? appearance21.service : null, (261631 & 4) != 0 ? appearance21.screen : null, (261631 & 8) != 0 ? appearance21.app : null, (261631 & 16) != 0 ? appearance21.micPerm : null, (261631 & 32) != 0 ? appearance21.cameraPerm : null, (261631 & 64) != 0 ? appearance21.notifications : null, (261631 & 128) != 0 ? appearance21.ringingMode : null, (261631 & 256) != 0 ? appearance21.camera : null, (261631 & 512) != 0 ? appearance21.isGsmBusy : false, (261631 & 1024) != 0 ? appearance21.network : null, (261631 & 2048) != 0 ? appearance21.connectionQuality : null, (261631 & 4096) != 0 ? appearance21.power : null, (261631 & 8192) != 0 ? appearance21.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance21.isMiui : false, (261631 & 32768) != 0 ? appearance21.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance21.config : null, (261631 & 131072) != 0 ? appearance21.stringResources : null), 7, null);
                } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                    IacState.InUse.Alive.Outgoing.Waiting waiting5 = (IacState.InUse.Alive.Outgoing.Waiting) state2;
                    Appearance appearance22 = waiting5.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting5, null, null, appearance22.copy((261631 & 1) != 0 ? appearance22.callInits : P0.i(appearance22.getCallInits(), callId), (261631 & 2) != 0 ? appearance22.service : null, (261631 & 4) != 0 ? appearance22.screen : null, (261631 & 8) != 0 ? appearance22.app : null, (261631 & 16) != 0 ? appearance22.micPerm : null, (261631 & 32) != 0 ? appearance22.cameraPerm : null, (261631 & 64) != 0 ? appearance22.notifications : null, (261631 & 128) != 0 ? appearance22.ringingMode : null, (261631 & 256) != 0 ? appearance22.camera : null, (261631 & 512) != 0 ? appearance22.isGsmBusy : false, (261631 & 1024) != 0 ? appearance22.network : null, (261631 & 2048) != 0 ? appearance22.connectionQuality : null, (261631 & 4096) != 0 ? appearance22.power : null, (261631 & 8192) != 0 ? appearance22.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance22.isMiui : false, (261631 & 32768) != 0 ? appearance22.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance22.config : null, (261631 & 131072) != 0 ? appearance22.stringResources : null), 3, null);
                } else if (state2 instanceof IacState.InUse.Alive.Incoming.Waiting) {
                    IacState.InUse.Alive.Incoming.Waiting waiting6 = (IacState.InUse.Alive.Incoming.Waiting) state2;
                    Appearance appearance23 = waiting6.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting6, null, null, appearance23.copy((261631 & 1) != 0 ? appearance23.callInits : P0.i(appearance23.getCallInits(), callId), (261631 & 2) != 0 ? appearance23.service : null, (261631 & 4) != 0 ? appearance23.screen : null, (261631 & 8) != 0 ? appearance23.app : null, (261631 & 16) != 0 ? appearance23.micPerm : null, (261631 & 32) != 0 ? appearance23.cameraPerm : null, (261631 & 64) != 0 ? appearance23.notifications : null, (261631 & 128) != 0 ? appearance23.ringingMode : null, (261631 & 256) != 0 ? appearance23.camera : null, (261631 & 512) != 0 ? appearance23.isGsmBusy : false, (261631 & 1024) != 0 ? appearance23.network : null, (261631 & 2048) != 0 ? appearance23.connectionQuality : null, (261631 & 4096) != 0 ? appearance23.power : null, (261631 & 8192) != 0 ? appearance23.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance23.isMiui : false, (261631 & 32768) != 0 ? appearance23.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance23.config : null, (261631 & 131072) != 0 ? appearance23.stringResources : null), 3, null);
                } else if (state2 instanceof IacState.InUse.Alive.Incoming.Resolving) {
                    IacState.InUse.Alive.Incoming.Resolving resolving6 = (IacState.InUse.Alive.Incoming.Resolving) state2;
                    Appearance appearance24 = resolving6.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving6, null, null, null, appearance24.copy((261631 & 1) != 0 ? appearance24.callInits : P0.i(appearance24.getCallInits(), callId), (261631 & 2) != 0 ? appearance24.service : null, (261631 & 4) != 0 ? appearance24.screen : null, (261631 & 8) != 0 ? appearance24.app : null, (261631 & 16) != 0 ? appearance24.micPerm : null, (261631 & 32) != 0 ? appearance24.cameraPerm : null, (261631 & 64) != 0 ? appearance24.notifications : null, (261631 & 128) != 0 ? appearance24.ringingMode : null, (261631 & 256) != 0 ? appearance24.camera : null, (261631 & 512) != 0 ? appearance24.isGsmBusy : false, (261631 & 1024) != 0 ? appearance24.network : null, (261631 & 2048) != 0 ? appearance24.connectionQuality : null, (261631 & 4096) != 0 ? appearance24.power : null, (261631 & 8192) != 0 ? appearance24.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance24.isMiui : false, (261631 & 32768) != 0 ? appearance24.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance24.config : null, (261631 & 131072) != 0 ? appearance24.stringResources : null), 7, null);
                } else if (state2 instanceof IacState.InUse.Alive.Incoming.Accepting) {
                    IacState.InUse.Alive.Incoming.Accepting accepting3 = (IacState.InUse.Alive.Incoming.Accepting) state2;
                    Appearance appearance25 = accepting3.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting3, null, null, appearance25.copy((261631 & 1) != 0 ? appearance25.callInits : P0.i(appearance25.getCallInits(), callId), (261631 & 2) != 0 ? appearance25.service : null, (261631 & 4) != 0 ? appearance25.screen : null, (261631 & 8) != 0 ? appearance25.app : null, (261631 & 16) != 0 ? appearance25.micPerm : null, (261631 & 32) != 0 ? appearance25.cameraPerm : null, (261631 & 64) != 0 ? appearance25.notifications : null, (261631 & 128) != 0 ? appearance25.ringingMode : null, (261631 & 256) != 0 ? appearance25.camera : null, (261631 & 512) != 0 ? appearance25.isGsmBusy : false, (261631 & 1024) != 0 ? appearance25.network : null, (261631 & 2048) != 0 ? appearance25.connectionQuality : null, (261631 & 4096) != 0 ? appearance25.power : null, (261631 & 8192) != 0 ? appearance25.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance25.isMiui : false, (261631 & 32768) != 0 ? appearance25.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance25.config : null, (261631 & 131072) != 0 ? appearance25.stringResources : null), 3, null);
                } else if (state2 instanceof IacState.InUse.Alive.Talking) {
                    IacState.InUse.Alive.Talking talking3 = (IacState.InUse.Alive.Talking) state2;
                    Appearance appearance26 = talking3.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Alive.Talking.copy$default(talking3, null, null, appearance26.copy((261631 & 1) != 0 ? appearance26.callInits : P0.i(appearance26.getCallInits(), callId), (261631 & 2) != 0 ? appearance26.service : null, (261631 & 4) != 0 ? appearance26.screen : null, (261631 & 8) != 0 ? appearance26.app : null, (261631 & 16) != 0 ? appearance26.micPerm : null, (261631 & 32) != 0 ? appearance26.cameraPerm : null, (261631 & 64) != 0 ? appearance26.notifications : null, (261631 & 128) != 0 ? appearance26.ringingMode : null, (261631 & 256) != 0 ? appearance26.camera : null, (261631 & 512) != 0 ? appearance26.isGsmBusy : false, (261631 & 1024) != 0 ? appearance26.network : null, (261631 & 2048) != 0 ? appearance26.connectionQuality : null, (261631 & 4096) != 0 ? appearance26.power : null, (261631 & 8192) != 0 ? appearance26.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance26.isMiui : false, (261631 & 32768) != 0 ? appearance26.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance26.config : null, (261631 & 131072) != 0 ? appearance26.stringResources : null), 3, null);
                } else {
                    if (!(state2 instanceof IacState.InUse.Finished)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IacState.InUse.Finished finished3 = (IacState.InUse.Finished) state2;
                    Appearance appearance27 = finished3.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Finished.copy$default(finished3, null, null, appearance27.copy((261631 & 1) != 0 ? appearance27.callInits : P0.i(appearance27.getCallInits(), callId), (261631 & 2) != 0 ? appearance27.service : null, (261631 & 4) != 0 ? appearance27.screen : null, (261631 & 8) != 0 ? appearance27.app : null, (261631 & 16) != 0 ? appearance27.micPerm : null, (261631 & 32) != 0 ? appearance27.cameraPerm : null, (261631 & 64) != 0 ? appearance27.notifications : null, (261631 & 128) != 0 ? appearance27.ringingMode : null, (261631 & 256) != 0 ? appearance27.camera : null, (261631 & 512) != 0 ? appearance27.isGsmBusy : false, (261631 & 1024) != 0 ? appearance27.network : null, (261631 & 2048) != 0 ? appearance27.connectionQuality : null, (261631 & 4096) != 0 ? appearance27.power : null, (261631 & 8192) != 0 ? appearance27.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance27.isMiui : false, (261631 & 32768) != 0 ? appearance27.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance27.config : null, (261631 & 131072) != 0 ? appearance27.stringResources : null), 3, null);
                }
                if (iacStateCopy$default3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse");
                }
            } else {
                if (state2 instanceof IacState.Idle) {
                    IacState.Idle idle4 = (IacState.Idle) state2;
                    Appearance appearance28 = idle4.getAppearance();
                    iacStateCopy$default3 = IacState.Idle.copy$default(idle4, appearance28.copy((261631 & 1) != 0 ? appearance28.callInits : P0.l(appearance28.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance28.service : null, (261631 & 4) != 0 ? appearance28.screen : null, (261631 & 8) != 0 ? appearance28.app : null, (261631 & 16) != 0 ? appearance28.micPerm : null, (261631 & 32) != 0 ? appearance28.cameraPerm : null, (261631 & 64) != 0 ? appearance28.notifications : null, (261631 & 128) != 0 ? appearance28.ringingMode : null, (261631 & 256) != 0 ? appearance28.camera : null, (261631 & 512) != 0 ? appearance28.isGsmBusy : false, (261631 & 1024) != 0 ? appearance28.network : null, (261631 & 2048) != 0 ? appearance28.connectionQuality : null, (261631 & 4096) != 0 ? appearance28.power : null, (261631 & 8192) != 0 ? appearance28.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance28.isMiui : false, (261631 & 32768) != 0 ? appearance28.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance28.config : null, (261631 & 131072) != 0 ? appearance28.stringResources : null), null, 2, null);
                } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Launching) {
                    IacState.InUse.Alive.Outgoing.Launching launching4 = (IacState.InUse.Alive.Outgoing.Launching) state2;
                    Appearance appearance29 = launching4.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching4, null, null, appearance29.copy((261631 & 1) != 0 ? appearance29.callInits : P0.l(appearance29.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance29.service : null, (261631 & 4) != 0 ? appearance29.screen : null, (261631 & 8) != 0 ? appearance29.app : null, (261631 & 16) != 0 ? appearance29.micPerm : null, (261631 & 32) != 0 ? appearance29.cameraPerm : null, (261631 & 64) != 0 ? appearance29.notifications : null, (261631 & 128) != 0 ? appearance29.ringingMode : null, (261631 & 256) != 0 ? appearance29.camera : null, (261631 & 512) != 0 ? appearance29.isGsmBusy : false, (261631 & 1024) != 0 ? appearance29.network : null, (261631 & 2048) != 0 ? appearance29.connectionQuality : null, (261631 & 4096) != 0 ? appearance29.power : null, (261631 & 8192) != 0 ? appearance29.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance29.isMiui : false, (261631 & 32768) != 0 ? appearance29.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance29.config : null, (261631 & 131072) != 0 ? appearance29.stringResources : null), 3, null);
                } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                    IacState.InUse.Alive.Outgoing.Resolving resolving7 = (IacState.InUse.Alive.Outgoing.Resolving) state2;
                    Appearance appearance30 = resolving7.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving7, null, null, null, appearance30.copy((261631 & 1) != 0 ? appearance30.callInits : P0.l(appearance30.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance30.service : null, (261631 & 4) != 0 ? appearance30.screen : null, (261631 & 8) != 0 ? appearance30.app : null, (261631 & 16) != 0 ? appearance30.micPerm : null, (261631 & 32) != 0 ? appearance30.cameraPerm : null, (261631 & 64) != 0 ? appearance30.notifications : null, (261631 & 128) != 0 ? appearance30.ringingMode : null, (261631 & 256) != 0 ? appearance30.camera : null, (261631 & 512) != 0 ? appearance30.isGsmBusy : false, (261631 & 1024) != 0 ? appearance30.network : null, (261631 & 2048) != 0 ? appearance30.connectionQuality : null, (261631 & 4096) != 0 ? appearance30.power : null, (261631 & 8192) != 0 ? appearance30.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance30.isMiui : false, (261631 & 32768) != 0 ? appearance30.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance30.config : null, (261631 & 131072) != 0 ? appearance30.stringResources : null), 7, null);
                } else if (state2 instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                    IacState.InUse.Alive.Outgoing.Waiting waiting7 = (IacState.InUse.Alive.Outgoing.Waiting) state2;
                    Appearance appearance31 = waiting7.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting7, null, null, appearance31.copy((261631 & 1) != 0 ? appearance31.callInits : P0.l(appearance31.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance31.service : null, (261631 & 4) != 0 ? appearance31.screen : null, (261631 & 8) != 0 ? appearance31.app : null, (261631 & 16) != 0 ? appearance31.micPerm : null, (261631 & 32) != 0 ? appearance31.cameraPerm : null, (261631 & 64) != 0 ? appearance31.notifications : null, (261631 & 128) != 0 ? appearance31.ringingMode : null, (261631 & 256) != 0 ? appearance31.camera : null, (261631 & 512) != 0 ? appearance31.isGsmBusy : false, (261631 & 1024) != 0 ? appearance31.network : null, (261631 & 2048) != 0 ? appearance31.connectionQuality : null, (261631 & 4096) != 0 ? appearance31.power : null, (261631 & 8192) != 0 ? appearance31.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance31.isMiui : false, (261631 & 32768) != 0 ? appearance31.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance31.config : null, (261631 & 131072) != 0 ? appearance31.stringResources : null), 3, null);
                } else if (state2 instanceof IacState.InUse.Alive.Incoming.Waiting) {
                    IacState.InUse.Alive.Incoming.Waiting waiting8 = (IacState.InUse.Alive.Incoming.Waiting) state2;
                    Appearance appearance32 = waiting8.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting8, null, null, appearance32.copy((261631 & 1) != 0 ? appearance32.callInits : P0.l(appearance32.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance32.service : null, (261631 & 4) != 0 ? appearance32.screen : null, (261631 & 8) != 0 ? appearance32.app : null, (261631 & 16) != 0 ? appearance32.micPerm : null, (261631 & 32) != 0 ? appearance32.cameraPerm : null, (261631 & 64) != 0 ? appearance32.notifications : null, (261631 & 128) != 0 ? appearance32.ringingMode : null, (261631 & 256) != 0 ? appearance32.camera : null, (261631 & 512) != 0 ? appearance32.isGsmBusy : false, (261631 & 1024) != 0 ? appearance32.network : null, (261631 & 2048) != 0 ? appearance32.connectionQuality : null, (261631 & 4096) != 0 ? appearance32.power : null, (261631 & 8192) != 0 ? appearance32.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance32.isMiui : false, (261631 & 32768) != 0 ? appearance32.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance32.config : null, (261631 & 131072) != 0 ? appearance32.stringResources : null), 3, null);
                } else if (state2 instanceof IacState.InUse.Alive.Incoming.Resolving) {
                    IacState.InUse.Alive.Incoming.Resolving resolving8 = (IacState.InUse.Alive.Incoming.Resolving) state2;
                    Appearance appearance33 = resolving8.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving8, null, null, null, appearance33.copy((261631 & 1) != 0 ? appearance33.callInits : P0.l(appearance33.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance33.service : null, (261631 & 4) != 0 ? appearance33.screen : null, (261631 & 8) != 0 ? appearance33.app : null, (261631 & 16) != 0 ? appearance33.micPerm : null, (261631 & 32) != 0 ? appearance33.cameraPerm : null, (261631 & 64) != 0 ? appearance33.notifications : null, (261631 & 128) != 0 ? appearance33.ringingMode : null, (261631 & 256) != 0 ? appearance33.camera : null, (261631 & 512) != 0 ? appearance33.isGsmBusy : false, (261631 & 1024) != 0 ? appearance33.network : null, (261631 & 2048) != 0 ? appearance33.connectionQuality : null, (261631 & 4096) != 0 ? appearance33.power : null, (261631 & 8192) != 0 ? appearance33.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance33.isMiui : false, (261631 & 32768) != 0 ? appearance33.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance33.config : null, (261631 & 131072) != 0 ? appearance33.stringResources : null), 7, null);
                } else if (state2 instanceof IacState.InUse.Alive.Incoming.Accepting) {
                    IacState.InUse.Alive.Incoming.Accepting accepting4 = (IacState.InUse.Alive.Incoming.Accepting) state2;
                    Appearance appearance34 = accepting4.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting4, null, null, appearance34.copy((261631 & 1) != 0 ? appearance34.callInits : P0.l(appearance34.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance34.service : null, (261631 & 4) != 0 ? appearance34.screen : null, (261631 & 8) != 0 ? appearance34.app : null, (261631 & 16) != 0 ? appearance34.micPerm : null, (261631 & 32) != 0 ? appearance34.cameraPerm : null, (261631 & 64) != 0 ? appearance34.notifications : null, (261631 & 128) != 0 ? appearance34.ringingMode : null, (261631 & 256) != 0 ? appearance34.camera : null, (261631 & 512) != 0 ? appearance34.isGsmBusy : false, (261631 & 1024) != 0 ? appearance34.network : null, (261631 & 2048) != 0 ? appearance34.connectionQuality : null, (261631 & 4096) != 0 ? appearance34.power : null, (261631 & 8192) != 0 ? appearance34.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance34.isMiui : false, (261631 & 32768) != 0 ? appearance34.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance34.config : null, (261631 & 131072) != 0 ? appearance34.stringResources : null), 3, null);
                } else if (state2 instanceof IacState.InUse.Alive.Talking) {
                    IacState.InUse.Alive.Talking talking4 = (IacState.InUse.Alive.Talking) state2;
                    Appearance appearance35 = talking4.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Alive.Talking.copy$default(talking4, null, null, appearance35.copy((261631 & 1) != 0 ? appearance35.callInits : P0.l(appearance35.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance35.service : null, (261631 & 4) != 0 ? appearance35.screen : null, (261631 & 8) != 0 ? appearance35.app : null, (261631 & 16) != 0 ? appearance35.micPerm : null, (261631 & 32) != 0 ? appearance35.cameraPerm : null, (261631 & 64) != 0 ? appearance35.notifications : null, (261631 & 128) != 0 ? appearance35.ringingMode : null, (261631 & 256) != 0 ? appearance35.camera : null, (261631 & 512) != 0 ? appearance35.isGsmBusy : false, (261631 & 1024) != 0 ? appearance35.network : null, (261631 & 2048) != 0 ? appearance35.connectionQuality : null, (261631 & 4096) != 0 ? appearance35.power : null, (261631 & 8192) != 0 ? appearance35.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance35.isMiui : false, (261631 & 32768) != 0 ? appearance35.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance35.config : null, (261631 & 131072) != 0 ? appearance35.stringResources : null), 3, null);
                } else {
                    if (!(state2 instanceof IacState.InUse.Finished)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IacState.InUse.Finished finished4 = (IacState.InUse.Finished) state2;
                    Appearance appearance36 = finished4.getAppearance();
                    iacStateCopy$default3 = IacState.InUse.Finished.copy$default(finished4, null, null, appearance36.copy((261631 & 1) != 0 ? appearance36.callInits : P0.l(appearance36.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance36.service : null, (261631 & 4) != 0 ? appearance36.screen : null, (261631 & 8) != 0 ? appearance36.app : null, (261631 & 16) != 0 ? appearance36.micPerm : null, (261631 & 32) != 0 ? appearance36.cameraPerm : null, (261631 & 64) != 0 ? appearance36.notifications : null, (261631 & 128) != 0 ? appearance36.ringingMode : null, (261631 & 256) != 0 ? appearance36.camera : null, (261631 & 512) != 0 ? appearance36.isGsmBusy : false, (261631 & 1024) != 0 ? appearance36.network : null, (261631 & 2048) != 0 ? appearance36.connectionQuality : null, (261631 & 4096) != 0 ? appearance36.power : null, (261631 & 8192) != 0 ? appearance36.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance36.isMiui : false, (261631 & 32768) != 0 ? appearance36.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance36.config : null, (261631 & 131072) != 0 ? appearance36.stringResources : null), 3, null);
                }
                if (iacStateCopy$default3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse");
                }
            }
            iacActionProcessing.plusAssign(out2, (IacState.InUse) iacStateCopy$default3);
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new r("Skip avcalls state changes of another call, current state is " + iacActionProcessing.getState()));
            return;
        }
        printCallStateDiff(iacActionProcessing);
        IacState iacStateCalculateNewState = calculateNewState(iacActionProcessing);
        if (iacStateCalculateNewState == null) {
            iacStateCalculateNewState = iacActionProcessing.getState();
        }
        IacActionOutput out3 = iacActionProcessing.getOut();
        if (iacStateCalculateNewState instanceof IacState.InUse) {
            IacState.InUse inUse = (IacState.InUse) iacStateCalculateNewState;
            if (inUse instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching5 = (IacState.InUse.Alive.Outgoing.Launching) inUse;
                launching5.getCall();
                iacStateCalculateNewState = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching5, this.newCallState, null, null, 6, null);
            } else if (inUse instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving9 = (IacState.InUse.Alive.Outgoing.Resolving) inUse;
                resolving9.getCall();
                iacStateCalculateNewState = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving9, null, this.newCallState, null, null, 13, null);
            } else if (inUse instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting9 = (IacState.InUse.Alive.Outgoing.Waiting) inUse;
                waiting9.getCall();
                iacStateCalculateNewState = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting9, this.newCallState, null, null, 6, null);
            } else if (inUse instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting10 = (IacState.InUse.Alive.Incoming.Waiting) inUse;
                waiting10.getCall();
                iacStateCalculateNewState = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting10, this.newCallState, null, null, 6, null);
            } else if (inUse instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving10 = (IacState.InUse.Alive.Incoming.Resolving) inUse;
                resolving10.getCall();
                iacStateCalculateNewState = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving10, null, this.newCallState, null, null, 13, null);
            } else if (inUse instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting5 = (IacState.InUse.Alive.Incoming.Accepting) inUse;
                accepting5.getCall();
                iacStateCalculateNewState = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting5, this.newCallState, null, null, 6, null);
            } else if (inUse instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking5 = (IacState.InUse.Alive.Talking) inUse;
                talking5.getCall();
                iacStateCalculateNewState = IacState.InUse.Alive.Talking.copy$default(talking5, this.newCallState, null, null, 6, null);
            } else {
                if (!(inUse instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished5 = (IacState.InUse.Finished) inUse;
                finished5.getCall();
                iacStateCalculateNewState = IacState.InUse.Finished.copy$default(finished5, this.newCallState, null, null, 6, null);
            }
            if (iacStateCalculateNewState == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse");
            }
        }
        if (callInitCopy$default == null) {
            if (iacStateCalculateNewState instanceof IacState.Idle) {
                IacState.Idle idle5 = (IacState.Idle) iacStateCalculateNewState;
                Appearance appearance37 = idle5.getAppearance();
                iacStateCopy$default = IacState.Idle.copy$default(idle5, appearance37.copy((261631 & 1) != 0 ? appearance37.callInits : P0.i(appearance37.getCallInits(), callId), (261631 & 2) != 0 ? appearance37.service : null, (261631 & 4) != 0 ? appearance37.screen : null, (261631 & 8) != 0 ? appearance37.app : null, (261631 & 16) != 0 ? appearance37.micPerm : null, (261631 & 32) != 0 ? appearance37.cameraPerm : null, (261631 & 64) != 0 ? appearance37.notifications : null, (261631 & 128) != 0 ? appearance37.ringingMode : null, (261631 & 256) != 0 ? appearance37.camera : null, (261631 & 512) != 0 ? appearance37.isGsmBusy : false, (261631 & 1024) != 0 ? appearance37.network : null, (261631 & 2048) != 0 ? appearance37.connectionQuality : null, (261631 & 4096) != 0 ? appearance37.power : null, (261631 & 8192) != 0 ? appearance37.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance37.isMiui : false, (261631 & 32768) != 0 ? appearance37.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance37.config : null, (261631 & 131072) != 0 ? appearance37.stringResources : null), null, 2, null);
            } else if (iacStateCalculateNewState instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching6 = (IacState.InUse.Alive.Outgoing.Launching) iacStateCalculateNewState;
                Appearance appearance38 = launching6.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching6, null, null, appearance38.copy((261631 & 1) != 0 ? appearance38.callInits : P0.i(appearance38.getCallInits(), callId), (261631 & 2) != 0 ? appearance38.service : null, (261631 & 4) != 0 ? appearance38.screen : null, (261631 & 8) != 0 ? appearance38.app : null, (261631 & 16) != 0 ? appearance38.micPerm : null, (261631 & 32) != 0 ? appearance38.cameraPerm : null, (261631 & 64) != 0 ? appearance38.notifications : null, (261631 & 128) != 0 ? appearance38.ringingMode : null, (261631 & 256) != 0 ? appearance38.camera : null, (261631 & 512) != 0 ? appearance38.isGsmBusy : false, (261631 & 1024) != 0 ? appearance38.network : null, (261631 & 2048) != 0 ? appearance38.connectionQuality : null, (261631 & 4096) != 0 ? appearance38.power : null, (261631 & 8192) != 0 ? appearance38.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance38.isMiui : false, (261631 & 32768) != 0 ? appearance38.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance38.config : null, (261631 & 131072) != 0 ? appearance38.stringResources : null), 3, null);
            } else if (iacStateCalculateNewState instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving11 = (IacState.InUse.Alive.Outgoing.Resolving) iacStateCalculateNewState;
                Appearance appearance39 = resolving11.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving11, null, null, null, appearance39.copy((261631 & 1) != 0 ? appearance39.callInits : P0.i(appearance39.getCallInits(), callId), (261631 & 2) != 0 ? appearance39.service : null, (261631 & 4) != 0 ? appearance39.screen : null, (261631 & 8) != 0 ? appearance39.app : null, (261631 & 16) != 0 ? appearance39.micPerm : null, (261631 & 32) != 0 ? appearance39.cameraPerm : null, (261631 & 64) != 0 ? appearance39.notifications : null, (261631 & 128) != 0 ? appearance39.ringingMode : null, (261631 & 256) != 0 ? appearance39.camera : null, (261631 & 512) != 0 ? appearance39.isGsmBusy : false, (261631 & 1024) != 0 ? appearance39.network : null, (261631 & 2048) != 0 ? appearance39.connectionQuality : null, (261631 & 4096) != 0 ? appearance39.power : null, (261631 & 8192) != 0 ? appearance39.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance39.isMiui : false, (261631 & 32768) != 0 ? appearance39.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance39.config : null, (261631 & 131072) != 0 ? appearance39.stringResources : null), 7, null);
            } else if (iacStateCalculateNewState instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting11 = (IacState.InUse.Alive.Outgoing.Waiting) iacStateCalculateNewState;
                Appearance appearance40 = waiting11.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting11, null, null, appearance40.copy((261631 & 1) != 0 ? appearance40.callInits : P0.i(appearance40.getCallInits(), callId), (261631 & 2) != 0 ? appearance40.service : null, (261631 & 4) != 0 ? appearance40.screen : null, (261631 & 8) != 0 ? appearance40.app : null, (261631 & 16) != 0 ? appearance40.micPerm : null, (261631 & 32) != 0 ? appearance40.cameraPerm : null, (261631 & 64) != 0 ? appearance40.notifications : null, (261631 & 128) != 0 ? appearance40.ringingMode : null, (261631 & 256) != 0 ? appearance40.camera : null, (261631 & 512) != 0 ? appearance40.isGsmBusy : false, (261631 & 1024) != 0 ? appearance40.network : null, (261631 & 2048) != 0 ? appearance40.connectionQuality : null, (261631 & 4096) != 0 ? appearance40.power : null, (261631 & 8192) != 0 ? appearance40.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance40.isMiui : false, (261631 & 32768) != 0 ? appearance40.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance40.config : null, (261631 & 131072) != 0 ? appearance40.stringResources : null), 3, null);
            } else if (iacStateCalculateNewState instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting12 = (IacState.InUse.Alive.Incoming.Waiting) iacStateCalculateNewState;
                Appearance appearance41 = waiting12.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting12, null, null, appearance41.copy((261631 & 1) != 0 ? appearance41.callInits : P0.i(appearance41.getCallInits(), callId), (261631 & 2) != 0 ? appearance41.service : null, (261631 & 4) != 0 ? appearance41.screen : null, (261631 & 8) != 0 ? appearance41.app : null, (261631 & 16) != 0 ? appearance41.micPerm : null, (261631 & 32) != 0 ? appearance41.cameraPerm : null, (261631 & 64) != 0 ? appearance41.notifications : null, (261631 & 128) != 0 ? appearance41.ringingMode : null, (261631 & 256) != 0 ? appearance41.camera : null, (261631 & 512) != 0 ? appearance41.isGsmBusy : false, (261631 & 1024) != 0 ? appearance41.network : null, (261631 & 2048) != 0 ? appearance41.connectionQuality : null, (261631 & 4096) != 0 ? appearance41.power : null, (261631 & 8192) != 0 ? appearance41.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance41.isMiui : false, (261631 & 32768) != 0 ? appearance41.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance41.config : null, (261631 & 131072) != 0 ? appearance41.stringResources : null), 3, null);
            } else if (iacStateCalculateNewState instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving12 = (IacState.InUse.Alive.Incoming.Resolving) iacStateCalculateNewState;
                Appearance appearance42 = resolving12.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving12, null, null, null, appearance42.copy((261631 & 1) != 0 ? appearance42.callInits : P0.i(appearance42.getCallInits(), callId), (261631 & 2) != 0 ? appearance42.service : null, (261631 & 4) != 0 ? appearance42.screen : null, (261631 & 8) != 0 ? appearance42.app : null, (261631 & 16) != 0 ? appearance42.micPerm : null, (261631 & 32) != 0 ? appearance42.cameraPerm : null, (261631 & 64) != 0 ? appearance42.notifications : null, (261631 & 128) != 0 ? appearance42.ringingMode : null, (261631 & 256) != 0 ? appearance42.camera : null, (261631 & 512) != 0 ? appearance42.isGsmBusy : false, (261631 & 1024) != 0 ? appearance42.network : null, (261631 & 2048) != 0 ? appearance42.connectionQuality : null, (261631 & 4096) != 0 ? appearance42.power : null, (261631 & 8192) != 0 ? appearance42.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance42.isMiui : false, (261631 & 32768) != 0 ? appearance42.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance42.config : null, (261631 & 131072) != 0 ? appearance42.stringResources : null), 7, null);
            } else if (iacStateCalculateNewState instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting6 = (IacState.InUse.Alive.Incoming.Accepting) iacStateCalculateNewState;
                Appearance appearance43 = accepting6.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting6, null, null, appearance43.copy((261631 & 1) != 0 ? appearance43.callInits : P0.i(appearance43.getCallInits(), callId), (261631 & 2) != 0 ? appearance43.service : null, (261631 & 4) != 0 ? appearance43.screen : null, (261631 & 8) != 0 ? appearance43.app : null, (261631 & 16) != 0 ? appearance43.micPerm : null, (261631 & 32) != 0 ? appearance43.cameraPerm : null, (261631 & 64) != 0 ? appearance43.notifications : null, (261631 & 128) != 0 ? appearance43.ringingMode : null, (261631 & 256) != 0 ? appearance43.camera : null, (261631 & 512) != 0 ? appearance43.isGsmBusy : false, (261631 & 1024) != 0 ? appearance43.network : null, (261631 & 2048) != 0 ? appearance43.connectionQuality : null, (261631 & 4096) != 0 ? appearance43.power : null, (261631 & 8192) != 0 ? appearance43.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance43.isMiui : false, (261631 & 32768) != 0 ? appearance43.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance43.config : null, (261631 & 131072) != 0 ? appearance43.stringResources : null), 3, null);
            } else if (iacStateCalculateNewState instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking6 = (IacState.InUse.Alive.Talking) iacStateCalculateNewState;
                Appearance appearance44 = talking6.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking6, null, null, appearance44.copy((261631 & 1) != 0 ? appearance44.callInits : P0.i(appearance44.getCallInits(), callId), (261631 & 2) != 0 ? appearance44.service : null, (261631 & 4) != 0 ? appearance44.screen : null, (261631 & 8) != 0 ? appearance44.app : null, (261631 & 16) != 0 ? appearance44.micPerm : null, (261631 & 32) != 0 ? appearance44.cameraPerm : null, (261631 & 64) != 0 ? appearance44.notifications : null, (261631 & 128) != 0 ? appearance44.ringingMode : null, (261631 & 256) != 0 ? appearance44.camera : null, (261631 & 512) != 0 ? appearance44.isGsmBusy : false, (261631 & 1024) != 0 ? appearance44.network : null, (261631 & 2048) != 0 ? appearance44.connectionQuality : null, (261631 & 4096) != 0 ? appearance44.power : null, (261631 & 8192) != 0 ? appearance44.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance44.isMiui : false, (261631 & 32768) != 0 ? appearance44.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance44.config : null, (261631 & 131072) != 0 ? appearance44.stringResources : null), 3, null);
            } else {
                if (!(iacStateCalculateNewState instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished6 = (IacState.InUse.Finished) iacStateCalculateNewState;
                Appearance appearance45 = finished6.getAppearance();
                iacStateCopy$default = IacState.InUse.Finished.copy$default(finished6, null, null, appearance45.copy((261631 & 1) != 0 ? appearance45.callInits : P0.i(appearance45.getCallInits(), callId), (261631 & 2) != 0 ? appearance45.service : null, (261631 & 4) != 0 ? appearance45.screen : null, (261631 & 8) != 0 ? appearance45.app : null, (261631 & 16) != 0 ? appearance45.micPerm : null, (261631 & 32) != 0 ? appearance45.cameraPerm : null, (261631 & 64) != 0 ? appearance45.notifications : null, (261631 & 128) != 0 ? appearance45.ringingMode : null, (261631 & 256) != 0 ? appearance45.camera : null, (261631 & 512) != 0 ? appearance45.isGsmBusy : false, (261631 & 1024) != 0 ? appearance45.network : null, (261631 & 2048) != 0 ? appearance45.connectionQuality : null, (261631 & 4096) != 0 ? appearance45.power : null, (261631 & 8192) != 0 ? appearance45.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance45.isMiui : false, (261631 & 32768) != 0 ? appearance45.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance45.config : null, (261631 & 131072) != 0 ? appearance45.stringResources : null), 3, null);
            }
            if (iacStateCopy$default == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState");
            }
        } else {
            if (iacStateCalculateNewState instanceof IacState.Idle) {
                IacState.Idle idle6 = (IacState.Idle) iacStateCalculateNewState;
                Appearance appearance46 = idle6.getAppearance();
                iacStateCopy$default = IacState.Idle.copy$default(idle6, appearance46.copy((261631 & 1) != 0 ? appearance46.callInits : P0.l(appearance46.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance46.service : null, (261631 & 4) != 0 ? appearance46.screen : null, (261631 & 8) != 0 ? appearance46.app : null, (261631 & 16) != 0 ? appearance46.micPerm : null, (261631 & 32) != 0 ? appearance46.cameraPerm : null, (261631 & 64) != 0 ? appearance46.notifications : null, (261631 & 128) != 0 ? appearance46.ringingMode : null, (261631 & 256) != 0 ? appearance46.camera : null, (261631 & 512) != 0 ? appearance46.isGsmBusy : false, (261631 & 1024) != 0 ? appearance46.network : null, (261631 & 2048) != 0 ? appearance46.connectionQuality : null, (261631 & 4096) != 0 ? appearance46.power : null, (261631 & 8192) != 0 ? appearance46.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance46.isMiui : false, (261631 & 32768) != 0 ? appearance46.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance46.config : null, (261631 & 131072) != 0 ? appearance46.stringResources : null), null, 2, null);
            } else if (iacStateCalculateNewState instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching7 = (IacState.InUse.Alive.Outgoing.Launching) iacStateCalculateNewState;
                Appearance appearance47 = launching7.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching7, null, null, appearance47.copy((261631 & 1) != 0 ? appearance47.callInits : P0.l(appearance47.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance47.service : null, (261631 & 4) != 0 ? appearance47.screen : null, (261631 & 8) != 0 ? appearance47.app : null, (261631 & 16) != 0 ? appearance47.micPerm : null, (261631 & 32) != 0 ? appearance47.cameraPerm : null, (261631 & 64) != 0 ? appearance47.notifications : null, (261631 & 128) != 0 ? appearance47.ringingMode : null, (261631 & 256) != 0 ? appearance47.camera : null, (261631 & 512) != 0 ? appearance47.isGsmBusy : false, (261631 & 1024) != 0 ? appearance47.network : null, (261631 & 2048) != 0 ? appearance47.connectionQuality : null, (261631 & 4096) != 0 ? appearance47.power : null, (261631 & 8192) != 0 ? appearance47.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance47.isMiui : false, (261631 & 32768) != 0 ? appearance47.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance47.config : null, (261631 & 131072) != 0 ? appearance47.stringResources : null), 3, null);
            } else if (iacStateCalculateNewState instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving13 = (IacState.InUse.Alive.Outgoing.Resolving) iacStateCalculateNewState;
                Appearance appearance48 = resolving13.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving13, null, null, null, appearance48.copy((261631 & 1) != 0 ? appearance48.callInits : P0.l(appearance48.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance48.service : null, (261631 & 4) != 0 ? appearance48.screen : null, (261631 & 8) != 0 ? appearance48.app : null, (261631 & 16) != 0 ? appearance48.micPerm : null, (261631 & 32) != 0 ? appearance48.cameraPerm : null, (261631 & 64) != 0 ? appearance48.notifications : null, (261631 & 128) != 0 ? appearance48.ringingMode : null, (261631 & 256) != 0 ? appearance48.camera : null, (261631 & 512) != 0 ? appearance48.isGsmBusy : false, (261631 & 1024) != 0 ? appearance48.network : null, (261631 & 2048) != 0 ? appearance48.connectionQuality : null, (261631 & 4096) != 0 ? appearance48.power : null, (261631 & 8192) != 0 ? appearance48.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance48.isMiui : false, (261631 & 32768) != 0 ? appearance48.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance48.config : null, (261631 & 131072) != 0 ? appearance48.stringResources : null), 7, null);
            } else if (iacStateCalculateNewState instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting13 = (IacState.InUse.Alive.Outgoing.Waiting) iacStateCalculateNewState;
                Appearance appearance49 = waiting13.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting13, null, null, appearance49.copy((261631 & 1) != 0 ? appearance49.callInits : P0.l(appearance49.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance49.service : null, (261631 & 4) != 0 ? appearance49.screen : null, (261631 & 8) != 0 ? appearance49.app : null, (261631 & 16) != 0 ? appearance49.micPerm : null, (261631 & 32) != 0 ? appearance49.cameraPerm : null, (261631 & 64) != 0 ? appearance49.notifications : null, (261631 & 128) != 0 ? appearance49.ringingMode : null, (261631 & 256) != 0 ? appearance49.camera : null, (261631 & 512) != 0 ? appearance49.isGsmBusy : false, (261631 & 1024) != 0 ? appearance49.network : null, (261631 & 2048) != 0 ? appearance49.connectionQuality : null, (261631 & 4096) != 0 ? appearance49.power : null, (261631 & 8192) != 0 ? appearance49.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance49.isMiui : false, (261631 & 32768) != 0 ? appearance49.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance49.config : null, (261631 & 131072) != 0 ? appearance49.stringResources : null), 3, null);
            } else if (iacStateCalculateNewState instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting14 = (IacState.InUse.Alive.Incoming.Waiting) iacStateCalculateNewState;
                Appearance appearance50 = waiting14.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting14, null, null, appearance50.copy((261631 & 1) != 0 ? appearance50.callInits : P0.l(appearance50.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance50.service : null, (261631 & 4) != 0 ? appearance50.screen : null, (261631 & 8) != 0 ? appearance50.app : null, (261631 & 16) != 0 ? appearance50.micPerm : null, (261631 & 32) != 0 ? appearance50.cameraPerm : null, (261631 & 64) != 0 ? appearance50.notifications : null, (261631 & 128) != 0 ? appearance50.ringingMode : null, (261631 & 256) != 0 ? appearance50.camera : null, (261631 & 512) != 0 ? appearance50.isGsmBusy : false, (261631 & 1024) != 0 ? appearance50.network : null, (261631 & 2048) != 0 ? appearance50.connectionQuality : null, (261631 & 4096) != 0 ? appearance50.power : null, (261631 & 8192) != 0 ? appearance50.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance50.isMiui : false, (261631 & 32768) != 0 ? appearance50.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance50.config : null, (261631 & 131072) != 0 ? appearance50.stringResources : null), 3, null);
            } else if (iacStateCalculateNewState instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving14 = (IacState.InUse.Alive.Incoming.Resolving) iacStateCalculateNewState;
                Appearance appearance51 = resolving14.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving14, null, null, null, appearance51.copy((261631 & 1) != 0 ? appearance51.callInits : P0.l(appearance51.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance51.service : null, (261631 & 4) != 0 ? appearance51.screen : null, (261631 & 8) != 0 ? appearance51.app : null, (261631 & 16) != 0 ? appearance51.micPerm : null, (261631 & 32) != 0 ? appearance51.cameraPerm : null, (261631 & 64) != 0 ? appearance51.notifications : null, (261631 & 128) != 0 ? appearance51.ringingMode : null, (261631 & 256) != 0 ? appearance51.camera : null, (261631 & 512) != 0 ? appearance51.isGsmBusy : false, (261631 & 1024) != 0 ? appearance51.network : null, (261631 & 2048) != 0 ? appearance51.connectionQuality : null, (261631 & 4096) != 0 ? appearance51.power : null, (261631 & 8192) != 0 ? appearance51.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance51.isMiui : false, (261631 & 32768) != 0 ? appearance51.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance51.config : null, (261631 & 131072) != 0 ? appearance51.stringResources : null), 7, null);
            } else if (iacStateCalculateNewState instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting7 = (IacState.InUse.Alive.Incoming.Accepting) iacStateCalculateNewState;
                Appearance appearance52 = accepting7.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting7, null, null, appearance52.copy((261631 & 1) != 0 ? appearance52.callInits : P0.l(appearance52.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance52.service : null, (261631 & 4) != 0 ? appearance52.screen : null, (261631 & 8) != 0 ? appearance52.app : null, (261631 & 16) != 0 ? appearance52.micPerm : null, (261631 & 32) != 0 ? appearance52.cameraPerm : null, (261631 & 64) != 0 ? appearance52.notifications : null, (261631 & 128) != 0 ? appearance52.ringingMode : null, (261631 & 256) != 0 ? appearance52.camera : null, (261631 & 512) != 0 ? appearance52.isGsmBusy : false, (261631 & 1024) != 0 ? appearance52.network : null, (261631 & 2048) != 0 ? appearance52.connectionQuality : null, (261631 & 4096) != 0 ? appearance52.power : null, (261631 & 8192) != 0 ? appearance52.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance52.isMiui : false, (261631 & 32768) != 0 ? appearance52.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance52.config : null, (261631 & 131072) != 0 ? appearance52.stringResources : null), 3, null);
            } else if (iacStateCalculateNewState instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking7 = (IacState.InUse.Alive.Talking) iacStateCalculateNewState;
                Appearance appearance53 = talking7.getAppearance();
                iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking7, null, null, appearance53.copy((261631 & 1) != 0 ? appearance53.callInits : P0.l(appearance53.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance53.service : null, (261631 & 4) != 0 ? appearance53.screen : null, (261631 & 8) != 0 ? appearance53.app : null, (261631 & 16) != 0 ? appearance53.micPerm : null, (261631 & 32) != 0 ? appearance53.cameraPerm : null, (261631 & 64) != 0 ? appearance53.notifications : null, (261631 & 128) != 0 ? appearance53.ringingMode : null, (261631 & 256) != 0 ? appearance53.camera : null, (261631 & 512) != 0 ? appearance53.isGsmBusy : false, (261631 & 1024) != 0 ? appearance53.network : null, (261631 & 2048) != 0 ? appearance53.connectionQuality : null, (261631 & 4096) != 0 ? appearance53.power : null, (261631 & 8192) != 0 ? appearance53.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance53.isMiui : false, (261631 & 32768) != 0 ? appearance53.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance53.config : null, (261631 & 131072) != 0 ? appearance53.stringResources : null), 3, null);
            } else {
                if (!(iacStateCalculateNewState instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished7 = (IacState.InUse.Finished) iacStateCalculateNewState;
                Appearance appearance54 = finished7.getAppearance();
                iacStateCopy$default = IacState.InUse.Finished.copy$default(finished7, null, null, appearance54.copy((261631 & 1) != 0 ? appearance54.callInits : P0.l(appearance54.getCallInits(), m0.a(callId, callInitCopy$default)), (261631 & 2) != 0 ? appearance54.service : null, (261631 & 4) != 0 ? appearance54.screen : null, (261631 & 8) != 0 ? appearance54.app : null, (261631 & 16) != 0 ? appearance54.micPerm : null, (261631 & 32) != 0 ? appearance54.cameraPerm : null, (261631 & 64) != 0 ? appearance54.notifications : null, (261631 & 128) != 0 ? appearance54.ringingMode : null, (261631 & 256) != 0 ? appearance54.camera : null, (261631 & 512) != 0 ? appearance54.isGsmBusy : false, (261631 & 1024) != 0 ? appearance54.network : null, (261631 & 2048) != 0 ? appearance54.connectionQuality : null, (261631 & 4096) != 0 ? appearance54.power : null, (261631 & 8192) != 0 ? appearance54.storage : null, (261631 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? appearance54.isMiui : false, (261631 & 32768) != 0 ? appearance54.splitter : null, (261631 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? appearance54.config : null, (261631 & 131072) != 0 ? appearance54.stringResources : null), 3, null);
            }
            if (iacStateCopy$default == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState");
            }
        }
        if ((iacStateCopy$default instanceof IacState.InUse.Alive.Talking) && ((IacState.InUse.Alive.Talking) iacStateCopy$default).getCall().getLocalConnected()) {
            IacState.InUse inUse2 = (IacState.InUse) iacStateCopy$default;
            if (inUse2 instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching8 = (IacState.InUse.Alive.Outgoing.Launching) inUse2;
                CallParams params = launching8.getParams();
                iacStateCopy$default2 = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching8, null, params.copy((251 & 1) != 0 ? params.time : launching8.getParams().getTime().a(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params.wasScreenStarted : false, (251 & 4) != 0 ? params.hideControlsInVideo : false, (251 & 8) != 0 ? params.hideVpnToast : false, (251 & 16) != 0 ? params.dtmfOpened : false, (251 & 32) != 0 ? params.customParams : null, (251 & 64) != 0 ? params.analyticsExtraParams : null, (251 & 128) != 0 ? params.muteRingtone : false), null, 5, null);
            } else if (inUse2 instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving15 = (IacState.InUse.Alive.Outgoing.Resolving) inUse2;
                CallParams params2 = resolving15.getParams();
                iacStateCopy$default2 = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving15, null, null, params2.copy((251 & 1) != 0 ? params2.time : resolving15.getParams().getTime().a(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params2.wasScreenStarted : false, (251 & 4) != 0 ? params2.hideControlsInVideo : false, (251 & 8) != 0 ? params2.hideVpnToast : false, (251 & 16) != 0 ? params2.dtmfOpened : false, (251 & 32) != 0 ? params2.customParams : null, (251 & 64) != 0 ? params2.analyticsExtraParams : null, (251 & 128) != 0 ? params2.muteRingtone : false), null, 11, null);
            } else if (inUse2 instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting15 = (IacState.InUse.Alive.Outgoing.Waiting) inUse2;
                CallParams params3 = waiting15.getParams();
                iacStateCopy$default2 = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting15, null, params3.copy((251 & 1) != 0 ? params3.time : waiting15.getParams().getTime().a(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params3.wasScreenStarted : false, (251 & 4) != 0 ? params3.hideControlsInVideo : false, (251 & 8) != 0 ? params3.hideVpnToast : false, (251 & 16) != 0 ? params3.dtmfOpened : false, (251 & 32) != 0 ? params3.customParams : null, (251 & 64) != 0 ? params3.analyticsExtraParams : null, (251 & 128) != 0 ? params3.muteRingtone : false), null, 5, null);
            } else if (inUse2 instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting16 = (IacState.InUse.Alive.Incoming.Waiting) inUse2;
                CallParams params4 = waiting16.getParams();
                iacStateCopy$default2 = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting16, null, params4.copy((251 & 1) != 0 ? params4.time : waiting16.getParams().getTime().a(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params4.wasScreenStarted : false, (251 & 4) != 0 ? params4.hideControlsInVideo : false, (251 & 8) != 0 ? params4.hideVpnToast : false, (251 & 16) != 0 ? params4.dtmfOpened : false, (251 & 32) != 0 ? params4.customParams : null, (251 & 64) != 0 ? params4.analyticsExtraParams : null, (251 & 128) != 0 ? params4.muteRingtone : false), null, 5, null);
            } else if (inUse2 instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving16 = (IacState.InUse.Alive.Incoming.Resolving) inUse2;
                CallParams params5 = resolving16.getParams();
                iacStateCopy$default2 = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving16, null, null, params5.copy((251 & 1) != 0 ? params5.time : resolving16.getParams().getTime().a(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params5.wasScreenStarted : false, (251 & 4) != 0 ? params5.hideControlsInVideo : false, (251 & 8) != 0 ? params5.hideVpnToast : false, (251 & 16) != 0 ? params5.dtmfOpened : false, (251 & 32) != 0 ? params5.customParams : null, (251 & 64) != 0 ? params5.analyticsExtraParams : null, (251 & 128) != 0 ? params5.muteRingtone : false), null, 11, null);
            } else if (inUse2 instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting8 = (IacState.InUse.Alive.Incoming.Accepting) inUse2;
                CallParams params6 = accepting8.getParams();
                iacStateCopy$default2 = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting8, null, params6.copy((251 & 1) != 0 ? params6.time : accepting8.getParams().getTime().a(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params6.wasScreenStarted : false, (251 & 4) != 0 ? params6.hideControlsInVideo : false, (251 & 8) != 0 ? params6.hideVpnToast : false, (251 & 16) != 0 ? params6.dtmfOpened : false, (251 & 32) != 0 ? params6.customParams : null, (251 & 64) != 0 ? params6.analyticsExtraParams : null, (251 & 128) != 0 ? params6.muteRingtone : false), null, 5, null);
            } else if (inUse2 instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking8 = (IacState.InUse.Alive.Talking) inUse2;
                CallParams params7 = talking8.getParams();
                iacStateCopy$default2 = IacState.InUse.Alive.Talking.copy$default(talking8, null, params7.copy((251 & 1) != 0 ? params7.time : talking8.getParams().getTime().a(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params7.wasScreenStarted : false, (251 & 4) != 0 ? params7.hideControlsInVideo : false, (251 & 8) != 0 ? params7.hideVpnToast : false, (251 & 16) != 0 ? params7.dtmfOpened : false, (251 & 32) != 0 ? params7.customParams : null, (251 & 64) != 0 ? params7.analyticsExtraParams : null, (251 & 128) != 0 ? params7.muteRingtone : false), null, 5, null);
            } else {
                if (!(inUse2 instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished8 = (IacState.InUse.Finished) inUse2;
                CallParams params8 = finished8.getParams();
                iacStateCopy$default2 = IacState.InUse.Finished.copy$default(finished8, null, params8.copy((251 & 1) != 0 ? params8.time : finished8.getParams().getTime().a(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params8.wasScreenStarted : false, (251 & 4) != 0 ? params8.hideControlsInVideo : false, (251 & 8) != 0 ? params8.hideVpnToast : false, (251 & 16) != 0 ? params8.dtmfOpened : false, (251 & 32) != 0 ? params8.customParams : null, (251 & 64) != 0 ? params8.analyticsExtraParams : null, (251 & 128) != 0 ? params8.muteRingtone : false), null, 5, null);
            }
            if (iacStateCopy$default2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Talking");
            }
            iacStateCopy$default = (IacState.InUse.Alive.Talking) iacStateCopy$default2;
        }
        if (iacStateCopy$default instanceof IacState.InUse) {
            IacState.InUse inUse3 = (IacState.InUse) iacStateCopy$default;
            if (L.f(inUse3.getCall().getInvitingState(), InvitingState.Ringing.INSTANCE) && !inUse3.getParams().getTime().getF166852i()) {
                if (inUse3 instanceof IacState.InUse.Alive.Outgoing.Launching) {
                    IacState.InUse.Alive.Outgoing.Launching launching9 = (IacState.InUse.Alive.Outgoing.Launching) inUse3;
                    CallParams params9 = launching9.getParams();
                    iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching9, null, params9.copy((251 & 1) != 0 ? params9.time : launching9.getParams().getTime().d(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params9.wasScreenStarted : false, (251 & 4) != 0 ? params9.hideControlsInVideo : false, (251 & 8) != 0 ? params9.hideVpnToast : false, (251 & 16) != 0 ? params9.dtmfOpened : false, (251 & 32) != 0 ? params9.customParams : null, (251 & 64) != 0 ? params9.analyticsExtraParams : null, (251 & 128) != 0 ? params9.muteRingtone : false), null, 5, null);
                } else if (inUse3 instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                    IacState.InUse.Alive.Outgoing.Resolving resolving17 = (IacState.InUse.Alive.Outgoing.Resolving) inUse3;
                    CallParams params10 = resolving17.getParams();
                    iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving17, null, null, params10.copy((251 & 1) != 0 ? params10.time : resolving17.getParams().getTime().d(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params10.wasScreenStarted : false, (251 & 4) != 0 ? params10.hideControlsInVideo : false, (251 & 8) != 0 ? params10.hideVpnToast : false, (251 & 16) != 0 ? params10.dtmfOpened : false, (251 & 32) != 0 ? params10.customParams : null, (251 & 64) != 0 ? params10.analyticsExtraParams : null, (251 & 128) != 0 ? params10.muteRingtone : false), null, 11, null);
                } else if (inUse3 instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                    IacState.InUse.Alive.Outgoing.Waiting waiting17 = (IacState.InUse.Alive.Outgoing.Waiting) inUse3;
                    CallParams params11 = waiting17.getParams();
                    iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting17, null, params11.copy((251 & 1) != 0 ? params11.time : waiting17.getParams().getTime().d(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params11.wasScreenStarted : false, (251 & 4) != 0 ? params11.hideControlsInVideo : false, (251 & 8) != 0 ? params11.hideVpnToast : false, (251 & 16) != 0 ? params11.dtmfOpened : false, (251 & 32) != 0 ? params11.customParams : null, (251 & 64) != 0 ? params11.analyticsExtraParams : null, (251 & 128) != 0 ? params11.muteRingtone : false), null, 5, null);
                } else if (inUse3 instanceof IacState.InUse.Alive.Incoming.Waiting) {
                    IacState.InUse.Alive.Incoming.Waiting waiting18 = (IacState.InUse.Alive.Incoming.Waiting) inUse3;
                    CallParams params12 = waiting18.getParams();
                    iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting18, null, params12.copy((251 & 1) != 0 ? params12.time : waiting18.getParams().getTime().d(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params12.wasScreenStarted : false, (251 & 4) != 0 ? params12.hideControlsInVideo : false, (251 & 8) != 0 ? params12.hideVpnToast : false, (251 & 16) != 0 ? params12.dtmfOpened : false, (251 & 32) != 0 ? params12.customParams : null, (251 & 64) != 0 ? params12.analyticsExtraParams : null, (251 & 128) != 0 ? params12.muteRingtone : false), null, 5, null);
                } else if (inUse3 instanceof IacState.InUse.Alive.Incoming.Resolving) {
                    IacState.InUse.Alive.Incoming.Resolving resolving18 = (IacState.InUse.Alive.Incoming.Resolving) inUse3;
                    CallParams params13 = resolving18.getParams();
                    iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving18, null, null, params13.copy((251 & 1) != 0 ? params13.time : resolving18.getParams().getTime().d(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params13.wasScreenStarted : false, (251 & 4) != 0 ? params13.hideControlsInVideo : false, (251 & 8) != 0 ? params13.hideVpnToast : false, (251 & 16) != 0 ? params13.dtmfOpened : false, (251 & 32) != 0 ? params13.customParams : null, (251 & 64) != 0 ? params13.analyticsExtraParams : null, (251 & 128) != 0 ? params13.muteRingtone : false), null, 11, null);
                } else if (inUse3 instanceof IacState.InUse.Alive.Incoming.Accepting) {
                    IacState.InUse.Alive.Incoming.Accepting accepting9 = (IacState.InUse.Alive.Incoming.Accepting) inUse3;
                    CallParams params14 = accepting9.getParams();
                    iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting9, null, params14.copy((251 & 1) != 0 ? params14.time : accepting9.getParams().getTime().d(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params14.wasScreenStarted : false, (251 & 4) != 0 ? params14.hideControlsInVideo : false, (251 & 8) != 0 ? params14.hideVpnToast : false, (251 & 16) != 0 ? params14.dtmfOpened : false, (251 & 32) != 0 ? params14.customParams : null, (251 & 64) != 0 ? params14.analyticsExtraParams : null, (251 & 128) != 0 ? params14.muteRingtone : false), null, 5, null);
                } else if (inUse3 instanceof IacState.InUse.Alive.Talking) {
                    IacState.InUse.Alive.Talking talking9 = (IacState.InUse.Alive.Talking) inUse3;
                    CallParams params15 = talking9.getParams();
                    iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking9, null, params15.copy((251 & 1) != 0 ? params15.time : talking9.getParams().getTime().d(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params15.wasScreenStarted : false, (251 & 4) != 0 ? params15.hideControlsInVideo : false, (251 & 8) != 0 ? params15.hideVpnToast : false, (251 & 16) != 0 ? params15.dtmfOpened : false, (251 & 32) != 0 ? params15.customParams : null, (251 & 64) != 0 ? params15.analyticsExtraParams : null, (251 & 128) != 0 ? params15.muteRingtone : false), null, 5, null);
                } else {
                    if (!(inUse3 instanceof IacState.InUse.Finished)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IacState.InUse.Finished finished9 = (IacState.InUse.Finished) inUse3;
                    CallParams params16 = finished9.getParams();
                    iacStateCopy$default = IacState.InUse.Finished.copy$default(finished9, null, params16.copy((251 & 1) != 0 ? params16.time : finished9.getParams().getTime().d(iacActionProcessing.getCurrentTime()), (251 & 2) != 0 ? params16.wasScreenStarted : false, (251 & 4) != 0 ? params16.hideControlsInVideo : false, (251 & 8) != 0 ? params16.hideVpnToast : false, (251 & 16) != 0 ? params16.dtmfOpened : false, (251 & 32) != 0 ? params16.customParams : null, (251 & 64) != 0 ? params16.analyticsExtraParams : null, (251 & 128) != 0 ? params16.muteRingtone : false), null, 5, null);
                }
                if (iacStateCopy$default == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse");
                }
            }
        }
        iacActionProcessing.plusAssign(out3, iacStateCopy$default);
    }

    @k
    public String toString() {
        return "OnAvCallsCallStateChangedAction(newCallState=" + this.newCallState + ')';
    }
}
