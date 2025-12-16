package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

/* loaded from: classes.dex */
public final class w21 implements v21 {
    public final bv1 a;
    public final k18 b;
    public final AtomicReference c = new AtomicReference();

    public w21(k18 k18Var, bv1 bv1Var) {
        this.a = bv1Var;
        this.b = k18Var;
    }

    public final void a(CallsAudioManager.State state) {
        wqi.c("CallAudioController", "setting audio state: " + state, new Object[0]);
        CallsAudioManager callsAudioManager = (CallsAudioManager) this.c.get();
        if (callsAudioManager != null) {
            CallsAudioManager.changeStateAsync$default(callsAudioManager, state, null, null, 6, null);
        }
    }

    public final CallsAudioDeviceInfo b() {
        CallsAudioDeviceInfo currentDevice;
        CallsAudioManager callsAudioManager = (CallsAudioManager) this.c.get();
        return (callsAudioManager == null || (currentDevice = callsAudioManager.getUsedDevice()) == null) ? CallsAudioDeviceInfo.INSTANCE.getNONE() : currentDevice;
    }

    public final MicrophoneManager c() {
        Conversation conversationA = ((n64) this.b.getValue()).a();
        if (conversationA != null) {
            return conversationA.getMicrophoneManager();
        }
        return null;
    }

    public final boolean d() {
        MicrophoneManager microphoneManagerC = c();
        return microphoneManagerC != null && microphoneManagerC.isMicEnabled();
    }

    public final void e(boolean z) {
        wqi.c("CallAudioController", "CallAudioController microphone changed=" + z, new Object[0]);
        MicrophoneManager microphoneManagerC = c();
        if (microphoneManagerC != null) {
            microphoneManagerC.setMicEnabled(z);
        }
    }
}
