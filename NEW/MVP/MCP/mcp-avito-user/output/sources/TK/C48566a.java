package tK;

import JK.j;
import KK.b;
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
import com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.dialer_mediator.IacOverlayState;
import com.avito.android.iac_dialer.impl_module.utils.HasIndex;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiImage;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiMapStringString;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.iac_dialer_ui.pub.call_screen.control_buttons.talking.IacUIControlButtonsAudioDeviceState;
import com.avito.android.iac_dialer_ui.pub.overlay_widget.IacUIOverlayWidgetState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: IacState_To_IacOverlayState_Mapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"LtK/a;", "LJK/j;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tK.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48566a implements j<IacState, IacOverlayState> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f439225b;

    /* compiled from: IacState_To_IacOverlayState_Mapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tK.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C12669a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f439226a;

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
            f439226a = iArr;
        }
    }

    public C48566a(@k Resources resources) {
        this.f439225b = resources;
    }

    @Override // JK.j
    public final IacOverlayState b(IacState iacState) throws Resources.NotFoundException {
        String string;
        IacUIControlButtonsAudioDeviceState iacUIControlButtonsAudioDeviceState;
        IacOverlayState visible;
        AudioState audio;
        AudioDevice current;
        IacPiiMapStringString avatarUrls;
        IacState iacState2 = iacState;
        if ((iacState2 instanceof IacState.Idle) || (iacState2 instanceof IacState.InUse.Finished)) {
            visible = IacOverlayState.Hidden.INSTANCE;
        } else {
            if (!(iacState2 instanceof IacState.InUse.Alive)) {
                throw new NoWhenBranchMatchedException();
            }
            IacState.InUse.Alive alive = (IacState.InUse.Alive) iacState2;
            CallMeta.User peer = alive.getCall().getMeta().getPeer();
            AudioDevice.Type type = null;
            IacPiiString name = peer != null ? peer.getName() : null;
            CallMeta.User peer2 = alive.getCall().getMeta().getPeer();
            IacPiiImage iacPiiImageA = (peer2 == null || (avatarUrls = peer2.getAvatarUrls()) == null) ? null : b.a(avatarUrls);
            boolean z12 = alive instanceof IacState.InUse.Alive.Incoming.Waiting ? true : alive instanceof IacState.InUse.Alive.Incoming.Resolving;
            Resources resources = this.f439225b;
            if (z12) {
                string = resources.getString(R.string.iac_dialer_impl_status_ringing);
            } else if (alive instanceof IacState.InUse.Alive.Incoming.Accepting) {
                string = resources.getString(R.string.iac_dialer_impl_status_dialing);
            } else {
                if (alive instanceof IacState.InUse.Alive.Outgoing.Launching ? true : alive instanceof IacState.InUse.Alive.Outgoing.Resolving) {
                    string = resources.getString(R.string.iac_dialer_impl_status_allocating);
                } else if (alive instanceof IacState.InUse.Alive.Outgoing.Waiting) {
                    string = alive.getCall().getWasRingingReceived() ? resources.getString(R.string.iac_dialer_impl_status_dialing_received) : resources.getString(R.string.iac_dialer_impl_status_dialing);
                } else {
                    if (!(alive instanceof IacState.InUse.Alive.Talking)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    string = alive.getCall().getLocalConnected() ? resources.getString(R.string.iac_dialer_impl_status_connected) : alive.getParams().getTime().f166853j ? resources.getString(R.string.iac_dialer_impl_status_reconnecting) : resources.getString(R.string.iac_dialer_impl_status_dialing);
                }
            }
            String str = string;
            Long lValueOf = Long.valueOf(alive.getParams().getTime().f166849f);
            long j12 = alive.getParams().getTime().f166850g;
            Long lValueOf2 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1)) > 0 ? Long.valueOf(j12) : null;
            CallInit callInitA = i.a(alive, alive.getCallId());
            if (callInitA != null && (audio = callInitA.getAudio()) != null && (current = audio.getCurrent()) != null) {
                type = current.getType();
            }
            switch (type == null ? -1 : C12669a.f439226a[type.ordinal()]) {
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
            visible = new IacOverlayState.Visible(new IacUIOverlayWidgetState(name, iacPiiImageA, str, lValueOf, lValueOf2, iacUIControlButtonsAudioDeviceState));
        }
        com.avito.android.iac_dialer.impl_module.utils.b bVar = com.avito.android.iac_dialer.impl_module.utils.b.f166511a;
        HasIndex hasIndexA = bVar.a(visible.getIndexType());
        if (hasIndexA == null) {
            visible.setIndex(0);
            bVar.b(visible.getIndexType(), visible);
        } else if (hasIndexA.equals(visible)) {
            visible.setIndex(hasIndexA.getIndex());
        } else {
            visible.setIndex(hasIndexA.getIndex() + 1);
            bVar.b(visible.getIndexType(), visible);
        }
        return visible;
    }
}
