package defpackage;

import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

/* loaded from: classes2.dex */
public final class g2e extends vt3 {
    public final PeerConnectionFactory f;
    public SurfaceTextureHelper g;
    public final jkc h;

    public g2e(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, y6d y6dVar, awd awdVar, btd btdVar) {
        super(str, mediaStream, y6dVar);
        this.f = peerConnectionFactory;
        jkc jkcVar = new jkc();
        jkcVar.a = btdVar;
        jkcVar.b = awdVar;
        this.h = jkcVar;
    }

    @Override // defpackage.vt3
    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.addTrack(videoTrack);
        }
    }

    @Override // defpackage.vt3
    public final void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.removeTrack(videoTrack);
        }
        SurfaceTextureHelper surfaceTextureHelper = this.g;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        this.g = null;
    }

    @Override // defpackage.vt3
    public final MediaSource g() {
        return this.f.createVideoSource(false);
    }

    @Override // defpackage.vt3
    public final MediaStreamTrack h(String str, MediaSource mediaSource) {
        return this.f.createVideoTrack(str, (VideoSource) mediaSource);
    }

    public final String toString() {
        return "OkSdkScreenShareRecord";
    }

    public final void u(int i, int i2, int i3) {
        int i4;
        c3h c3hVar;
        int iD;
        if (i <= 0 || i2 <= 0 || i < i2 || i3 <= 0) {
            i4 = i3;
            c3hVar = null;
        } else {
            int i5 = 320;
            if (i < 320) {
                iD = kti.d(320 * (i2 / i)) / 16;
            } else {
                i5 = (i / 16) * 16;
                iD = i2 / 16;
            }
            int i6 = iD * 16;
            int i7 = i5;
            i4 = i3;
            c3hVar = new c3h(i7, i6, i6, i7, i4);
        }
        if (c3hVar == null) {
            return;
        }
        VideoSource videoSource = (VideoSource) ((MediaSource) this.d);
        if (videoSource != null) {
            int i8 = i4;
            videoSource.adaptOutputFormat(c3hVar.a, c3hVar.b, c3hVar.c, c3hVar.d, i8);
            i4 = i8;
        }
        y6d y6dVar = (y6d) this.c;
        String strJ = j();
        StringBuilder sbK = wy1.k("Set screenshare dimensions to ", c3hVar.a, " x ", c3hVar.b, " by requested ");
        hf3.g(sbK, i, " x ", i2, " fps ");
        sbK.append(i4);
        y6dVar.log(strJ, sbK.toString());
    }
}
