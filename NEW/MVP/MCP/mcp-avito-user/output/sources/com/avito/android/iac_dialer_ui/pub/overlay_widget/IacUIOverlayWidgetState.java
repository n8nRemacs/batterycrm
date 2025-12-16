package com.avito.android.iac_dialer_ui.pub.overlay_widget;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.H0;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiImage;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.IacUIControlButtonsAudioDeviceState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacUIOverlayWidget.kt */
@H0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JV\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0014J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b-\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u0010\u0019¨\u00060"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/overlay_widget/IacUIOverlayWidgetState;", "LdL/d;", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "peerName", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "peerAvatar", "", "statusText", "", "callTimeActivatedAt", "callTimeFinishedAt", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsAudioDeviceState;", "audioDevice", "<init>", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsAudioDeviceState;)V", "component1", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "component2", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/lang/Long;", "component5", "component6", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsAudioDeviceState;", "copy", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsAudioDeviceState;)Lcom/avito/android/iac_dialer_ui/pub/overlay_widget/IacUIOverlayWidgetState;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "getPeerName", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "getPeerAvatar", "Ljava/lang/String;", "getStatusText", "Ljava/lang/Long;", "getCallTimeActivatedAt", "getCallTimeFinishedAt", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsAudioDeviceState;", "getAudioDevice", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacUIOverlayWidgetState implements dL.d {
    public static final int $stable = 0;

    @k
    private final IacUIControlButtonsAudioDeviceState audioDevice;

    @l
    private final Long callTimeActivatedAt;

    @l
    private final Long callTimeFinishedAt;

    @l
    private final IacPiiImage peerAvatar;

    @l
    private final IacPiiString peerName;

    @l
    private final String statusText;

    public IacUIOverlayWidgetState(@l IacPiiString iacPiiString, @l IacPiiImage iacPiiImage, @l String str, @l Long l12, @l Long l13, @k IacUIControlButtonsAudioDeviceState iacUIControlButtonsAudioDeviceState) {
        this.peerName = iacPiiString;
        this.peerAvatar = iacPiiImage;
        this.statusText = str;
        this.callTimeActivatedAt = l12;
        this.callTimeFinishedAt = l13;
        this.audioDevice = iacUIControlButtonsAudioDeviceState;
    }

    public static /* synthetic */ IacUIOverlayWidgetState copy$default(IacUIOverlayWidgetState iacUIOverlayWidgetState, IacPiiString iacPiiString, IacPiiImage iacPiiImage, String str, Long l12, Long l13, IacUIControlButtonsAudioDeviceState iacUIControlButtonsAudioDeviceState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            iacPiiString = iacUIOverlayWidgetState.peerName;
        }
        if ((i12 & 2) != 0) {
            iacPiiImage = iacUIOverlayWidgetState.peerAvatar;
        }
        IacPiiImage iacPiiImage2 = iacPiiImage;
        if ((i12 & 4) != 0) {
            str = iacUIOverlayWidgetState.statusText;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            l12 = iacUIOverlayWidgetState.callTimeActivatedAt;
        }
        Long l14 = l12;
        if ((i12 & 16) != 0) {
            l13 = iacUIOverlayWidgetState.callTimeFinishedAt;
        }
        Long l15 = l13;
        if ((i12 & 32) != 0) {
            iacUIControlButtonsAudioDeviceState = iacUIOverlayWidgetState.audioDevice;
        }
        return iacUIOverlayWidgetState.copy(iacPiiString, iacPiiImage2, str2, l14, l15, iacUIControlButtonsAudioDeviceState);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final IacPiiString getPeerName() {
        return this.peerName;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final IacPiiImage getPeerAvatar() {
        return this.peerAvatar;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getStatusText() {
        return this.statusText;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Long getCallTimeActivatedAt() {
        return this.callTimeActivatedAt;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Long getCallTimeFinishedAt() {
        return this.callTimeFinishedAt;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final IacUIControlButtonsAudioDeviceState getAudioDevice() {
        return this.audioDevice;
    }

    @k
    public final IacUIOverlayWidgetState copy(@l IacPiiString peerName, @l IacPiiImage peerAvatar, @l String statusText, @l Long callTimeActivatedAt, @l Long callTimeFinishedAt, @k IacUIControlButtonsAudioDeviceState audioDevice) {
        return new IacUIOverlayWidgetState(peerName, peerAvatar, statusText, callTimeActivatedAt, callTimeFinishedAt, audioDevice);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacUIOverlayWidgetState)) {
            return false;
        }
        IacUIOverlayWidgetState iacUIOverlayWidgetState = (IacUIOverlayWidgetState) other;
        return L.f(this.peerName, iacUIOverlayWidgetState.peerName) && L.f(this.peerAvatar, iacUIOverlayWidgetState.peerAvatar) && L.f(this.statusText, iacUIOverlayWidgetState.statusText) && L.f(this.callTimeActivatedAt, iacUIOverlayWidgetState.callTimeActivatedAt) && L.f(this.callTimeFinishedAt, iacUIOverlayWidgetState.callTimeFinishedAt) && this.audioDevice == iacUIOverlayWidgetState.audioDevice;
    }

    @k
    public final IacUIControlButtonsAudioDeviceState getAudioDevice() {
        return this.audioDevice;
    }

    @l
    public final Long getCallTimeActivatedAt() {
        return this.callTimeActivatedAt;
    }

    @l
    public final Long getCallTimeFinishedAt() {
        return this.callTimeFinishedAt;
    }

    @l
    public final IacPiiImage getPeerAvatar() {
        return this.peerAvatar;
    }

    @l
    public final IacPiiString getPeerName() {
        return this.peerName;
    }

    @l
    public final String getStatusText() {
        return this.statusText;
    }

    public int hashCode() {
        IacPiiString iacPiiString = this.peerName;
        int iHashCode = (iacPiiString == null ? 0 : iacPiiString.hashCode()) * 31;
        IacPiiImage iacPiiImage = this.peerAvatar;
        int iHashCode2 = (iHashCode + (iacPiiImage == null ? 0 : iacPiiImage.hashCode())) * 31;
        String str = this.statusText;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.callTimeActivatedAt;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.callTimeFinishedAt;
        return this.audioDevice.hashCode() + ((iHashCode4 + (l13 != null ? l13.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        return "IacUIOverlayWidgetState(peerName=" + this.peerName + ", peerAvatar=" + this.peerAvatar + ", statusText=" + this.statusText + ", callTimeActivatedAt=" + this.callTimeActivatedAt + ", callTimeFinishedAt=" + this.callTimeFinishedAt + ", audioDevice=" + this.audioDevice + ')';
    }
}
