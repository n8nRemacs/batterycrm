package com.avito.avcalls.call.models;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PeerStatus.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/avcalls/call/models/PeerStatus;", "", "", "Lcom/avito/avcalls/call/models/UserId;", ChannelContext.Item.USER_ID, "endpointId", "", "wasRingingReceived", "Lcom/avito/avcalls/call/models/MediaStatus;", "mediaStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/avito/avcalls/call/models/MediaStatus;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLcom/avito/avcalls/call/models/MediaStatus;)Lcom/avito/avcalls/call/models/PeerStatus;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUserId", "getEndpointId", "Z", "getWasRingingReceived", "()Z", "Lcom/avito/avcalls/call/models/MediaStatus;", "getMediaStatus", "()Lcom/avito/avcalls/call/models/MediaStatus;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PeerStatus {

    @k
    private final String endpointId;

    @k
    private final MediaStatus mediaStatus;

    @k
    private final String userId;
    private final boolean wasRingingReceived;

    public PeerStatus(@k String str, @k String str2, boolean z12, @k MediaStatus mediaStatus) {
        this.userId = str;
        this.endpointId = str2;
        this.wasRingingReceived = z12;
        this.mediaStatus = mediaStatus;
    }

    public static /* synthetic */ PeerStatus copy$default(PeerStatus peerStatus, String str, String str2, boolean z12, MediaStatus mediaStatus, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = peerStatus.userId;
        }
        if ((i12 & 2) != 0) {
            str2 = peerStatus.endpointId;
        }
        if ((i12 & 4) != 0) {
            z12 = peerStatus.wasRingingReceived;
        }
        if ((i12 & 8) != 0) {
            mediaStatus = peerStatus.mediaStatus;
        }
        return peerStatus.copy(str, str2, z12, mediaStatus);
    }

    @k
    public final PeerStatus copy(@k String userId, @k String endpointId, boolean wasRingingReceived, @k MediaStatus mediaStatus) {
        return new PeerStatus(userId, endpointId, wasRingingReceived, mediaStatus);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PeerStatus)) {
            return false;
        }
        PeerStatus peerStatus = (PeerStatus) other;
        return L.f(this.userId, peerStatus.userId) && L.f(this.endpointId, peerStatus.endpointId) && this.wasRingingReceived == peerStatus.wasRingingReceived && L.f(this.mediaStatus, peerStatus.mediaStatus);
    }

    @k
    public final String getEndpointId() {
        return this.endpointId;
    }

    @k
    public final MediaStatus getMediaStatus() {
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
        return "PeerStatus(userId=" + this.userId + ", endpointId=" + this.endpointId + ", wasRingingReceived=" + this.wasRingingReceived + ", mediaStatus=" + this.mediaStatus + ')';
    }
}
