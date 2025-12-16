package defpackage;

import org.webrtc.PeerConnectionFactory;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes2.dex */
public final /* synthetic */ class qve implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rve b;

    public /* synthetic */ qve(rve rveVar, int i) {
        this.a = i;
        this.b = rveVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                JavaAudioDeviceModule javaAudioDeviceModule = this.b.g;
                if (javaAudioDeviceModule != null) {
                    javaAudioDeviceModule.restartAudioRecording(false);
                    break;
                }
                break;
            default:
                rve rveVar = this.b;
                rveVar.b.log("SharedPeerConnectionFac", "releaseInternal");
                PeerConnectionFactory peerConnectionFactory = rveVar.d;
                if (peerConnectionFactory != null) {
                    rveVar.i.b(rveVar.j);
                    peerConnectionFactory.dispose();
                    rveVar.b.log("SharedPeerConnectionFac", w0a.c(peerConnectionFactory) + " was disposed.");
                    rveVar.d = null;
                }
                v08 v08Var = rveVar.l;
                if (v08Var != null) {
                    ty4.a(v08Var);
                }
                JavaAudioDeviceModule javaAudioDeviceModule2 = rveVar.g;
                if (javaAudioDeviceModule2 != null) {
                    javaAudioDeviceModule2.release();
                    rveVar.g = null;
                    break;
                }
                break;
        }
    }
}
