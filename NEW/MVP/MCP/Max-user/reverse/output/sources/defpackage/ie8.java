package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import org.webrtc.YuvConverter;

/* loaded from: classes2.dex */
public final class ie8 {
    public final btd C;
    public final k5i D;
    public final awd E;
    public final EglBase.Context a;
    public final he8 b;
    public final Context d;
    public final f54 e;
    public final wd8 f;
    public final Executor g;
    public final MediaStream h;
    public final m50 i;
    public final m50 j;
    public final String k;
    public final String l;
    public final String m;
    public final y6d n;
    public final boolean o;
    public fch p;
    public volatile VideoSink q;
    public volatile d12 r;
    public volatile b32 s;
    public volatile i1e t;
    public volatile q2e u;
    public volatile wpb v;
    public final boolean w;
    public ge8 x;
    public final ubh y;
    public final g2e z;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public final DisplayMetrics A = new DisplayMetrics();
    public final Size B = new Size(0, 0);

    public ie8(fe8 fe8Var) {
        this.w = false;
        y6d y6dVar = fe8Var.h;
        this.n = y6dVar;
        this.d = fe8Var.d;
        PeerConnectionFactory peerConnectionFactory = fe8Var.a;
        this.e = fe8Var.b;
        this.f = fe8Var.q;
        this.g = fe8Var.c;
        String str = fe8Var.g;
        String str2 = fe8Var.f;
        this.m = fe8Var.e;
        this.o = fe8Var.p;
        this.a = fe8Var.i;
        boolean z = fe8Var.k;
        this.b = fe8Var.j;
        this.w = fe8Var.l;
        String strL = ho7.l(new StringBuilder(), fe8Var.e, "sc0");
        this.k = strL;
        String strL2 = ho7.l(new StringBuilder(), fe8Var.e, "as0");
        this.l = strL2;
        MediaStream mediaStreamCreateLocalMediaStream = peerConnectionFactory.createLocalMediaStream(fe8Var.e);
        this.h = mediaStreamCreateLocalMediaStream;
        MediaStream mediaStreamCreateLocalMediaStream2 = peerConnectionFactory.createLocalMediaStream(strL);
        this.D = fe8Var.o ? new k5i(this) : null;
        this.E = fe8Var.r;
        mediaStreamCreateLocalMediaStream = z ? mediaStreamCreateLocalMediaStream : null;
        m50 m50Var = new m50(peerConnectionFactory, str, mediaStreamCreateLocalMediaStream, y6dVar);
        this.i = m50Var;
        m50Var.l();
        m50Var.o(false);
        m50 m50Var2 = new m50(peerConnectionFactory, strL2, mediaStreamCreateLocalMediaStream, y6dVar);
        this.j = m50Var2;
        m50Var2.l();
        m50Var2.o(false);
        ubh ubhVar = new ubh(peerConnectionFactory, str2, mediaStreamCreateLocalMediaStream, fe8Var.s, fe8Var.t, new zkb(15, this), y6dVar);
        this.y = ubhVar;
        ubhVar.l();
        g2e g2eVar = new g2e(peerConnectionFactory, strL, mediaStreamCreateLocalMediaStream2, y6dVar, fe8Var.r, fe8Var.m);
        this.z = g2eVar;
        g2eVar.l();
        this.C = fe8Var.m;
    }

    public final void a() {
        fch fchVar = this.p;
        if (fchVar != null) {
            fchVar.a = null;
            this.n.log("OKRTCLmsAdapter", this + ": " + w0a.c(this.p) + " was cleared");
        }
    }

    public final void b(ke8 ke8Var) {
        k5i k5iVar = this.D;
        if (k5iVar != null) {
            thg thgVar = (thg) k5iVar.d;
            Handler handler = (Handler) k5iVar.c;
            if (ke8Var == null) {
                return;
            }
            k5iVar.b = ke8Var;
            handler.removeCallbacks(thgVar);
            ((ie8) k5iVar.o).n.log("OKRTCLmsAdapter", "Schedule check screen dimensions in 1500ms");
            handler.postDelayed(thgVar, 1500L);
        }
    }

    public final void c(kob kobVar) {
        this.n.log("OKRTCLmsAdapter", "createVideoTrackForCamera for " + w0a.c(kobVar));
        this.y.l();
        ubh ubhVar = this.y;
        Context context = this.d;
        EglBase.Context context2 = this.a;
        VideoSource videoSource = (VideoSource) ((MediaSource) ubhVar.d);
        CapturerObserver capturerObserver = videoSource != null ? videoSource.getCapturerObserver() : null;
        if (capturerObserver == null) {
            throw new IllegalStateException("Can't set capture in absence of video source");
        }
        if (ubhVar.h != null) {
            throw new IllegalStateException("An attempt to create surface texture screencast=false, while got one");
        }
        SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("VideoCapturerThread", context2, false, new YuvConverter(), null, ubhVar);
        ubhVar.h = surfaceTextureHelperCreate;
        ubhVar.i = new aqc(ubhVar, 13, capturerObserver);
        kobVar.initialize(surfaceTextureHelperCreate, context.getApplicationContext(), ubhVar.i);
        if (this.w) {
            kobVar.c = this.q;
            return;
        }
        VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) this.y.e);
        if (videoTrack != null) {
            if (this.p == null) {
                fch fchVar = new fch();
                this.p = fchVar;
                fchVar.a = this.q;
            }
            videoTrack.addSink(this.p);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.r8a r12) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie8.d(r8a):void");
    }

    public final void e() {
        Display[] displays = ((DisplayManager) this.d.getSystemService("display")).getDisplays();
        if (displays.length > 0) {
            displays[0].getRealMetrics(this.A);
        }
    }

    public final void f(VideoCapturer videoCapturer) {
        this.n.log("OKRTCLmsAdapter", "createVideoTrackForScreenCapture for " + w0a.c(videoCapturer));
        if (videoCapturer == null) {
            throw new IllegalArgumentException("videoCapturer must not be null");
        }
        g2e g2eVar = this.z;
        g2eVar.l();
        Context applicationContext = this.d.getApplicationContext();
        jkc jkcVar = g2eVar.h;
        VideoSource videoSource = (VideoSource) ((MediaSource) g2eVar.d);
        CapturerObserver capturerObserver = videoSource != null ? videoSource.getCapturerObserver() : null;
        if (capturerObserver == null) {
            throw new IllegalStateException("Can't set capture in absence of video source");
        }
        jkcVar.c = capturerObserver;
        SurfaceTextureHelper surfaceTextureHelper = g2eVar.g;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("ScreenCapturerThread", this.a);
        g2eVar.g = surfaceTextureHelperCreate;
        videoCapturer.initialize(surfaceTextureHelperCreate, applicationContext.getApplicationContext(), jkcVar);
    }

    public final void g() {
        fch fchVar;
        y6d y6dVar = this.n;
        y6dVar.log("OKRTCLmsAdapter", "releaseCameraVideoTrack");
        a();
        ubh ubhVar = this.y;
        VideoTrack videoTrack = (VideoTrack) ((MediaStreamTrack) ubhVar.e);
        if (videoTrack != null && (fchVar = this.p) != null) {
            try {
                videoTrack.removeSink(fchVar);
            } catch (Exception unused) {
            }
            y6dVar.log("OKRTCLmsAdapter", this + ": " + w0a.c(this.p) + " was removed from " + w0a.c(videoTrack));
        }
        this.p = null;
        ubhVar.m();
    }

    public final Size h() {
        d12 d12Var = this.r;
        if (d12Var == null) {
            return new Size(0, 0);
        }
        Size size = new Size(d12Var.n, d12Var.m);
        Size sizeB = this.y.j.b(size.width, size.height);
        return sizeB == null ? size : sizeB;
    }

    public final void i(d12 d12Var, boolean z) {
        this.n.log("OKRTCLmsAdapter", xc0.f("onCameraCapturerSwitchDone, switched ? ", z));
        if (z) {
            ge8 ge8Var = this.x;
            if (ge8Var != null) {
                ge8Var.a(true);
            }
            if (d12Var != this.r) {
                IllegalStateException illegalStateException = new IllegalStateException("Wrong camera capturer on camera switch done");
                if (this.r == null) {
                    this.n.logException("OKRTCLmsAdapter", "No camera capturer when switch done", illegalStateException);
                } else {
                    this.n.reportException("OKRTCLmsAdapter", "camera.switch.check", illegalStateException);
                }
            }
        }
    }

    public final void j(VideoSink videoSink) {
        this.n.log("OKRTCLmsAdapter", "setVideoRenderer, " + w0a.c(videoSink));
        this.q = videoSink;
        if (this.w) {
            d12 d12Var = this.r;
            kob kobVar = d12Var != null ? (kob) d12Var.c.b : null;
            if (kobVar != null) {
                kobVar.c = videoSink;
            } else if (kobVar != null) {
                throw new IllegalArgumentException("Video capturer is expected to be an implementation of ".concat(kob.class.getName()));
            }
        }
        fch fchVar = this.p;
        if (fchVar != null) {
            fchVar.a = videoSink;
        }
    }

    public final void k(b32 b32Var) {
        j22 j22VarK;
        this.n.log("OKRTCLmsAdapter", "switchCamera, " + this);
        if (this.r == null) {
            if (b32Var != null) {
                this.n.log("OKRTCLmsAdapter", "Got cameraParams while no capturer created yet. Remember for future use");
                this.s = b32Var;
                return;
            } else {
                this.n.log("OKRTCLmsAdapter", this + ": has no camera capturer");
                return;
            }
        }
        d12 d12Var = this.r;
        d12Var.e.log("CameraCapturerAdapter", "switchCamera");
        if (!d12Var.k) {
            d12Var.e.log("CameraCapturerAdapter", "Camera is not started");
            return;
        }
        if (d12Var.j) {
            synchronized (d12Var.g) {
                try {
                    if (d12Var.j) {
                        d12Var.e.log("CameraCapturerAdapter", "Camera switch is pending");
                        return;
                    }
                    d12Var.j = true;
                } finally {
                }
            }
        }
        if (b32Var == null) {
            j22VarK = d12Var.d.K(d12Var.i ? 2 : 1);
        } else {
            j22VarK = d12Var.d.K(b32Var.a);
        }
        if (j22VarK == null || Objects.equals(d12Var.h, j22VarK.a())) {
            return;
        }
        String strA = j22VarK.a();
        ((kob) d12Var.c.b).switchCamera(new xt4(d12Var, strA, false, 10), strA);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(java.lang.Float r6, java.lang.Float r7) {
        /*
            r5 = this;
            ubh r0 = r5.y
            q4h r1 = r0.j
            if (r6 == 0) goto L25
            r1.getClass()
            float r2 = r6.floatValue()
            int r3 = r1.c
            float r3 = (float) r3
            float r3 = r3 * r2
            int r2 = defpackage.kti.d(r3)
            int r3 = r2 % 16
            int r2 = r2 - r3
            r3 = 320(0x140, float:4.48E-43)
            r4 = 4096(0x1000, float:5.74E-42)
            int r2 = defpackage.n7j.c(r2, r3, r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L26
        L25:
            r2 = 0
        L26:
            r1.e = r2
            ts9 r1 = r1.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Set scale restriction: "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r6 = " "
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.invoke(r6)
            r0.u()
            ubh r6 = r5.y
            if (r7 == 0) goto L64
            r6.getClass()
            float r0 = r7.floatValue()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L64
            float r0 = r7.floatValue()
            double r0 = (double) r0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L5f
            goto L64
        L5f:
            float r7 = r7.floatValue()
            goto L66
        L64:
            r7 = 1065353216(0x3f800000, float:1.0)
        L66:
            r6.l = r7
            r6.u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ie8.l(java.lang.Float, java.lang.Float):void");
    }

    public final String toString() {
        return w0a.c(this);
    }
}
