package com.avito.android.iac_dialer.impl_module.audio.audio_devices;

import Oa1.B;
import Y61.k;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.g;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioDevice;
import com.avito.android.iac_dialer.impl_module.telecom.stub.b;
import com.squareup.anvil.annotations.ContributesBinding;
import hK.InterfaceC40840a;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: IacAudioDeviceManager.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/d;", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class d implements com.avito.android.iac_dialer.impl_module.audio.audio_devices.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC40840a> f165749a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Handler f165750b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    @k
    public volatile Object f165751c = C42784z0.f406748b;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f165752d = C42727D.c(new a());

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AtomicBoolean f165753e = new AtomicBoolean(false);

    /* compiled from: IacAudioDeviceManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LhK/a;", "kotlin.jvm.PlatformType", "invoke", "()LhK/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<InterfaceC40840a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC40840a invoke() {
            d dVar = d.this;
            InterfaceC40840a interfaceC40840a = dVar.f165749a.get();
            interfaceC40840a.a(new com.avito.android.iac_dialer.impl_module.audio.audio_devices.c(dVar));
            return interfaceC40840a;
        }
    }

    /* compiled from: IacAudioDeviceManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ HardwareAudioDevice f165756m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HardwareAudioDevice hardwareAudioDevice) {
            super(0);
            this.f165756m = hardwareAudioDevice;
        }

        @Override // Y41.a
        public final G0 invoke() {
            ((InterfaceC40840a) d.this.f165752d.getValue()).b(this.f165756m);
            return G0.f406611a;
        }
    }

    /* compiled from: IacAudioDeviceManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ((InterfaceC40840a) d.this.f165752d.getValue()).start();
            return G0.f406611a;
        }
    }

    /* compiled from: IacAudioDeviceManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.iac_dialer.impl_module.audio.audio_devices.d$d, reason: collision with other inner class name */
    public static final class C4913d extends N implements Y41.a<G0> {
        public C4913d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            d dVar = d.this;
            if (dVar.f165753e.getAndSet(false)) {
                ((InterfaceC40840a) dVar.f165752d.getValue()).stop();
            }
            return G0.f406611a;
        }
    }

    @Inject
    public d(@k h31.e<InterfaceC40840a> eVar) {
        this.f165749a = eVar;
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.b
    public final void a(@k AudioDevice audioDevice) {
        HardwareAudioDevice hardwareAudioDevice = null;
        switch (g.a.f165761b[audioDevice.getType().ordinal()]) {
            case 1:
                hardwareAudioDevice = HardwareAudioDevice.WIRED_HEADSET;
                break;
            case 2:
                hardwareAudioDevice = HardwareAudioDevice.BLUETOOTH;
                break;
            case 3:
                hardwareAudioDevice = HardwareAudioDevice.SPEAKER_PHONE;
                break;
            case 4:
                hardwareAudioDevice = HardwareAudioDevice.EARPIECE;
                break;
            case 5:
            case 6:
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (hardwareAudioDevice == null) {
            return;
        }
        this.f165750b.postDelayed(new B(1, new b(hardwareAudioDevice)), 0L);
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.b
    public final void b(@k b.a aVar) {
        this.f165751c = C42745f0.c0((Iterable) this.f165751c, aVar);
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.b
    public final void c(@k b.a aVar) {
        this.f165751c = C42745f0.i0(aVar, (Collection) this.f165751c);
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.b
    public final void start() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacAudioDeviceManager", "start()", null);
        this.f165753e.set(false);
        this.f165750b.postDelayed(new B(1, new c()), 0L);
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.b
    public final void stop() {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacAudioDeviceManager", "stop()", null);
        this.f165753e.set(true);
        this.f165750b.postDelayed(new B(1, new C4913d()), 500L);
    }
}
