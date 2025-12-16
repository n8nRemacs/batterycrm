package com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing;

import android.content.Context;
import android.media.AudioAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacVibrationPlayer.kt */
@Singleton
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/l;", "Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/k;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Vibrator f165895a;

    @Inject
    public l(@Y61.k Context context) {
        this.f165895a = (Vibrator) context.getSystemService("vibrator");
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k
    public final void a() {
        this.f165895a.vibrate(VibrationEffect.createOneShot(500L, -1), new AudioAttributes.Builder().setUsage(6).build());
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k
    public final void b() {
        this.f165895a.vibrate(VibrationEffect.createWaveform(r.f165901a, 0), new AudioAttributes.Builder().setUsage(6).build());
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k
    @Y61.k
    public final String getName() {
        return "IacVibrationPlayerApi27Impl";
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k
    public final void stop() {
        this.f165895a.cancel();
    }
}
