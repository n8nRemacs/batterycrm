package com.avito.avcalls.call.models;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: MediaSenderState.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/avito/avcalls/call/models/MediaSenderState;", "", "", "sendingAudio", "sendingVideo", "onHold", "<init>", "(ZZZ)V", "copy", "(ZZZ)Lcom/avito/avcalls/call/models/MediaSenderState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getSendingAudio", "()Z", "getSendingVideo", "getOnHold", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MediaSenderState {
    private final boolean onHold;
    private final boolean sendingAudio;
    private final boolean sendingVideo;

    public MediaSenderState(boolean z12, boolean z13, boolean z14) {
        this.sendingAudio = z12;
        this.sendingVideo = z13;
        this.onHold = z14;
    }

    public static /* synthetic */ MediaSenderState copy$default(MediaSenderState mediaSenderState, boolean z12, boolean z13, boolean z14, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = mediaSenderState.sendingAudio;
        }
        if ((i12 & 2) != 0) {
            z13 = mediaSenderState.sendingVideo;
        }
        if ((i12 & 4) != 0) {
            z14 = mediaSenderState.onHold;
        }
        return mediaSenderState.copy(z12, z13, z14);
    }

    @k
    public final MediaSenderState copy(boolean sendingAudio, boolean sendingVideo, boolean onHold) {
        return new MediaSenderState(sendingAudio, sendingVideo, onHold);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaSenderState)) {
            return false;
        }
        MediaSenderState mediaSenderState = (MediaSenderState) other;
        return this.sendingAudio == mediaSenderState.sendingAudio && this.sendingVideo == mediaSenderState.sendingVideo && this.onHold == mediaSenderState.onHold;
    }

    public final boolean getOnHold() {
        return this.onHold;
    }

    public final boolean getSendingAudio() {
        return this.sendingAudio;
    }

    public final boolean getSendingVideo() {
        return this.sendingVideo;
    }

    public int hashCode() {
        return Boolean.hashCode(this.onHold) + r.i(Boolean.hashCode(this.sendingAudio) * 31, 31, this.sendingVideo);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MediaSenderState(sendingAudio=");
        sb2.append(this.sendingAudio);
        sb2.append(", sendingVideo=");
        sb2.append(this.sendingVideo);
        sb2.append(", onHold=");
        return r.x(sb2, this.onHold, ')');
    }
}
