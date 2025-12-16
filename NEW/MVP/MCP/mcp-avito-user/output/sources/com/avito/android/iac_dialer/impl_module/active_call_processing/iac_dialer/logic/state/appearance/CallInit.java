package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.InvitingState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReason;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input.CallInput;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import org.webrtc.MediaStreamTrack;

/* compiled from: CallInit.kt */
@P
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0004<=>?BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJZ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b\u0005\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b0\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u0010\u001fR\u0015\u00107\u001a\u00060\u0010j\u0002`58F¢\u0006\u0006\u001a\u0004\b6\u0010\u0012R\u0011\u0010;\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006@"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit;", "LdL/d;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom;", "telecom", "", "isRealTelecomImpl", NotificationsSettings.Section.SECTION_PAID_SERVICES, "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "avCalls", "payloadSent", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Payload;", "payload", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;", MediaStreamTrack.AUDIO_TRACK_KIND, "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom;Ljava/lang/Boolean;ZLcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;ZLcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Payload;Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "component5", "component6", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Payload;", "component7", "()Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom;Ljava/lang/Boolean;ZLcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;ZLcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Payload;Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom;", "getTelecom", "Ljava/lang/Boolean;", "Z", "getNotification", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "getAvCalls", "getPayloadSent", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Payload;", "getPayload", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;", "getAudio", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "getCallId", FailedBinderCallBack.CALLER_ID, "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "getDirection", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "direction", "IncomingPayload", "OutgoingPayload", "Payload", "Telecom", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CallInit implements dL.d {
    public static final int $stable = 8;

    @Y61.k
    private final AudioState audio;

    @Y61.l
    private final InvitingState avCalls;

    @Y61.l
    private final Boolean isRealTelecomImpl;
    private final boolean notification;

    @Y61.k
    private final Payload payload;
    private final boolean payloadSent;

    @Y61.k
    private final Telecom telecom;

    /* compiled from: CallInit.kt */
    @P
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\r\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$IncomingPayload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Payload;", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "json", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "isVideo", "", "isFromPush", "(Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;ZZ)V", "getCallId", "()Ljava/lang/String;", "()Z", "getJson", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "component1", "component2", "component3", "component4", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IncomingPayload implements Payload {
        public static final int $stable = 8;

        @Y61.k
        private final String callId;
        private final boolean isFromPush;
        private final boolean isVideo;

        @Y61.k
        private final IacPiiString json;

        public IncomingPayload(@Y61.k String str, @Y61.k IacPiiString iacPiiString, boolean z12, boolean z13) {
            this.callId = str;
            this.json = iacPiiString;
            this.isVideo = z12;
            this.isFromPush = z13;
        }

        public static /* synthetic */ IncomingPayload copy$default(IncomingPayload incomingPayload, String str, IacPiiString iacPiiString, boolean z12, boolean z13, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = incomingPayload.callId;
            }
            if ((i12 & 2) != 0) {
                iacPiiString = incomingPayload.json;
            }
            if ((i12 & 4) != 0) {
                z12 = incomingPayload.isVideo;
            }
            if ((i12 & 8) != 0) {
                z13 = incomingPayload.isFromPush;
            }
            return incomingPayload.copy(str, iacPiiString, z12, z13);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        @Y61.k
        /* renamed from: component2, reason: from getter */
        public final IacPiiString getJson() {
            return this.json;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsVideo() {
            return this.isVideo;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsFromPush() {
            return this.isFromPush;
        }

        @Y61.k
        public final IncomingPayload copy(@Y61.k String callId, @Y61.k IacPiiString json, boolean isVideo, boolean isFromPush) {
            return new IncomingPayload(callId, json, isVideo, isFromPush);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IncomingPayload)) {
                return false;
            }
            IncomingPayload incomingPayload = (IncomingPayload) other;
            return L.f(this.callId, incomingPayload.callId) && L.f(this.json, incomingPayload.json) && this.isVideo == incomingPayload.isVideo && this.isFromPush == incomingPayload.isFromPush;
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit.Payload
        @Y61.k
        public String getCallId() {
            return this.callId;
        }

        @Y61.k
        public final IacPiiString getJson() {
            return this.json;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isFromPush) + androidx.appcompat.app.r.i((this.json.hashCode() + (this.callId.hashCode() * 31)) * 31, 31, this.isVideo);
        }

        public final boolean isFromPush() {
            return this.isFromPush;
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit.Payload
        public boolean isVideo() {
            return this.isVideo;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("IncomingPayload(callId=");
            sb2.append(this.callId);
            sb2.append(", json=");
            sb2.append(this.json);
            sb2.append(", isVideo=");
            sb2.append(this.isVideo);
            sb2.append(", isFromPush=");
            return androidx.appcompat.app.r.x(sb2, this.isFromPush, ')');
        }
    }

    /* compiled from: CallInit.kt */
    @P
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0005\u001a\u00060\u0006j\u0002`\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$OutgoingPayload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Payload;", "input", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$NewCall;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$NewCall;)V", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "getCallId", "()Ljava/lang/String;", "getInput", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/input/CallInput$NewCall;", "isVideo", "", "()Z", "component1", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OutgoingPayload implements Payload {
        public static final int $stable = 8;

        @Y61.k
        private final CallInput.NewCall input;

        public OutgoingPayload(@Y61.k CallInput.NewCall newCall) {
            this.input = newCall;
        }

        public static /* synthetic */ OutgoingPayload copy$default(OutgoingPayload outgoingPayload, CallInput.NewCall newCall, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                newCall = outgoingPayload.input;
            }
            return outgoingPayload.copy(newCall);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final CallInput.NewCall getInput() {
            return this.input;
        }

        @Y61.k
        public final OutgoingPayload copy(@Y61.k CallInput.NewCall input) {
            return new OutgoingPayload(input);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OutgoingPayload) && L.f(this.input, ((OutgoingPayload) other).input);
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit.Payload
        @Y61.k
        public String getCallId() {
            return this.input.getCallId();
        }

        @Y61.k
        public final CallInput.NewCall getInput() {
            return this.input;
        }

        public int hashCode() {
            return this.input.hashCode();
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit.Payload
        public boolean isVideo() {
            return this.input.isVideo();
        }

        @Y61.k
        public String toString() {
            return "OutgoingPayload(input=" + this.input + ')';
        }
    }

    /* compiled from: CallInit.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\t\u001a\u00060\u0005j\u0002`\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Payload;", "LdL/d;", "", "isVideo", "()Z", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "getCallId", "()Ljava/lang/String;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$IncomingPayload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$OutgoingPayload;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Payload extends dL.d {
        @Y61.k
        String getCallId();

        boolean isVideo();
    }

    /* compiled from: CallInit.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom;", "LdL/d;", "", "isTerminal", "()Z", "Active", "Creating", "Disconnected", "Disconnecting", "New", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom$Active;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom$Creating;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom$Disconnected;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom$Disconnecting;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom$New;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Telecom extends dL.d {

        /* compiled from: CallInit.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom$Active;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Active implements Telecom {
            public static final int $stable = 0;

            @Y61.k
            public static final Active INSTANCE = new Active();

            private Active() {
            }

            public boolean equals(@Y61.l Object other) {
                return this == other || (other instanceof Active);
            }

            public int hashCode() {
                return 545308927;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit.Telecom
            public boolean isTerminal() {
                return a.a(this);
            }

            @Y61.k
            public String toString() {
                return "Active";
            }
        }

        /* compiled from: CallInit.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom$Creating;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Creating implements Telecom {
            public static final int $stable = 0;

            @Y61.k
            public static final Creating INSTANCE = new Creating();

            private Creating() {
            }

            public boolean equals(@Y61.l Object other) {
                return this == other || (other instanceof Creating);
            }

            public int hashCode() {
                return -762702222;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit.Telecom
            public boolean isTerminal() {
                return a.a(this);
            }

            @Y61.k
            public String toString() {
                return "Creating";
            }
        }

        /* compiled from: CallInit.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom$Disconnected;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom;", "reason", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "isLocal", "", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;Z)V", "()Z", "getReason", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "component1", "component2", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Disconnected implements Telecom {
            public static final int $stable = 0;
            private final boolean isLocal;

            @Y61.k
            private final TerminateReason reason;

            public Disconnected(@Y61.k TerminateReason terminateReason, boolean z12) {
                this.reason = terminateReason;
                this.isLocal = z12;
            }

            public static /* synthetic */ Disconnected copy$default(Disconnected disconnected, TerminateReason terminateReason, boolean z12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    terminateReason = disconnected.reason;
                }
                if ((i12 & 2) != 0) {
                    z12 = disconnected.isLocal;
                }
                return disconnected.copy(terminateReason, z12);
            }

            @Y61.k
            /* renamed from: component1, reason: from getter */
            public final TerminateReason getReason() {
                return this.reason;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsLocal() {
                return this.isLocal;
            }

            @Y61.k
            public final Disconnected copy(@Y61.k TerminateReason reason, boolean isLocal) {
                return new Disconnected(reason, isLocal);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Disconnected)) {
                    return false;
                }
                Disconnected disconnected = (Disconnected) other;
                return L.f(this.reason, disconnected.reason) && this.isLocal == disconnected.isLocal;
            }

            @Y61.k
            public final TerminateReason getReason() {
                return this.reason;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isLocal) + (this.reason.hashCode() * 31);
            }

            public final boolean isLocal() {
                return this.isLocal;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit.Telecom
            public boolean isTerminal() {
                return a.a(this);
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Disconnected(reason=");
                sb2.append(this.reason);
                sb2.append(", isLocal=");
                return androidx.appcompat.app.r.x(sb2, this.isLocal, ')');
            }
        }

        /* compiled from: CallInit.kt */
        @P
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom$Disconnecting;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom;", "reason", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "isLocal", "", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;Z)V", "()Z", "getReason", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReason;", "component1", "component2", "copy", "equals", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Disconnecting implements Telecom {
            public static final int $stable = 0;
            private final boolean isLocal;

            @Y61.k
            private final TerminateReason reason;

            public Disconnecting(@Y61.k TerminateReason terminateReason, boolean z12) {
                this.reason = terminateReason;
                this.isLocal = z12;
            }

            public static /* synthetic */ Disconnecting copy$default(Disconnecting disconnecting, TerminateReason terminateReason, boolean z12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    terminateReason = disconnecting.reason;
                }
                if ((i12 & 2) != 0) {
                    z12 = disconnecting.isLocal;
                }
                return disconnecting.copy(terminateReason, z12);
            }

            @Y61.k
            /* renamed from: component1, reason: from getter */
            public final TerminateReason getReason() {
                return this.reason;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsLocal() {
                return this.isLocal;
            }

            @Y61.k
            public final Disconnecting copy(@Y61.k TerminateReason reason, boolean isLocal) {
                return new Disconnecting(reason, isLocal);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Disconnecting)) {
                    return false;
                }
                Disconnecting disconnecting = (Disconnecting) other;
                return L.f(this.reason, disconnecting.reason) && this.isLocal == disconnecting.isLocal;
            }

            @Y61.k
            public final TerminateReason getReason() {
                return this.reason;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isLocal) + (this.reason.hashCode() * 31);
            }

            public final boolean isLocal() {
                return this.isLocal;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit.Telecom
            public boolean isTerminal() {
                return a.a(this);
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Disconnecting(reason=");
                sb2.append(this.reason);
                sb2.append(", isLocal=");
                return androidx.appcompat.app.r.x(sb2, this.isLocal, ')');
            }
        }

        /* compiled from: CallInit.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom$New;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallInit$Telecom;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class New implements Telecom {
            public static final int $stable = 0;

            @Y61.k
            public static final New INSTANCE = new New();

            private New() {
            }

            public boolean equals(@Y61.l Object other) {
                return this == other || (other instanceof New);
            }

            public int hashCode() {
                return -256159161;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit.Telecom
            public boolean isTerminal() {
                return a.a(this);
            }

            @Y61.k
            public String toString() {
                return "New";
            }
        }

        /* compiled from: CallInit.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public static boolean a(@Y61.k Telecom telecom) {
                return (telecom instanceof Disconnecting) || (telecom instanceof Disconnected);
            }
        }

        boolean isTerminal();
    }

    public CallInit(@Y61.k Telecom telecom, @Y61.l Boolean bool, boolean z12, @Y61.l InvitingState invitingState, boolean z13, @Y61.k Payload payload, @Y61.k AudioState audioState) {
        this.telecom = telecom;
        this.isRealTelecomImpl = bool;
        this.notification = z12;
        this.avCalls = invitingState;
        this.payloadSent = z13;
        this.payload = payload;
        this.audio = audioState;
    }

    public static /* synthetic */ CallInit copy$default(CallInit callInit, Telecom telecom, Boolean bool, boolean z12, InvitingState invitingState, boolean z13, Payload payload, AudioState audioState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            telecom = callInit.telecom;
        }
        if ((i12 & 2) != 0) {
            bool = callInit.isRealTelecomImpl;
        }
        Boolean bool2 = bool;
        if ((i12 & 4) != 0) {
            z12 = callInit.notification;
        }
        boolean z14 = z12;
        if ((i12 & 8) != 0) {
            invitingState = callInit.avCalls;
        }
        InvitingState invitingState2 = invitingState;
        if ((i12 & 16) != 0) {
            z13 = callInit.payloadSent;
        }
        boolean z15 = z13;
        if ((i12 & 32) != 0) {
            payload = callInit.payload;
        }
        Payload payload2 = payload;
        if ((i12 & 64) != 0) {
            audioState = callInit.audio;
        }
        return callInit.copy(telecom, bool2, z14, invitingState2, z15, payload2, audioState);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final Telecom getTelecom() {
        return this.telecom;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final Boolean getIsRealTelecomImpl() {
        return this.isRealTelecomImpl;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNotification() {
        return this.notification;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final InvitingState getAvCalls() {
        return this.avCalls;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getPayloadSent() {
        return this.payloadSent;
    }

    @Y61.k
    /* renamed from: component6, reason: from getter */
    public final Payload getPayload() {
        return this.payload;
    }

    @Y61.k
    /* renamed from: component7, reason: from getter */
    public final AudioState getAudio() {
        return this.audio;
    }

    @Y61.k
    public final CallInit copy(@Y61.k Telecom telecom, @Y61.l Boolean isRealTelecomImpl, boolean notification, @Y61.l InvitingState avCalls, boolean payloadSent, @Y61.k Payload payload, @Y61.k AudioState audio) {
        return new CallInit(telecom, isRealTelecomImpl, notification, avCalls, payloadSent, payload, audio);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallInit)) {
            return false;
        }
        CallInit callInit = (CallInit) other;
        return L.f(this.telecom, callInit.telecom) && L.f(this.isRealTelecomImpl, callInit.isRealTelecomImpl) && this.notification == callInit.notification && L.f(this.avCalls, callInit.avCalls) && this.payloadSent == callInit.payloadSent && L.f(this.payload, callInit.payload) && L.f(this.audio, callInit.audio);
    }

    @Y61.k
    public final AudioState getAudio() {
        return this.audio;
    }

    @Y61.l
    public final InvitingState getAvCalls() {
        return this.avCalls;
    }

    @Y61.k
    public final String getCallId() {
        return this.payload.getCallId();
    }

    @Y61.k
    public final IacCallDirection getDirection() {
        Payload payload = this.payload;
        if (payload instanceof IncomingPayload) {
            return IacCallDirection.INCOMING;
        }
        if (payload instanceof OutgoingPayload) {
            return IacCallDirection.OUTGOING;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean getNotification() {
        return this.notification;
    }

    @Y61.k
    public final Payload getPayload() {
        return this.payload;
    }

    public final boolean getPayloadSent() {
        return this.payloadSent;
    }

    @Y61.k
    public final Telecom getTelecom() {
        return this.telecom;
    }

    public int hashCode() {
        int iHashCode = this.telecom.hashCode() * 31;
        Boolean bool = this.isRealTelecomImpl;
        int i12 = androidx.appcompat.app.r.i((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.notification);
        InvitingState invitingState = this.avCalls;
        return this.audio.hashCode() + ((this.payload.hashCode() + androidx.appcompat.app.r.i((i12 + (invitingState != null ? invitingState.hashCode() : 0)) * 31, 31, this.payloadSent)) * 31);
    }

    @Y61.l
    public final Boolean isRealTelecomImpl() {
        return this.isRealTelecomImpl;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CallInit(");
        sb2.append("dir=" + getDirection() + ", ");
        sb2.append("id=" + C43066x.u0(3, getCallId()) + ", ");
        sb2.append("telecom=" + this.telecom + ", ");
        sb2.append("isRealTelecomImpl=" + this.isRealTelecomImpl + ", ");
        sb2.append("ntf=" + this.notification + ", ");
        sb2.append("payloadSent=" + this.payloadSent + ", ");
        sb2.append("avcalls=" + this.avCalls + ", ");
        StringBuilder sb3 = new StringBuilder("audio=");
        sb3.append(this.audio);
        sb2.append(sb3.toString());
        sb2.append(")");
        return sb2.toString();
    }
}
