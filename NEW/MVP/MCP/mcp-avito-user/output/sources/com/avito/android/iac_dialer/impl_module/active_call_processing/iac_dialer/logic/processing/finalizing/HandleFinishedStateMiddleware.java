package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.finalizing;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewarePayload;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReason;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.u;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.CallParams;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.final_link.IacFinalLinkInteractor;
import com.avito.android.iac_dialer_models.abstract_module.IacCallTime;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import dL.d;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: HandleFinishedStateMiddleware.kt */
@P
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/finalizing/HandleFinishedStateMiddleware;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareDistinctBy;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/finalizing/HandleFinishedStateMiddleware$Payload;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", VoiceInfo.STATE, "getPayloadFromState", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/finalizing/HandleFinishedStateMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "oldPayload", "newPayload", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/finalizing/HandleFinishedStateMiddleware$Payload;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/finalizing/HandleFinishedStateMiddleware$Payload;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Action", "Payload", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final /* data */ class HandleFinishedStateMiddleware implements IacMiddlewareDistinctBy<Payload> {
    public static final int $stable = 0;

    @k
    public static final HandleFinishedStateMiddleware INSTANCE = new HandleFinishedStateMiddleware();

    /* compiled from: HandleFinishedStateMiddleware.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/finalizing/HandleFinishedStateMiddleware$Action;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Finished;", VoiceInfo.STATE, "Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "resolveFinishReason", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Finished;)Lcom/avito/android/iac_dialer/impl_module/final_link/IacFinalLinkInteractor$FinishReason;", "", "toString", "()Ljava/lang/String;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "name", "Ljava/lang/String;", "getName", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements IacAction {
        public static final int $stable = 0;

        @k
        public static final Action INSTANCE = new Action();

        @k
        private static final String name = "HandleFinishedStateMiddleware.Action";

        private Action() {
        }

        private final IacFinalLinkInteractor.FinishReason resolveFinishReason(IacState.InUse.Finished state) {
            d invitingState = state.getCall().getInvitingState();
            u uVar = invitingState instanceof u ? (u) invitingState : null;
            if (uVar == null) {
                return IacFinalLinkInteractor.FinishReason.Error.INSTANCE;
            }
            TerminateReason reason = uVar.getReason();
            if (L.f(reason, TerminateReason.AnswerTimeout.INSTANCE)) {
                return IacFinalLinkInteractor.FinishReason.TimeoutAnswer.INSTANCE;
            }
            if (L.f(reason, TerminateReason.ConnectTimeout.INSTANCE)) {
                return IacFinalLinkInteractor.FinishReason.TimeoutConnect.INSTANCE;
            }
            if (L.f(reason, TerminateReason.Busy.INSTANCE)) {
                return IacFinalLinkInteractor.FinishReason.BusyByIac.INSTANCE;
            }
            if (L.f(reason, TerminateReason.Hangup.INSTANCE)) {
                return uVar.isLocally() ? IacFinalLinkInteractor.FinishReason.HangupByLocal.INSTANCE : IacFinalLinkInteractor.FinishReason.HangupByPeer.INSTANCE;
            }
            if (L.f(reason, TerminateReason.InternalError.INSTANCE)) {
                return IacFinalLinkInteractor.FinishReason.Error.INSTANCE;
            }
            if (L.f(reason, TerminateReason.NoMicAccess.INSTANCE)) {
                return IacFinalLinkInteractor.FinishReason.NoMicAccess.INSTANCE;
            }
            if (L.f(reason, TerminateReason.Reject.INSTANCE)) {
                return IacFinalLinkInteractor.FinishReason.Reject.INSTANCE;
            }
            if (L.f(reason, TerminateReason.ServerError.INSTANCE)) {
                return IacFinalLinkInteractor.FinishReason.Error.INSTANCE;
            }
            if (reason instanceof TerminateReason.Unknown) {
                return new IacFinalLinkInteractor.FinishReason.Unknown(((TerminateReason.Unknown) reason).getReason());
            }
            throw new NoWhenBranchMatchedException();
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Action);
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
        @k
        public String getName() {
            return name;
        }

        public int hashCode() {
            return 1422945410;
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
        public void process(@k IacActionProcessing iacActionProcessing) {
            IacState iacStateCopy$default;
            CallState call;
            Long lValueOf = null;
            if (!(iacActionProcessing.getState() instanceof IacState.InUse.Finished) || ((IacState.InUse.Finished) iacActionProcessing.getState()).getParams().getTime().f166854k) {
                f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
                return;
            }
            IacCallTime time = ((IacState.InUse.Finished) iacActionProcessing.getState()).getParams().getTime();
            long currentTime = iacActionProcessing.getCurrentTime();
            if (!time.f166854k) {
                time = IacCallTime.b(time, 0L, 0L, 0L, currentTime, 31);
            }
            IacCallTime iacCallTime = time;
            IacActionOutput out = iacActionProcessing.getOut();
            String callId = ((IacState.InUse.Finished) iacActionProcessing.getState()).getCallId();
            Boolean boolValueOf = Boolean.valueOf(((IacState.InUse.Finished) iacActionProcessing.getState()).getParams().getTime().f166851h);
            if (iacCallTime.f166853j && iacCallTime.f166854k) {
                lValueOf = Long.valueOf(iacCallTime.f166850g - iacCallTime.f166849f);
            }
            Long l12 = lValueOf;
            IacFinalLinkInteractor.FinishReason finishReasonResolveFinishReason = resolveFinishReason((IacState.InUse.Finished) iacActionProcessing.getState());
            IacState.InUse inUseAsInUse = iacActionProcessing.getState().asInUse();
            iacActionProcessing.plusAssign(out, new IacEvent.Finalizing.ResolveFinalLink(new IacFinalLinkInteractor.Params(callId, boolValueOf, l12, finishReasonResolveFinishReason, (inUseAsInUse == null || (call = inUseAsInUse.getCall()) == null || !call.getWasRingingReceived()) ? false : true, ((IacState.InUse.Finished) iacActionProcessing.getState()).getParams().getCustomParams(), iacActionProcessing.getState().getAppearance().getMicPerm().b(), iacActionProcessing.getState().getAppearance().getMicPerm().a(), iacActionProcessing.getState().getAppearance().getCameraPerm().b(), iacActionProcessing.getState().getAppearance().getCameraPerm().a())));
            IacActionOutput out2 = iacActionProcessing.getOut();
            IacState.InUse inUse = (IacState.InUse) iacActionProcessing.getState();
            if (inUse instanceof IacState.InUse.Alive.Outgoing.Launching) {
                IacState.InUse.Alive.Outgoing.Launching launching = (IacState.InUse.Alive.Outgoing.Launching) inUse;
                CallParams params = launching.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching, null, params.copy((251 & 1) != 0 ? params.time : iacCallTime, (251 & 2) != 0 ? params.wasScreenStarted : false, (251 & 4) != 0 ? params.hideControlsInVideo : false, (251 & 8) != 0 ? params.hideVpnToast : false, (251 & 16) != 0 ? params.dtmfOpened : false, (251 & 32) != 0 ? params.customParams : null, (251 & 64) != 0 ? params.analyticsExtraParams : null, (251 & 128) != 0 ? params.muteRingtone : false), null, 5, null);
            } else if (inUse instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) inUse;
                CallParams params2 = resolving.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving, null, null, params2.copy((251 & 1) != 0 ? params2.time : iacCallTime, (251 & 2) != 0 ? params2.wasScreenStarted : false, (251 & 4) != 0 ? params2.hideControlsInVideo : false, (251 & 8) != 0 ? params2.hideVpnToast : false, (251 & 16) != 0 ? params2.dtmfOpened : false, (251 & 32) != 0 ? params2.customParams : null, (251 & 64) != 0 ? params2.analyticsExtraParams : null, (251 & 128) != 0 ? params2.muteRingtone : false), null, 11, null);
            } else if (inUse instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                IacState.InUse.Alive.Outgoing.Waiting waiting = (IacState.InUse.Alive.Outgoing.Waiting) inUse;
                CallParams params3 = waiting.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting, null, params3.copy((251 & 1) != 0 ? params3.time : iacCallTime, (251 & 2) != 0 ? params3.wasScreenStarted : false, (251 & 4) != 0 ? params3.hideControlsInVideo : false, (251 & 8) != 0 ? params3.hideVpnToast : false, (251 & 16) != 0 ? params3.dtmfOpened : false, (251 & 32) != 0 ? params3.customParams : null, (251 & 64) != 0 ? params3.analyticsExtraParams : null, (251 & 128) != 0 ? params3.muteRingtone : false), null, 5, null);
            } else if (inUse instanceof IacState.InUse.Alive.Incoming.Waiting) {
                IacState.InUse.Alive.Incoming.Waiting waiting2 = (IacState.InUse.Alive.Incoming.Waiting) inUse;
                CallParams params4 = waiting2.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting2, null, params4.copy((251 & 1) != 0 ? params4.time : iacCallTime, (251 & 2) != 0 ? params4.wasScreenStarted : false, (251 & 4) != 0 ? params4.hideControlsInVideo : false, (251 & 8) != 0 ? params4.hideVpnToast : false, (251 & 16) != 0 ? params4.dtmfOpened : false, (251 & 32) != 0 ? params4.customParams : null, (251 & 64) != 0 ? params4.analyticsExtraParams : null, (251 & 128) != 0 ? params4.muteRingtone : false), null, 5, null);
            } else if (inUse instanceof IacState.InUse.Alive.Incoming.Resolving) {
                IacState.InUse.Alive.Incoming.Resolving resolving2 = (IacState.InUse.Alive.Incoming.Resolving) inUse;
                CallParams params5 = resolving2.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving2, null, null, params5.copy((251 & 1) != 0 ? params5.time : iacCallTime, (251 & 2) != 0 ? params5.wasScreenStarted : false, (251 & 4) != 0 ? params5.hideControlsInVideo : false, (251 & 8) != 0 ? params5.hideVpnToast : false, (251 & 16) != 0 ? params5.dtmfOpened : false, (251 & 32) != 0 ? params5.customParams : null, (251 & 64) != 0 ? params5.analyticsExtraParams : null, (251 & 128) != 0 ? params5.muteRingtone : false), null, 11, null);
            } else if (inUse instanceof IacState.InUse.Alive.Incoming.Accepting) {
                IacState.InUse.Alive.Incoming.Accepting accepting = (IacState.InUse.Alive.Incoming.Accepting) inUse;
                CallParams params6 = accepting.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting, null, params6.copy((251 & 1) != 0 ? params6.time : iacCallTime, (251 & 2) != 0 ? params6.wasScreenStarted : false, (251 & 4) != 0 ? params6.hideControlsInVideo : false, (251 & 8) != 0 ? params6.hideVpnToast : false, (251 & 16) != 0 ? params6.dtmfOpened : false, (251 & 32) != 0 ? params6.customParams : null, (251 & 64) != 0 ? params6.analyticsExtraParams : null, (251 & 128) != 0 ? params6.muteRingtone : false), null, 5, null);
            } else if (inUse instanceof IacState.InUse.Alive.Talking) {
                IacState.InUse.Alive.Talking talking = (IacState.InUse.Alive.Talking) inUse;
                CallParams params7 = talking.getParams();
                iacStateCopy$default = IacState.InUse.Alive.Talking.copy$default(talking, null, params7.copy((251 & 1) != 0 ? params7.time : iacCallTime, (251 & 2) != 0 ? params7.wasScreenStarted : false, (251 & 4) != 0 ? params7.hideControlsInVideo : false, (251 & 8) != 0 ? params7.hideVpnToast : false, (251 & 16) != 0 ? params7.dtmfOpened : false, (251 & 32) != 0 ? params7.customParams : null, (251 & 64) != 0 ? params7.analyticsExtraParams : null, (251 & 128) != 0 ? params7.muteRingtone : false), null, 5, null);
            } else {
                if (!(inUse instanceof IacState.InUse.Finished)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse.Finished finished = (IacState.InUse.Finished) inUse;
                CallParams params8 = finished.getParams();
                iacStateCopy$default = IacState.InUse.Finished.copy$default(finished, null, params8.copy((251 & 1) != 0 ? params8.time : iacCallTime, (251 & 2) != 0 ? params8.wasScreenStarted : false, (251 & 4) != 0 ? params8.hideControlsInVideo : false, (251 & 8) != 0 ? params8.hideVpnToast : false, (251 & 16) != 0 ? params8.dtmfOpened : false, (251 & 32) != 0 ? params8.customParams : null, (251 & 64) != 0 ? params8.analyticsExtraParams : null, (251 & 128) != 0 ? params8.muteRingtone : false), null, 5, null);
            }
            if (iacStateCopy$default == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Finished");
            }
            iacActionProcessing.plusAssign(out2, (IacState.InUse.Finished) iacStateCopy$default);
        }

        @k
        public String toString() {
            return getName();
        }
    }

    /* compiled from: HandleFinishedStateMiddleware.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/finalizing/HandleFinishedStateMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;", "shouldStartLoadingFinalLink", "", "(Z)V", "getShouldStartLoadingFinalLink", "()Z", "component1", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload implements IacMiddlewarePayload {
        public static final int $stable = 0;
        private final boolean shouldStartLoadingFinalLink;

        public Payload(boolean z12) {
            this.shouldStartLoadingFinalLink = z12;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = payload.shouldStartLoadingFinalLink;
            }
            return payload.copy(z12);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShouldStartLoadingFinalLink() {
            return this.shouldStartLoadingFinalLink;
        }

        @k
        public final Payload copy(boolean shouldStartLoadingFinalLink) {
            return new Payload(shouldStartLoadingFinalLink);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Payload) && this.shouldStartLoadingFinalLink == ((Payload) other).shouldStartLoadingFinalLink;
        }

        public final boolean getShouldStartLoadingFinalLink() {
            return this.shouldStartLoadingFinalLink;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldStartLoadingFinalLink);
        }

        @k
        public String toString() {
            return r.x(new StringBuilder("Payload(shouldStartLoadingFinalLink="), this.shouldStartLoadingFinalLink, ')');
        }
    }

    private HandleFinishedStateMiddleware() {
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof HandleFinishedStateMiddleware);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return -594635454;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing) {
        IacMiddlewareDistinctBy.a.a(this, iacMiddlewareProcessing);
    }

    @k
    public String toString() {
        return "HandleFinishedStateMiddleware";
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    @k
    public Payload getPayloadFromState(@k IacState state) {
        return new Payload((state instanceof IacState.InUse.Finished) && !((IacState.InUse.Finished) state).getParams().getTime().f166854k);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing, @k Payload payload, @k Payload payload2) {
        if (payload2.getShouldStartLoadingFinalLink()) {
            iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), Action.INSTANCE);
        }
    }
}
