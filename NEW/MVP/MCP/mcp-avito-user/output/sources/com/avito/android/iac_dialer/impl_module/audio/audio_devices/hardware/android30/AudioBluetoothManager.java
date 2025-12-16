package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.MediaStreamTrack;

/* compiled from: AudioBluetoothManager.kt */
@Singleton
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager;", "", "a", "b", "c", "d", "e", "f", "ExternalState", "InternalState", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AudioBluetoothManager {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f165762a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f165763b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f165764c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a f165765d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public InternalState f165766e = InternalState.UNINITIALIZED;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public ExternalState f165767f = ExternalState.NO_DEVICES;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public e f165768g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final j f165769h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final h f165770i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final i f165771j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioBluetoothManager.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$ExternalState;", "", "(Ljava/lang/String;I)V", "NO_DEVICES", "SCO_AUDIO_DISCONNECTED", "SCO_AUDIO_CONNECTED", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ExternalState {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ ExternalState[] $VALUES;
        public static final ExternalState NO_DEVICES = new ExternalState("NO_DEVICES", 0);
        public static final ExternalState SCO_AUDIO_DISCONNECTED = new ExternalState("SCO_AUDIO_DISCONNECTED", 1);
        public static final ExternalState SCO_AUDIO_CONNECTED = new ExternalState("SCO_AUDIO_CONNECTED", 2);

        private static final /* synthetic */ ExternalState[] $values() {
            return new ExternalState[]{NO_DEVICES, SCO_AUDIO_DISCONNECTED, SCO_AUDIO_CONNECTED};
        }

        static {
            ExternalState[] externalStateArr$values = $values();
            $VALUES = externalStateArr$values;
            $ENTRIES = kotlin.enums.c.a(externalStateArr$values);
        }

        private ExternalState(String str, int i12) {
        }

        @Y61.k
        public static kotlin.enums.a<ExternalState> getEntries() {
            return $ENTRIES;
        }

        public static ExternalState valueOf(String str) {
            return (ExternalState) Enum.valueOf(ExternalState.class, str);
        }

        public static ExternalState[] values() {
            return (ExternalState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioBluetoothManager.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0083\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$InternalState;", "", "(Ljava/lang/String;I)V", "UNINITIALIZED", "HEADSET_UNAVAILABLE", "SCO_DISCONNECTED", "SCO_CONNECTING", "SCO_CONNECTED", "SCO_DISCONNECTING", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InternalState {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ InternalState[] $VALUES;
        public static final InternalState UNINITIALIZED = new InternalState("UNINITIALIZED", 0);
        public static final InternalState HEADSET_UNAVAILABLE = new InternalState("HEADSET_UNAVAILABLE", 1);
        public static final InternalState SCO_DISCONNECTED = new InternalState("SCO_DISCONNECTED", 2);
        public static final InternalState SCO_CONNECTING = new InternalState("SCO_CONNECTING", 3);
        public static final InternalState SCO_CONNECTED = new InternalState("SCO_CONNECTED", 4);
        public static final InternalState SCO_DISCONNECTING = new InternalState("SCO_DISCONNECTING", 5);

        private static final /* synthetic */ InternalState[] $values() {
            return new InternalState[]{UNINITIALIZED, HEADSET_UNAVAILABLE, SCO_DISCONNECTED, SCO_CONNECTING, SCO_CONNECTED, SCO_DISCONNECTING};
        }

        static {
            InternalState[] internalStateArr$values = $values();
            $VALUES = internalStateArr$values;
            $ENTRIES = kotlin.enums.c.a(internalStateArr$values);
        }

        private InternalState(String str, int i12) {
        }

        @Y61.k
        public static kotlin.enums.a<InternalState> getEntries() {
            return $ENTRIES;
        }

        public static InternalState valueOf(String str) {
            return (InternalState) Enum.valueOf(InternalState.class, str);
        }

        public static InternalState[] values() {
            return (InternalState[]) $VALUES.clone();
        }
    }

    /* compiled from: AudioBluetoothManager.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$a;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Singleton
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Context f165772a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f165773b = true;

        @Inject
        public a(@Y61.k Context context) {
            this.f165772a = context;
        }
    }

    /* compiled from: AudioBluetoothManager.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$b;", "Landroid/content/BroadcastReceiver;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Singleton
    public static class b extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Context f165774a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final a f165775b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public a f165776c;

        /* compiled from: AudioBluetoothManager.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$b$a;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface a {
            void a();

            void b();

            void c();

            void d();
        }

        @Inject
        public b(@Y61.k Context context, @Y61.k a aVar) {
            this.f165774a = context;
            this.f165775b = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@Y61.k Context context, @Y61.k Intent intent) {
            a aVar;
            a aVar2;
            a aVar3;
            if (this.f165775b.f165773b) {
                return;
            }
            String action = intent.getAction();
            if (L.f(action, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                if (intExtra != 0) {
                    if (intExtra == 2 && (aVar3 = this.f165776c) != null) {
                        aVar3.a();
                        return;
                    }
                    return;
                }
                a aVar4 = this.f165776c;
                if (aVar4 != null) {
                    aVar4.c();
                    return;
                }
                return;
            }
            if (L.f(action, "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
                int intExtra2 = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 10);
                if (intExtra2 != 10) {
                    if (intExtra2 == 12 && (aVar2 = this.f165776c) != null) {
                        aVar2.b();
                        return;
                    }
                    return;
                }
                if (isInitialStickyBroadcast() || (aVar = this.f165776c) == null) {
                    return;
                }
                aVar.d();
            }
        }
    }

    /* compiled from: AudioBluetoothManager.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$c;", "", "a", "b", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Singleton
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final a f165777a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public a f165778b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final AudioManager f165779c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Handler f165780d = new Handler(Looper.getMainLooper());

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.app.coldstart.d f165781e = new com.avito.android.app.coldstart.d(this, 27);

        /* compiled from: AudioBluetoothManager.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$c$a;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface a {
            void a();
        }

        /* compiled from: AudioBluetoothManager.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$c$b;", "", "<init>", "()V", "", "BLUETOOTH_SCO_TIMEOUT_MS", "J", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        static {
            new b(null);
        }

        @Inject
        public c(@Y61.k Context context, @Y61.k a aVar) {
            this.f165777a = aVar;
            this.f165779c = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        }

        public final void a() {
            if (this.f165777a.f165773b) {
                return;
            }
            this.f165780d.removeCallbacks(this.f165781e);
            AudioManager audioManager = this.f165779c;
            audioManager.stopBluetoothSco();
            audioManager.setBluetoothScoOn(false);
        }
    }

    /* compiled from: AudioBluetoothManager.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$d;", "Landroid/bluetooth/BluetoothProfile$ServiceListener;", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Singleton
    public static class d implements BluetoothProfile.ServiceListener {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Context f165782a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final a f165783b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public a f165784c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public BluetoothHeadset f165785d;

        /* compiled from: AudioBluetoothManager.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$d$a;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface a {
            void a();

            void b();
        }

        @Inject
        public d(@Y61.k Context context, @Y61.k a aVar) {
            this.f165782a = context;
            this.f165783b = aVar;
        }

        @SuppressLint({"MissingPermission"})
        public final boolean a() {
            List<BluetoothDevice> connectedDevices;
            if (this.f165783b.f165773b) {
                return false;
            }
            BluetoothHeadset bluetoothHeadset = this.f165785d;
            return ((bluetoothHeadset == null || (connectedDevices = bluetoothHeadset.getConnectedDevices()) == null) ? null : (BluetoothDevice) C42745f0.G(connectedDevices)) != null;
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public final void onServiceConnected(int i12, @Y61.k BluetoothProfile bluetoothProfile) {
            if (!this.f165783b.f165773b && i12 == 1 && (bluetoothProfile instanceof BluetoothHeadset)) {
                this.f165785d = (BluetoothHeadset) bluetoothProfile;
                a aVar = this.f165784c;
                if (aVar != null) {
                    aVar.a();
                }
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public final void onServiceDisconnected(int i12) {
            if (!this.f165783b.f165773b && i12 == 1) {
                this.f165785d = null;
                a aVar = this.f165784c;
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }

    /* compiled from: AudioBluetoothManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$e;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {
        void a(@Y61.k ExternalState externalState);
    }

    /* compiled from: AudioBluetoothManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$f;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f {
        public /* synthetic */ f(C42822w c42822w) {
            this();
        }

        public f() {
        }
    }

    /* compiled from: AudioBluetoothManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f165786a;

        static {
            int[] iArr = new int[InternalState.values().length];
            try {
                iArr[InternalState.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalState.HEADSET_UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InternalState.SCO_DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InternalState.SCO_CONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InternalState.SCO_CONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InternalState.SCO_DISCONNECTING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f165786a = iArr;
        }
    }

    /* compiled from: AudioBluetoothManager.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$h", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$b$a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements b.a {
        public h() {
        }

        @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager.b.a
        public final void a() {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AudioDeviceManager30.BT", "BluetoothHeadsetBroadcastReceiver.Callback: onProfileConnected", null);
            AudioBluetoothManager audioBluetoothManager = AudioBluetoothManager.this;
            if (audioBluetoothManager.f165765d.f165773b) {
                return;
            }
            AudioBluetoothManager.a(audioBluetoothManager);
        }

        @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager.b.a
        public final void b() {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AudioDeviceManager30.BT", "BluetoothHeadsetBroadcastReceiver.Callback: onScoAudioStreamConnected", null);
            AudioBluetoothManager audioBluetoothManager = AudioBluetoothManager.this;
            if (audioBluetoothManager.f165765d.f165773b) {
                return;
            }
            audioBluetoothManager.d(InternalState.SCO_CONNECTED);
        }

        @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager.b.a
        public final void c() {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AudioDeviceManager30.BT", "BluetoothHeadsetBroadcastReceiver.Callback: onProfileDisconnected", null);
            AudioBluetoothManager audioBluetoothManager = AudioBluetoothManager.this;
            if (audioBluetoothManager.f165765d.f165773b) {
                return;
            }
            audioBluetoothManager.c();
        }

        @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager.b.a
        public final void d() {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AudioDeviceManager30.BT", "BluetoothHeadsetBroadcastReceiver.Callback: onScoAudioStreamDisconnected", null);
            AudioBluetoothManager audioBluetoothManager = AudioBluetoothManager.this;
            if (audioBluetoothManager.f165765d.f165773b) {
                return;
            }
            audioBluetoothManager.d(audioBluetoothManager.f165762a.a() ? InternalState.SCO_DISCONNECTED : InternalState.HEADSET_UNAVAILABLE);
        }
    }

    /* compiled from: AudioBluetoothManager.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$i", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$c$a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements c.a {
        public i() {
        }

        @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager.c.a
        public final void a() {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AudioDeviceManager30.BT", "BluetoothScoAudioStreamConnector.Callback: onNeedToCheckScoAudioStreamByTimeout", null);
            AudioBluetoothManager audioBluetoothManager = AudioBluetoothManager.this;
            if (audioBluetoothManager.f165765d.f165773b || audioBluetoothManager.f165766e != InternalState.SCO_CONNECTING || audioBluetoothManager.f165762a.a()) {
                return;
            }
            audioBluetoothManager.d(InternalState.HEADSET_UNAVAILABLE);
        }
    }

    /* compiled from: AudioBluetoothManager.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$j", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android30/AudioBluetoothManager$d$a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j implements d.a {
        public j() {
        }

        @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager.d.a
        public final void a() {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AudioDeviceManager30.BT", "BluetoothServiceListener.Callback: onBluetoothHeadsetConnected", null);
            AudioBluetoothManager audioBluetoothManager = AudioBluetoothManager.this;
            if (audioBluetoothManager.f165765d.f165773b) {
                return;
            }
            AudioBluetoothManager.a(audioBluetoothManager);
        }

        @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30.AudioBluetoothManager.d.a
        public final void b() {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AudioDeviceManager30.BT", "BluetoothServiceListener.Callback: onBluetoothHeadsetDisconnected", null);
            AudioBluetoothManager audioBluetoothManager = AudioBluetoothManager.this;
            if (audioBluetoothManager.f165765d.f165773b) {
                return;
            }
            audioBluetoothManager.f165764c.a();
            audioBluetoothManager.d(InternalState.HEADSET_UNAVAILABLE);
            AudioBluetoothManager.a(audioBluetoothManager);
        }
    }

    static {
        new f(null);
    }

    @Inject
    public AudioBluetoothManager(@Y61.k d dVar, @Y61.k b bVar, @Y61.k c cVar, @Y61.k a aVar) {
        this.f165762a = dVar;
        this.f165763b = bVar;
        this.f165764c = cVar;
        this.f165765d = aVar;
        l.f165829a.getClass();
        l.a();
        this.f165769h = new j();
        this.f165770i = new h();
        this.f165771j = new i();
    }

    public static final void a(AudioBluetoothManager audioBluetoothManager) {
        InternalState internalState;
        audioBluetoothManager.getClass();
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AudioDeviceManager30.BT", "resetDeviceAvailability", null);
        if (audioBluetoothManager.f165765d.f165773b) {
            return;
        }
        switch (g.f165786a[audioBluetoothManager.f165766e.ordinal()]) {
            case 1:
            case 4:
            case 5:
                internalState = audioBluetoothManager.f165766e;
                break;
            case 2:
            case 3:
            case 6:
                if (!audioBluetoothManager.f165762a.a()) {
                    internalState = InternalState.HEADSET_UNAVAILABLE;
                    break;
                } else {
                    internalState = InternalState.SCO_DISCONNECTED;
                    break;
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
        audioBluetoothManager.d(internalState);
    }

    public final void b() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AudioDeviceManager30.BT", "connectScoAudioStream", null);
        if (this.f165765d.f165773b) {
            return;
        }
        InternalState internalState = InternalState.SCO_CONNECTING;
        if (C42756l.H(this.f165766e, new InternalState[]{internalState, InternalState.SCO_CONNECTED}) >= 0) {
            return;
        }
        c cVar = this.f165764c;
        if (!cVar.f165777a.f165773b) {
            AudioManager audioManager = cVar.f165779c;
            audioManager.startBluetoothSco();
            audioManager.setBluetoothScoOn(true);
            cVar.f165780d.postDelayed(cVar.f165781e, 4000L);
        }
        d(internalState);
    }

    public final void c() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AudioDeviceManager30.BT", "disconnectScoAudioStream", null);
        if (this.f165765d.f165773b) {
            return;
        }
        InternalState internalState = this.f165766e;
        if (internalState == InternalState.SCO_CONNECTING || internalState == InternalState.SCO_CONNECTED) {
            d(InternalState.SCO_DISCONNECTING);
            this.f165764c.a();
        }
    }

    public final void d(InternalState internalState) {
        ExternalState externalState;
        this.f165766e = internalState;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        bVar.a("AudioDeviceManager30.BT", "onNewState: " + internalState, null);
        switch (g.f165786a[internalState.ordinal()]) {
            case 1:
            case 2:
                externalState = ExternalState.NO_DEVICES;
                break;
            case 3:
            case 4:
                externalState = ExternalState.SCO_AUDIO_DISCONNECTED;
                break;
            case 5:
                externalState = ExternalState.SCO_AUDIO_CONNECTED;
                break;
            case 6:
                externalState = ExternalState.SCO_AUDIO_CONNECTED;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (externalState != this.f165767f) {
            bVar.a("AudioDeviceManager30.BT", "onNewExternalState: " + externalState, null);
            this.f165767f = externalState;
            e eVar = this.f165768g;
            if (eVar != null) {
                eVar.a(externalState);
            }
        }
    }
}
