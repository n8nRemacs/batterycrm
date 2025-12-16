package com.avito.android.iac_dialer.impl_module.audio.audio_devices;

import Y61.k;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.b;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioDevice;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.HardwareAudioState;
import hK.InterfaceC40840a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: IacAudioDeviceManager.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/c;", "LhK/a$a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements InterfaceC40840a.InterfaceC11251a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f165748a;

    public c(d dVar) {
        this.f165748a = dVar;
    }

    public final void a(@k HardwareAudioState hardwareAudioState) {
        AudioState audioState;
        for (b.a aVar : (Iterable) this.f165748a.f165751c) {
            if (hardwareAudioState instanceof HardwareAudioState.NotActivated) {
                AudioState.INSTANCE.getClass();
                audioState = AudioState.Companion.a();
            } else {
                if (!(hardwareAudioState instanceof HardwareAudioState.Activated)) {
                    throw new NoWhenBranchMatchedException();
                }
                HardwareAudioState.Activated activated = (HardwareAudioState.Activated) hardwareAudioState;
                AudioDevice audioDeviceA = g.a(activated.getActiveDevice());
                Set<HardwareAudioDevice> availableDevices = activated.getAvailableDevices();
                ArrayList arrayList = new ArrayList(C42745f0.q(availableDevices, 10));
                Iterator<T> it = availableDevices.iterator();
                while (it.hasNext()) {
                    arrayList.add(g.a((HardwareAudioDevice) it.next()));
                }
                audioState = new AudioState(audioDeviceA, C42745f0.P0(arrayList));
            }
            aVar.a(audioState);
        }
    }
}
