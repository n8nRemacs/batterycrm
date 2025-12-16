package com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing;

import android.content.Context;
import android.os.CombinedVibration;
import android.os.VibrationAttributes;
import android.os.VibrationEffect;
import android.os.VibratorManager;
import androidx.compose.runtime.internal.P;
import j.X;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacVibrationPlayer.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/p;", "Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/k;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
@Singleton
/* loaded from: classes14.dex */
public final class p implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final VibratorManager f165899a;

    @Inject
    public p(@Y61.k Context context) {
        this.f165899a = androidx.media3.exoplayer.audio.n.i(context.getSystemService("vibrator_manager"));
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k
    public final void a() {
        this.f165899a.vibrate(CombinedVibration.createParallel(VibrationEffect.createOneShot(500L, -1)), VibrationAttributes.createForUsage(33));
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k
    public final void b() {
        this.f165899a.vibrate(CombinedVibration.createParallel(VibrationEffect.createWaveform(r.f165901a, 0)), VibrationAttributes.createForUsage(33));
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k
    @Y61.k
    public final String getName() {
        return "IacVibrationPlayerApi33Impl";
    }

    @Override // com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing.k
    public final void stop() {
        this.f165899a.cancel();
    }
}
