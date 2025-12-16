package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.l;
import com.google.android.exoplayer2.util.U;
import j.P;
import j.X;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: SynchronousMediaCodecAdapter.java */
/* loaded from: classes6.dex */
public final class r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f345620a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public ByteBuffer[] f345621b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public ByteBuffer[] f345622c;

    /* compiled from: SynchronousMediaCodecAdapter.java */
    public static class b implements l.b {
        public static MediaCodec b(l.a aVar) throws IOException {
            aVar.f345603a.getClass();
            String str = aVar.f345603a.f345608a;
            com.google.android.exoplayer2.util.P.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            com.google.android.exoplayer2.util.P.b();
            return mediaCodecCreateByCodecName;
        }

        @Override // com.google.android.exoplayer2.mediacodec.l.b
        public final l a(l.a aVar) throws Throwable {
            MediaCodec mediaCodec = null;
            try {
                MediaCodec mediaCodecB = b(aVar);
                try {
                    com.google.android.exoplayer2.util.P.a("configureCodec");
                    mediaCodecB.configure(aVar.f345604b, aVar.f345606d, aVar.f345607e, 0);
                    com.google.android.exoplayer2.util.P.b();
                    com.google.android.exoplayer2.util.P.a("startCodec");
                    mediaCodecB.start();
                    com.google.android.exoplayer2.util.P.b();
                    return new r(mediaCodecB, null);
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

    public r(MediaCodec mediaCodec, a aVar) {
        this.f345620a = mediaCodec;
        if (U.f348106a < 21) {
            this.f345621b = mediaCodec.getInputBuffers();
            this.f345622c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void a(int i12) {
        this.f345620a.setVideoScalingMode(i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f345620a;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && U.f348106a < 21) {
                this.f345622c = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    @X
    public final void c(Surface surface) {
        this.f345620a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final int d() {
        return this.f345620a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    @X
    public final void e(int i12, long j12) {
        this.f345620a.releaseOutputBuffer(i12, j12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void f(int i12, int i13, long j12, int i14) throws MediaCodec.CryptoException {
        this.f345620a.queueInputBuffer(i12, 0, i13, j12, i14);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void flush() {
        this.f345620a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    @X
    public final void g(l.c cVar, Handler handler) {
        this.f345620a.setOnFrameRenderedListener(new com.google.android.exoplayer2.mediacodec.a(this, cVar, 1), handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    @P
    public final ByteBuffer getInputBuffer(int i12) {
        return U.f348106a >= 21 ? this.f345620a.getInputBuffer(i12) : this.f345621b[i12];
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    @P
    public final ByteBuffer getOutputBuffer(int i12) {
        return U.f348106a >= 21 ? this.f345620a.getOutputBuffer(i12) : this.f345622c[i12];
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final MediaFormat getOutputFormat() {
        return this.f345620a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void h(int i12, com.google.android.exoplayer2.decoder.d dVar, long j12) throws MediaCodec.CryptoException {
        this.f345620a.queueSecureInputBuffer(i12, 0, dVar.f344219i, j12, 0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void release() {
        this.f345621b = null;
        this.f345622c = null;
        this.f345620a.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void releaseOutputBuffer(int i12, boolean z12) {
        this.f345620a.releaseOutputBuffer(i12, z12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    @X
    public final void setParameters(Bundle bundle) {
        this.f345620a.setParameters(bundle);
    }
}
