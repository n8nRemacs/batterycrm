package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioDevice;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioState;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import hK.InterfaceC40840a;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import org.webrtc.MediaStreamTrack;

/* compiled from: HardwareAudioManagerAndroid30Impl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl;", "LhK/a;", "a", "b", "State", "d", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class HardwareAudioManagerAndroid30Impl implements InterfaceC40840a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AudioBluetoothManager f165790a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d f165791b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final b f165792c;

    /* renamed from: d, reason: collision with root package name */
    public com.avito.android.iac_dialer.impl_module.audio.audio_devices.c f165793d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public State f165794e = State.NotInitialized.INSTANCE;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final f f165795f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final e f165796g;

    /* compiled from: HardwareAudioManagerAndroid30Impl.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$State;", "", "()V", "activeDevice", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioDevice;", "getActiveDevice", "()Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioDevice;", "devices", "", "getDevices", "()Ljava/util/Set;", "NotInitialized", "Running", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$State$NotInitialized;", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$State$Running;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State {
        public static final int $stable = 0;

        /* compiled from: HardwareAudioManagerAndroid30Impl.kt */
        @P
        @Keep
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$State$NotInitialized;", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$State;", "()V", "activeDevice", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioDevice;", "getActiveDevice", "()Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioDevice;", "devices", "", "getDevices", "()Ljava/util/Set;", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NotInitialized extends State {

            @Y61.k
            public static final NotInitialized INSTANCE = new NotInitialized();

            @Y61.k
            private static final Set<HardwareAudioDevice> devices = B0.f406639b;

            @Y61.k
            private static final HardwareAudioDevice activeDevice = HardwareAudioDevice.SPEAKER_PHONE;
            public static final int $stable = 8;

            private NotInitialized() {
                super(null);
            }

            public boolean equals(@Y61.l Object other) {
                return this == other || (other instanceof NotInitialized);
            }

            @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.HardwareAudioManagerAndroid30Impl.State
            @Y61.k
            public HardwareAudioDevice getActiveDevice() {
                return activeDevice;
            }

            @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.HardwareAudioManagerAndroid30Impl.State
            @Y61.k
            public Set<HardwareAudioDevice> getDevices() {
                return devices;
            }

            public int hashCode() {
                return 573718272;
            }

            @Y61.k
            public String toString() {
                return "NotInitialized";
            }
        }

        /* compiled from: HardwareAudioManagerAndroid30Impl.kt */
        @P
        @Keep
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0007J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J/\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$State$Running;", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$State;", "devices", "", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioDevice;", "activeDevice", "pendingDevice", "(Ljava/util/Set;Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioDevice;Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioDevice;)V", "getActiveDevice", "()Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioDevice;", "getDevices", "()Ljava/util/Set;", "getPendingDevice", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Running extends State {
            public static final int $stable = 8;

            @Y61.k
            private final HardwareAudioDevice activeDevice;

            @Y61.k
            private final Set<HardwareAudioDevice> devices;

            @Y61.l
            private final HardwareAudioDevice pendingDevice;

            /* JADX WARN: Multi-variable type inference failed */
            public Running(@Y61.k Set<? extends HardwareAudioDevice> set, @Y61.k HardwareAudioDevice hardwareAudioDevice, @Y61.l HardwareAudioDevice hardwareAudioDevice2) {
                super(null);
                this.devices = set;
                this.activeDevice = hardwareAudioDevice;
                this.pendingDevice = hardwareAudioDevice2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Running copy$default(Running running, Set set, HardwareAudioDevice hardwareAudioDevice, HardwareAudioDevice hardwareAudioDevice2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    set = running.devices;
                }
                if ((i12 & 2) != 0) {
                    hardwareAudioDevice = running.activeDevice;
                }
                if ((i12 & 4) != 0) {
                    hardwareAudioDevice2 = running.pendingDevice;
                }
                return running.copy(set, hardwareAudioDevice, hardwareAudioDevice2);
            }

            @Y61.k
            public final Set<HardwareAudioDevice> component1() {
                return this.devices;
            }

            @Y61.k
            /* renamed from: component2, reason: from getter */
            public final HardwareAudioDevice getActiveDevice() {
                return this.activeDevice;
            }

            @Y61.l
            /* renamed from: component3, reason: from getter */
            public final HardwareAudioDevice getPendingDevice() {
                return this.pendingDevice;
            }

            @Y61.k
            public final Running copy(@Y61.k Set<? extends HardwareAudioDevice> devices, @Y61.k HardwareAudioDevice activeDevice, @Y61.l HardwareAudioDevice pendingDevice) {
                return new Running(devices, activeDevice, pendingDevice);
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Running)) {
                    return false;
                }
                Running running = (Running) other;
                return L.f(this.devices, running.devices) && this.activeDevice == running.activeDevice && this.pendingDevice == running.pendingDevice;
            }

            @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.HardwareAudioManagerAndroid30Impl.State
            @Y61.k
            public HardwareAudioDevice getActiveDevice() {
                return this.activeDevice;
            }

            @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.HardwareAudioManagerAndroid30Impl.State
            @Y61.k
            public Set<HardwareAudioDevice> getDevices() {
                return this.devices;
            }

            @Y61.l
            public final HardwareAudioDevice getPendingDevice() {
                return this.pendingDevice;
            }

            public int hashCode() {
                int iHashCode = (this.activeDevice.hashCode() + (this.devices.hashCode() * 31)) * 31;
                HardwareAudioDevice hardwareAudioDevice = this.pendingDevice;
                return iHashCode + (hardwareAudioDevice == null ? 0 : hardwareAudioDevice.hashCode());
            }

            @Y61.k
            public String toString() {
                return "Running(devices=" + this.devices + ", activeDevice=" + this.activeDevice + ", pendingDevice=" + this.pendingDevice + ')';
            }
        }

        public /* synthetic */ State(C42822w c42822w) {
            this();
        }

        @Y61.k
        public abstract HardwareAudioDevice getActiveDevice();

        @Y61.k
        public abstract Set<HardwareAudioDevice> getDevices();

        private State() {
        }
    }

    /* compiled from: HardwareAudioManagerAndroid30Impl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$a;", "", "<init>", "()V", "", "HAS_MIC", "I", "HAS_NO_MIC", "STATE_PLUGGED", "STATE_UNPLUGGED", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HardwareAudioManagerAndroid30Impl.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$b;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Singleton
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Context f165797a;

        /* renamed from: b, reason: collision with root package name */
        public int f165798b = -2;

        /* renamed from: c, reason: collision with root package name */
        public boolean f165799c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f165800d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final AudioManager f165801e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.f f165802f;

        @Inject
        public b(@Y61.k Context context) {
            this.f165797a = context;
            this.f165801e = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        }
    }

    /* compiled from: HardwareAudioManagerAndroid30Impl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165803a;

        static {
            int[] iArr = new int[HardwareAudioDevice.values().length];
            try {
                iArr[HardwareAudioDevice.BLUETOOTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HardwareAudioDevice.WIRED_HEADSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HardwareAudioDevice.EARPIECE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HardwareAudioDevice.SPEAKER_PHONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f165803a = iArr;
        }
    }

    /* compiled from: HardwareAudioManagerAndroid30Impl.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$d;", "Landroid/content/BroadcastReceiver;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Singleton
    public static class d extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Context f165804a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public a f165805b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final AudioManager f165806c;

        /* compiled from: HardwareAudioManagerAndroid30Impl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$d$a;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface a {
            void a(boolean z12);
        }

        @Inject
        public d(@Y61.k Context context) {
            this.f165804a = context;
            this.f165806c = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@Y61.k Context context, @Y61.k Intent intent) {
            int intExtra = intent.getIntExtra(VoiceInfo.STATE, 0);
            int intExtra2 = intent.getIntExtra("microphone", 0);
            String stringExtra = intent.getStringExtra("name");
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
            StringBuilder sb2 = new StringBuilder("WiredHeadsetReceiver.onReceive: a=");
            sb2.append(intent.getAction());
            sb2.append(", s=");
            sb2.append(intExtra == 0 ? "unplugged" : "plugged");
            sb2.append(", m=");
            m.p(sb2, intExtra2 == 1 ? "mic" : "no mic", ", n=", stringExtra, ", sb=");
            sb2.append(isInitialStickyBroadcast());
            bVar.a("IacHardwareAudioManagerAndroid30", sb2.toString(), null);
            a aVar = this.f165805b;
            if (aVar != null) {
                aVar.a(intExtra == 1);
            }
        }
    }

    /* compiled from: HardwareAudioManagerAndroid30Impl.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$e", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$e;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements AudioBluetoothManager.e {

        /* compiled from: HardwareAudioManagerAndroid30Impl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f165808a;

            static {
                int[] iArr = new int[AudioBluetoothManager.ExternalState.values().length];
                try {
                    iArr[AudioBluetoothManager.ExternalState.NO_DEVICES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AudioBluetoothManager.ExternalState.SCO_AUDIO_DISCONNECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AudioBluetoothManager.ExternalState.SCO_AUDIO_CONNECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f165808a = iArr;
            }
        }

        public e() {
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x00e7 A[PHI: r1
  0x00e7: PHI (r1v8 com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioDevice) = 
  (r1v6 com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioDevice)
  (r1v7 com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioDevice)
 binds: [B:55:0x00e5, B:58:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(@Y61.k com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager.ExternalState r12) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.HardwareAudioManagerAndroid30Impl.e.a(com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager$ExternalState):void");
        }
    }

    /* compiled from: HardwareAudioManagerAndroid30Impl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$f", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/HardwareAudioManagerAndroid30Impl$d$a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements d.a {

        /* compiled from: HardwareAudioManagerAndroid30Impl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f165810a;

            static {
                int[] iArr = new int[HardwareAudioDevice.values().length];
                try {
                    iArr[HardwareAudioDevice.BLUETOOTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HardwareAudioDevice.WIRED_HEADSET.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HardwareAudioDevice.EARPIECE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[HardwareAudioDevice.SPEAKER_PHONE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f165810a = iArr;
            }
        }

        public f() {
        }

        @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.HardwareAudioManagerAndroid30Impl.d.a
        public final void a(boolean z12) {
            HardwareAudioDevice hardwareAudioDevice;
            HardwareAudioDevice hardwareAudioDevice2;
            Object obj = null;
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacHardwareAudioManagerAndroid30", "WiredHeadsetReceiver.Callback: onWiredHeadsetChange: " + z12, null);
            HardwareAudioManagerAndroid30Impl hardwareAudioManagerAndroid30Impl = HardwareAudioManagerAndroid30Impl.this;
            State state = hardwareAudioManagerAndroid30Impl.f165794e;
            State.Running running = state instanceof State.Running ? (State.Running) state : null;
            if (running == null) {
                return;
            }
            LinkedHashSet linkedHashSetE = z12 ? b1.e(b1.i(running.getDevices(), HardwareAudioDevice.WIRED_HEADSET), HardwareAudioDevice.EARPIECE) : hardwareAudioManagerAndroid30Impl.f165792c.f165797a.getPackageManager().hasSystemFeature("android.hardware.telephony") ? b1.i(b1.e(running.getDevices(), HardwareAudioDevice.WIRED_HEADSET), HardwareAudioDevice.EARPIECE) : b1.e(running.getDevices(), HardwareAudioDevice.WIRED_HEADSET);
            int i12 = a.f165810a[running.getActiveDevice().ordinal()];
            if (i12 == 1) {
                hardwareAudioDevice = HardwareAudioDevice.BLUETOOTH;
            } else if (i12 == 2 || i12 == 3) {
                for (Object obj2 : linkedHashSetE) {
                    HardwareAudioDevice hardwareAudioDevice3 = (HardwareAudioDevice) obj2;
                    if (hardwareAudioDevice3 == HardwareAudioDevice.WIRED_HEADSET || hardwareAudioDevice3 == HardwareAudioDevice.EARPIECE) {
                        obj = obj2;
                        break;
                    }
                }
                HardwareAudioDevice hardwareAudioDevice4 = (HardwareAudioDevice) obj;
                if (hardwareAudioDevice4 != null) {
                    hardwareAudioDevice2 = hardwareAudioDevice4;
                    hardwareAudioManagerAndroid30Impl.c(State.Running.copy$default(running, linkedHashSetE, hardwareAudioDevice2, null, 4, null));
                }
                hardwareAudioDevice = HardwareAudioDevice.SPEAKER_PHONE;
            } else {
                if (i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                hardwareAudioDevice = z12 ? HardwareAudioDevice.WIRED_HEADSET : HardwareAudioDevice.SPEAKER_PHONE;
            }
            hardwareAudioDevice2 = hardwareAudioDevice;
            hardwareAudioManagerAndroid30Impl.c(State.Running.copy$default(running, linkedHashSetE, hardwareAudioDevice2, null, 4, null));
        }
    }

    static {
        new a(null);
    }

    @Inject
    public HardwareAudioManagerAndroid30Impl(@Y61.k AudioBluetoothManager audioBluetoothManager, @Y61.k d dVar, @Y61.k b bVar) {
        this.f165790a = audioBluetoothManager;
        this.f165791b = dVar;
        this.f165792c = bVar;
        l.f165829a.getClass();
        l.a();
        this.f165795f = new f();
        this.f165796g = new e();
    }

    @Override // hK.InterfaceC40840a
    public final void a(@Y61.k com.avito.android.iac_dialer.impl_module.audio.audio_devices.c cVar) {
        this.f165793d = cVar;
    }

    @Override // hK.InterfaceC40840a
    public final void b(@Y61.k HardwareAudioDevice hardwareAudioDevice) {
        State.Running runningCopy$default;
        l.f165829a.getClass();
        l.a();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacHardwareAudioManagerAndroid30", "activateAudioDevice: " + hardwareAudioDevice, null);
        State state = this.f165794e;
        State.Running running = state instanceof State.Running ? (State.Running) state : null;
        if (running == null) {
            return;
        }
        int[] iArr = c.f165803a;
        int i12 = iArr[hardwareAudioDevice.ordinal()];
        AudioBluetoothManager audioBluetoothManager = this.f165790a;
        if (i12 == 1) {
            audioBluetoothManager.b();
            return;
        }
        if (i12 == 2 || i12 == 3 || i12 == 4) {
            int i13 = iArr[running.getActiveDevice().ordinal()];
            if (i13 == 1) {
                audioBluetoothManager.c();
                runningCopy$default = State.Running.copy$default(running, null, null, hardwareAudioDevice, 3, null);
            } else {
                if (i13 != 2 && i13 != 3 && i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                runningCopy$default = State.Running.copy$default(running, null, hardwareAudioDevice, null, 5, null);
            }
            c(runningCopy$default);
        }
    }

    public final void c(State state) {
        HardwareAudioState activated;
        if (L.f(this.f165794e, state)) {
            return;
        }
        this.f165794e = state;
        boolean z12 = state instanceof State.Running;
        if (z12) {
            boolean z13 = state.getActiveDevice() == HardwareAudioDevice.SPEAKER_PHONE;
            AudioManager audioManager = this.f165792c.f165801e;
            if (audioManager.isSpeakerphoneOn() != z13) {
                audioManager.setSpeakerphoneOn(z13);
            }
        }
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacHardwareAudioManagerAndroid30", "onNewState: " + state, null);
        com.avito.android.iac_dialer.impl_module.audio.audio_devices.c cVar = this.f165793d;
        com.avito.android.iac_dialer.impl_module.audio.audio_devices.c cVar2 = cVar != null ? cVar : null;
        if (state instanceof State.NotInitialized) {
            activated = HardwareAudioState.NotActivated.INSTANCE;
        } else {
            if (!z12) {
                throw new NoWhenBranchMatchedException();
            }
            activated = new HardwareAudioState.Activated(state.getDevices(), state.getActiveDevice());
        }
        cVar2.a(activated);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    @Override // hK.InterfaceC40840a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.HardwareAudioManagerAndroid30Impl.start():void");
    }

    @Override // hK.InterfaceC40840a
    @SuppressLint({"WrongConstant"})
    public final void stop() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        bVar.a("IacHardwareAudioManagerAndroid30", "stop", null);
        l.f165829a.getClass();
        l.a();
        if (!(this.f165794e instanceof State.Running)) {
            bVar.a("IacHardwareAudioManagerAndroid30", "AudioDeviceManager is already stopped", null);
            return;
        }
        AudioBluetoothManager audioBluetoothManager = this.f165790a;
        audioBluetoothManager.getClass();
        bVar.a("AudioDeviceManager30.BT", "stop", null);
        l.a();
        if (!audioBluetoothManager.f165765d.f165773b) {
            AudioBluetoothManager.InternalState internalState = audioBluetoothManager.f165766e;
            AudioBluetoothManager.InternalState internalState2 = AudioBluetoothManager.InternalState.UNINITIALIZED;
            if (internalState != internalState2) {
                AudioBluetoothManager.c cVar = audioBluetoothManager.f165764c;
                if (!cVar.f165777a.f165773b) {
                    cVar.f165778b = null;
                    cVar.a();
                }
                AudioBluetoothManager.b bVar2 = audioBluetoothManager.f165763b;
                if (!bVar2.f165775b.f165773b) {
                    bVar2.f165776c = null;
                    bVar2.f165774a.unregisterReceiver(bVar2);
                }
                AudioBluetoothManager.d dVar = audioBluetoothManager.f165762a;
                if (!dVar.f165783b.f165773b) {
                    dVar.f165784c = null;
                    Object systemService = dVar.f165782a.getSystemService("bluetooth");
                    BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
                    BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
                    if (adapter != null) {
                        adapter.closeProfileProxy(1, dVar.f165785d);
                    }
                    dVar.f165785d = null;
                }
                audioBluetoothManager.d(internalState2);
                bVar.a("AudioDeviceManager30.BT", "stopped", null);
            }
        }
        b bVar3 = this.f165792c;
        int i12 = bVar3.f165798b;
        AudioManager audioManager = bVar3.f165801e;
        audioManager.setMode(i12);
        audioManager.setSpeakerphoneOn(bVar3.f165799c);
        boolean z12 = bVar3.f165800d;
        if (audioManager.isMicrophoneMute() != z12) {
            audioManager.setMicrophoneMute(z12);
        }
        audioManager.abandonAudioFocus(bVar3.f165802f);
        d dVar2 = this.f165791b;
        dVar2.f165805b = null;
        dVar2.f165804a.unregisterReceiver(dVar2);
        c(State.NotInitialized.INSTANCE);
        bVar.a("IacHardwareAudioManagerAndroid30", "AudioDeviceManager stopped", null);
    }
}
