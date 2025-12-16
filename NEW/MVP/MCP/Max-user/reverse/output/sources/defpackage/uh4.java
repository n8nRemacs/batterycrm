package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VpxDecoderWrapper;

/* loaded from: classes2.dex */
public final class uh4 implements VideoSink, VpxDecoderWrapper.ErrorCallback {
    public final int X;
    public final z9a b;
    public final y6d c;
    public final HandlerThread d;
    public final Handler o;
    public final /* synthetic */ b9i y0;
    public volatile boolean Y = false;
    public volatile boolean Z = false;
    public volatile boolean s0 = true;
    public final AtomicInteger t0 = new AtomicInteger(0);
    public final AtomicInteger u0 = new AtomicInteger(0);
    public final AtomicInteger v0 = new AtomicInteger(-1);
    public final AtomicInteger w0 = new AtomicInteger(-1);
    public final AtomicInteger x0 = new AtomicInteger(-1);
    public final VpxDecoderWrapper a = new VpxDecoderWrapper();

    public uh4(b9i b9iVar, int i, z9a z9aVar, y6d y6dVar) {
        this.y0 = b9iVar;
        this.b = z9aVar;
        this.c = y6dVar;
        HandlerThread handlerThread = new HandlerThread("DecoderWrapperVpxQueue");
        this.d = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.o = handler;
        this.X = i;
        handler.post(new l30(this, i, 7));
    }

    public final void a() {
        if (this.Y) {
            return;
        }
        this.Y = true;
        this.c.log("DecoderWrapper", "releasing decoder " + System.identityHashCode(this));
        HandlerThread handlerThread = this.d;
        Handler handler = this.y0.e;
        VpxDecoderWrapper vpxDecoderWrapper = this.a;
        Objects.requireNonNull(vpxDecoderWrapper);
        vy1 vy1Var = new vy1(28, vpxDecoderWrapper);
        handler.removeCallbacksAndMessages(null);
        handler.post(vy1Var);
        handlerThread.quitSafely();
        this.Z = true;
    }

    @Override // org.webrtc.VpxDecoderWrapper.ErrorCallback
    public final void onDecodeError(int i) {
        y6d y6dVar = this.c;
        StringBuilder sbM = ho7.m(i, "onDecodeError vpx_error_code:", " System.identityHashCode: ");
        sbM.append(System.identityHashCode(this));
        y6dVar.log("DecoderWrapper", sbM.toString());
        b9i b9iVar = this.y0;
        b9iVar.x.a();
        b9iVar.t.incrementAndGet();
        this.s0 = true;
        this.v0.set(this.u0.get());
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        if (this.Y) {
            return;
        }
        this.y0.s.incrementAndGet();
        this.y0.w.a();
        if (SystemClock.elapsedRealtimeNanos() > b9i.E) {
            z9a z9aVar = this.b;
            n2e n2eVar = (n2e) z9aVar.b;
            ti1 ti1Var = (ti1) z9aVar.c;
            if (!n2eVar.f) {
                n2eVar.e.a(ti1Var, videoFrame);
            }
        }
        this.w0.set(videoFrame.getRotatedWidth());
        this.x0.set(videoFrame.getRotatedHeight());
    }
}
