package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.util.H;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.mediacodec.l;
import j.P;
import j.X;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: SynchronousMediaCodecAdapter.java */
@J
/* loaded from: classes.dex */
public final class t implements l {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f49398a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public ByteBuffer[] f49399b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public ByteBuffer[] f49400c;

    /* compiled from: SynchronousMediaCodecAdapter.java */
    public static class b implements l.b {
        public static MediaCodec b(l.a aVar) throws IOException {
            aVar.f49381a.getClass();
            String str = aVar.f49381a.f49386a;
            H.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            H.b();
            return mediaCodecCreateByCodecName;
        }

        @Override // androidx.media3.exoplayer.mediacodec.l.b
        public final l a(l.a aVar) throws Throwable {
            MediaCodec mediaCodec = null;
            try {
                MediaCodec mediaCodecB = b(aVar);
                try {
                    H.a("configureCodec");
                    mediaCodecB.configure(aVar.f49382b, aVar.f49384d, aVar.f49385e, 0);
                    H.b();
                    H.a("startCodec");
                    mediaCodecB.start();
                    H.b();
                    return new t(mediaCodecB, null);
                } catch (IOException | RuntimeException e12) {
                    e = e12;
                    mediaCodec = mediaCodecB;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (IOException e13) {
                e = e13;
            } catch (RuntimeException e14) {
                e = e14;
            }
        }
    }

    public t(MediaCodec mediaCodec, a aVar) {
        this.f49398a = mediaCodec;
        if (M.f47887a < 21) {
            this.f49399b = mediaCodec.getInputBuffers();
            this.f49400c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void a(int i12) {
        this.f49398a.setVideoScalingMode(i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f49398a;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && M.f47887a < 21) {
                this.f49400c = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    @X
    public final void c(Surface surface) {
        this.f49398a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final int d() {
        return this.f49398a.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    @X
    public final void e(int i12, long j12) {
        this.f49398a.releaseOutputBuffer(i12, j12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void f(int i12, int i13, long j12, int i14) throws MediaCodec.CryptoException {
        this.f49398a.queueInputBuffer(i12, 0, i13, j12, i14);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void flush() {
        this.f49398a.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void g(int i12, androidx.media3.decoder.d dVar, long j12) throws MediaCodec.CryptoException {
        this.f49398a.queueSecureInputBuffer(i12, 0, dVar.f48337i, j12, 0);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    @P
    public final ByteBuffer getInputBuffer(int i12) {
        return M.f47887a >= 21 ? this.f49398a.getInputBuffer(i12) : this.f49399b[i12];
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    @P
    public final ByteBuffer getOutputBuffer(int i12) {
        return M.f47887a >= 21 ? this.f49398a.getOutputBuffer(i12) : this.f49400c[i12];
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final MediaFormat getOutputFormat() {
        return this.f49398a.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    @X
    public final void h(l.c cVar, Handler handler) {
        this.f49398a.setOnFrameRenderedListener(new androidx.media3.exoplayer.mediacodec.a(this, cVar, 1), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void release() {
        this.f49399b = null;
        this.f49400c = null;
        this.f49398a.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void releaseOutputBuffer(int i12, boolean z12) {
        this.f49398a.releaseOutputBuffer(i12, z12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    @X
    public final void setParameters(Bundle bundle) {
        this.f49398a.setParameters(bundle);
    }
}
