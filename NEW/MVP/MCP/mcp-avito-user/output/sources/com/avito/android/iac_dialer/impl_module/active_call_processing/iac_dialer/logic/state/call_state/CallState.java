package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.avito.android.iac_dialer.impl_module.camera.IacCameraPosition;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CallState.kt */
@P
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u001d\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b(\u0010$J\u0010\u0010)\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010$J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001eJ\u0010\u0010,\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b,\u0010$J\u0010\u0010-\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b-\u0010$J\u0010\u0010.\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b.\u0010$J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001eJ\u0010\u00100\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b2\u0010$J\u0010\u00103\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b3\u00104JÈ\u0001\u00105\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u0019HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010\u001eJ\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\b\n\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010E\u001a\u0004\bF\u0010$R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bG\u0010$R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bH\u0010$R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bI\u0010$R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bJ\u0010$R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bK\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bL\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bM\u0010$R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bN\u0010$R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bO\u0010$R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\bP\u0010\u001eR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010Q\u001a\u0004\bR\u00101R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010E\u001a\u0004\bS\u0010$R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010T\u001a\u0004\bU\u00104¨\u0006V"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "LdL/d;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "invitingState", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "direction", "", "isVideo", "videoTxAllowed", "wasRingingReceived", "peerConnected", "peerSendingAudio", "peerSendingVideo", "peerEndpointId", "peerUserId", "localConnected", "localSendingAudio", "localSendingVideo", "localUserId", "Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;", "defaultCamera", "defaultCameraEnabled", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta;", Constants.REFERRER_API_META, "<init>", "(Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;ZZZZZZLjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;ZLcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "component3", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "component4", "()Z", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;", "component17", "component18", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta;", "copy", "(Ljava/lang/String;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;ZZZZZZLjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;ZLcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/InvitingState;", "getInvitingState", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "getDirection", "Z", "getVideoTxAllowed", "getWasRingingReceived", "getPeerConnected", "getPeerSendingAudio", "getPeerSendingVideo", "getPeerEndpointId", "getPeerUserId", "getLocalConnected", "getLocalSendingAudio", "getLocalSendingVideo", "getLocalUserId", "Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;", "getDefaultCamera", "getDefaultCameraEnabled", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallMeta;", "getMeta", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CallState implements dL.d {
    public static final int $stable = 8;

    @Y61.k
    private final String callId;

    @Y61.k
    private final IacCameraPosition defaultCamera;
    private final boolean defaultCameraEnabled;

    @Y61.k
    private final IacCallDirection direction;

    @Y61.k
    private final InvitingState invitingState;
    private final boolean isVideo;
    private final boolean localConnected;
    private final boolean localSendingAudio;
    private final boolean localSendingVideo;

    @Y61.k
    private final String localUserId;

    @Y61.k
    private final CallMeta meta;
    private final boolean peerConnected;

    @Y61.k
    private final String peerEndpointId;
    private final boolean peerSendingAudio;
    private final boolean peerSendingVideo;

    @Y61.k
    private final String peerUserId;
    private final boolean videoTxAllowed;
    private final boolean wasRingingReceived;

    public CallState(@Y61.k String str, @Y61.k InvitingState invitingState, @Y61.k IacCallDirection iacCallDirection, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, @Y61.k String str2, @Y61.k String str3, boolean z18, boolean z19, boolean z22, @Y61.k String str4, @Y61.k IacCameraPosition iacCameraPosition, boolean z23, @Y61.k CallMeta callMeta) {
        this.callId = str;
        this.invitingState = invitingState;
        this.direction = iacCallDirection;
        this.isVideo = z12;
        this.videoTxAllowed = z13;
        this.wasRingingReceived = z14;
        this.peerConnected = z15;
        this.peerSendingAudio = z16;
        this.peerSendingVideo = z17;
        this.peerEndpointId = str2;
        this.peerUserId = str3;
        this.localConnected = z18;
        this.localSendingAudio = z19;
        this.localSendingVideo = z22;
        this.localUserId = str4;
        this.defaultCamera = iacCameraPosition;
        this.defaultCameraEnabled = z23;
        this.meta = callMeta;
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @Y61.k
    /* renamed from: component10, reason: from getter */
    public final String getPeerEndpointId() {
        return this.peerEndpointId;
    }

    @Y61.k
    /* renamed from: component11, reason: from getter */
    public final String getPeerUserId() {
        return this.peerUserId;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getLocalConnected() {
        return this.localConnected;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getLocalSendingAudio() {
        return this.localSendingAudio;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getLocalSendingVideo() {
        return this.localSendingVideo;
    }

    @Y61.k
    /* renamed from: component15, reason: from getter */
    public final String getLocalUserId() {
        return this.localUserId;
    }

    @Y61.k
    /* renamed from: component16, reason: from getter */
    public final IacCameraPosition getDefaultCamera() {
        return this.defaultCamera;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getDefaultCameraEnabled() {
        return this.defaultCameraEnabled;
    }

    @Y61.k
    /* renamed from: component18, reason: from getter */
    public final CallMeta getMeta() {
        return this.meta;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final InvitingState getInvitingState() {
        return this.invitingState;
    }

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final IacCallDirection getDirection() {
        return this.direction;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getVideoTxAllowed() {
        return this.videoTxAllowed;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getWasRingingReceived() {
        return this.wasRingingReceived;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getPeerConnected() {
        return this.peerConnected;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getPeerSendingAudio() {
        return this.peerSendingAudio;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getPeerSendingVideo() {
        return this.peerSendingVideo;
    }

    @Y61.k
    public final CallState copy(@Y61.k String callId, @Y61.k InvitingState invitingState, @Y61.k IacCallDirection direction, boolean isVideo, boolean videoTxAllowed, boolean wasRingingReceived, boolean peerConnected, boolean peerSendingAudio, boolean peerSendingVideo, @Y61.k String peerEndpointId, @Y61.k String peerUserId, boolean localConnected, boolean localSendingAudio, boolean localSendingVideo, @Y61.k String localUserId, @Y61.k IacCameraPosition defaultCamera, boolean defaultCameraEnabled, @Y61.k CallMeta meta) {
        return new CallState(callId, invitingState, direction, isVideo, videoTxAllowed, wasRingingReceived, peerConnected, peerSendingAudio, peerSendingVideo, peerEndpointId, peerUserId, localConnected, localSendingAudio, localSendingVideo, localUserId, defaultCamera, defaultCameraEnabled, meta);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallState)) {
            return false;
        }
        CallState callState = (CallState) other;
        return L.f(this.callId, callState.callId) && L.f(this.invitingState, callState.invitingState) && this.direction == callState.direction && this.isVideo == callState.isVideo && this.videoTxAllowed == callState.videoTxAllowed && this.wasRingingReceived == callState.wasRingingReceived && this.peerConnected == callState.peerConnected && this.peerSendingAudio == callState.peerSendingAudio && this.peerSendingVideo == callState.peerSendingVideo && L.f(this.peerEndpointId, callState.peerEndpointId) && L.f(this.peerUserId, callState.peerUserId) && this.localConnected == callState.localConnected && this.localSendingAudio == callState.localSendingAudio && this.localSendingVideo == callState.localSendingVideo && L.f(this.localUserId, callState.localUserId) && this.defaultCamera == callState.defaultCamera && this.defaultCameraEnabled == callState.defaultCameraEnabled && L.f(this.meta, callState.meta);
    }

    @Y61.k
    public final String getCallId() {
        return this.callId;
    }

    @Y61.k
    public final IacCameraPosition getDefaultCamera() {
        return this.defaultCamera;
    }

    public final boolean getDefaultCameraEnabled() {
        return this.defaultCameraEnabled;
    }

    @Y61.k
    public final IacCallDirection getDirection() {
        return this.direction;
    }

    @Y61.k
    public final InvitingState getInvitingState() {
        return this.invitingState;
    }

    public final boolean getLocalConnected() {
        return this.localConnected;
    }

    public final boolean getLocalSendingAudio() {
        return this.localSendingAudio;
    }

    public final boolean getLocalSendingVideo() {
        return this.localSendingVideo;
    }

    @Y61.k
    public final String getLocalUserId() {
        return this.localUserId;
    }

    @Y61.k
    public final CallMeta getMeta() {
        return this.meta;
    }

    public final boolean getPeerConnected() {
        return this.peerConnected;
    }

    @Y61.k
    public final String getPeerEndpointId() {
        return this.peerEndpointId;
    }

    public final boolean getPeerSendingAudio() {
        return this.peerSendingAudio;
    }

    public final boolean getPeerSendingVideo() {
        return this.peerSendingVideo;
    }

    @Y61.k
    public final String getPeerUserId() {
        return this.peerUserId;
    }

    public final boolean getVideoTxAllowed() {
        return this.videoTxAllowed;
    }

    public final boolean getWasRingingReceived() {
        return this.wasRingingReceived;
    }

    public int hashCode() {
        return this.meta.hashCode() + androidx.appcompat.app.r.i((this.defaultCamera.hashCode() + H.d(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(H.d(H.d(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.direction.hashCode() + ((this.invitingState.hashCode() + (this.callId.hashCode() * 31)) * 31)) * 31, 31, this.isVideo), 31, this.videoTxAllowed), 31, this.wasRingingReceived), 31, this.peerConnected), 31, this.peerSendingAudio), 31, this.peerSendingVideo), 31, this.peerEndpointId), 31, this.peerUserId), 31, this.localConnected), 31, this.localSendingAudio), 31, this.localSendingVideo), 31, this.localUserId)) * 31, 31, this.defaultCameraEnabled);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @Y61.k
    public String toString() {
        return "CallState(callId=" + this.callId + ", invitingState=" + this.invitingState + ", direction=" + this.direction + ", isVideo=" + this.isVideo + ", videoTxAllowed=" + this.videoTxAllowed + ", wasRingingReceived=" + this.wasRingingReceived + ", peerConnected=" + this.peerConnected + ", peerSendingAudio=" + this.peerSendingAudio + ", peerSendingVideo=" + this.peerSendingVideo + ", peerEndpointId=" + this.peerEndpointId + ", peerUserId=" + this.peerUserId + ", localConnected=" + this.localConnected + ", localSendingAudio=" + this.localSendingAudio + ", localSendingVideo=" + this.localSendingVideo + ", localUserId=" + this.localUserId + ", defaultCamera=" + this.defaultCamera + ", defaultCameraEnabled=" + this.defaultCameraEnabled + ", meta=" + this.meta + ')';
    }
}
