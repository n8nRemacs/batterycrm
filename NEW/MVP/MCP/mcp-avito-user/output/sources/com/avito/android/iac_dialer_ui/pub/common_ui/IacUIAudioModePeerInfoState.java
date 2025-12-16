package com.avito.android.iac_dialer_ui.pub.common_ui;

import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiImage;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacUIAudioModePeerInfo.kt */
@H0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018JV\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0014R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b.\u0010\u0018¨\u0006/"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUIAudioModePeerInfoState;", "LdL/d;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "peerName", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "peerAvatar", "", "statusText", "", "showTimerInStatus", "", "callTimeActivatedAt", "callTimeFinishedAt", "<init>", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)V", "component1", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "component2", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "component3", "()Ljava/lang/String;", "component4", "()Z", "component5", "()Ljava/lang/Long;", "component6", "copy", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;)Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUIAudioModePeerInfoState;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "getPeerName", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "getPeerAvatar", "Ljava/lang/String;", "getStatusText", "Z", "getShowTimerInStatus", "Ljava/lang/Long;", "getCallTimeActivatedAt", "getCallTimeFinishedAt", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacUIAudioModePeerInfoState implements dL.d {
    public static final int $stable = 0;

    @Y61.l
    private final Long callTimeActivatedAt;

    @Y61.l
    private final Long callTimeFinishedAt;

    @Y61.l
    private final IacPiiImage peerAvatar;

    @Y61.l
    private final IacPiiString peerName;
    private final boolean showTimerInStatus;

    @Y61.l
    private final String statusText;

    public IacUIAudioModePeerInfoState(@Y61.l IacPiiString iacPiiString, @Y61.l IacPiiImage iacPiiImage, @Y61.l String str, boolean z12, @Y61.l Long l12, @Y61.l Long l13) {
        this.peerName = iacPiiString;
        this.peerAvatar = iacPiiImage;
        this.statusText = str;
        this.showTimerInStatus = z12;
        this.callTimeActivatedAt = l12;
        this.callTimeFinishedAt = l13;
    }

    public static /* synthetic */ IacUIAudioModePeerInfoState copy$default(IacUIAudioModePeerInfoState iacUIAudioModePeerInfoState, IacPiiString iacPiiString, IacPiiImage iacPiiImage, String str, boolean z12, Long l12, Long l13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            iacPiiString = iacUIAudioModePeerInfoState.peerName;
        }
        if ((i12 & 2) != 0) {
            iacPiiImage = iacUIAudioModePeerInfoState.peerAvatar;
        }
        IacPiiImage iacPiiImage2 = iacPiiImage;
        if ((i12 & 4) != 0) {
            str = iacUIAudioModePeerInfoState.statusText;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            z12 = iacUIAudioModePeerInfoState.showTimerInStatus;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            l12 = iacUIAudioModePeerInfoState.callTimeActivatedAt;
        }
        Long l14 = l12;
        if ((i12 & 32) != 0) {
            l13 = iacUIAudioModePeerInfoState.callTimeFinishedAt;
        }
        return iacUIAudioModePeerInfoState.copy(iacPiiString, iacPiiImage2, str2, z13, l14, l13);
    }

    @Y61.l
    /* renamed from: component1, reason: from getter */
    public final IacPiiString getPeerName() {
        return this.peerName;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final IacPiiImage getPeerAvatar() {
        return this.peerAvatar;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowTimerInStatus() {
        return this.showTimerInStatus;
    }

    @Y61.l
    /* renamed from: component5, reason: from getter */
    public final Long getCallTimeActivatedAt() {
        return this.callTimeActivatedAt;
    }

    @Y61.l
    /* renamed from: component6, reason: from getter */
    public final Long getCallTimeFinishedAt() {
        return this.callTimeFinishedAt;
    }

    @Y61.k
    public final IacUIAudioModePeerInfoState copy(@Y61.l IacPiiString peerName, @Y61.l IacPiiImage peerAvatar, @Y61.l String statusText, boolean showTimerInStatus, @Y61.l Long callTimeActivatedAt, @Y61.l Long callTimeFinishedAt) {
        return new IacUIAudioModePeerInfoState(peerName, peerAvatar, statusText, showTimerInStatus, callTimeActivatedAt, callTimeFinishedAt);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacUIAudioModePeerInfoState)) {
            return false;
        }
        IacUIAudioModePeerInfoState iacUIAudioModePeerInfoState = (IacUIAudioModePeerInfoState) other;
        return L.f(this.peerName, iacUIAudioModePeerInfoState.peerName) && L.f(this.peerAvatar, iacUIAudioModePeerInfoState.peerAvatar) && L.f(this.statusText, iacUIAudioModePeerInfoState.statusText) && this.showTimerInStatus == iacUIAudioModePeerInfoState.showTimerInStatus && L.f(this.callTimeActivatedAt, iacUIAudioModePeerInfoState.callTimeActivatedAt) && L.f(this.callTimeFinishedAt, iacUIAudioModePeerInfoState.callTimeFinishedAt);
    }

    @Y61.l
    public final Long getCallTimeActivatedAt() {
        return this.callTimeActivatedAt;
    }

    @Y61.l
    public final Long getCallTimeFinishedAt() {
        return this.callTimeFinishedAt;
    }

    @Y61.l
    public final IacPiiImage getPeerAvatar() {
        return this.peerAvatar;
    }

    @Y61.l
    public final IacPiiString getPeerName() {
        return this.peerName;
    }

    public final boolean getShowTimerInStatus() {
        return this.showTimerInStatus;
    }

    @Y61.l
    public final String getStatusText() {
        return this.statusText;
    }

    public int hashCode() {
        IacPiiString iacPiiString = this.peerName;
        int iHashCode = (iacPiiString == null ? 0 : iacPiiString.hashCode()) * 31;
        IacPiiImage iacPiiImage = this.peerAvatar;
        int iHashCode2 = (iHashCode + (iacPiiImage == null ? 0 : iacPiiImage.hashCode())) * 31;
        String str = this.statusText;
        int i12 = r.i((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.showTimerInStatus);
        Long l12 = this.callTimeActivatedAt;
        int iHashCode3 = (i12 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.callTimeFinishedAt;
        return iHashCode3 + (l13 != null ? l13.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacUIAudioModePeerInfoState(peerName=");
        sb2.append(this.peerName);
        sb2.append(", peerAvatar=");
        sb2.append(this.peerAvatar);
        sb2.append(", statusText=");
        sb2.append(this.statusText);
        sb2.append(", showTimerInStatus=");
        sb2.append(this.showTimerInStatus);
        sb2.append(", callTimeActivatedAt=");
        sb2.append(this.callTimeActivatedAt);
        sb2.append(", callTimeFinishedAt=");
        return androidx.media3.exoplayer.analytics.m.m(sb2, this.callTimeFinishedAt, ')');
    }
}
