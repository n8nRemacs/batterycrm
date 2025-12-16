package defpackage;

import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;

/* loaded from: classes2.dex */
public final class ubh extends vt3 implements SurfaceTextureHelper.FrameGeometryAdjuster {
    public final PeerConnectionFactory f;
    public final zkb g;
    public SurfaceTextureHelper h;
    public aqc i;
    public final q4h j;
    public volatile Size k;
    public volatile float l;

    public ubh(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, Integer num, boolean z, zkb zkbVar, y6d y6dVar) {
        super(str, mediaStream, y6dVar);
        this.f = peerConnectionFactory;
        this.g = zkbVar;
        this.j = new q4h(z, num != null ? num.intValue() : 960, new ts9(1, this, ubh.class, "logBufferTransform", "logBufferTransform(Ljava/lang/String;)V", 0, 24));
        this.k = new Size(960, 540);
        this.l = 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    @Override // org.webrtc.SurfaceTextureHelper.FrameGeometryAdjuster
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.webrtc.SurfaceTextureHelper.FrameGeometry adjustFrameGeometry(android.graphics.Matrix r8, int r9, int r10) {
        /*
            r7 = this;
            q4h r0 = r7.j
            r0.getClass()
            java.lang.String r1 = "x"
            if (r9 == 0) goto L8e
            if (r10 != 0) goto Ld
            goto L8e
        Ld:
            otb r2 = r0.f
            java.lang.Integer r3 = r0.d
            java.lang.Integer r4 = r0.e
            int r5 = r0.c
            if (r3 == 0) goto L26
            if (r4 == 0) goto L26
            int r3 = r3.intValue()
            int r4 = r4.intValue()
            int r5 = java.lang.Math.min(r3, r4)
            goto L33
        L26:
            if (r3 == 0) goto L2d
            int r5 = r3.intValue()
            goto L33
        L2d:
            if (r4 == 0) goto L33
            int r5 = r4.intValue()
        L33:
            if (r2 == 0) goto L57
            java.lang.Integer r3 = r0.g
            if (r3 != 0) goto L3a
            goto L57
        L3a:
            int r3 = r3.intValue()
            if (r3 != r9) goto L57
            java.lang.Integer r3 = r0.h
            if (r3 != 0) goto L45
            goto L57
        L45:
            int r3 = r3.intValue()
            if (r3 != r10) goto L57
            java.lang.Integer r3 = r0.i
            if (r3 != 0) goto L50
            goto L57
        L50:
            int r3 = r3.intValue()
            if (r3 != r5) goto L57
            goto La9
        L57:
            otb r2 = r0.a(r9, r10)
            r0.f = r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r0.g = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r0.h = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r0.i = r3
            ts9 r0 = r0.b
            int r3 = r2.g
            int r4 = r2.h
            java.lang.String r5 = "get new transform "
            java.lang.String r6 = " -> "
            java.lang.StringBuilder r5 = defpackage.wy1.k(r5, r9, r1, r10, r6)
            r5.append(r3)
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            r0.invoke(r1)
            goto La9
        L8e:
            ts9 r0 = r0.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Wrong frame size: "
            r2.<init>(r3)
            r2.append(r9)
            r2.append(r1)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
            r0.invoke(r1)
            o4h r2 = defpackage.o4h.a
        La9:
            org.webrtc.SurfaceTextureHelper$FrameGeometry r8 = r2.a(r8, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ubh.adjustFrameGeometry(android.graphics.Matrix, int, int):org.webrtc.SurfaceTextureHelper$FrameGeometry");
    }

    @Override // defpackage.vt3
    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        VideoTrack videoTrack = (VideoTrack) mediaStreamTrack;
        videoTrack.setContentHint(VideoTrack.ContentHint.NONE);
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
        SurfaceTextureHelper surfaceTextureHelper = this.h;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        this.h = null;
    }

    @Override // defpackage.vt3
    public final MediaSource g() {
        return this.f.createVideoSource(false);
    }

    @Override // defpackage.vt3
    public final MediaStreamTrack h(String str, MediaSource mediaSource) {
        return this.f.createVideoTrack(str, (VideoSource) mediaSource);
    }

    @Override // defpackage.vt3
    public final String j() {
        return "VideoRecord";
    }

    @Override // defpackage.vt3
    public final void m() {
        super.m();
        this.i = null;
    }

    public final String toString() {
        return "OkSdkVideoRecord(isScreenCast=false)";
    }

    public final void u() {
        VideoSource videoSource = (VideoSource) ((MediaSource) this.d);
        if (videoSource == null) {
            ((y6d) this.c).log("VideoRecord", "No source while trying to update video format");
            return;
        }
        Size sizeB = this.j.b(this.k.width, this.k.height);
        if (sizeB == null) {
            sizeB = new Size(960, 540);
        }
        ((y6d) this.c).log("VideoRecord", ho7.g("Apply output format adaptation: size= ", sizeB.width, sizeB.height, "x"));
        videoSource.adaptOutputFormat(sizeB.width, sizeB.height, kti.d(this.l * 24.0f));
    }
}
