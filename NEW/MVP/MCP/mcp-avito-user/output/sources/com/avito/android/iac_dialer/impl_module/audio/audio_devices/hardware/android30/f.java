package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android30;

import android.media.AudioManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class f implements AudioManager.OnAudioFocusChangeListener {
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i12) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacHardwareAudioManagerAndroid30", "onAudioFocusChange: ".concat(i12 != -3 ? i12 != -2 ? i12 != -1 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? "AUDIOFOCUS_INVALID" : "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE" : "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK" : "AUDIOFOCUS_GAIN_TRANSIENT" : "AUDIOFOCUS_GAIN" : "AUDIOFOCUS_LOSS" : "AUDIOFOCUS_LOSS_TRANSIENT" : "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK"), null);
    }
}
