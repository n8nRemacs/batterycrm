package ru.ok.android.externcalls.sdk.audio.internal.impl;

import defpackage.em6;
import defpackage.hn6;
import defpackage.qqg;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class CallsAudioManagerV2Impl$deviceSwitchHelper$1 extends hn6 implements em6 {
    public CallsAudioManagerV2Impl$deviceSwitchHelper$1(Object obj) {
        super(1, 0, CallsAudioManagerV2Impl.class, obj, "selectAudioDeviceImpl", "selectAudioDeviceImpl(Lru/ok/android/externcalls/sdk/audio/CallsAudioManager$AudioDeviceType;)V");
    }

    @Override // defpackage.em6
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CallsAudioManager.AudioDeviceType) obj);
        return qqg.a;
    }

    public final void invoke(CallsAudioManager.AudioDeviceType audioDeviceType) {
        ((CallsAudioManagerV2Impl) this.receiver).selectAudioDeviceImpl(audioDeviceType);
    }
}
