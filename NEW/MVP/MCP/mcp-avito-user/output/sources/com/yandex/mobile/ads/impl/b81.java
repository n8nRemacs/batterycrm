package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.yandex.mobile.ads.impl.ac0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class b81 implements ac0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f383816a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private ByteBuffer[] f383817b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private ByteBuffer[] f383818c;

    public static class a implements ac0.b {
        public static MediaCodec b(ac0.a aVar) throws IOException {
            aVar.f383458a.getClass();
            String str = aVar.f383458a.f384886a;
            r91.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            r91.a();
            return mediaCodecCreateByCodecName;
        }

        @Override // com.yandex.mobile.ads.impl.ac0.b
        public final ac0 a(ac0.a aVar) {
            MediaCodec mediaCodecB = null;
            try {
                mediaCodecB = b(aVar);
                r91.a("configureCodec");
                mediaCodecB.configure(aVar.f383459b, aVar.f383461d, aVar.f383462e, 0);
                r91.a();
                r91.a("startCodec");
                mediaCodecB.start();
                r91.a();
                return new b81(mediaCodecB, 0);
            } catch (IOException | RuntimeException e12) {
                if (mediaCodecB != null) {
                    mediaCodecB.release();
                }
                throw e12;
            }
        }
    }

    public /* synthetic */ b81(MediaCodec mediaCodec, int i12) {
        this(mediaCodec);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final MediaFormat b() {
        return this.f383816a.getOutputFormat();
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final int c() {
        return this.f383816a.dequeueInputBuffer(0L);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void flush() {
        this.f383816a.flush();
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void release() {
        this.f383817b = null;
        this.f383818c = null;
        this.f383816a.release();
    }

    private b81(MediaCodec mediaCodec) {
        this.f383816a = mediaCodec;
        if (pc1.f388768a < 21) {
            this.f383817b = mediaCodec.getInputBuffers();
            this.f383818c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    @j.P
    public final ByteBuffer b(int i12) {
        return pc1.f388768a >= 21 ? this.f383816a.getInputBuffer(i12) : this.f383817b[i12];
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    @j.P
    public final ByteBuffer c(int i12) {
        return pc1.f388768a >= 21 ? this.f383816a.getOutputBuffer(i12) : this.f383818c[i12];
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f383816a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && pc1.f388768a < 21) {
                this.f383818c = this.f383816a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void a(int i12, int i13, long j12, int i14) throws MediaCodec.CryptoException {
        this.f383816a.queueInputBuffer(i12, 0, i13, j12, i14);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void a(int i12, um umVar, long j12) throws MediaCodec.CryptoException {
        this.f383816a.queueSecureInputBuffer(i12, 0, umVar.a(), j12, 0);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void a(boolean z12, int i12) {
        this.f383816a.releaseOutputBuffer(i12, z12);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    @j.X
    public final void a(int i12, long j12) {
        this.f383816a.releaseOutputBuffer(i12, j12);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    @j.X
    public final void a(ac0.c cVar, Handler handler) {
        this.f383816a.setOnFrameRenderedListener(new F(this, cVar, 1), handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ac0.c cVar, MediaCodec mediaCodec, long j12, long j13) {
        cVar.a(j12);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    @j.X
    public final void a(Surface surface) {
        this.f383816a.setOutputSurface(surface);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    @j.X
    public final void a(Bundle bundle) {
        this.f383816a.setParameters(bundle);
    }

    @Override // com.yandex.mobile.ads.impl.ac0
    public final void a(int i12) {
        this.f383816a.setVideoScalingMode(i12);
    }
}
