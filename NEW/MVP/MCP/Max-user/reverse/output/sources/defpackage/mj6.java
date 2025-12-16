package defpackage;

import android.content.Context;
import android.media.projection.MediaProjection;
import android.os.Handler;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* loaded from: classes2.dex */
public final class mj6 extends MediaProjection.Callback implements CapturerObserver, ke8 {
    public volatile ScreenCapturerAndroid X;
    public VideoSink Y;
    public final EglBase.Context a;
    public final Context b;
    public final y6d c;
    public volatile SurfaceTextureHelper o;
    public boolean s0;
    public boolean t0;
    public final awd u0;
    public final u44 d = new u44("SSFrameCapturer");
    public final g9g Z = new g9g();

    public mj6(EglBase.Context context, Context context2, awd awdVar, y6d y6dVar) {
        this.a = context;
        this.b = context2;
        this.c = y6dVar;
        this.u0 = awdVar;
    }

    @Override // defpackage.ke8
    public final void a(int i, int i2) {
        this.d.c(new vu0(this, i, i2, 1));
    }

    public final void b(Size size, int i) {
        if (!this.s0 || this.t0) {
            return;
        }
        try {
            this.X.startCapture(size.width, size.height, 0);
            this.t0 = true;
        } catch (SecurityException e) {
            this.c.logException("FrameCapturerImpl", "Error starting screen capture", e);
            if (i > 10) {
                this.c.reportException("FrameCapturerImpl", wy1.e(i, "Error: ", "times of restart screen capture did fail"), e);
                this.d.c(new lj6(this, 0));
            } else {
                u44 u44Var = this.d;
                ((Handler) u44Var.b).postDelayed(new mn1(this, size, i, 11), 400L);
            }
        } catch (RuntimeException e2) {
            this.c.reportException("FrameCapturerImpl", "Error starting screen capture", e2);
            this.d.c(new lj6(this, 0));
        }
    }

    @Override // org.webrtc.CapturerObserver
    public final void onCapturerStarted(boolean z) {
        awd awdVar;
        this.c.log("FrameCapturerImpl", "Screen capture did start success=" + z);
        if (!z || (awdVar = this.u0) == null) {
            return;
        }
        ((k01) awdVar.b).P.log("OKRTCCall", "Screen capture has started, fast=false");
    }

    @Override // org.webrtc.CapturerObserver
    public final void onCapturerStopped() {
        this.c.log("FrameCapturerImpl", "Screen capture did stop");
        awd awdVar = this.u0;
        if (awdVar != null) {
            awdVar.a(false);
        }
    }

    @Override // org.webrtc.CapturerObserver
    public final void onFrameCaptured(VideoFrame videoFrame) {
        this.Z.a();
        VideoSink videoSink = this.Y;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        this.d.c(new lj6(this, 0));
    }
}
