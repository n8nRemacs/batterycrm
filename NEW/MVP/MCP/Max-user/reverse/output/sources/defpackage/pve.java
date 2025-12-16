package defpackage;

import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes2.dex */
public final /* synthetic */ class pve implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rve b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ pve(rve rveVar, boolean z, int i) {
        this.a = i;
        this.b = rveVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                JavaAudioDeviceModule javaAudioDeviceModule = this.b.g;
                if (javaAudioDeviceModule != null) {
                    javaAudioDeviceModule.setNoiseSuppressorEnabled(this.c);
                    break;
                }
                break;
            case 1:
                JavaAudioDeviceModule javaAudioDeviceModule2 = this.b.g;
                if (javaAudioDeviceModule2 != null) {
                    javaAudioDeviceModule2.setMicrophoneMute(this.c);
                    break;
                }
                break;
            default:
                JavaAudioDeviceModule javaAudioDeviceModule3 = this.b.g;
                if (javaAudioDeviceModule3 != null) {
                    javaAudioDeviceModule3.setSpeakerMute(this.c);
                    break;
                }
                break;
        }
    }
}
