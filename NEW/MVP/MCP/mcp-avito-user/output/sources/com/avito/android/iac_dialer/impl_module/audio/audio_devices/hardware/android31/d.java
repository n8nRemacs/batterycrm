package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31;

import android.media.AudioManager;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware.android31.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class d implements AudioManager.OnAudioFocusChangeListener {
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i12) {
        c.d dVar = c.d.f165842l;
        String strG = i12 != -3 ? i12 != -2 ? i12 != -1 ? i12 != 1 ? AK.c.g(i12, "unknown_focusChange_int_") : "AUDIOFOCUS_GAIN" : "AUDIOFOCUS_LOSS" : "AUDIOFOCUS_LOSS_TRANSIENT" : "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacHardwareAudioManagerAndroid31", "on audio focus change: " + strG, null);
    }
}
