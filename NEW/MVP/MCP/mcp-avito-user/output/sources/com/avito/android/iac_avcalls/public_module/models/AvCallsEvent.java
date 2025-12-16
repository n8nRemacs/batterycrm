package com.avito.android.iac_avcalls.public_module.models;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvCallsEvent.kt */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent;", "", "()V", "CallStateChanged", "CallTerminated", "CameraPositionChanged", "ConnectionQualityChanged", "NewIncomingCallReceived", "StatsReportDelivered", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent$CallStateChanged;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent$CallTerminated;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent$CameraPositionChanged;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent$ConnectionQualityChanged;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent$NewIncomingCallReceived;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent$StatsReportDelivered;", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class AvCallsEvent {

    /* compiled from: AvCallsEvent.kt */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent$CallStateChanged;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent;", VoiceInfo.STATE, "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;", "(Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;)V", "getState", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CallStateChanged extends AvCallsEvent {

        @k
        private final AvCallsCallState state;

        public CallStateChanged(@k AvCallsCallState avCallsCallState) {
            super(null);
            this.state = avCallsCallState;
        }

        public static /* synthetic */ CallStateChanged copy$default(CallStateChanged callStateChanged, AvCallsCallState avCallsCallState, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                avCallsCallState = callStateChanged.state;
            }
            return callStateChanged.copy(avCallsCallState);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AvCallsCallState getState() {
            return this.state;
        }

        @k
        public final CallStateChanged copy(@k AvCallsCallState state) {
            return new CallStateChanged(state);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CallStateChanged) && L.f(this.state, ((CallStateChanged) other).state);
        }

        @k
        public final AvCallsCallState getState() {
            return this.state;
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        @k
        public String toString() {
            return "CallStateChanged(state=" + this.state + ')';
        }
    }

    /* compiled from: AvCallsEvent.kt */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent$CallTerminated;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent;", VoiceInfo.STATE, "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;", "(Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;)V", "getState", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CallTerminated extends AvCallsEvent {

        @k
        private final AvCallsCallState state;

        public CallTerminated(@k AvCallsCallState avCallsCallState) {
            super(null);
            this.state = avCallsCallState;
        }

        public static /* synthetic */ CallTerminated copy$default(CallTerminated callTerminated, AvCallsCallState avCallsCallState, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                avCallsCallState = callTerminated.state;
            }
            return callTerminated.copy(avCallsCallState);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AvCallsCallState getState() {
            return this.state;
        }

        @k
        public final CallTerminated copy(@k AvCallsCallState state) {
            return new CallTerminated(state);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CallTerminated) && L.f(this.state, ((CallTerminated) other).state);
        }

        @k
        public final AvCallsCallState getState() {
            return this.state;
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        @k
        public String toString() {
            return "CallTerminated(state=" + this.state + ')';
        }
    }

    /* compiled from: AvCallsEvent.kt */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent$CameraPositionChanged;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent;", "cameraPosition", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCameraPosition;", "(Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCameraPosition;)V", "getCameraPosition", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCameraPosition;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CameraPositionChanged extends AvCallsEvent {

        @l
        private final AvCallsCameraPosition cameraPosition;

        public CameraPositionChanged(@l AvCallsCameraPosition avCallsCameraPosition) {
            super(null);
            this.cameraPosition = avCallsCameraPosition;
        }

        public static /* synthetic */ CameraPositionChanged copy$default(CameraPositionChanged cameraPositionChanged, AvCallsCameraPosition avCallsCameraPosition, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                avCallsCameraPosition = cameraPositionChanged.cameraPosition;
            }
            return cameraPositionChanged.copy(avCallsCameraPosition);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final AvCallsCameraPosition getCameraPosition() {
            return this.cameraPosition;
        }

        @k
        public final CameraPositionChanged copy(@l AvCallsCameraPosition cameraPosition) {
            return new CameraPositionChanged(cameraPosition);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CameraPositionChanged) && this.cameraPosition == ((CameraPositionChanged) other).cameraPosition;
        }

        @l
        public final AvCallsCameraPosition getCameraPosition() {
            return this.cameraPosition;
        }

        public int hashCode() {
            AvCallsCameraPosition avCallsCameraPosition = this.cameraPosition;
            if (avCallsCameraPosition == null) {
                return 0;
            }
            return avCallsCameraPosition.hashCode();
        }

        @k
        public String toString() {
            return "CameraPositionChanged(cameraPosition=" + this.cameraPosition + ')';
        }
    }

    /* compiled from: AvCallsEvent.kt */
    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent$ConnectionQualityChanged;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent;", "connectionQuality", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsConnectionQuality;", "(Lcom/avito/android/iac_avcalls/public_module/models/AvCallsConnectionQuality;)V", "getConnectionQuality", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsConnectionQuality;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConnectionQualityChanged extends AvCallsEvent {

        @k
        private final AvCallsConnectionQuality connectionQuality;

        public ConnectionQualityChanged(@k AvCallsConnectionQuality avCallsConnectionQuality) {
            super(null);
            this.connectionQuality = avCallsConnectionQuality;
        }

        public static /* synthetic */ ConnectionQualityChanged copy$default(ConnectionQualityChanged connectionQualityChanged, AvCallsConnectionQuality avCallsConnectionQuality, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                avCallsConnectionQuality = connectionQualityChanged.connectionQuality;
            }
            return connectionQualityChanged.copy(avCallsConnectionQuality);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AvCallsConnectionQuality getConnectionQuality() {
            return this.connectionQuality;
        }

        @k
        public final ConnectionQualityChanged copy(@k AvCallsConnectionQuality connectionQuality) {
            return new ConnectionQualityChanged(connectionQuality);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConnectionQualityChanged) && this.connectionQuality == ((ConnectionQualityChanged) other).connectionQuality;
        }

        @k
        public final AvCallsConnectionQuality getConnectionQuality() {
            return this.connectionQuality;
        }

        public int hashCode() {
            return this.connectionQuality.hashCode();
        }

        @k
        public String toString() {
            return "ConnectionQualityChanged(connectionQuality=" + this.connectionQuality + ')';
        }
    }

    /* compiled from: AvCallsEvent.kt */
    @Keep
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\r\u0010\u0013\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\r\u0010\u0014\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u00062\f\b\u0002\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent$NewIncomingCallReceived;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent;", VoiceInfo.STATE, "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsUserId;", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "metaInfo", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;", "(Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;)V", "getFrom", "()Ljava/lang/String;", "getMetaInfo", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;", "getState", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;", "getTo", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NewIncomingCallReceived extends AvCallsEvent {

        @k
        private final String from;

        @k
        private final AvCallsCallMetaInfo metaInfo;

        @k
        private final AvCallsCallState state;

        @k
        private final String to;

        public NewIncomingCallReceived(@k AvCallsCallState avCallsCallState, @k String str, @k String str2, @k AvCallsCallMetaInfo avCallsCallMetaInfo) {
            super(null);
            this.state = avCallsCallState;
            this.from = str;
            this.to = str2;
            this.metaInfo = avCallsCallMetaInfo;
        }

        public static /* synthetic */ NewIncomingCallReceived copy$default(NewIncomingCallReceived newIncomingCallReceived, AvCallsCallState avCallsCallState, String str, String str2, AvCallsCallMetaInfo avCallsCallMetaInfo, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                avCallsCallState = newIncomingCallReceived.state;
            }
            if ((i12 & 2) != 0) {
                str = newIncomingCallReceived.from;
            }
            if ((i12 & 4) != 0) {
                str2 = newIncomingCallReceived.to;
            }
            if ((i12 & 8) != 0) {
                avCallsCallMetaInfo = newIncomingCallReceived.metaInfo;
            }
            return newIncomingCallReceived.copy(avCallsCallState, str, str2, avCallsCallMetaInfo);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AvCallsCallState getState() {
            return this.state;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getTo() {
            return this.to;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final AvCallsCallMetaInfo getMetaInfo() {
            return this.metaInfo;
        }

        @k
        public final NewIncomingCallReceived copy(@k AvCallsCallState state, @k String from, @k String to2, @k AvCallsCallMetaInfo metaInfo) {
            return new NewIncomingCallReceived(state, from, to2, metaInfo);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewIncomingCallReceived)) {
                return false;
            }
            NewIncomingCallReceived newIncomingCallReceived = (NewIncomingCallReceived) other;
            return L.f(this.state, newIncomingCallReceived.state) && L.f(this.from, newIncomingCallReceived.from) && L.f(this.to, newIncomingCallReceived.to) && L.f(this.metaInfo, newIncomingCallReceived.metaInfo);
        }

        @k
        public final String getFrom() {
            return this.from;
        }

        @k
        public final AvCallsCallMetaInfo getMetaInfo() {
            return this.metaInfo;
        }

        @k
        public final AvCallsCallState getState() {
            return this.state;
        }

        @k
        public final String getTo() {
            return this.to;
        }

        public int hashCode() {
            return this.metaInfo.hashCode() + H.d(H.d(this.state.hashCode() * 31, 31, this.from), 31, this.to);
        }

        @k
        public String toString() {
            return "NewIncomingCallReceived(state=" + this.state + ", from=" + this.from + ", to=" + this.to + ", metaInfo=" + this.metaInfo + ')';
        }
    }

    /* compiled from: AvCallsEvent.kt */
    @Keep
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent$StatsReportDelivered;", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsEvent;", "statsReportJson", "", VoiceInfo.STATE, "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;", "(Ljava/lang/String;Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;)V", "getState", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;", "getStatsReportJson", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StatsReportDelivered extends AvCallsEvent {

        @k
        private final AvCallsCallState state;

        @k
        private final String statsReportJson;

        public StatsReportDelivered(@k String str, @k AvCallsCallState avCallsCallState) {
            super(null);
            this.statsReportJson = str;
            this.state = avCallsCallState;
        }

        public static /* synthetic */ StatsReportDelivered copy$default(StatsReportDelivered statsReportDelivered, String str, AvCallsCallState avCallsCallState, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = statsReportDelivered.statsReportJson;
            }
            if ((i12 & 2) != 0) {
                avCallsCallState = statsReportDelivered.state;
            }
            return statsReportDelivered.copy(str, avCallsCallState);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getStatsReportJson() {
            return this.statsReportJson;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final AvCallsCallState getState() {
            return this.state;
        }

        @k
        public final StatsReportDelivered copy(@k String statsReportJson, @k AvCallsCallState state) {
            return new StatsReportDelivered(statsReportJson, state);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StatsReportDelivered)) {
                return false;
            }
            StatsReportDelivered statsReportDelivered = (StatsReportDelivered) other;
            return L.f(this.statsReportJson, statsReportDelivered.statsReportJson) && L.f(this.state, statsReportDelivered.state);
        }

        @k
        public final AvCallsCallState getState() {
            return this.state;
        }

        @k
        public final String getStatsReportJson() {
            return this.statsReportJson;
        }

        public int hashCode() {
            return this.state.hashCode() + (this.statsReportJson.hashCode() * 31);
        }

        @k
        public String toString() {
            return "StatsReportDelivered(statsReportJson=" + this.statsReportJson + ", state=" + this.state + ')';
        }
    }

    public /* synthetic */ AvCallsEvent(C42822w c42822w) {
        this();
    }

    private AvCallsEvent() {
    }
}
