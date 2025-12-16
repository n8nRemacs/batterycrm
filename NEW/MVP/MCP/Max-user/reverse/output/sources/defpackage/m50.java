package defpackage;

import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;

/* loaded from: classes2.dex */
public final class m50 extends vt3 {
    public final PeerConnectionFactory f;

    public m50(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, y6d y6dVar) {
        super(str, mediaStream, y6dVar);
        this.f = peerConnectionFactory;
    }

    @Override // defpackage.vt3
    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        AudioTrack audioTrack = (AudioTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.addTrack(audioTrack);
        }
    }

    @Override // defpackage.vt3
    public final void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        AudioTrack audioTrack = (AudioTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.removeTrack(audioTrack);
        }
    }

    @Override // defpackage.vt3
    public final MediaSource g() {
        return this.f.createAudioSource(new MediaConstraints());
    }

    @Override // defpackage.vt3
    public final MediaStreamTrack h(String str, MediaSource mediaSource) {
        return this.f.createAudioTrack(str, (AudioSource) mediaSource);
    }

    public final String toString() {
        return "OkSdkAudioRecord";
    }
}
