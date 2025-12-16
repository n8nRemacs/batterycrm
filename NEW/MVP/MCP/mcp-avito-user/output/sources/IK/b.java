package IK;

import IK.a;
import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioDevice;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import java.util.Set;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlin.collections.B0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: IacConnectionAudioDelegateApi26.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIK/b;", "LIK/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements IK.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<Integer, G0> f8123a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<AudioState, G0> f8124b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public AudioDevice f8125c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public Set<AudioDevice> f8126d = B0.f406639b;

    /* renamed from: e, reason: collision with root package name */
    @k
    public AudioState f8127e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f8128f;

    /* compiled from: IacConnectionAudioDelegateApi26.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8129a;

        static {
            int[] iArr = new int[AudioDevice.Type.values().length];
            try {
                iArr[AudioDevice.Type.WIRED_HEADSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioDevice.Type.SPEAKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioDevice.Type.EARPIECE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AudioDevice.Type.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AudioDevice.Type.STREAMING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AudioDevice.Type.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f8129a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k String str, @k l<? super Integer, G0> lVar, @k l<? super AudioState, G0> lVar2) {
        this.f8123a = lVar;
        this.f8124b = lVar2;
        AudioState.INSTANCE.getClass();
        this.f8127e = AudioState.Companion.a();
        this.f8128f = "IacConnectionAudio26_".concat(C43066x.u0(3, str));
    }

    public static AudioDevice b(AudioDevice.Type type) {
        UUID uuid;
        switch (a.f8129a[type.ordinal()]) {
            case 1:
                com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165743a.getClass();
                uuid = com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165745c;
                break;
            case 2:
                com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165743a.getClass();
                uuid = com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165744b;
                break;
            case 3:
                com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165743a.getClass();
                uuid = com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165746d;
                break;
            case 4:
                com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165743a.getClass();
                uuid = com.avito.android.iac_dialer.impl_module.audio.audio_devices.a.f165747e;
                break;
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new AudioDevice(type, null, uuid);
    }

    @Override // IK.a
    @k
    public final Object a(@k AudioDevice audioDevice) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        String str = this.f8128f;
        bVar.a(str, "requestAudioDeviceChange(" + audioDevice + ')', null);
        try {
            bVar.a(str, "requestAudioDeviceChange.setAudioRoute", null);
            l<Integer, G0> lVar = this.f8123a;
            int i12 = a.b.f8122a[audioDevice.getType().ordinal()];
            int i13 = 1;
            if (i12 != 1) {
                if (i12 == 2) {
                    i13 = 2;
                } else if (i12 == 3) {
                    i13 = 4;
                } else if (i12 == 4) {
                    i13 = 8;
                }
            }
            lVar.invoke(Integer.valueOf(i13));
            int i14 = Z.f406624c;
            return G0.f406611a;
        } catch (Exception e12) {
            int i15 = Z.f406624c;
            return new Z.b(e12);
        }
    }
}
