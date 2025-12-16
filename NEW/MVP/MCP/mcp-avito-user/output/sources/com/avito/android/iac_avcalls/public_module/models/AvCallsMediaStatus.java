package com.avito.android.iac_avcalls.public_module.models;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvCallsMediaStatus.kt */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/iac_avcalls/public_module/models/AvCallsMediaStatus;", "", "mss", "Lcom/avito/android/iac_avcalls/public_module/models/AvCallsMediaSenderState;", "connected", "", "(Lcom/avito/android/iac_avcalls/public_module/models/AvCallsMediaSenderState;Z)V", "getConnected", "()Z", "getMss", "()Lcom/avito/android/iac_avcalls/public_module/models/AvCallsMediaSenderState;", "component1", "component2", "copy", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito_iac-avcalls_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AvCallsMediaStatus {
    private final boolean connected;

    @k
    private final AvCallsMediaSenderState mss;

    public AvCallsMediaStatus(@k AvCallsMediaSenderState avCallsMediaSenderState, boolean z12) {
        this.mss = avCallsMediaSenderState;
        this.connected = z12;
    }

    public static /* synthetic */ AvCallsMediaStatus copy$default(AvCallsMediaStatus avCallsMediaStatus, AvCallsMediaSenderState avCallsMediaSenderState, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            avCallsMediaSenderState = avCallsMediaStatus.mss;
        }
        if ((i12 & 2) != 0) {
            z12 = avCallsMediaStatus.connected;
        }
        return avCallsMediaStatus.copy(avCallsMediaSenderState, z12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AvCallsMediaSenderState getMss() {
        return this.mss;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getConnected() {
        return this.connected;
    }

    @k
    public final AvCallsMediaStatus copy(@k AvCallsMediaSenderState mss, boolean connected) {
        return new AvCallsMediaStatus(mss, connected);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvCallsMediaStatus)) {
            return false;
        }
        AvCallsMediaStatus avCallsMediaStatus = (AvCallsMediaStatus) other;
        return L.f(this.mss, avCallsMediaStatus.mss) && this.connected == avCallsMediaStatus.connected;
    }

    public final boolean getConnected() {
        return this.connected;
    }

    @k
    public final AvCallsMediaSenderState getMss() {
        return this.mss;
    }

    public int hashCode() {
        return Boolean.hashCode(this.connected) + (this.mss.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvCallsMediaStatus(mss=");
        sb2.append(this.mss);
        sb2.append(", connected=");
        return r.x(sb2, this.connected, ')');
    }
}
