package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting.active_fallback;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewarePayload;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.timer_interactor.IacTimerInteractor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.huawei.hms.api.FailedBinderCallBack;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StartActiveFallbackTimerMiddleware.kt */
@P
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/active_fallback/StartActiveFallbackTimerMiddleware;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareDistinctBy;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/active_fallback/StartActiveFallbackTimerMiddleware$Payload;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", VoiceInfo.STATE, "getPayloadFromState", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/active_fallback/StartActiveFallbackTimerMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "oldPayload", "newPayload", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/active_fallback/StartActiveFallbackTimerMiddleware$Payload;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/active_fallback/StartActiveFallbackTimerMiddleware$Payload;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "PAUSE", "J", "Payload", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final /* data */ class StartActiveFallbackTimerMiddleware implements IacMiddlewareDistinctBy<Payload> {
    public static final int $stable = 0;

    @k
    public static final StartActiveFallbackTimerMiddleware INSTANCE = new StartActiveFallbackTimerMiddleware();
    private static final long PAUSE = 8000;

    /* compiled from: StartActiveFallbackTimerMiddleware.kt */
    @P
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/outgoing/waiting/active_fallback/StartActiveFallbackTimerMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "shouldStartActiveFallbackDialogTimer", "", "(Ljava/lang/String;Z)V", "getCallId", "()Ljava/lang/String;", "getShouldStartActiveFallbackDialogTimer", "()Z", "component1", "component2", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload implements IacMiddlewarePayload {
        public static final int $stable = 0;

        @l
        private final String callId;
        private final boolean shouldStartActiveFallbackDialogTimer;

        public Payload(@l String str, boolean z12) {
            this.callId = str;
            this.shouldStartActiveFallbackDialogTimer = z12;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, String str, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = payload.callId;
            }
            if ((i12 & 2) != 0) {
                z12 = payload.shouldStartActiveFallbackDialogTimer;
            }
            return payload.copy(str, z12);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldStartActiveFallbackDialogTimer() {
            return this.shouldStartActiveFallbackDialogTimer;
        }

        @k
        public final Payload copy(@l String callId, boolean shouldStartActiveFallbackDialogTimer) {
            return new Payload(callId, shouldStartActiveFallbackDialogTimer);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) other;
            return L.f(this.callId, payload.callId) && this.shouldStartActiveFallbackDialogTimer == payload.shouldStartActiveFallbackDialogTimer;
        }

        @l
        public final String getCallId() {
            return this.callId;
        }

        public final boolean getShouldStartActiveFallbackDialogTimer() {
            return this.shouldStartActiveFallbackDialogTimer;
        }

        public int hashCode() {
            String str = this.callId;
            return Boolean.hashCode(this.shouldStartActiveFallbackDialogTimer) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Payload(callId=");
            sb2.append(this.callId);
            sb2.append(", shouldStartActiveFallbackDialogTimer=");
            return r.x(sb2, this.shouldStartActiveFallbackDialogTimer, ')');
        }
    }

    private StartActiveFallbackTimerMiddleware() {
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof StartActiveFallbackTimerMiddleware);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return 1578597623;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing) {
        IacMiddlewareDistinctBy.a.a(this, iacMiddlewareProcessing);
    }

    @k
    public String toString() {
        return "StartActiveFallbackTimerMiddleware";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting.active_fallback.StartActiveFallbackTimerMiddleware.Payload getPayloadFromState(@Y61.k com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Outgoing.Waiting
            if (r0 == 0) goto L27
            r0 = r4
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState$InUse$Alive$Outgoing$Waiting r0 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Outgoing.Waiting) r0
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallState r1 = r0.getCall()
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.InvitingState r1 = r1.getInvitingState()
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.InvitingState$Ringing r2 = com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.InvitingState.Ringing.INSTANCE
            int r1 = r1.compareTo(r2)
            if (r1 < 0) goto L27
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallState r0 = r0.getCall()
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallMeta r0 = r0.getMeta()
            com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink r0 = r0.getGsmLink()
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState$InUse r4 = r4.asInUse()
            if (r4 == 0) goto L33
            java.lang.String r4 = r4.getCallId()
            goto L34
        L33:
            r4 = 0
        L34:
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting.active_fallback.StartActiveFallbackTimerMiddleware$Payload r1 = new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting.active_fallback.StartActiveFallbackTimerMiddleware$Payload
            r1.<init>(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting.active_fallback.StartActiveFallbackTimerMiddleware.getPayloadFromState(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState):com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.waiting.active_fallback.StartActiveFallbackTimerMiddleware$Payload");
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing, @k Payload payload, @k Payload payload2) {
        if (payload2.getCallId() == null || !payload2.getShouldStartActiveFallbackDialogTimer()) {
            return;
        }
        iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), new IacEvent.TimerInteractor.StartTimer(new IacTimerInteractor.Timer.ActiveFallbackDialogPause(PAUSE, payload2.getCallId())));
    }
}
