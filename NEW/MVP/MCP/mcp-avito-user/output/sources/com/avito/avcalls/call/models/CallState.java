package com.avito.avcalls.call.models;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CallState.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b!\b\u0086\b\u0018\u0000 <2\u00020\u0001:\u0001=Bg\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0086\u0001\u0010\u0019\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\f\b\u0002\u0010\u0006\u001a\u00060\u0002j\u0002`\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u001cR\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b%\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b\u0010\u00103R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u00102\u001a\u0004\b4\u00103R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u00102\u001a\u0004\b8\u00103R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u00109\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/avito/avcalls/call/models/CallState;", "", "", "Lcom/avito/avcalls/call/models/CallId;", FailedBinderCallBack.CALLER_ID, "Lcom/avito/avcalls/call/models/UserId;", "localUserId", "Lcom/avito/avcalls/call/models/CallDirection;", "direction", "Lcom/avito/avcalls/call/models/InvitingState;", "invitingState", "Lcom/avito/avcalls/call/models/MediaStatus;", "localMediaStatus", "Lcom/avito/avcalls/call/models/PeerStatus;", "peerStatus", "", "isVideo", "videoTxAllowed", "Lcom/avito/avcalls/call/models/CameraPosition;", "defaultCamera", "defaultCameraEnabled", "Lcom/avito/avcalls/call/models/CallMetaInfo;", "callMetaInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/avcalls/call/models/CallDirection;Lcom/avito/avcalls/call/models/InvitingState;Lcom/avito/avcalls/call/models/MediaStatus;Lcom/avito/avcalls/call/models/PeerStatus;ZZLcom/avito/avcalls/call/models/CameraPosition;ZLcom/avito/avcalls/call/models/CallMetaInfo;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/avcalls/call/models/CallDirection;Lcom/avito/avcalls/call/models/InvitingState;Lcom/avito/avcalls/call/models/MediaStatus;Lcom/avito/avcalls/call/models/PeerStatus;ZZLcom/avito/avcalls/call/models/CameraPosition;ZLcom/avito/avcalls/call/models/CallMetaInfo;)Lcom/avito/avcalls/call/models/CallState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallId", "getLocalUserId", "Lcom/avito/avcalls/call/models/CallDirection;", "getDirection", "()Lcom/avito/avcalls/call/models/CallDirection;", "Lcom/avito/avcalls/call/models/InvitingState;", "getInvitingState", "()Lcom/avito/avcalls/call/models/InvitingState;", "Lcom/avito/avcalls/call/models/MediaStatus;", "getLocalMediaStatus", "()Lcom/avito/avcalls/call/models/MediaStatus;", "Lcom/avito/avcalls/call/models/PeerStatus;", "getPeerStatus", "()Lcom/avito/avcalls/call/models/PeerStatus;", "Z", "()Z", "getVideoTxAllowed", "Lcom/avito/avcalls/call/models/CameraPosition;", "getDefaultCamera", "()Lcom/avito/avcalls/call/models/CameraPosition;", "getDefaultCameraEnabled", "Lcom/avito/avcalls/call/models/CallMetaInfo;", "getCallMetaInfo", "()Lcom/avito/avcalls/call/models/CallMetaInfo;", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CallState {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final String callId;

    @k
    private final CallMetaInfo callMetaInfo;

    @k
    private final CameraPosition defaultCamera;
    private final boolean defaultCameraEnabled;

    @k
    private final CallDirection direction;

    @k
    private final InvitingState invitingState;
    private final boolean isVideo;

    @k
    private final MediaStatus localMediaStatus;

    @k
    private final String localUserId;

    @k
    private final PeerStatus peerStatus;
    private final boolean videoTxAllowed;

    /* compiled from: CallState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/avcalls/call/models/CallState$a;", "", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.avcalls.call.models.CallState$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    public CallState(@k String str, @k String str2, @k CallDirection callDirection, @k InvitingState invitingState, @k MediaStatus mediaStatus, @k PeerStatus peerStatus, boolean z12, boolean z13, @k CameraPosition cameraPosition, boolean z14, @k CallMetaInfo callMetaInfo) {
        this.callId = str;
        this.localUserId = str2;
        this.direction = callDirection;
        this.invitingState = invitingState;
        this.localMediaStatus = mediaStatus;
        this.peerStatus = peerStatus;
        this.isVideo = z12;
        this.videoTxAllowed = z13;
        this.defaultCamera = cameraPosition;
        this.defaultCameraEnabled = z14;
        this.callMetaInfo = callMetaInfo;
    }

    @k
    public final CallState copy(@k String callId, @k String localUserId, @k CallDirection direction, @k InvitingState invitingState, @k MediaStatus localMediaStatus, @k PeerStatus peerStatus, boolean isVideo, boolean videoTxAllowed, @k CameraPosition defaultCamera, boolean defaultCameraEnabled, @k CallMetaInfo callMetaInfo) {
        return new CallState(callId, localUserId, direction, invitingState, localMediaStatus, peerStatus, isVideo, videoTxAllowed, defaultCamera, defaultCameraEnabled, callMetaInfo);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallState)) {
            return false;
        }
        CallState callState = (CallState) other;
        return L.f(this.callId, callState.callId) && L.f(this.localUserId, callState.localUserId) && this.direction == callState.direction && L.f(this.invitingState, callState.invitingState) && L.f(this.localMediaStatus, callState.localMediaStatus) && L.f(this.peerStatus, callState.peerStatus) && this.isVideo == callState.isVideo && this.videoTxAllowed == callState.videoTxAllowed && this.defaultCamera == callState.defaultCamera && this.defaultCameraEnabled == callState.defaultCameraEnabled && L.f(this.callMetaInfo, callState.callMetaInfo);
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    @k
    public final CallMetaInfo getCallMetaInfo() {
        return this.callMetaInfo;
    }

    @k
    public final CameraPosition getDefaultCamera() {
        return this.defaultCamera;
    }

    public final boolean getDefaultCameraEnabled() {
        return this.defaultCameraEnabled;
    }

    @k
    public final CallDirection getDirection() {
        return this.direction;
    }

    @k
    public final InvitingState getInvitingState() {
        return this.invitingState;
    }

    @k
    public final MediaStatus getLocalMediaStatus() {
        return this.localMediaStatus;
    }

    @k
    public final String getLocalUserId() {
        return this.localUserId;
    }

    @k
    public final PeerStatus getPeerStatus() {
        return this.peerStatus;
    }

    public final boolean getVideoTxAllowed() {
        return this.videoTxAllowed;
    }

    public int hashCode() {
        return this.callMetaInfo.hashCode() + r.i((this.defaultCamera.hashCode() + r.i(r.i((this.peerStatus.hashCode() + ((this.localMediaStatus.hashCode() + ((this.invitingState.hashCode() + ((this.direction.hashCode() + H.d(this.callId.hashCode() * 31, 31, this.localUserId)) * 31)) * 31)) * 31)) * 31, 31, this.isVideo), 31, this.videoTxAllowed)) * 31, 31, this.defaultCameraEnabled);
    }

    /* renamed from: isVideo, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    @k
    public String toString() {
        return "CallState(callId=" + this.callId + ", localUserId=" + this.localUserId + ", direction=" + this.direction + ", invitingState=" + this.invitingState + ", localMediaStatus=" + this.localMediaStatus + ", peerStatus=" + this.peerStatus + ", isVideo=" + this.isVideo + ", videoTxAllowed=" + this.videoTxAllowed + ", defaultCamera=" + this.defaultCamera + ", defaultCameraEnabled=" + this.defaultCameraEnabled + ", callMetaInfo=" + this.callMetaInfo + ')';
    }
}
