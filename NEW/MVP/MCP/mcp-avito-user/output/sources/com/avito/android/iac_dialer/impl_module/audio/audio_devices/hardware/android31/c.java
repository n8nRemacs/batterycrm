package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.b;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioDevice;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioState;
import hK.InterfaceC40840a;
import j.X;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import org.webrtc.MediaStreamTrack;

/* compiled from: HardwareAudioManagerAndroid31Impl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android31/c;", "LhK/a;", "a", "b", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes14.dex */
public final class c implements InterfaceC40840a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f165831h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165833b;

    /* renamed from: c, reason: collision with root package name */
    public com.avito.android.iac_dialer.impl_module.audio.audio_devices.c f165834c;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AtomicBoolean f165832a = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    @k
    public b f165835d = new b(B0.f406639b, null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31.b f165836e = new AudioManager.OnCommunicationDeviceChangedListener() { // from class: com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31.b
        @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
        public final void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
            c cVar = this.f165830a;
            int i12 = c.f165831h;
            StringBuilder sb2 = new StringBuilder("onCommunicationDeviceChangedListener(device=");
            sb2.append(audioDeviceInfo != null ? e.b(audioDeviceInfo) : null);
            sb2.append(')');
            cVar.f(sb2.toString());
        }
    };

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C4914c f165837f = new C4914c();

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165838g = C42727D.c(d.f165842l);

    /* compiled from: HardwareAudioManagerAndroid31Impl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android31/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HardwareAudioManagerAndroid31Impl.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android31/c$b;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final HardwareAudioDevice f165839a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Set<HardwareAudioDevice> f165840b;

        public b(@k Set set, @l HardwareAudioDevice hardwareAudioDevice) {
            this.f165839a = hardwareAudioDevice;
            this.f165840b = set;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f165839a == bVar.f165839a && L.f(this.f165840b, bVar.f165840b);
        }

        public final int hashCode() {
            HardwareAudioDevice hardwareAudioDevice = this.f165839a;
            return this.f165840b.hashCode() + ((hardwareAudioDevice == null ? 0 : hardwareAudioDevice.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InternalState(activated=");
            sb2.append(this.f165839a);
            sb2.append(", available=");
            return AK.c.u(sb2, this.f165840b, ')');
        }
    }

    /* compiled from: HardwareAudioManagerAndroid31Impl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/android31/c$c", "Landroid/media/AudioDeviceCallback;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31.c$c, reason: collision with other inner class name */
    public static final class C4914c extends AudioDeviceCallback {
        public C4914c() {
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(@l AudioDeviceInfo[] audioDeviceInfoArr) {
            ArrayList arrayList;
            StringBuilder sb2 = new StringBuilder("audioDeviceCallback(addedDevices=");
            if (audioDeviceInfoArr != null) {
                arrayList = new ArrayList(audioDeviceInfoArr.length);
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    arrayList.add(com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31.e.b(audioDeviceInfo));
                }
            } else {
                arrayList = null;
            }
            String strP = androidx.compose.ui.graphics.colorspace.e.p(sb2, arrayList, ')');
            int i12 = c.f165831h;
            c.this.f(strP);
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(@l AudioDeviceInfo[] audioDeviceInfoArr) {
            ArrayList arrayList;
            StringBuilder sb2 = new StringBuilder("audioDeviceCallback(removedDevices=");
            if (audioDeviceInfoArr != null) {
                arrayList = new ArrayList(audioDeviceInfoArr.length);
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    arrayList.add(com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31.e.b(audioDeviceInfo));
                }
            } else {
                arrayList = null;
            }
            String strP = androidx.compose.ui.graphics.colorspace.e.p(sb2, arrayList, ')');
            int i12 = c.f165831h;
            c.this.f(strP);
        }
    }

    /* compiled from: HardwareAudioManagerAndroid31Impl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/media/AudioFocusRequest;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<AudioFocusRequest> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f165842l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final AudioFocusRequest invoke() {
            return new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(2).setContentType(1).build()).setOnAudioFocusChangeListener(new com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31.d()).build();
        }
    }

    /* compiled from: HardwareAudioManagerAndroid31Impl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/media/AudioManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<AudioManager> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f165843l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context) {
            super(0);
            this.f165843l = context;
        }

        @Override // Y41.a
        public final AudioManager invoke() {
            return (AudioManager) this.f165843l.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31.b] */
    @Inject
    public c(@k Context context) {
        this.f165833b = C42727D.c(new e(context));
    }

    public static HardwareAudioDevice d(AudioDeviceInfo audioDeviceInfo) {
        int type = audioDeviceInfo.getType();
        if (type == 1) {
            return HardwareAudioDevice.EARPIECE;
        }
        if (type == 2) {
            return HardwareAudioDevice.SPEAKER_PHONE;
        }
        if (type == 3) {
            return HardwareAudioDevice.WIRED_HEADSET;
        }
        if (type == 7) {
            return HardwareAudioDevice.BLUETOOTH;
        }
        if (type == 8) {
            return HardwareAudioDevice.BLUETOOTH;
        }
        if (type != 26) {
            return null;
        }
        return HardwareAudioDevice.BLUETOOTH;
    }

    public static HardwareAudioState e(b bVar) {
        if (bVar.f165839a != null) {
            Set<HardwareAudioDevice> set = bVar.f165840b;
            if (!set.isEmpty()) {
                return new HardwareAudioState.Activated(set, bVar.f165839a);
            }
        }
        return HardwareAudioState.NotActivated.INSTANCE;
    }

    @Override // hK.InterfaceC40840a
    public final void a(@k com.avito.android.iac_dialer.impl_module.audio.audio_devices.c cVar) {
        this.f165834c = cVar;
    }

    @Override // hK.InterfaceC40840a
    public final void b(@k HardwareAudioDevice hardwareAudioDevice) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        bVar.a("IacHardwareAudioManagerAndroid31", "activateAudioDevice(" + hardwareAudioDevice + "): started", null);
        if (!this.f165832a.get()) {
            bVar.d("IacHardwareAudioManagerAndroid31", "Can not activate audio device cause AudioDeviceManager is not started", null);
            return;
        }
        LinkedHashMap linkedHashMapF = f("activateAudioDevice(" + hardwareAudioDevice + ')');
        if (hardwareAudioDevice == this.f165835d.f165839a) {
            bVar.d("IacHardwareAudioManagerAndroid31", "activateAudioDevice(" + hardwareAudioDevice + "): device is already active", null);
            return;
        }
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) linkedHashMapF.get(hardwareAudioDevice);
        if (audioDeviceInfo == null) {
            bVar.d("IacHardwareAudioManagerAndroid31", "activateAudioDevice(" + hardwareAudioDevice + "): device is not available and can not be activated", null);
            return;
        }
        try {
            bVar.a("IacHardwareAudioManagerAndroid31", "activateAudioDevice(" + hardwareAudioDevice + "): setCommunicationDevice(" + com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31.e.b(audioDeviceInfo) + ')', null);
            if (!c().setCommunicationDevice(audioDeviceInfo)) {
                bVar.d("IacHardwareAudioManagerAndroid31", "activateAudioDevice(" + hardwareAudioDevice + "): device activation was not accepted by system", null);
            }
        } catch (Exception e12) {
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.b("IacHardwareAudioManagerAndroid31", "activateAudioDevice(" + hardwareAudioDevice + "): device activation exception", e12);
            com.avito.android.iac_dialer.impl_module.audio.audio_devices.c cVar = this.f165834c;
            if (cVar == null) {
                cVar = null;
            }
            Iterator it = ((Iterable) cVar.f165748a.f165751c).iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).getClass();
            }
        }
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacHardwareAudioManagerAndroid31", "activateAudioDevice(" + hardwareAudioDevice + "): finished", null);
    }

    public final AudioManager c() {
        return (AudioManager) this.f165833b.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0271, code lost:
    
        r14 = r1.f165840b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0277, code lost:
    
        if ((r14 instanceof java.util.Collection) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0280, code lost:
    
        if (r14.isEmpty() == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0283, code lost:
    
        r14 = r14.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x028b, code lost:
    
        if (r14.hasNext() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0295, code lost:
    
        if (((com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioDevice) r14.next()) != com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioDevice.BLUETOOTH) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x029e, code lost:
    
        if (r13.f165832a.get() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02a0, code lost:
    
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacHardwareAudioManagerAndroid31", "bluetooth audio device is connected now, lets enable it", null);
        b(com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioDevice.BLUETOOTH);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.LinkedHashMap f(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31.c.f(java.lang.String):java.util.LinkedHashMap");
    }

    @Override // hK.InterfaceC40840a
    public final void start() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        bVar.a("IacHardwareAudioManagerAndroid31", "start", null);
        if (this.f165832a.getAndSet(true)) {
            bVar.d("IacHardwareAudioManagerAndroid31", "manager is already started", null);
            return;
        }
        if (c().requestAudioFocus((AudioFocusRequest) this.f165838g.getValue()) == 1) {
            bVar.a("IacHardwareAudioManagerAndroid31", "audio focus granted", null);
        } else {
            bVar.d("IacHardwareAudioManagerAndroid31", "audio focus request failed", null);
        }
        c().setMode(3);
        f("start");
        c().registerAudioDeviceCallback(this.f165837f, null);
        c().addOnCommunicationDeviceChangedListener(Executors.newSingleThreadExecutor(), this.f165836e);
        bVar.a("IacHardwareAudioManagerAndroid31", "started", null);
    }

    @Override // hK.InterfaceC40840a
    public final void stop() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
        bVar.a("IacHardwareAudioManagerAndroid31", "stop", null);
        if (!this.f165832a.getAndSet(false)) {
            bVar.d("IacHardwareAudioManagerAndroid31", "already stopped", null);
            return;
        }
        c().abandonAudioFocusRequest((AudioFocusRequest) this.f165838g.getValue());
        c().unregisterAudioDeviceCallback(this.f165837f);
        c().removeOnCommunicationDeviceChangedListener(this.f165836e);
        c().clearCommunicationDevice();
        b bVar2 = new b(B0.f406639b, null);
        this.f165835d = bVar2;
        com.avito.android.iac_dialer.impl_module.audio.audio_devices.c cVar = this.f165834c;
        if (cVar == null) {
            cVar = null;
        }
        cVar.a(e(bVar2));
        bVar.a("IacHardwareAudioManagerAndroid31", "stopped", null);
    }
}
