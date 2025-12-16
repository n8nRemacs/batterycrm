package com.avito.android.iac_avcalls.public_module.models;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: AvCallsMediaSenderState.kt */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsMediaSenderState;", "", "sendingAudio", "", "sendingVideo", "onHold", "(ZZZ)V", "getOnHold", "()Z", "getSendingAudio", "getSendingVideo", "component1", "component2", "component3", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AvCallsMediaSenderState {
    private final boolean onHold;
    private final boolean sendingAudio;
    private final boolean sendingVideo;

    public AvCallsMediaSenderState(boolean z12, boolean z13, boolean z14) {
        this.sendingAudio = z12;
        this.sendingVideo = z13;
        this.onHold = z14;
    }

    public static /* synthetic */ AvCallsMediaSenderState copy$default(AvCallsMediaSenderState avCallsMediaSenderState, boolean z12, boolean z13, boolean z14, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = avCallsMediaSenderState.sendingAudio;
        }
        if ((i12 & 2) != 0) {
            z13 = avCallsMediaSenderState.sendingVideo;
        }
        if ((i12 & 4) != 0) {
            z14 = avCallsMediaSenderState.onHold;
        }
        return avCallsMediaSenderState.copy(z12, z13, z14);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getSendingAudio() {
        return this.sendingAudio;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSendingVideo() {
        return this.sendingVideo;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getOnHold() {
        return this.onHold;
    }

    @k
    public final AvCallsMediaSenderState copy(boolean sendingAudio, boolean sendingVideo, boolean onHold) {
        return new AvCallsMediaSenderState(sendingAudio, sendingVideo, onHold);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvCallsMediaSenderState)) {
            return false;
        }
        AvCallsMediaSenderState avCallsMediaSenderState = (AvCallsMediaSenderState) other;
        return this.sendingAudio == avCallsMediaSenderState.sendingAudio && this.sendingVideo == avCallsMediaSenderState.sendingVideo && this.onHold == avCallsMediaSenderState.onHold;
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
        StringBuilder sb2 = new StringBuilder("AvCallsMediaSenderState(sendingAudio=");
        sb2.append(this.sendingAudio);
        sb2.append(", sendingVideo=");
        sb2.append(this.sendingVideo);
        sb2.append(", onHold=");
        return r.x(sb2, this.onHold, ')');
    }
}
