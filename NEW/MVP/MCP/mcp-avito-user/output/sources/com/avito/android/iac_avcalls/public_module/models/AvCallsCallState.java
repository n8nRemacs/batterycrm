package com.avito.android.iac_avcalls.public_module.models;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvCallsCallState.kt */
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0002\u0010\u0017J\r\u0010*\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010+\u001a\u00020\u0010HÆ\u0003J\t\u0010,\u001a\u00020\u0016HÆ\u0003J\r\u0010-\u001a\u00060\u0003j\u0002`\u0006HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\t\u00103\u001a\u00020\u0010HÆ\u0003J\t\u00104\u001a\u00020\u0013HÆ\u0003J\u007f\u00105\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001J\u0013\u00106\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\u0005\u001a\u00060\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001d¨\u0006;"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallState;", "", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallId;", "localUserId", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsUserId;", "direction", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallDirection;", "invitingState", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState;", "localMediaStatus", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsMediaStatus;", "peerStatus", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsPeerStatus;", "isVideo", "", "videoTxAllowed", "defaultCamera", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCameraPosition;", "defaultCameraEnabled", Constants.REFERRER_API_META, "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallDirection;Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState;Lcom/avito/android/iac_avcalls/public_module/models/AvCallsMediaStatus;Lcom/avito/android/iac_avcalls/public_module/models/AvCallsPeerStatus;ZZLcom/avito/android/iac_avcalls/public_module/models/AvCallsCameraPosition;ZLcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;)V", "getCallId", "()Ljava/lang/String;", "getDefaultCamera", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCameraPosition;", "getDefaultCameraEnabled", "()Z", "getDirection", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallDirection;", "getInvitingState", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsInvitingState;", "getLocalMediaStatus", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsMediaStatus;", "getLocalUserId", "getMeta", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsCallMetaInfo;", "getPeerStatus", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsPeerStatus;", "getVideoTxAllowed", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AvCallsCallState {

    @k
    private final String callId;

    @k
    private final AvCallsCameraPosition defaultCamera;
    private final boolean defaultCameraEnabled;

    @k
    private final AvCallsCallDirection direction;

    @k
    private final AvCallsInvitingState invitingState;
    private final boolean isVideo;

    @k
    private final AvCallsMediaStatus localMediaStatus;

    @k
    private final String localUserId;

    @k
    private final AvCallsCallMetaInfo meta;

    @k
    private final AvCallsPeerStatus peerStatus;
    private final boolean videoTxAllowed;

    public AvCallsCallState(@k String str, @k String str2, @k AvCallsCallDirection avCallsCallDirection, @k AvCallsInvitingState avCallsInvitingState, @k AvCallsMediaStatus avCallsMediaStatus, @k AvCallsPeerStatus avCallsPeerStatus, boolean z12, boolean z13, @k AvCallsCameraPosition avCallsCameraPosition, boolean z14, @k AvCallsCallMetaInfo avCallsCallMetaInfo) {
        this.callId = str;
        this.localUserId = str2;
        this.direction = avCallsCallDirection;
        this.invitingState = avCallsInvitingState;
        this.localMediaStatus = avCallsMediaStatus;
        this.peerStatus = avCallsPeerStatus;
        this.isVideo = z12;
        this.videoTxAllowed = z13;
        this.defaultCamera = avCallsCameraPosition;
        this.defaultCameraEnabled = z14;
        this.meta = avCallsCallMetaInfo;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getDefaultCameraEnabled() {
        return this.defaultCameraEnabled;
    }

    @k
    /* renamed from: component11, reason: from getter */
    public final AvCallsCallMetaInfo getMeta() {
        return this.meta;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getLocalUserId() {
        return this.localUserId;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final AvCallsCallDirection getDirection() {
        return this.direction;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final AvCallsInvitingState getInvitingState() {
        return this.invitingState;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final AvCallsMediaStatus getLocalMediaStatus() {
        return this.localMediaStatus;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final AvCallsPeerStatus getPeerStatus() {
        return this.peerStatus;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getVideoTxAllowed() {
        return this.videoTxAllowed;
    }

    @k
    /* renamed from: component9, reason: from getter */
    public final AvCallsCameraPosition getDefaultCamera() {
        return this.defaultCamera;
    }

    @k
    public final AvCallsCallState copy(@k String callId, @k String localUserId, @k AvCallsCallDirection direction, @k AvCallsInvitingState invitingState, @k AvCallsMediaStatus localMediaStatus, @k AvCallsPeerStatus peerStatus, boolean isVideo, boolean videoTxAllowed, @k AvCallsCameraPosition defaultCamera, boolean defaultCameraEnabled, @k AvCallsCallMetaInfo meta) {
        return new AvCallsCallState(callId, localUserId, direction, invitingState, localMediaStatus, peerStatus, isVideo, videoTxAllowed, defaultCamera, defaultCameraEnabled, meta);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvCallsCallState)) {
            return false;
        }
        AvCallsCallState avCallsCallState = (AvCallsCallState) other;
        return L.f(this.callId, avCallsCallState.callId) && L.f(this.localUserId, avCallsCallState.localUserId) && this.direction == avCallsCallState.direction && L.f(this.invitingState, avCallsCallState.invitingState) && L.f(this.localMediaStatus, avCallsCallState.localMediaStatus) && L.f(this.peerStatus, avCallsCallState.peerStatus) && this.isVideo == avCallsCallState.isVideo && this.videoTxAllowed == avCallsCallState.videoTxAllowed && this.defaultCamera == avCallsCallState.defaultCamera && this.defaultCameraEnabled == avCallsCallState.defaultCameraEnabled && L.f(this.meta, avCallsCallState.meta);
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    @k
    public final AvCallsCameraPosition getDefaultCamera() {
        return this.defaultCamera;
    }

    public final boolean getDefaultCameraEnabled() {
        return this.defaultCameraEnabled;
    }

    @k
    public final AvCallsCallDirection getDirection() {
        return this.direction;
    }

    @k
    public final AvCallsInvitingState getInvitingState() {
        return this.invitingState;
    }

    @k
    public final AvCallsMediaStatus getLocalMediaStatus() {
        return this.localMediaStatus;
    }

    @k
    public final String getLocalUserId() {
        return this.localUserId;
    }

    @k
    public final AvCallsCallMetaInfo getMeta() {
        return this.meta;
    }

    @k
    public final AvCallsPeerStatus getPeerStatus() {
        return this.peerStatus;
    }

    public final boolean getVideoTxAllowed() {
        return this.videoTxAllowed;
    }

    public int hashCode() {
        return this.meta.hashCode() + r.i((this.defaultCamera.hashCode() + r.i(r.i((this.peerStatus.hashCode() + ((this.localMediaStatus.hashCode() + ((this.invitingState.hashCode() + ((this.direction.hashCode() + H.d(this.callId.hashCode() * 31, 31, this.localUserId)) * 31)) * 31)) * 31)) * 31, 31, this.isVideo), 31, this.videoTxAllowed)) * 31, 31, this.defaultCameraEnabled);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @k
    public String toString() {
        return "AvCallsCallState(callId=" + this.callId + ", localUserId=" + this.localUserId + ", direction=" + this.direction + ", invitingState=" + this.invitingState + ", localMediaStatus=" + this.localMediaStatus + ", peerStatus=" + this.peerStatus + ", isVideo=" + this.isVideo + ", videoTxAllowed=" + this.videoTxAllowed + ", defaultCamera=" + this.defaultCamera + ", defaultCameraEnabled=" + this.defaultCameraEnabled + ", meta=" + this.meta + ')';
    }
}
