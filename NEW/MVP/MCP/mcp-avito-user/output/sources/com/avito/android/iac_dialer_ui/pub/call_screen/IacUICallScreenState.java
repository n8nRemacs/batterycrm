package com.avito.android.iac_dialer_ui.pub.call_screen;

import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.IacUIAcceptTimeoutProgressBarState;
import com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.panel.IacUIControlButtonsPanelTalkingState;
import com.avito.android.iac_dialer_ui.pub.call_screen.standalone_status.IacUIStandaloneStatusState;
import com.avito.android.iac_dialer_ui.pub.call_screen.toasts.IacUICallToastState;
import com.avito.android.iac_dialer_ui.pub.call_screen.video_mode_peer_info.IacUIVideoModePeerInfoState;
import com.avito.android.iac_dialer_ui.pub.call_screen.video_renderer.IacUIVideoRendererState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUIAudioModeItemInfoState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUIAudioModePeerInfoState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUICallHeaderState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacUICallScreenState.kt */
@H0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0007()*+,-.B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0013¨\u0006/"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState;", "LdL/d;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$Content;", "content", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/toasts/IacUICallToastState;", "toast", "", "keepScreenOn", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState;", "audioDevicesBottomSheetState", "<init>", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$Content;Lcom/avito/android/iac_dialer_ui/pub/call_screen/toasts/IacUICallToastState;ZLcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState;)V", "component1", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$Content;", "component2", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/toasts/IacUICallToastState;", "component3", "()Z", "component4", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState;", "copy", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$Content;Lcom/avito/android/iac_dialer_ui/pub/call_screen/toasts/IacUICallToastState;ZLcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState;)Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$Content;", "getContent", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/toasts/IacUICallToastState;", "getToast", "Z", "getKeepScreenOn", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState;", "getAudioDevicesBottomSheetState", "AudioModeContent", "Content", "ControlButtons", "DtmfButtons", "IdleModeContent", "SupportModeContent", "VideoModeContent", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacUICallScreenState implements dL.d {
    public static final int $stable = 0;

    @Y61.k
    private final IacUIAudioDevicesBottomSheetState audioDevicesBottomSheetState;

    @Y61.k
    private final Content content;
    private final boolean keepScreenOn;

    @Y61.l
    private final IacUICallToastState toast;

    /* compiled from: IacUICallScreenState.kt */
    @H0
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003JK\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$AudioModeContent;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$Content;", "callHeader", "Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUICallHeaderState;", "peerInfo", "Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUIAudioModePeerInfoState;", "itemInfo", "Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUIAudioModeItemInfoState;", "standaloneStatus", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/standalone_status/IacUIStandaloneStatusState;", "acceptTimeoutProgressBar", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/accept_timeout/IacUIAcceptTimeoutProgressBarState;", "controlButtons", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons;", "(Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUICallHeaderState;Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUIAudioModePeerInfoState;Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUIAudioModeItemInfoState;Lcom/avito/android/iac_dialer_ui/pub/call_screen/standalone_status/IacUIStandaloneStatusState;Lcom/avito/android/iac_dialer_ui/pub/call_screen/accept_timeout/IacUIAcceptTimeoutProgressBarState;Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons;)V", "getAcceptTimeoutProgressBar", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/accept_timeout/IacUIAcceptTimeoutProgressBarState;", "getCallHeader", "()Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUICallHeaderState;", "getControlButtons", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons;", "getItemInfo", "()Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUIAudioModeItemInfoState;", "getPeerInfo", "()Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUIAudioModePeerInfoState;", "getStandaloneStatus", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/standalone_status/IacUIStandaloneStatusState;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AudioModeContent implements Content {
        public static final int $stable = 0;

        @Y61.l
        private final IacUIAcceptTimeoutProgressBarState acceptTimeoutProgressBar;

        @Y61.k
        private final IacUICallHeaderState callHeader;

        @Y61.l
        private final ControlButtons controlButtons;

        @Y61.l
        private final IacUIAudioModeItemInfoState itemInfo;

        @Y61.k
        private final IacUIAudioModePeerInfoState peerInfo;

        @Y61.k
        private final IacUIStandaloneStatusState standaloneStatus;

        public AudioModeContent(@Y61.k IacUICallHeaderState iacUICallHeaderState, @Y61.k IacUIAudioModePeerInfoState iacUIAudioModePeerInfoState, @Y61.l IacUIAudioModeItemInfoState iacUIAudioModeItemInfoState, @Y61.k IacUIStandaloneStatusState iacUIStandaloneStatusState, @Y61.l IacUIAcceptTimeoutProgressBarState iacUIAcceptTimeoutProgressBarState, @Y61.l ControlButtons controlButtons) {
            this.callHeader = iacUICallHeaderState;
            this.peerInfo = iacUIAudioModePeerInfoState;
            this.itemInfo = iacUIAudioModeItemInfoState;
            this.standaloneStatus = iacUIStandaloneStatusState;
            this.acceptTimeoutProgressBar = iacUIAcceptTimeoutProgressBarState;
            this.controlButtons = controlButtons;
        }

        public static /* synthetic */ AudioModeContent copy$default(AudioModeContent audioModeContent, IacUICallHeaderState iacUICallHeaderState, IacUIAudioModePeerInfoState iacUIAudioModePeerInfoState, IacUIAudioModeItemInfoState iacUIAudioModeItemInfoState, IacUIStandaloneStatusState iacUIStandaloneStatusState, IacUIAcceptTimeoutProgressBarState iacUIAcceptTimeoutProgressBarState, ControlButtons controlButtons, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iacUICallHeaderState = audioModeContent.callHeader;
            }
            if ((i12 & 2) != 0) {
                iacUIAudioModePeerInfoState = audioModeContent.peerInfo;
            }
            IacUIAudioModePeerInfoState iacUIAudioModePeerInfoState2 = iacUIAudioModePeerInfoState;
            if ((i12 & 4) != 0) {
                iacUIAudioModeItemInfoState = audioModeContent.itemInfo;
            }
            IacUIAudioModeItemInfoState iacUIAudioModeItemInfoState2 = iacUIAudioModeItemInfoState;
            if ((i12 & 8) != 0) {
                iacUIStandaloneStatusState = audioModeContent.standaloneStatus;
            }
            IacUIStandaloneStatusState iacUIStandaloneStatusState2 = iacUIStandaloneStatusState;
            if ((i12 & 16) != 0) {
                iacUIAcceptTimeoutProgressBarState = audioModeContent.acceptTimeoutProgressBar;
            }
            IacUIAcceptTimeoutProgressBarState iacUIAcceptTimeoutProgressBarState2 = iacUIAcceptTimeoutProgressBarState;
            if ((i12 & 32) != 0) {
                controlButtons = audioModeContent.controlButtons;
            }
            return audioModeContent.copy(iacUICallHeaderState, iacUIAudioModePeerInfoState2, iacUIAudioModeItemInfoState2, iacUIStandaloneStatusState2, iacUIAcceptTimeoutProgressBarState2, controlButtons);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final IacUICallHeaderState getCallHeader() {
            return this.callHeader;
        }

        @Y61.k
        /* renamed from: component2, reason: from getter */
        public final IacUIAudioModePeerInfoState getPeerInfo() {
            return this.peerInfo;
        }

        @Y61.l
        /* renamed from: component3, reason: from getter */
        public final IacUIAudioModeItemInfoState getItemInfo() {
            return this.itemInfo;
        }

        @Y61.k
        /* renamed from: component4, reason: from getter */
        public final IacUIStandaloneStatusState getStandaloneStatus() {
            return this.standaloneStatus;
        }

        @Y61.l
        /* renamed from: component5, reason: from getter */
        public final IacUIAcceptTimeoutProgressBarState getAcceptTimeoutProgressBar() {
            return this.acceptTimeoutProgressBar;
        }

        @Y61.l
        /* renamed from: component6, reason: from getter */
        public final ControlButtons getControlButtons() {
            return this.controlButtons;
        }

        @Y61.k
        public final AudioModeContent copy(@Y61.k IacUICallHeaderState callHeader, @Y61.k IacUIAudioModePeerInfoState peerInfo, @Y61.l IacUIAudioModeItemInfoState itemInfo, @Y61.k IacUIStandaloneStatusState standaloneStatus, @Y61.l IacUIAcceptTimeoutProgressBarState acceptTimeoutProgressBar, @Y61.l ControlButtons controlButtons) {
            return new AudioModeContent(callHeader, peerInfo, itemInfo, standaloneStatus, acceptTimeoutProgressBar, controlButtons);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AudioModeContent)) {
                return false;
            }
            AudioModeContent audioModeContent = (AudioModeContent) other;
            return L.f(this.callHeader, audioModeContent.callHeader) && L.f(this.peerInfo, audioModeContent.peerInfo) && L.f(this.itemInfo, audioModeContent.itemInfo) && L.f(this.standaloneStatus, audioModeContent.standaloneStatus) && L.f(this.acceptTimeoutProgressBar, audioModeContent.acceptTimeoutProgressBar) && L.f(this.controlButtons, audioModeContent.controlButtons);
        }

        @Y61.l
        public final IacUIAcceptTimeoutProgressBarState getAcceptTimeoutProgressBar() {
            return this.acceptTimeoutProgressBar;
        }

        @Y61.k
        public final IacUICallHeaderState getCallHeader() {
            return this.callHeader;
        }

        @Y61.l
        public final ControlButtons getControlButtons() {
            return this.controlButtons;
        }

        @Y61.l
        public final IacUIAudioModeItemInfoState getItemInfo() {
            return this.itemInfo;
        }

        @Y61.k
        public final IacUIAudioModePeerInfoState getPeerInfo() {
            return this.peerInfo;
        }

        @Y61.k
        public final IacUIStandaloneStatusState getStandaloneStatus() {
            return this.standaloneStatus;
        }

        public int hashCode() {
            int iHashCode = (this.peerInfo.hashCode() + (this.callHeader.hashCode() * 31)) * 31;
            IacUIAudioModeItemInfoState iacUIAudioModeItemInfoState = this.itemInfo;
            int iHashCode2 = (this.standaloneStatus.hashCode() + ((iHashCode + (iacUIAudioModeItemInfoState == null ? 0 : iacUIAudioModeItemInfoState.hashCode())) * 31)) * 31;
            IacUIAcceptTimeoutProgressBarState iacUIAcceptTimeoutProgressBarState = this.acceptTimeoutProgressBar;
            int iHashCode3 = (iHashCode2 + (iacUIAcceptTimeoutProgressBarState == null ? 0 : iacUIAcceptTimeoutProgressBarState.hashCode())) * 31;
            ControlButtons controlButtons = this.controlButtons;
            return iHashCode3 + (controlButtons != null ? controlButtons.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            return "AudioModeContent(callHeader=" + this.callHeader + ", peerInfo=" + this.peerInfo + ", itemInfo=" + this.itemInfo + ", standaloneStatus=" + this.standaloneStatus + ", acceptTimeoutProgressBar=" + this.acceptTimeoutProgressBar + ", controlButtons=" + this.controlButtons + ')';
        }
    }

    /* compiled from: IacUICallScreenState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$Content;", "LdL/d;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$AudioModeContent;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$IdleModeContent;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$SupportModeContent;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$VideoModeContent;", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Content extends dL.d {
    }

    /* compiled from: IacUICallScreenState.kt */
    @H0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons;", "LdL/d;", "Incoming", "Talking", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons$Incoming;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons$Talking;", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ControlButtons extends dL.d {

        /* compiled from: IacUICallScreenState.kt */
        @H0
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons$Incoming;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Incoming implements ControlButtons {
            public static final int $stable = 0;

            @Y61.k
            public static final Incoming INSTANCE = new Incoming();

            private Incoming() {
            }

            public boolean equals(@Y61.l Object other) {
                return this == other || (other instanceof Incoming);
            }

            public int hashCode() {
                return -396823405;
            }

            @Y61.k
            public String toString() {
                return "Incoming";
            }
        }

        /* compiled from: IacUICallScreenState.kt */
        @H0
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons$Talking;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons;", VoiceInfo.STATE, "Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/panel/IacUIControlButtonsPanelTalkingState;", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/panel/IacUIControlButtonsPanelTalkingState;)V", "getState", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/control_buttons/talking/panel/IacUIControlButtonsPanelTalkingState;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Talking implements ControlButtons {
            public static final int $stable = 0;

            @Y61.k
            private final IacUIControlButtonsPanelTalkingState state;

            public Talking(@Y61.k IacUIControlButtonsPanelTalkingState iacUIControlButtonsPanelTalkingState) {
                this.state = iacUIControlButtonsPanelTalkingState;
            }

            public static /* synthetic */ Talking copy$default(Talking talking, IacUIControlButtonsPanelTalkingState iacUIControlButtonsPanelTalkingState, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    iacUIControlButtonsPanelTalkingState = talking.state;
                }
                return talking.copy(iacUIControlButtonsPanelTalkingState);
            }

            @Y61.k
            /* renamed from: component1, reason: from getter */
            public final IacUIControlButtonsPanelTalkingState getState() {
                return this.state;
            }

            @Y61.k
            public final Talking copy(@Y61.k IacUIControlButtonsPanelTalkingState state) {
                return new Talking(state);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Talking) && L.f(this.state, ((Talking) other).state);
            }

            @Y61.k
            public final IacUIControlButtonsPanelTalkingState getState() {
                return this.state;
            }

            public int hashCode() {
                return this.state.hashCode();
            }

            @Y61.k
            public String toString() {
                return "Talking(state=" + this.state + ')';
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IacUICallScreenState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$DtmfButtons;", "", "LdL/d;", "<init>", "(Ljava/lang/String;I)V", "ALLOWED", "VISIBLE", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DtmfButtons implements dL.d {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ DtmfButtons[] $VALUES;
        public static final DtmfButtons ALLOWED = new DtmfButtons("ALLOWED", 0);
        public static final DtmfButtons VISIBLE = new DtmfButtons("VISIBLE", 1);

        private static final /* synthetic */ DtmfButtons[] $values() {
            return new DtmfButtons[]{ALLOWED, VISIBLE};
        }

        static {
            DtmfButtons[] dtmfButtonsArr$values = $values();
            $VALUES = dtmfButtonsArr$values;
            $ENTRIES = kotlin.enums.c.a(dtmfButtonsArr$values);
        }

        private DtmfButtons(String str, int i12) {
        }

        @Y61.k
        public static kotlin.enums.a<DtmfButtons> getEntries() {
            return $ENTRIES;
        }

        public static DtmfButtons valueOf(String str) {
            return (DtmfButtons) Enum.valueOf(DtmfButtons.class, str);
        }

        public static DtmfButtons[] values() {
            return (DtmfButtons[]) $VALUES.clone();
        }
    }

    /* compiled from: IacUICallScreenState.kt */
    @H0
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$IdleModeContent;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$Content;", "launchedAction", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$IdleModeContent$LaunchedAction;", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$IdleModeContent$LaunchedAction;)V", "getLaunchedAction", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$IdleModeContent$LaunchedAction;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "LaunchedAction", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IdleModeContent implements Content {
        public static final int $stable = 0;

        @Y61.l
        private final LaunchedAction launchedAction;

        /* compiled from: IacUICallScreenState.kt */
        @H0
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$IdleModeContent$LaunchedAction;", "LdL/d;", "CloseCallScreenActivity", "OpenLinkInCallScreenActivityTask", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$IdleModeContent$LaunchedAction$CloseCallScreenActivity;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$IdleModeContent$LaunchedAction$OpenLinkInCallScreenActivityTask;", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface LaunchedAction extends dL.d {

            /* compiled from: IacUICallScreenState.kt */
            @P
            @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$IdleModeContent$LaunchedAction$CloseCallScreenActivity;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$IdleModeContent$LaunchedAction;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class CloseCallScreenActivity implements LaunchedAction {
                public static final int $stable = 0;

                @Y61.k
                public static final CloseCallScreenActivity INSTANCE = new CloseCallScreenActivity();

                private CloseCallScreenActivity() {
                }

                public boolean equals(@Y61.l Object other) {
                    return this == other || (other instanceof CloseCallScreenActivity);
                }

                public int hashCode() {
                    return -1014826156;
                }

                @Y61.k
                public String toString() {
                    return "CloseCallScreenActivity";
                }
            }

            /* compiled from: IacUICallScreenState.kt */
            @H0
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$IdleModeContent$LaunchedAction$OpenLinkInCallScreenActivityTask;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$IdleModeContent$LaunchedAction;", "link", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "(Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)V", "getLink", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class OpenLinkInCallScreenActivityTask implements LaunchedAction {
                public static final int $stable = 0;

                @Y61.k
                private final IacPiiDeepLink link;

                public OpenLinkInCallScreenActivityTask(@Y61.k IacPiiDeepLink iacPiiDeepLink) {
                    this.link = iacPiiDeepLink;
                }

                public static /* synthetic */ OpenLinkInCallScreenActivityTask copy$default(OpenLinkInCallScreenActivityTask openLinkInCallScreenActivityTask, IacPiiDeepLink iacPiiDeepLink, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        iacPiiDeepLink = openLinkInCallScreenActivityTask.link;
                    }
                    return openLinkInCallScreenActivityTask.copy(iacPiiDeepLink);
                }

                @Y61.k
                /* renamed from: component1, reason: from getter */
                public final IacPiiDeepLink getLink() {
                    return this.link;
                }

                @Y61.k
                public final OpenLinkInCallScreenActivityTask copy(@Y61.k IacPiiDeepLink link) {
                    return new OpenLinkInCallScreenActivityTask(link);
                }

                public boolean equals(@Y61.l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof OpenLinkInCallScreenActivityTask) && L.f(this.link, ((OpenLinkInCallScreenActivityTask) other).link);
                }

                @Y61.k
                public final IacPiiDeepLink getLink() {
                    return this.link;
                }

                public int hashCode() {
                    return this.link.hashCode();
                }

                @Y61.k
                public String toString() {
                    return "OpenLinkInCallScreenActivityTask(link=" + this.link + ')';
                }
            }
        }

        public IdleModeContent(@Y61.l LaunchedAction launchedAction) {
            this.launchedAction = launchedAction;
        }

        public static /* synthetic */ IdleModeContent copy$default(IdleModeContent idleModeContent, LaunchedAction launchedAction, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                launchedAction = idleModeContent.launchedAction;
            }
            return idleModeContent.copy(launchedAction);
        }

        @Y61.l
        /* renamed from: component1, reason: from getter */
        public final LaunchedAction getLaunchedAction() {
            return this.launchedAction;
        }

        @Y61.k
        public final IdleModeContent copy(@Y61.l LaunchedAction launchedAction) {
            return new IdleModeContent(launchedAction);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IdleModeContent) && L.f(this.launchedAction, ((IdleModeContent) other).launchedAction);
        }

        @Y61.l
        public final LaunchedAction getLaunchedAction() {
            return this.launchedAction;
        }

        public int hashCode() {
            LaunchedAction launchedAction = this.launchedAction;
            if (launchedAction == null) {
                return 0;
            }
            return launchedAction.hashCode();
        }

        @Y61.k
        public String toString() {
            return "IdleModeContent(launchedAction=" + this.launchedAction + ')';
        }
    }

    /* compiled from: IacUICallScreenState.kt */
    @H0
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$SupportModeContent;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$Content;", "callHeader", "Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUICallHeaderState;", "peerInfo", "Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUIAudioModePeerInfoState;", "controlButtons", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons$Talking;", "dtmfButtons", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$DtmfButtons;", "(Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUICallHeaderState;Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUIAudioModePeerInfoState;Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons$Talking;Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$DtmfButtons;)V", "getCallHeader", "()Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUICallHeaderState;", "getControlButtons", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons$Talking;", "getDtmfButtons", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$DtmfButtons;", "getPeerInfo", "()Lcom/avito/android/iac_dialer_ui/pub/common_ui/IacUIAudioModePeerInfoState;", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SupportModeContent implements Content {
        public static final int $stable = 0;

        @Y61.k
        private final IacUICallHeaderState callHeader;

        @Y61.l
        private final ControlButtons.Talking controlButtons;

        @Y61.l
        private final DtmfButtons dtmfButtons;

        @Y61.k
        private final IacUIAudioModePeerInfoState peerInfo;

        public SupportModeContent(@Y61.k IacUICallHeaderState iacUICallHeaderState, @Y61.k IacUIAudioModePeerInfoState iacUIAudioModePeerInfoState, @Y61.l ControlButtons.Talking talking, @Y61.l DtmfButtons dtmfButtons) {
            this.callHeader = iacUICallHeaderState;
            this.peerInfo = iacUIAudioModePeerInfoState;
            this.controlButtons = talking;
            this.dtmfButtons = dtmfButtons;
        }

        public static /* synthetic */ SupportModeContent copy$default(SupportModeContent supportModeContent, IacUICallHeaderState iacUICallHeaderState, IacUIAudioModePeerInfoState iacUIAudioModePeerInfoState, ControlButtons.Talking talking, DtmfButtons dtmfButtons, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iacUICallHeaderState = supportModeContent.callHeader;
            }
            if ((i12 & 2) != 0) {
                iacUIAudioModePeerInfoState = supportModeContent.peerInfo;
            }
            if ((i12 & 4) != 0) {
                talking = supportModeContent.controlButtons;
            }
            if ((i12 & 8) != 0) {
                dtmfButtons = supportModeContent.dtmfButtons;
            }
            return supportModeContent.copy(iacUICallHeaderState, iacUIAudioModePeerInfoState, talking, dtmfButtons);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final IacUICallHeaderState getCallHeader() {
            return this.callHeader;
        }

        @Y61.k
        /* renamed from: component2, reason: from getter */
        public final IacUIAudioModePeerInfoState getPeerInfo() {
            return this.peerInfo;
        }

        @Y61.l
        /* renamed from: component3, reason: from getter */
        public final ControlButtons.Talking getControlButtons() {
            return this.controlButtons;
        }

        @Y61.l
        /* renamed from: component4, reason: from getter */
        public final DtmfButtons getDtmfButtons() {
            return this.dtmfButtons;
        }

        @Y61.k
        public final SupportModeContent copy(@Y61.k IacUICallHeaderState callHeader, @Y61.k IacUIAudioModePeerInfoState peerInfo, @Y61.l ControlButtons.Talking controlButtons, @Y61.l DtmfButtons dtmfButtons) {
            return new SupportModeContent(callHeader, peerInfo, controlButtons, dtmfButtons);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SupportModeContent)) {
                return false;
            }
            SupportModeContent supportModeContent = (SupportModeContent) other;
            return L.f(this.callHeader, supportModeContent.callHeader) && L.f(this.peerInfo, supportModeContent.peerInfo) && L.f(this.controlButtons, supportModeContent.controlButtons) && this.dtmfButtons == supportModeContent.dtmfButtons;
        }

        @Y61.k
        public final IacUICallHeaderState getCallHeader() {
            return this.callHeader;
        }

        @Y61.l
        public final ControlButtons.Talking getControlButtons() {
            return this.controlButtons;
        }

        @Y61.l
        public final DtmfButtons getDtmfButtons() {
            return this.dtmfButtons;
        }

        @Y61.k
        public final IacUIAudioModePeerInfoState getPeerInfo() {
            return this.peerInfo;
        }

        public int hashCode() {
            int iHashCode = (this.peerInfo.hashCode() + (this.callHeader.hashCode() * 31)) * 31;
            ControlButtons.Talking talking = this.controlButtons;
            int iHashCode2 = (iHashCode + (talking == null ? 0 : talking.hashCode())) * 31;
            DtmfButtons dtmfButtons = this.dtmfButtons;
            return iHashCode2 + (dtmfButtons != null ? dtmfButtons.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            return "SupportModeContent(callHeader=" + this.callHeader + ", peerInfo=" + this.peerInfo + ", controlButtons=" + this.controlButtons + ", dtmfButtons=" + this.dtmfButtons + ')';
        }
    }

    /* compiled from: IacUICallScreenState.kt */
    @H0
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$VideoModeContent;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$Content;", "fullScreenRendererState", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState;", "pipRendererState", "peerInfo", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_mode_peer_info/IacUIVideoModePeerInfoState;", "controlButtons", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons$Talking;", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState;Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState;Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_mode_peer_info/IacUIVideoModePeerInfoState;Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons$Talking;)V", "getControlButtons", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState$ControlButtons$Talking;", "getFullScreenRendererState", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_renderer/IacUIVideoRendererState;", "getPeerInfo", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/video_mode_peer_info/IacUIVideoModePeerInfoState;", "getPipRendererState", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VideoModeContent implements Content {
        public static final int $stable = 0;

        @Y61.l
        private final ControlButtons.Talking controlButtons;

        @Y61.k
        private final IacUIVideoRendererState fullScreenRendererState;

        @Y61.l
        private final IacUIVideoModePeerInfoState peerInfo;

        @Y61.l
        private final IacUIVideoRendererState pipRendererState;

        public VideoModeContent(@Y61.k IacUIVideoRendererState iacUIVideoRendererState, @Y61.l IacUIVideoRendererState iacUIVideoRendererState2, @Y61.l IacUIVideoModePeerInfoState iacUIVideoModePeerInfoState, @Y61.l ControlButtons.Talking talking) {
            this.fullScreenRendererState = iacUIVideoRendererState;
            this.pipRendererState = iacUIVideoRendererState2;
            this.peerInfo = iacUIVideoModePeerInfoState;
            this.controlButtons = talking;
        }

        public static /* synthetic */ VideoModeContent copy$default(VideoModeContent videoModeContent, IacUIVideoRendererState iacUIVideoRendererState, IacUIVideoRendererState iacUIVideoRendererState2, IacUIVideoModePeerInfoState iacUIVideoModePeerInfoState, ControlButtons.Talking talking, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iacUIVideoRendererState = videoModeContent.fullScreenRendererState;
            }
            if ((i12 & 2) != 0) {
                iacUIVideoRendererState2 = videoModeContent.pipRendererState;
            }
            if ((i12 & 4) != 0) {
                iacUIVideoModePeerInfoState = videoModeContent.peerInfo;
            }
            if ((i12 & 8) != 0) {
                talking = videoModeContent.controlButtons;
            }
            return videoModeContent.copy(iacUIVideoRendererState, iacUIVideoRendererState2, iacUIVideoModePeerInfoState, talking);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final IacUIVideoRendererState getFullScreenRendererState() {
            return this.fullScreenRendererState;
        }

        @Y61.l
        /* renamed from: component2, reason: from getter */
        public final IacUIVideoRendererState getPipRendererState() {
            return this.pipRendererState;
        }

        @Y61.l
        /* renamed from: component3, reason: from getter */
        public final IacUIVideoModePeerInfoState getPeerInfo() {
            return this.peerInfo;
        }

        @Y61.l
        /* renamed from: component4, reason: from getter */
        public final ControlButtons.Talking getControlButtons() {
            return this.controlButtons;
        }

        @Y61.k
        public final VideoModeContent copy(@Y61.k IacUIVideoRendererState fullScreenRendererState, @Y61.l IacUIVideoRendererState pipRendererState, @Y61.l IacUIVideoModePeerInfoState peerInfo, @Y61.l ControlButtons.Talking controlButtons) {
            return new VideoModeContent(fullScreenRendererState, pipRendererState, peerInfo, controlButtons);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoModeContent)) {
                return false;
            }
            VideoModeContent videoModeContent = (VideoModeContent) other;
            return L.f(this.fullScreenRendererState, videoModeContent.fullScreenRendererState) && L.f(this.pipRendererState, videoModeContent.pipRendererState) && L.f(this.peerInfo, videoModeContent.peerInfo) && L.f(this.controlButtons, videoModeContent.controlButtons);
        }

        @Y61.l
        public final ControlButtons.Talking getControlButtons() {
            return this.controlButtons;
        }

        @Y61.k
        public final IacUIVideoRendererState getFullScreenRendererState() {
            return this.fullScreenRendererState;
        }

        @Y61.l
        public final IacUIVideoModePeerInfoState getPeerInfo() {
            return this.peerInfo;
        }

        @Y61.l
        public final IacUIVideoRendererState getPipRendererState() {
            return this.pipRendererState;
        }

        public int hashCode() {
            int iHashCode = this.fullScreenRendererState.hashCode() * 31;
            IacUIVideoRendererState iacUIVideoRendererState = this.pipRendererState;
            int iHashCode2 = (iHashCode + (iacUIVideoRendererState == null ? 0 : iacUIVideoRendererState.hashCode())) * 31;
            IacUIVideoModePeerInfoState iacUIVideoModePeerInfoState = this.peerInfo;
            int iHashCode3 = (iHashCode2 + (iacUIVideoModePeerInfoState == null ? 0 : iacUIVideoModePeerInfoState.hashCode())) * 31;
            ControlButtons.Talking talking = this.controlButtons;
            return iHashCode3 + (talking != null ? talking.hashCode() : 0);
        }

        @Y61.k
        public String toString() {
            return "VideoModeContent(fullScreenRendererState=" + this.fullScreenRendererState + ", pipRendererState=" + this.pipRendererState + ", peerInfo=" + this.peerInfo + ", controlButtons=" + this.controlButtons + ')';
        }
    }

    public IacUICallScreenState(@Y61.k Content content, @Y61.l IacUICallToastState iacUICallToastState, boolean z12, @Y61.k IacUIAudioDevicesBottomSheetState iacUIAudioDevicesBottomSheetState) {
        this.content = content;
        this.toast = iacUICallToastState;
        this.keepScreenOn = z12;
        this.audioDevicesBottomSheetState = iacUIAudioDevicesBottomSheetState;
    }

    public static /* synthetic */ IacUICallScreenState copy$default(IacUICallScreenState iacUICallScreenState, Content content, IacUICallToastState iacUICallToastState, boolean z12, IacUIAudioDevicesBottomSheetState iacUIAudioDevicesBottomSheetState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            content = iacUICallScreenState.content;
        }
        if ((i12 & 2) != 0) {
            iacUICallToastState = iacUICallScreenState.toast;
        }
        if ((i12 & 4) != 0) {
            z12 = iacUICallScreenState.keepScreenOn;
        }
        if ((i12 & 8) != 0) {
            iacUIAudioDevicesBottomSheetState = iacUICallScreenState.audioDevicesBottomSheetState;
        }
        return iacUICallScreenState.copy(content, iacUICallToastState, z12, iacUIAudioDevicesBottomSheetState);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final Content getContent() {
        return this.content;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final IacUICallToastState getToast() {
        return this.toast;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getKeepScreenOn() {
        return this.keepScreenOn;
    }

    @Y61.k
    /* renamed from: component4, reason: from getter */
    public final IacUIAudioDevicesBottomSheetState getAudioDevicesBottomSheetState() {
        return this.audioDevicesBottomSheetState;
    }

    @Y61.k
    public final IacUICallScreenState copy(@Y61.k Content content, @Y61.l IacUICallToastState toast, boolean keepScreenOn, @Y61.k IacUIAudioDevicesBottomSheetState audioDevicesBottomSheetState) {
        return new IacUICallScreenState(content, toast, keepScreenOn, audioDevicesBottomSheetState);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacUICallScreenState)) {
            return false;
        }
        IacUICallScreenState iacUICallScreenState = (IacUICallScreenState) other;
        return L.f(this.content, iacUICallScreenState.content) && L.f(this.toast, iacUICallScreenState.toast) && this.keepScreenOn == iacUICallScreenState.keepScreenOn && L.f(this.audioDevicesBottomSheetState, iacUICallScreenState.audioDevicesBottomSheetState);
    }

    @Y61.k
    public final IacUIAudioDevicesBottomSheetState getAudioDevicesBottomSheetState() {
        return this.audioDevicesBottomSheetState;
    }

    @Y61.k
    public final Content getContent() {
        return this.content;
    }

    public final boolean getKeepScreenOn() {
        return this.keepScreenOn;
    }

    @Y61.l
    public final IacUICallToastState getToast() {
        return this.toast;
    }

    public int hashCode() {
        int iHashCode = this.content.hashCode() * 31;
        IacUICallToastState iacUICallToastState = this.toast;
        return this.audioDevicesBottomSheetState.hashCode() + androidx.appcompat.app.r.i((iHashCode + (iacUICallToastState == null ? 0 : iacUICallToastState.hashCode())) * 31, 31, this.keepScreenOn);
    }

    @Y61.k
    public String toString() {
        return "IacUICallScreenState(content=" + this.content + ", toast=" + this.toast + ", keepScreenOn=" + this.keepScreenOn + ", audioDevicesBottomSheetState=" + this.audioDevicesBottomSheetState + ')';
    }
}
