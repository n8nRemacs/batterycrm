package yK;

import JK.j;
import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallMeta;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.i;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioDevice;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.dialer_mediator.IacCallScreenDialerMediatorState;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiImage;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiMapStringString;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.iac_dialer_ui.pub.call_screen.IacUICallScreenState;
import com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.IacUIControlButtonsAudioDeviceState;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.IacUIControlButtonsToggleCameraState;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.IacUIControlButtonsToggleMicState;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.panel.IacUIControlButtonsPanelTalkingState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUIAudioModePeerInfoState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUICallHeaderState;
import com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import nt.f;

/* compiled from: IacState_To_IacCallScreenDialerMediatorState_Mapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LyK/c;", "LJK/j;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/dialer_mediator/IacCallScreenDialerMediatorState;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yK.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50124c implements j<IacState, IacCallScreenDialerMediatorState> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f443030b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f443031c;

    /* compiled from: IacState_To_IacCallScreenDialerMediatorState_Mapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yK.c$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f443032a;

        static {
            int[] iArr = new int[AudioDevice.Type.values().length];
            try {
                iArr[AudioDevice.Type.EARPIECE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioDevice.Type.WIRED_HEADSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioDevice.Type.STREAMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioDevice.Type.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AudioDevice.Type.BLUETOOTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AudioDevice.Type.SPEAKER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f443032a = iArr;
        }
    }

    public C50124c(@k Resources resources, @k f fVar) {
        this.f443030b = resources;
        this.f443031c = fVar;
    }

    public static final String a(C50124c c50124c, AudioDevice audioDevice) {
        c50124c.getClass();
        switch (a.f443032a[audioDevice.getType().ordinal()]) {
            case 1:
                return "1_" + audioDevice.getId();
            case 2:
                return "4_" + audioDevice.getId();
            case 3:
                return "5_" + audioDevice.getId();
            case 4:
                return "6_" + audioDevice.getId();
            case 5:
                return "3_" + audioDevice.getId();
            case 6:
                return "2_" + audioDevice.getId();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final IacUIAudioDevicesBottomSheetState.Device c(C50124c c50124c, AudioDevice audioDevice) throws Resources.NotFoundException {
        String string;
        c50124c.getClass();
        int i12 = a.f443032a[audioDevice.getType().ordinal()];
        Resources resources = c50124c.f443030b;
        switch (i12) {
            case 1:
                string = resources.getString(R.string.iac_dialer_impl_audio_device_earpiece);
                break;
            case 2:
                string = resources.getString(R.string.iac_dialer_impl_audio_device_wired_headset);
                break;
            case 3:
                string = resources.getString(R.string.iac_dialer_impl_audio_device_unknown);
                break;
            case 4:
                string = resources.getString(R.string.iac_dialer_impl_audio_device_unknown);
                break;
            case 5:
                String name = audioDevice.getName();
                if (name != null && !C43066x.K(name)) {
                    string = audioDevice.getName();
                    break;
                } else {
                    string = resources.getString(R.string.iac_dialer_impl_audio_device_bluetooth);
                    break;
                }
                break;
            case 6:
                string = resources.getString(R.string.iac_dialer_impl_audio_device_speaker);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new IacUIAudioDevicesBottomSheetState.Device(string, audioDevice.getId().toString());
    }

    public static IacUICallScreenState.ControlButtons f(IacState.InUse inUse) {
        IacUIControlButtonsAudioDeviceState iacUIControlButtonsAudioDeviceState;
        AudioState audio;
        AudioDevice current;
        AudioDevice.Type type = null;
        if (inUse instanceof IacState.InUse.Finished) {
            return null;
        }
        if (inUse instanceof IacState.InUse.Alive.Incoming) {
            return IacUICallScreenState.ControlButtons.Incoming.INSTANCE;
        }
        if (!(inUse instanceof IacState.InUse.Alive.Outgoing ? true : inUse instanceof IacState.InUse.Alive.Talking)) {
            throw new NoWhenBranchMatchedException();
        }
        IacUIControlButtonsToggleMicState iacUIControlButtonsToggleMicState = inUse.getCall().getLocalSendingAudio() ? IacUIControlButtonsToggleMicState.MicEnabled : IacUIControlButtonsToggleMicState.MicDisabled;
        IacUIControlButtonsToggleCameraState iacUIControlButtonsToggleCameraState = (inUse.getCall().isVideo() && inUse.getCall().getVideoTxAllowed()) ? inUse.getCall().getLocalSendingVideo() ? IacUIControlButtonsToggleCameraState.CameraEnabled : IacUIControlButtonsToggleCameraState.CameraDisabled : null;
        G0 g02 = G0.f406611a;
        if (!(iacUIControlButtonsToggleCameraState == IacUIControlButtonsToggleCameraState.CameraEnabled)) {
            g02 = null;
        }
        CallInit callInitA = i.a(inUse, inUse.getCallId());
        if (callInitA != null && (audio = callInitA.getAudio()) != null && (current = audio.getCurrent()) != null) {
            type = current.getType();
        }
        switch (type == null ? -1 : a.f443032a[type.ordinal()]) {
            case -1:
            case 1:
            case 2:
                iacUIControlButtonsAudioDeviceState = IacUIControlButtonsAudioDeviceState.EarpieceOrWireHeadset;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 3:
            case 4:
            case 5:
                iacUIControlButtonsAudioDeviceState = IacUIControlButtonsAudioDeviceState.Bluetooth;
                break;
            case 6:
                iacUIControlButtonsAudioDeviceState = IacUIControlButtonsAudioDeviceState.Speaker;
                break;
        }
        return new IacUICallScreenState.ControlButtons.Talking(new IacUIControlButtonsPanelTalkingState(iacUIControlButtonsAudioDeviceState, iacUIControlButtonsToggleMicState, iacUIControlButtonsToggleCameraState, g02));
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x035f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    @Override // JK.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.iac_dialer.impl_module.screens.call_screen.dialer_mediator.IacCallScreenDialerMediatorState b(com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState r23) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yK.C50124c.b(java.lang.Object):java.lang.Object");
    }

    public final IacUIAudioModePeerInfoState d(IacState.InUse inUse) {
        IacPiiMapStringString avatarUrls;
        CallMeta.User peer = inUse.getCall().getMeta().getPeer();
        IacPiiString name = peer != null ? peer.getName() : null;
        CallMeta.User peer2 = inUse.getCall().getMeta().getPeer();
        IacPiiImage iacPiiImageA = (peer2 == null || (avatarUrls = peer2.getAvatarUrls()) == null) ? null : KK.b.a(avatarUrls);
        String strG = L.f(inUse.getCall().getMeta().getScenario(), AttachMenuItem.Support.KEY) ? g(inUse) : null;
        boolean zF2 = L.f(inUse.getCall().getMeta().getScenario(), AttachMenuItem.Support.KEY);
        Long lValueOf = Long.valueOf(inUse.getParams().getTime().f166849f);
        long j12 = inUse.getParams().getTime().f166850g;
        return new IacUIAudioModePeerInfoState(name, iacPiiImageA, strG, zF2, lValueOf, j12 > 0 ? Long.valueOf(j12) : null);
    }

    public final IacUICallHeaderState e(IacState.InUse inUse) {
        boolean zIsVideo = inUse.getCall().isVideo();
        Resources resources = this.f443030b;
        return zIsVideo ? new IacUICallHeaderState(resources.getString(R.string.iac_dialer_ui_public___cahh_header___video)) : new IacUICallHeaderState(resources.getString(R.string.iac_dialer_ui_public___cahh_header___audio));
    }

    public final String g(IacState.InUse inUse) {
        boolean z12 = inUse instanceof IacState.InUse.Alive.Incoming.Waiting ? true : inUse instanceof IacState.InUse.Alive.Incoming.Resolving;
        Resources resources = this.f443030b;
        if (z12) {
            return resources.getString(R.string.iac_dialer_impl_status_ringing);
        }
        if (inUse instanceof IacState.InUse.Alive.Incoming.Accepting) {
            return resources.getString(R.string.iac_dialer_impl_status_dialing);
        }
        if (inUse instanceof IacState.InUse.Alive.Outgoing.Launching ? true : inUse instanceof IacState.InUse.Alive.Outgoing.Resolving) {
            return resources.getString(R.string.iac_dialer_impl_status_allocating);
        }
        if (inUse instanceof IacState.InUse.Alive.Outgoing.Waiting) {
            return ((IacState.InUse.Alive.Outgoing.Waiting) inUse).getCall().getWasRingingReceived() ? resources.getString(R.string.iac_dialer_impl_status_dialing_received) : resources.getString(R.string.iac_dialer_impl_status_dialing);
        }
        if (inUse instanceof IacState.InUse.Alive.Talking) {
            IacState.InUse.Alive.Talking talking = (IacState.InUse.Alive.Talking) inUse;
            return talking.getCall().getLocalConnected() ? resources.getString(R.string.iac_dialer_impl_status_connected) : talking.getParams().getTime().f166853j ? resources.getString(R.string.iac_dialer_impl_status_reconnecting) : resources.getString(R.string.iac_dialer_impl_status_dialing);
        }
        if (inUse instanceof IacState.InUse.Finished) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
