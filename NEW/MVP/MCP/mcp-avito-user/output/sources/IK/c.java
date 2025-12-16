package IK;

import IK.a;
import Y41.l;
import Y61.k;
import android.bluetooth.BluetoothDevice;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioDevice;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import com.avito.android.iac_dialer.impl_module.telecom.IacConnectionException;
import j.X;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlin.collections.B0;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: IacConnectionAudioDelegateApi28.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIK/c;", "LIK/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes14.dex */
public final class c implements IK.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<Integer, G0> f8130a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<BluetoothDevice, G0> f8131b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<AudioState, G0> f8132c;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public AudioDevice f8134e;

    /* renamed from: g, reason: collision with root package name */
    @k
    public AudioState f8136g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f8137h;

    /* renamed from: d, reason: collision with root package name */
    @k
    public Object f8133d = P0.c();

    /* renamed from: f, reason: collision with root package name */
    @k
    public Set<AudioDevice> f8135f = B0.f406639b;

    /* compiled from: IacConnectionAudioDelegateApi28.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8138a;

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
            f8138a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k String str, @k l<? super Integer, G0> lVar, @k l<? super BluetoothDevice, G0> lVar2, @k l<? super AudioState, G0> lVar3) {
        this.f8130a = lVar;
        this.f8131b = lVar2;
        this.f8132c = lVar3;
        AudioState.INSTANCE.getClass();
        this.f8136g = AudioState.Companion.a();
        this.f8137h = "IacConnectionAudio28_...".concat(C43066x.u0(3, str));
    }

    public static AudioDevice c(AudioDevice.Type type) {
        UUID uuid;
        switch (a.f8138a[type.ordinal()]) {
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
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new AudioDevice(type, null, uuid);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.util.Map] */
    @Override // IK.a
    @k
    public final Object a(@k AudioDevice audioDevice) throws IacConnectionException {
        Z.b bVar;
        String name;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar2 = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        String str = this.f8137h;
        bVar2.a(str, "requestAudioDeviceChange(" + audioDevice + ')', null);
        if (audioDevice.getType() != AudioDevice.Type.BLUETOOTH || (name = audioDevice.getName()) == null || C43066x.K(name)) {
            try {
                bVar2.a(str, "requestAudioDeviceChange.setAudioRoute", null);
                l<Integer, G0> lVar = this.f8130a;
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
                bVar = new Z.b(e12);
            }
        } else {
            try {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) this.f8133d.get(audioDevice.getId());
                if (bluetoothDevice != null) {
                    bVar2.a(str, "requestAudioDeviceChange.requestBluetoothAudio", null);
                    this.f8131b.invoke(bluetoothDevice);
                    int i16 = Z.f406624c;
                    return G0.f406611a;
                }
                throw new IacConnectionException("btDevice with id=" + audioDevice.getId() + " not found in cache: " + this.f8133d.keySet());
            } catch (Exception e13) {
                int i17 = Z.f406624c;
                bVar = new Z.b(e13);
            }
        }
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final AudioDevice b(BluetoothDevice bluetoothDevice) {
        String name;
        String address;
        String str = this.f8137h;
        UUID uuidRandomUUID = null;
        try {
            name = bluetoothDevice.getName();
        } catch (SecurityException unused) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(str, "Can't read bluetooth device name", null);
            name = null;
        }
        try {
            address = bluetoothDevice.getAddress();
        } catch (Exception unused2) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(str, "Can't read bluetooth device address", null);
            address = null;
        }
        if (address == null) {
            return null;
        }
        Iterator it = this.f8133d.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            UUID uuid = (UUID) entry.getKey();
            if (!L.f(((BluetoothDevice) entry.getValue()).getAddress(), address)) {
                uuid = null;
            }
            if (uuid != null) {
                uuidRandomUUID = uuid;
                break;
            }
        }
        AudioDevice.Type type = AudioDevice.Type.BLUETOOTH;
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
        }
        return new AudioDevice(type, name, uuidRandomUUID);
    }
}
