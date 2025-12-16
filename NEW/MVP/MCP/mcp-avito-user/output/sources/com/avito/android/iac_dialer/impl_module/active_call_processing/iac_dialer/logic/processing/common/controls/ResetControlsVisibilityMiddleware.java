package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.controls;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionOutput;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewarePayload;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.e;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.CallParams;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: ResetControlsVisibilityMiddleware.kt */
@P
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/controls/ResetControlsVisibilityMiddleware;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareDistinctBy;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/controls/ResetControlsVisibilityMiddleware$Payload;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", VoiceInfo.STATE, "getPayloadFromState", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/controls/ResetControlsVisibilityMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "oldPayload", "newPayload", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/controls/ResetControlsVisibilityMiddleware$Payload;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/controls/ResetControlsVisibilityMiddleware$Payload;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Action", "Payload", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final /* data */ class ResetControlsVisibilityMiddleware implements IacMiddlewareDistinctBy<Payload> {
    public static final int $stable = 0;

    @k
    public static final ResetControlsVisibilityMiddleware INSTANCE = new ResetControlsVisibilityMiddleware();

    /* compiled from: ResetControlsVisibilityMiddleware.kt */
    @P
    @s0
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/controls/ResetControlsVisibilityMiddleware$Action;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "name", "Ljava/lang/String;", "getName", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements IacAction {
        public static final int $stable = 0;

        @k
        public static final Action INSTANCE = new Action();

        @k
        private static final String name = "ResetControlsVisibilityMiddleware.Action";

        private Action() {
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
            return 1981772732;
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
        public void process(@k IacActionProcessing iacActionProcessing) {
            IacActionOutput out = iacActionProcessing.getOut();
            IacState state = iacActionProcessing.getState();
            if (!(state instanceof IacState.Idle)) {
                if (!(state instanceof IacState.InUse)) {
                    throw new NoWhenBranchMatchedException();
                }
                IacState.InUse inUse = (IacState.InUse) state;
                if (inUse instanceof IacState.InUse.Alive.Outgoing.Launching) {
                    IacState.InUse.Alive.Outgoing.Launching launching = (IacState.InUse.Alive.Outgoing.Launching) inUse;
                    CallParams params = launching.getParams();
                    state = IacState.InUse.Alive.Outgoing.Launching.copy$default(launching, null, params.copy((251 & 1) != 0 ? params.time : null, (251 & 2) != 0 ? params.wasScreenStarted : false, (251 & 4) != 0 ? params.hideControlsInVideo : false, (251 & 8) != 0 ? params.hideVpnToast : false, (251 & 16) != 0 ? params.dtmfOpened : false, (251 & 32) != 0 ? params.customParams : null, (251 & 64) != 0 ? params.analyticsExtraParams : null, (251 & 128) != 0 ? params.muteRingtone : false), null, 5, null);
                } else if (inUse instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                    IacState.InUse.Alive.Outgoing.Resolving resolving = (IacState.InUse.Alive.Outgoing.Resolving) inUse;
                    CallParams params2 = resolving.getParams();
                    state = IacState.InUse.Alive.Outgoing.Resolving.copy$default(resolving, null, null, params2.copy((251 & 1) != 0 ? params2.time : null, (251 & 2) != 0 ? params2.wasScreenStarted : false, (251 & 4) != 0 ? params2.hideControlsInVideo : false, (251 & 8) != 0 ? params2.hideVpnToast : false, (251 & 16) != 0 ? params2.dtmfOpened : false, (251 & 32) != 0 ? params2.customParams : null, (251 & 64) != 0 ? params2.analyticsExtraParams : null, (251 & 128) != 0 ? params2.muteRingtone : false), null, 11, null);
                } else if (inUse instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                    IacState.InUse.Alive.Outgoing.Waiting waiting = (IacState.InUse.Alive.Outgoing.Waiting) inUse;
                    CallParams params3 = waiting.getParams();
                    state = IacState.InUse.Alive.Outgoing.Waiting.copy$default(waiting, null, params3.copy((251 & 1) != 0 ? params3.time : null, (251 & 2) != 0 ? params3.wasScreenStarted : false, (251 & 4) != 0 ? params3.hideControlsInVideo : false, (251 & 8) != 0 ? params3.hideVpnToast : false, (251 & 16) != 0 ? params3.dtmfOpened : false, (251 & 32) != 0 ? params3.customParams : null, (251 & 64) != 0 ? params3.analyticsExtraParams : null, (251 & 128) != 0 ? params3.muteRingtone : false), null, 5, null);
                } else if (inUse instanceof IacState.InUse.Alive.Incoming.Waiting) {
                    IacState.InUse.Alive.Incoming.Waiting waiting2 = (IacState.InUse.Alive.Incoming.Waiting) inUse;
                    CallParams params4 = waiting2.getParams();
                    state = IacState.InUse.Alive.Incoming.Waiting.copy$default(waiting2, null, params4.copy((251 & 1) != 0 ? params4.time : null, (251 & 2) != 0 ? params4.wasScreenStarted : false, (251 & 4) != 0 ? params4.hideControlsInVideo : false, (251 & 8) != 0 ? params4.hideVpnToast : false, (251 & 16) != 0 ? params4.dtmfOpened : false, (251 & 32) != 0 ? params4.customParams : null, (251 & 64) != 0 ? params4.analyticsExtraParams : null, (251 & 128) != 0 ? params4.muteRingtone : false), null, 5, null);
                } else if (inUse instanceof IacState.InUse.Alive.Incoming.Resolving) {
                    IacState.InUse.Alive.Incoming.Resolving resolving2 = (IacState.InUse.Alive.Incoming.Resolving) inUse;
                    CallParams params5 = resolving2.getParams();
                    state = IacState.InUse.Alive.Incoming.Resolving.copy$default(resolving2, null, null, params5.copy((251 & 1) != 0 ? params5.time : null, (251 & 2) != 0 ? params5.wasScreenStarted : false, (251 & 4) != 0 ? params5.hideControlsInVideo : false, (251 & 8) != 0 ? params5.hideVpnToast : false, (251 & 16) != 0 ? params5.dtmfOpened : false, (251 & 32) != 0 ? params5.customParams : null, (251 & 64) != 0 ? params5.analyticsExtraParams : null, (251 & 128) != 0 ? params5.muteRingtone : false), null, 11, null);
                } else if (inUse instanceof IacState.InUse.Alive.Incoming.Accepting) {
                    IacState.InUse.Alive.Incoming.Accepting accepting = (IacState.InUse.Alive.Incoming.Accepting) inUse;
                    CallParams params6 = accepting.getParams();
                    state = IacState.InUse.Alive.Incoming.Accepting.copy$default(accepting, null, params6.copy((251 & 1) != 0 ? params6.time : null, (251 & 2) != 0 ? params6.wasScreenStarted : false, (251 & 4) != 0 ? params6.hideControlsInVideo : false, (251 & 8) != 0 ? params6.hideVpnToast : false, (251 & 16) != 0 ? params6.dtmfOpened : false, (251 & 32) != 0 ? params6.customParams : null, (251 & 64) != 0 ? params6.analyticsExtraParams : null, (251 & 128) != 0 ? params6.muteRingtone : false), null, 5, null);
                } else if (inUse instanceof IacState.InUse.Alive.Talking) {
                    IacState.InUse.Alive.Talking talking = (IacState.InUse.Alive.Talking) inUse;
                    CallParams params7 = talking.getParams();
                    state = IacState.InUse.Alive.Talking.copy$default(talking, null, params7.copy((251 & 1) != 0 ? params7.time : null, (251 & 2) != 0 ? params7.wasScreenStarted : false, (251 & 4) != 0 ? params7.hideControlsInVideo : false, (251 & 8) != 0 ? params7.hideVpnToast : false, (251 & 16) != 0 ? params7.dtmfOpened : false, (251 & 32) != 0 ? params7.customParams : null, (251 & 64) != 0 ? params7.analyticsExtraParams : null, (251 & 128) != 0 ? params7.muteRingtone : false), null, 5, null);
                } else {
                    if (!(inUse instanceof IacState.InUse.Finished)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IacState.InUse.Finished finished = (IacState.InUse.Finished) inUse;
                    CallParams params8 = finished.getParams();
                    state = IacState.InUse.Finished.copy$default(finished, null, params8.copy((251 & 1) != 0 ? params8.time : null, (251 & 2) != 0 ? params8.wasScreenStarted : false, (251 & 4) != 0 ? params8.hideControlsInVideo : false, (251 & 8) != 0 ? params8.hideVpnToast : false, (251 & 16) != 0 ? params8.dtmfOpened : false, (251 & 32) != 0 ? params8.customParams : null, (251 & 64) != 0 ? params8.analyticsExtraParams : null, (251 & 128) != 0 ? params8.muteRingtone : false), null, 5, null);
                }
                if (state == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse");
                }
            }
            iacActionProcessing.plusAssign(out, state);
        }

        @k
        public String toString() {
            return getName();
        }
    }

    /* compiled from: ResetControlsVisibilityMiddleware.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/controls/ResetControlsVisibilityMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;", "shouldReset", "", "(Z)V", "getShouldReset", "()Z", "component1", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload implements IacMiddlewarePayload {
        public static final int $stable = 0;
        private final boolean shouldReset;

        public Payload(boolean z12) {
            this.shouldReset = z12;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = payload.shouldReset;
            }
            return payload.copy(z12);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShouldReset() {
            return this.shouldReset;
        }

        @k
        public final Payload copy(boolean shouldReset) {
            return new Payload(shouldReset);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Payload) && this.shouldReset == ((Payload) other).shouldReset;
        }

        public final boolean getShouldReset() {
            return this.shouldReset;
        }

        public int hashCode() {
            return Boolean.hashCode(this.shouldReset);
        }

        @k
        public String toString() {
            return r.x(new StringBuilder("Payload(shouldReset="), this.shouldReset, ')');
        }
    }

    private ResetControlsVisibilityMiddleware() {
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof ResetControlsVisibilityMiddleware);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return -1574184120;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing) {
        IacMiddlewareDistinctBy.a.a(this, iacMiddlewareProcessing);
    }

    @k
    public String toString() {
        return "ResetControlsVisibilityMiddleware";
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    @k
    public Payload getPayloadFromState(@k IacState state) {
        return new Payload((state instanceof IacState.InUse.Alive) && !e.a(state) && ((IacState.InUse.Alive) state).getParams().getHideControlsInVideo());
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing, @k Payload payload, @k Payload payload2) {
        if (payload2.getShouldReset()) {
            iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), Action.INSTANCE);
        }
    }
}
