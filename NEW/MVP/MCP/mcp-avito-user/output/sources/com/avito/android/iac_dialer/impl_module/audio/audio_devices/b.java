package com.avito.android.iac_dialer.impl_module.audio.audio_devices;

import Y61.k;
import com.avito.android.iac_dialer.impl_module.telecom.stub.b;
import kotlin.Metadata;

/* compiled from: IacAudioDeviceManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/b;", "", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: IacAudioDeviceManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/b$a;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@k AudioState audioState);
    }

    void a(@k AudioDevice audioDevice);

    void b(@k b.a aVar);

    void c(@k b.a aVar);

    void start();

    void stop();
}
