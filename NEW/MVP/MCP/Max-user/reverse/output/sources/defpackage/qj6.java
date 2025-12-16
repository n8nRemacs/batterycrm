package defpackage;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.EncodedImage;
import org.webrtc.EncoderCallback;
import org.webrtc.GlUtil;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VpxEncoderWrapper;

/* loaded from: classes2.dex */
public final class qj6 implements EncoderCallback, VideoSink {
    public volatile VpxEncoderWrapper X;
    public volatile ek6 Y;
    public volatile ek6 Z;
    public final long a;
    public final long b;
    public final u44 c;
    public final y6d d;
    public final btd o;
    public volatile long s0;
    public final g9g t0;
    public final g9g u0;
    public final AtomicInteger v0;
    public volatile boolean w0;
    public volatile long x0;

    public qj6(y6d y6dVar, btd btdVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.a = timeUnit.toMillis(5L);
        this.b = timeUnit.toNanos(1L) / 10;
        this.v0 = new AtomicInteger(0);
        this.d = y6dVar;
        this.o = btdVar;
        this.c = new u44("SSFrameEncoder");
        this.t0 = new g9g();
        this.u0 = new g9g();
    }

    public final void a() {
        this.w0 = false;
        VpxEncoderWrapper vpxEncoderWrapper = this.X;
        if (vpxEncoderWrapper != null) {
            vpxEncoderWrapper.release();
        }
        this.X = null;
    }

    @Override // org.webrtc.EncoderCallback
    public final void onEncodedImage(EncodedImage encodedImage) {
        this.t0.a();
        EncodedImage.FrameType frameType = encodedImage.frameType;
        EncodedImage.FrameType frameType2 = EncodedImage.FrameType.VideoFrameKey;
        if (frameType == frameType2) {
            this.s0 = SystemClock.elapsedRealtime();
        }
        if (this.Y != null) {
            ek6 ek6Var = this.Y;
            if (!ek6Var.a) {
                encodedImage.release();
                return;
            }
            if (encodedImage.frameType == frameType2) {
                ek6Var.h = false;
            }
            ek6Var.c.add(encodedImage);
            ek6Var.d.addAndGet(encodedImage.buffer.remaining());
            ek6.b(ek6Var.g);
        }
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        ek6 ek6Var = this.Z;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (jElapsedRealtimeNanos < this.x0 + this.b) {
            return;
        }
        if ((ek6Var == null || (ek6Var.c.size() <= 15 && ek6Var.d.get() <= 4000000)) && this.v0.get() < 5) {
            try {
                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                if (i420 == null) {
                    this.d.log("SSFrameEncoder", "toI420 didn't result in valid buffer, skipping");
                    return;
                }
                float rotation = videoFrame.getRotation() + 360;
                this.o.getClass();
                float f = (rotation + 0.0f) % 360.0f;
                this.d.log("SSFrameEncoder", "rotation angle = " + f);
                VideoFrame videoFrame2 = new VideoFrame(i420, (int) f, videoFrame.getTimestampNs());
                this.x0 = jElapsedRealtimeNanos;
                this.v0.incrementAndGet();
                this.c.c(new se5(this, ek6Var, videoFrame2, 11));
            } catch (GlUtil.GlOutOfMemoryException unused) {
                this.d.log("SSFrameEncoder", "gl oom @ toI420, skipping");
            }
        }
    }

    @Override // org.webrtc.EncoderCallback
    public final void onFrameDropped(int i) {
        this.u0.a();
    }
}
