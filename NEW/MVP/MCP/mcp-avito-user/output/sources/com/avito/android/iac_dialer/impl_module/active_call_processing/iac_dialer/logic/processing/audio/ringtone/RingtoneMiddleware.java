package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.ringtone;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewarePayload;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.e;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RingtoneMiddleware.kt */
@P
@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/ringtone/RingtoneMiddleware;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareDistinctBy;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/ringtone/RingtoneMiddleware$Payload;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", VoiceInfo.STATE, "getPayloadFromState", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/ringtone/RingtoneMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "oldPayload", "newPayload", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/ringtone/RingtoneMiddleware$Payload;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/ringtone/RingtoneMiddleware$Payload;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Payload", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final /* data */ class RingtoneMiddleware implements IacMiddlewareDistinctBy<Payload> {
    public static final int $stable = 0;

    @k
    public static final RingtoneMiddleware INSTANCE = new RingtoneMiddleware();

    /* compiled from: RingtoneMiddleware.kt */
    @P
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/ringtone/RingtoneMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;", "Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/e;", "ringingPlayerState", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/e;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/e;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/e;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/ringtone/RingtoneMiddleware$Payload;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/e;", "getRingingPlayerState", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload implements IacMiddlewarePayload {
        public static final int $stable = 0;

        @k
        private final e ringingPlayerState;

        public Payload(@k e eVar) {
            this.ringingPlayerState = eVar;
        }

        public static /* synthetic */ Payload copy$default(Payload payload, e eVar, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                eVar = payload.ringingPlayerState;
            }
            return payload.copy(eVar);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final e getRingingPlayerState() {
            return this.ringingPlayerState;
        }

        @k
        public final Payload copy(@k e ringingPlayerState) {
            return new Payload(ringingPlayerState);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Payload) && L.f(this.ringingPlayerState, ((Payload) other).ringingPlayerState);
        }

        @k
        public final e getRingingPlayerState() {
            return this.ringingPlayerState;
        }

        public int hashCode() {
            return this.ringingPlayerState.hashCode();
        }

        @k
        public String toString() {
            return "Payload(ringingPlayerState=" + this.ringingPlayerState + ')';
        }
    }

    private RingtoneMiddleware() {
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof RingtoneMiddleware);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return -1365930916;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing) {
        IacMiddlewareDistinctBy.a.a(this, iacMiddlewareProcessing);
    }

    @k
    public String toString() {
        return "RingtoneMiddleware";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[PHI: r2
  0x0041: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v3 java.lang.String) binds: [B:20:0x0056, B:15:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.ringtone.RingtoneMiddleware.Payload getPayloadFromState(@Y61.k com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.Idle
            r1 = 0
            if (r0 == 0) goto L6
            goto L67
        L6:
            boolean r0 = r5 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming.Waiting
            if (r0 == 0) goto L2c
            r0 = r5
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState$InUse$Alive$Incoming$Waiting r0 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming.Waiting) r0
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallState r2 = r0.getCall()
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.InvitingState r2 = r2.getInvitingState()
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.InvitingState$Ringing r3 = com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.InvitingState.Ringing.INSTANCE
            int r2 = r2.compareTo(r3)
            if (r2 < 0) goto L67
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.CallParams r2 = r0.getParams()
            boolean r2 = r2.getMuteRingtone()
            if (r2 != 0) goto L67
            java.lang.String r1 = r0.getCallId()
            goto L67
        L2c:
            boolean r0 = r5 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming.Resolving
            if (r0 == 0) goto L43
            r0 = r5
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState$InUse$Alive$Incoming$Resolving r0 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming.Resolving) r0
            java.lang.String r2 = r0.getCallId()
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.CallParams r0 = r0.getParams()
            boolean r0 = r0.getMuteRingtone()
            if (r0 != 0) goto L67
        L41:
            r1 = r2
            goto L67
        L43:
            boolean r0 = r5 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming.Accepting
            if (r0 == 0) goto L59
            r0 = r5
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState$InUse$Alive$Incoming$Accepting r0 = (com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming.Accepting) r0
            java.lang.String r2 = r0.getCallId()
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.CallParams r0 = r0.getParams()
            boolean r0 = r0.getMuteRingtone()
            if (r0 != 0) goto L67
            goto L41
        L59:
            boolean r0 = r5 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Outgoing
            if (r0 == 0) goto L5e
            goto L67
        L5e:
            boolean r0 = r5 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Talking
            if (r0 == 0) goto L63
            goto L67
        L63:
            boolean r0 = r5 instanceof com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Finished
            if (r0 == 0) goto L7a
        L67:
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.ringtone.RingtoneMiddleware$Payload r0 = new com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.ringtone.RingtoneMiddleware$Payload
            com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.e r2 = new com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.e
            com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.Appearance r5 = r5.getAppearance()
            com.avito.android.iac_dialer.impl_module.audio.ringtone.IacRingingMode r5 = r5.getRingingMode()
            r2.<init>(r1, r5)
            r0.<init>(r2)
            return r0
        L7a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.ringtone.RingtoneMiddleware.getPayloadFromState(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState):com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.ringtone.RingtoneMiddleware$Payload");
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing, @k Payload payload, @k Payload payload2) {
        iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), new IacEvent.RingingPlayer.Update(payload2.getRingingPlayerState()));
    }
}
