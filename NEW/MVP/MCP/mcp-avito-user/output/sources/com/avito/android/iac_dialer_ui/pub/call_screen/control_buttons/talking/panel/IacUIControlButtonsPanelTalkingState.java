package com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.panel;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.H0;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.IacUIControlButtonsAudioDeviceState;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.IacUIControlButtonsToggleCameraState;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.IacUIControlButtonsToggleMicState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacUIControlButtonsPanelTalking.kt */
@H0
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010\u0013¨\u0006)"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/panel/IacUIControlButtonsPanelTalkingState;", "LdL/d;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsAudioDeviceState;", "audioDevice", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsToggleMicState;", "toggleMic", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsToggleCameraState;", "toggleCamera", "Lkotlin/G0;", "switchCamera", "<init>", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsAudioDeviceState;Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsToggleMicState;Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsToggleCameraState;Lkotlin/G0;)V", "component1", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsAudioDeviceState;", "component2", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsToggleMicState;", "component3", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsToggleCameraState;", "component4", "()Lkotlin/G0;", "copy", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsAudioDeviceState;Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsToggleMicState;Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsToggleCameraState;Lkotlin/G0;)Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/panel/IacUIControlButtonsPanelTalkingState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsAudioDeviceState;", "getAudioDevice", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsToggleMicState;", "getToggleMic", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/IacUIControlButtonsToggleCameraState;", "getToggleCamera", "Lkotlin/G0;", "getSwitchCamera", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacUIControlButtonsPanelTalkingState implements dL.d {
    public static final int $stable = 0;

    @k
    private final IacUIControlButtonsAudioDeviceState audioDevice;

    @l
    private final G0 switchCamera;

    @l
    private final IacUIControlButtonsToggleCameraState toggleCamera;

    @k
    private final IacUIControlButtonsToggleMicState toggleMic;

    public IacUIControlButtonsPanelTalkingState(@k IacUIControlButtonsAudioDeviceState iacUIControlButtonsAudioDeviceState, @k IacUIControlButtonsToggleMicState iacUIControlButtonsToggleMicState, @l IacUIControlButtonsToggleCameraState iacUIControlButtonsToggleCameraState, @l G0 g02) {
        this.audioDevice = iacUIControlButtonsAudioDeviceState;
        this.toggleMic = iacUIControlButtonsToggleMicState;
        this.toggleCamera = iacUIControlButtonsToggleCameraState;
        this.switchCamera = g02;
    }

    public static /* synthetic */ IacUIControlButtonsPanelTalkingState copy$default(IacUIControlButtonsPanelTalkingState iacUIControlButtonsPanelTalkingState, IacUIControlButtonsAudioDeviceState iacUIControlButtonsAudioDeviceState, IacUIControlButtonsToggleMicState iacUIControlButtonsToggleMicState, IacUIControlButtonsToggleCameraState iacUIControlButtonsToggleCameraState, G0 g02, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            iacUIControlButtonsAudioDeviceState = iacUIControlButtonsPanelTalkingState.audioDevice;
        }
        if ((i12 & 2) != 0) {
            iacUIControlButtonsToggleMicState = iacUIControlButtonsPanelTalkingState.toggleMic;
        }
        if ((i12 & 4) != 0) {
            iacUIControlButtonsToggleCameraState = iacUIControlButtonsPanelTalkingState.toggleCamera;
        }
        if ((i12 & 8) != 0) {
            g02 = iacUIControlButtonsPanelTalkingState.switchCamera;
        }
        return iacUIControlButtonsPanelTalkingState.copy(iacUIControlButtonsAudioDeviceState, iacUIControlButtonsToggleMicState, iacUIControlButtonsToggleCameraState, g02);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final IacUIControlButtonsAudioDeviceState getAudioDevice() {
        return this.audioDevice;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final IacUIControlButtonsToggleMicState getToggleMic() {
        return this.toggleMic;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final IacUIControlButtonsToggleCameraState getToggleCamera() {
        return this.toggleCamera;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final G0 getSwitchCamera() {
        return this.switchCamera;
    }

    @k
    public final IacUIControlButtonsPanelTalkingState copy(@k IacUIControlButtonsAudioDeviceState audioDevice, @k IacUIControlButtonsToggleMicState toggleMic, @l IacUIControlButtonsToggleCameraState toggleCamera, @l G0 switchCamera) {
        return new IacUIControlButtonsPanelTalkingState(audioDevice, toggleMic, toggleCamera, switchCamera);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacUIControlButtonsPanelTalkingState)) {
            return false;
        }
        IacUIControlButtonsPanelTalkingState iacUIControlButtonsPanelTalkingState = (IacUIControlButtonsPanelTalkingState) other;
        return this.audioDevice == iacUIControlButtonsPanelTalkingState.audioDevice && this.toggleMic == iacUIControlButtonsPanelTalkingState.toggleMic && this.toggleCamera == iacUIControlButtonsPanelTalkingState.toggleCamera && L.f(this.switchCamera, iacUIControlButtonsPanelTalkingState.switchCamera);
    }

    @k
    public final IacUIControlButtonsAudioDeviceState getAudioDevice() {
        return this.audioDevice;
    }

    @l
    public final G0 getSwitchCamera() {
        return this.switchCamera;
    }

    @l
    public final IacUIControlButtonsToggleCameraState getToggleCamera() {
        return this.toggleCamera;
    }

    @k
    public final IacUIControlButtonsToggleMicState getToggleMic() {
        return this.toggleMic;
    }

    public int hashCode() {
        int iHashCode = (this.toggleMic.hashCode() + (this.audioDevice.hashCode() * 31)) * 31;
        IacUIControlButtonsToggleCameraState iacUIControlButtonsToggleCameraState = this.toggleCamera;
        int iHashCode2 = (iHashCode + (iacUIControlButtonsToggleCameraState == null ? 0 : iacUIControlButtonsToggleCameraState.hashCode())) * 31;
        G0 g02 = this.switchCamera;
        return iHashCode2 + (g02 != null ? g02.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacUIControlButtonsPanelTalkingState(audioDevice=");
        sb2.append(this.audioDevice);
        sb2.append(", toggleMic=");
        sb2.append(this.toggleMic);
        sb2.append(", toggleCamera=");
        sb2.append(this.toggleCamera);
        sb2.append(", switchCamera=");
        return AK.c.v(sb2, this.switchCamera, ')');
    }
}
