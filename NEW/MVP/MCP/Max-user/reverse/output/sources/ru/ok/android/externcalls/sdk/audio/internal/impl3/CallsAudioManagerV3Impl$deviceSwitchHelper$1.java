package ru.ok.android.externcalls.sdk.audio.internal.impl3;

import defpackage.em6;
import defpackage.hn6;
import defpackage.qqg;
import java.io.IOException;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public /* synthetic */ class CallsAudioManagerV3Impl$deviceSwitchHelper$1 extends hn6 implements em6 {
    public CallsAudioManagerV3Impl$deviceSwitchHelper$1(Object obj) {
        super(1, 0, CallsAudioManagerV3Impl.class, obj, "selectAudioDeviceImpl", "selectAudioDeviceImpl(Lru/ok/android/externcalls/sdk/audio/CallsAudioDeviceInfo;)V");
    }

    @Override // defpackage.em6
    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
        invoke((CallsAudioDeviceInfo) obj);
        return qqg.a;
    }

    public final void invoke(CallsAudioDeviceInfo callsAudioDeviceInfo) throws IOException {
        ((CallsAudioManagerV3Impl) this.receiver).selectAudioDeviceImpl(callsAudioDeviceInfo);
    }
}
