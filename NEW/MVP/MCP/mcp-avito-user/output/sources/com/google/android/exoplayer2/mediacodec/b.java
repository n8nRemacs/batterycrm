package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.e;
import com.google.android.exoplayer2.mediacodec.l;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36592h;
import com.google.android.exoplayer2.util.P;
import com.google.android.exoplayer2.util.U;
import j.X;
import j.k0;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: AsynchronousMediaCodecAdapter.java */
@X
/* loaded from: classes6.dex */
final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f345554a;

    /* renamed from: b, reason: collision with root package name */
    public final g f345555b;

    /* renamed from: c, reason: collision with root package name */
    public final e f345556c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f345557d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f345558e;

    /* renamed from: f, reason: collision with root package name */
    public int f345559f = 0;

    /* compiled from: AsynchronousMediaCodecAdapter.java */
    /* renamed from: com.google.android.exoplayer2.mediacodec.b$b, reason: collision with other inner class name */
    public static final class C10586b implements l.b {

        /* renamed from: a, reason: collision with root package name */
        public final c f345560a;

        /* renamed from: b, reason: collision with root package name */
        public final c f345561b;

        @k0
        public C10586b() {
            throw null;
        }

        public C10586b(int i12) {
            c cVar = new c(i12, 0);
            c cVar2 = new c(i12, 1);
            this.f345560a = cVar;
            this.f345561b = cVar2;
        }

        @Override // com.google.android.exoplayer2.mediacodec.l.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b a(l.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            b bVar;
            String str = aVar.f345603a.f345608a;
            b bVar2 = null;
            try {
                P.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    bVar = new b(mediaCodecCreateByCodecName, (HandlerThread) this.f345560a.get(), (HandlerThread) this.f345561b.get(), false, null);
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                e = e13;
                mediaCodecCreateByCodecName = null;
            }
            try {
                P.b();
                b.i(bVar, aVar.f345604b, aVar.f345606d, aVar.f345607e);
                return bVar;
            } catch (Exception e14) {
                e = e14;
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.release();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        }
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z12, a aVar) {
        this.f345554a = mediaCodec;
        this.f345555b = new g(handlerThread);
        this.f345556c = new e(mediaCodec, handlerThread2);
        this.f345557d = z12;
    }

    public static void i(b bVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        g gVar = bVar.f345555b;
        C36585a.d(gVar.f345581c == null);
        HandlerThread handlerThread = gVar.f345580b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = bVar.f345554a;
        mediaCodec.setCallback(gVar, handler);
        gVar.f345581c = handler;
        P.a("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        P.b();
        e eVar = bVar.f345556c;
        if (!eVar.f345572f) {
            HandlerThread handlerThread2 = eVar.f345568b;
            handlerThread2.start();
            eVar.f345569c = new d(eVar, handlerThread2.getLooper());
            eVar.f345572f = true;
        }
        P.a("startCodec");
        mediaCodec.start();
        P.b();
        bVar.f345559f = 1;
    }

    public static String j(int i12, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i12 == 1) {
            sb2.append("Audio");
        } else if (i12 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i12);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void a(int i12) {
        k();
        this.f345554a.setVideoScalingMode(i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int iB2;
        g gVar = this.f345555b;
        synchronized (gVar.f345579a) {
            try {
                boolean z12 = true;
                iB2 = -1;
                if (!(gVar.f345589k > 0 || gVar.f345590l)) {
                    IllegalStateException illegalStateException = gVar.f345591m;
                    if (illegalStateException != null) {
                        gVar.f345591m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = gVar.f345588j;
                    if (codecException != null) {
                        gVar.f345588j = null;
                        throw codecException;
                    }
                    k kVar = gVar.f345583e;
                    if (kVar.f345600c != 0) {
                        z12 = false;
                    }
                    if (!z12) {
                        iB2 = kVar.b();
                        if (iB2 >= 0) {
                            C36585a.e(gVar.f345586h);
                            MediaCodec.BufferInfo bufferInfoRemove = gVar.f345584f.remove();
                            bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                        } else if (iB2 == -2) {
                            gVar.f345586h = gVar.f345585g.remove();
                        }
                    }
                }
            } finally {
            }
        }
        return iB2;
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void c(Surface surface) {
        k();
        this.f345554a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final int d() {
        int iB2;
        g gVar = this.f345555b;
        synchronized (gVar.f345579a) {
            try {
                boolean z12 = true;
                iB2 = -1;
                if (!(gVar.f345589k > 0 || gVar.f345590l)) {
                    IllegalStateException illegalStateException = gVar.f345591m;
                    if (illegalStateException != null) {
                        gVar.f345591m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = gVar.f345588j;
                    if (codecException != null) {
                        gVar.f345588j = null;
                        throw codecException;
                    }
                    k kVar = gVar.f345582d;
                    if (kVar.f345600c != 0) {
                        z12 = false;
                    }
                    if (!z12) {
                        iB2 = kVar.b();
                    }
                }
            } finally {
            }
        }
        return iB2;
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void e(int i12, long j12) {
        this.f345554a.releaseOutputBuffer(i12, j12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void f(int i12, int i13, long j12, int i14) {
        e eVar = this.f345556c;
        RuntimeException andSet = eVar.f345570d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
        e.a aVarB = e.b();
        aVarB.f345573a = i12;
        aVarB.f345574b = i13;
        aVarB.f345576d = j12;
        aVarB.f345577e = i14;
        Handler handler = eVar.f345569c;
        int i15 = U.f348106a;
        handler.obtainMessage(0, aVarB).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void flush() {
        this.f345556c.a();
        this.f345554a.flush();
        final g gVar = this.f345555b;
        synchronized (gVar.f345579a) {
            gVar.f345589k++;
            Handler handler = gVar.f345581c;
            int i12 = U.f348106a;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.f
                @Override // java.lang.Runnable
                public final void run() {
                    g gVar2 = gVar;
                    synchronized (gVar2.f345579a) {
                        try {
                            if (gVar2.f345590l) {
                                return;
                            }
                            long j12 = gVar2.f345589k - 1;
                            gVar2.f345589k = j12;
                            if (j12 > 0) {
                                return;
                            }
                            if (j12 >= 0) {
                                gVar2.a();
                                return;
                            }
                            IllegalStateException illegalStateException = new IllegalStateException();
                            synchronized (gVar2.f345579a) {
                                gVar2.f345591m = illegalStateException;
                            }
                        } finally {
                        }
                    }
                }
            });
        }
        this.f345554a.start();
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void g(l.c cVar, Handler handler) {
        k();
        this.f345554a.setOnFrameRenderedListener(new com.google.android.exoplayer2.mediacodec.a(this, cVar, 0), handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    @j.P
    public final ByteBuffer getInputBuffer(int i12) {
        return this.f345554a.getInputBuffer(i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    @j.P
    public final ByteBuffer getOutputBuffer(int i12) {
        return this.f345554a.getOutputBuffer(i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        g gVar = this.f345555b;
        synchronized (gVar.f345579a) {
            try {
                mediaFormat = gVar.f345586h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void h(int i12, com.google.android.exoplayer2.decoder.d dVar, long j12) {
        e eVar = this.f345556c;
        RuntimeException andSet = eVar.f345570d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
        e.a aVarB = e.b();
        aVarB.f345573a = i12;
        aVarB.f345574b = 0;
        aVarB.f345576d = j12;
        aVarB.f345577e = 0;
        int i13 = dVar.f344216f;
        MediaCodec.CryptoInfo cryptoInfo = aVarB.f345575c;
        cryptoInfo.numSubSamples = i13;
        int[] iArr = dVar.f344214d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = dVar.f344215e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = dVar.f344212b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = dVar.f344211a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = dVar.f344213c;
        if (U.f348106a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f344217g, dVar.f344218h));
        }
        eVar.f345569c.obtainMessage(1, aVarB).sendToTarget();
    }

    public final void k() {
        if (this.f345557d) {
            try {
                e eVar = this.f345556c;
                C36592h c36592h = eVar.f345571e;
                synchronized (c36592h) {
                    c36592h.f348131b = false;
                }
                Handler handler = eVar.f345569c;
                handler.getClass();
                handler.obtainMessage(2).sendToTarget();
                c36592h.a();
            } catch (InterruptedException e12) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e12);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void release() {
        try {
            if (this.f345559f == 1) {
                e eVar = this.f345556c;
                if (eVar.f345572f) {
                    eVar.a();
                    eVar.f345568b.quit();
                }
                eVar.f345572f = false;
                g gVar = this.f345555b;
                synchronized (gVar.f345579a) {
                    gVar.f345590l = true;
                    gVar.f345580b.quit();
                    gVar.a();
                }
            }
            this.f345559f = 2;
            if (this.f345558e) {
                return;
            }
            this.f345554a.release();
            this.f345558e = true;
        } catch (Throwable th2) {
            if (!this.f345558e) {
                this.f345554a.release();
                this.f345558e = true;
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void releaseOutputBuffer(int i12, boolean z12) {
        this.f345554a.releaseOutputBuffer(i12, z12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.l
    public final void setParameters(Bundle bundle) {
        k();
        this.f345554a.setParameters(bundle);
    }
}
