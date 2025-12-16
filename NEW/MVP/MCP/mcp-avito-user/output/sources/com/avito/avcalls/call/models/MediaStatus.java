package com.avito.avcalls.call.models;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MediaStatus.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/avcalls/call/models/MediaStatus;", "", "Lcom/avito/avcalls/call/models/MediaSenderState;", "mss", "", "connected", "<init>", "(Lcom/avito/avcalls/call/models/MediaSenderState;Z)V", "copy", "(Lcom/avito/avcalls/call/models/MediaSenderState;Z)Lcom/avito/avcalls/call/models/MediaStatus;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/avcalls/call/models/MediaSenderState;", "getMss", "()Lcom/avito/avcalls/call/models/MediaSenderState;", "Z", "getConnected", "()Z", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MediaStatus {
    private final boolean connected;

    @k
    private final MediaSenderState mss;

    public MediaStatus(@k MediaSenderState mediaSenderState, boolean z12) {
        this.mss = mediaSenderState;
        this.connected = z12;
    }

    public static /* synthetic */ MediaStatus copy$default(MediaStatus mediaStatus, MediaSenderState mediaSenderState, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            mediaSenderState = mediaStatus.mss;
        }
        if ((i12 & 2) != 0) {
            z12 = mediaStatus.connected;
        }
        return mediaStatus.copy(mediaSenderState, z12);
    }

    @k
    public final MediaStatus copy(@k MediaSenderState mss, boolean connected) {
        return new MediaStatus(mss, connected);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaStatus)) {
            return false;
        }
        MediaStatus mediaStatus = (MediaStatus) other;
        return L.f(this.mss, mediaStatus.mss) && this.connected == mediaStatus.connected;
    }

    public final boolean getConnected() {
        return this.connected;
    }

    @k
    public final MediaSenderState getMss() {
        return this.mss;
    }

    public int hashCode() {
        return Boolean.hashCode(this.connected) + (this.mss.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MediaStatus(mss=");
        sb2.append(this.mss);
        sb2.append(", connected=");
        return r.x(sb2, this.connected, ')');
    }
}
