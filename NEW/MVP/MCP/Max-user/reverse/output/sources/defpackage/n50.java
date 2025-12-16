package defpackage;

import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes2.dex */
public final class n50 implements JavaAudioDeviceModule.AudioRecordStateCallback, JavaAudioDeviceModule.AudioRecordErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback, JavaAudioDeviceModule.AudioTrackErrorCallback {
    public final y6d a;

    public /* synthetic */ n50(y6d y6dVar) {
        this.a = y6dVar;
    }

    public tbh a(tm9 tm9Var) {
        int iN0 = tm9Var.n0();
        int iS0 = 0;
        int iS02 = 0;
        int iE = 0;
        for (int i = 0; i < iN0; i++) {
            if (i != 0) {
                boolean z = true;
                if (i == 1) {
                    iS02 = tm9Var.s0();
                } else if (i != 2) {
                    try {
                        tm9Var.v();
                    } catch (Throwable th) {
                        this.a.log("VideoQualityUpdateNotificationParser", "Can't parse VideoQualityUpdate " + th);
                        return null;
                    }
                } else {
                    a2 a2VarX0 = tm9Var.x0();
                    if (a2VarX0.d() == 3) {
                        int iD = a2VarX0.d();
                        if (iD == 0) {
                            throw null;
                        }
                        if (iD != 1) {
                            z = false;
                        }
                        if (!z) {
                            iE = a2VarX0.f().e();
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                iS0 = tm9Var.s0();
            }
        }
        return new tbh(new sbh(iS0, iS02, iE));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordError(String str) {
        a9h.o("Audio record error: ", str, this.a, "AudioRecordCallback");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordInitError(String str) {
        a9h.o("Audio record init error: ", str, this.a, "AudioRecordCallback");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
    public void onWebRtcAudioRecordStart() {
        this.a.log("AudioRecordCallback", "Audio record did start");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        this.a.log("AudioRecordCallback", "Audio record start error: [" + audioRecordStartErrorCode + "] " + str);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
    public void onWebRtcAudioRecordStop() {
        this.a.log("AudioRecordCallback", "Audio record did stop");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public void onWebRtcAudioTrackError(String str) {
        a9h.o("Audio track error: ", str, this.a, "AudioRecordCallback");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public void onWebRtcAudioTrackInitError(String str) {
        a9h.o("Audio track init error: ", str, this.a, "AudioRecordCallback");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
    public void onWebRtcAudioTrackStart() {
        this.a.log("AudioRecordCallback", "Audio track did start");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        this.a.log("AudioRecordCallback", "Audio track start error: [" + audioTrackStartErrorCode + "] " + str);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
    public void onWebRtcAudioTrackStop() {
        this.a.log("AudioRecordCallback", "Audio track did stop");
    }
}
