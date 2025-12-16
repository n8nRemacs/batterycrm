package com.avito.android.iac_avcalls.public_module.models;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvCallsPeerStatus.kt */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsPeerStatus;", "", ChannelContext.Item.USER_ID, "", "endpointId", "wasRingingReceived", "", "mediaStatus", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsMediaStatus;", "(Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/iac_avcalls/public_module/models/AvCallsMediaStatus;)V", "getEndpointId", "()Ljava/lang/String;", "getMediaStatus", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsMediaStatus;", "getUserId", "getWasRingingReceived", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AvCallsPeerStatus {

    @k
    private final String endpointId;

    @k
    private final AvCallsMediaStatus mediaStatus;

    @k
    private final String userId;
    private final boolean wasRingingReceived;

    public AvCallsPeerStatus(@k String str, @k String str2, boolean z12, @k AvCallsMediaStatus avCallsMediaStatus) {
        this.userId = str;
        this.endpointId = str2;
        this.wasRingingReceived = z12;
        this.mediaStatus = avCallsMediaStatus;
    }

    public static /* synthetic */ AvCallsPeerStatus copy$default(AvCallsPeerStatus avCallsPeerStatus, String str, String str2, boolean z12, AvCallsMediaStatus avCallsMediaStatus, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = avCallsPeerStatus.userId;
        }
        if ((i12 & 2) != 0) {
            str2 = avCallsPeerStatus.endpointId;
        }
        if ((i12 & 4) != 0) {
            z12 = avCallsPeerStatus.wasRingingReceived;
        }
        if ((i12 & 8) != 0) {
            avCallsMediaStatus = avCallsPeerStatus.mediaStatus;
        }
        return avCallsPeerStatus.copy(str, str2, z12, avCallsMediaStatus);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getEndpointId() {
        return this.endpointId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getWasRingingReceived() {
        return this.wasRingingReceived;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final AvCallsMediaStatus getMediaStatus() {
        return this.mediaStatus;
    }

    @k
    public final AvCallsPeerStatus copy(@k String userId, @k String endpointId, boolean wasRingingReceived, @k AvCallsMediaStatus mediaStatus) {
        return new AvCallsPeerStatus(userId, endpointId, wasRingingReceived, mediaStatus);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvCallsPeerStatus)) {
            return false;
        }
        AvCallsPeerStatus avCallsPeerStatus = (AvCallsPeerStatus) other;
        return L.f(this.userId, avCallsPeerStatus.userId) && L.f(this.endpointId, avCallsPeerStatus.endpointId) && this.wasRingingReceived == avCallsPeerStatus.wasRingingReceived && L.f(this.mediaStatus, avCallsPeerStatus.mediaStatus);
    }

    @k
    public final String getEndpointId() {
        return this.endpointId;
    }

    @k
    public final AvCallsMediaStatus getMediaStatus() {
        return this.mediaStatus;
    }

    @k
    public final String getUserId() {
        return this.userId;
    }

    public final boolean getWasRingingReceived() {
        return this.wasRingingReceived;
    }

    public int hashCode() {
        return this.mediaStatus.hashCode() + r.i(H.d(this.userId.hashCode() * 31, 31, this.endpointId), 31, this.wasRingingReceived);
    }

    @k
    public String toString() {
        return "AvCallsPeerStatus(userId=" + this.userId + ", endpointId=" + this.endpointId + ", wasRingingReceived=" + this.wasRingingReceived + ", mediaStatus=" + this.mediaStatus + ')';
    }
}
