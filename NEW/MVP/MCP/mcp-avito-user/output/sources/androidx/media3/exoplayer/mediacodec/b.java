package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23118i;
import androidx.media3.common.util.H;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.mediacodec.e;
import androidx.media3.exoplayer.mediacodec.l;
import j.P;
import j.X;
import j.k0;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: AsynchronousMediaCodecAdapter.java */
@X
/* loaded from: classes.dex */
final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f49332a;

    /* renamed from: b, reason: collision with root package name */
    public final g f49333b;

    /* renamed from: c, reason: collision with root package name */
    public final e f49334c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f49335d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f49336e;

    /* renamed from: f, reason: collision with root package name */
    public int f49337f = 0;

    /* compiled from: AsynchronousMediaCodecAdapter.java */
    /* renamed from: androidx.media3.exoplayer.mediacodec.b$b, reason: collision with other inner class name */
    public static final class C1828b implements l.b {

        /* renamed from: a, reason: collision with root package name */
        public final c f49338a;

        /* renamed from: b, reason: collision with root package name */
        public final c f49339b;

        @k0
        public C1828b() {
            throw null;
        }

        public C1828b(int i12) {
            c cVar = new c(i12, 0);
            c cVar2 = new c(i12, 1);
            this.f49338a = cVar;
            this.f49339b = cVar2;
        }

        @Override // androidx.media3.exoplayer.mediacodec.l.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b a(l.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            b bVar;
            String str = aVar.f49381a.f49386a;
            b bVar2 = null;
            try {
                H.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    bVar = new b(mediaCodecCreateByCodecName, (HandlerThread) this.f49338a.get(), (HandlerThread) this.f49339b.get(), false, null);
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                e = e13;
                mediaCodecCreateByCodecName = null;
            }
            try {
                H.b();
                b.i(bVar, aVar.f49382b, aVar.f49384d, aVar.f49385e);
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
        this.f49332a = mediaCodec;
        this.f49333b = new g(handlerThread);
        this.f49334c = new e(mediaCodec, handlerThread2);
        this.f49335d = z12;
    }

    public static void i(b bVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        g gVar = bVar.f49333b;
        C23110a.g(gVar.f49359c == null);
        HandlerThread handlerThread = gVar.f49358b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = bVar.f49332a;
        mediaCodec.setCallback(gVar, handler);
        gVar.f49359c = handler;
        H.a("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        H.b();
        e eVar = bVar.f49334c;
        if (!eVar.f49350f) {
            HandlerThread handlerThread2 = eVar.f49346b;
            handlerThread2.start();
            eVar.f49347c = new d(eVar, handlerThread2.getLooper());
            eVar.f49350f = true;
        }
        H.a("startCodec");
        mediaCodec.start();
        H.b();
        bVar.f49337f = 1;
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

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void a(int i12) {
        k();
        this.f49332a.setVideoScalingMode(i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int iB2;
        RuntimeException andSet = this.f49334c.f49348d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
        g gVar = this.f49333b;
        synchronized (gVar.f49357a) {
            try {
                IllegalStateException illegalStateException = gVar.f49369m;
                if (illegalStateException != null) {
                    gVar.f49369m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = gVar.f49366j;
                if (codecException != null) {
                    gVar.f49366j = null;
                    throw codecException;
                }
                boolean z12 = true;
                iB2 = -1;
                if (!(gVar.f49367k > 0 || gVar.f49368l)) {
                    k kVar = gVar.f49361e;
                    if (kVar.f49378c != 0) {
                        z12 = false;
                    }
                    if (!z12) {
                        iB2 = kVar.b();
                        if (iB2 >= 0) {
                            C23110a.h(gVar.f49364h);
                            MediaCodec.BufferInfo bufferInfoRemove = gVar.f49362f.remove();
                            bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                        } else if (iB2 == -2) {
                            gVar.f49364h = gVar.f49363g.remove();
                        }
                    }
                }
            } finally {
            }
        }
        return iB2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void c(Surface surface) {
        k();
        this.f49332a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final int d() {
        int iB2;
        RuntimeException andSet = this.f49334c.f49348d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
        g gVar = this.f49333b;
        synchronized (gVar.f49357a) {
            try {
                IllegalStateException illegalStateException = gVar.f49369m;
                if (illegalStateException != null) {
                    gVar.f49369m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = gVar.f49366j;
                if (codecException != null) {
                    gVar.f49366j = null;
                    throw codecException;
                }
                boolean z12 = true;
                iB2 = -1;
                if (!(gVar.f49367k > 0 || gVar.f49368l)) {
                    k kVar = gVar.f49360d;
                    if (kVar.f49378c != 0) {
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

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void e(int i12, long j12) {
        this.f49332a.releaseOutputBuffer(i12, j12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void f(int i12, int i13, long j12, int i14) {
        e eVar = this.f49334c;
        RuntimeException andSet = eVar.f49348d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
        e.a aVarB = e.b();
        aVarB.f49351a = i12;
        aVarB.f49352b = i13;
        aVarB.f49354d = j12;
        aVarB.f49355e = i14;
        Handler handler = eVar.f49347c;
        int i15 = M.f47887a;
        handler.obtainMessage(0, aVarB).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void flush() {
        this.f49334c.a();
        this.f49332a.flush();
        final g gVar = this.f49333b;
        synchronized (gVar.f49357a) {
            gVar.f49367k++;
            Handler handler = gVar.f49359c;
            int i12 = M.f47887a;
            handler.post(new Runnable() { // from class: androidx.media3.exoplayer.mediacodec.f
                @Override // java.lang.Runnable
                public final void run() {
                    g gVar2 = gVar;
                    synchronized (gVar2.f49357a) {
                        try {
                            if (gVar2.f49368l) {
                                return;
                            }
                            long j12 = gVar2.f49367k - 1;
                            gVar2.f49367k = j12;
                            if (j12 > 0) {
                                return;
                            }
                            if (j12 >= 0) {
                                gVar2.a();
                                return;
                            }
                            IllegalStateException illegalStateException = new IllegalStateException();
                            synchronized (gVar2.f49357a) {
                                gVar2.f49369m = illegalStateException;
                            }
                        } finally {
                        }
                    }
                }
            });
        }
        this.f49332a.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void g(int i12, androidx.media3.decoder.d dVar, long j12) {
        e eVar = this.f49334c;
        RuntimeException andSet = eVar.f49348d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
        e.a aVarB = e.b();
        aVarB.f49351a = i12;
        aVarB.f49352b = 0;
        aVarB.f49354d = j12;
        aVarB.f49355e = 0;
        int i13 = dVar.f48334f;
        MediaCodec.CryptoInfo cryptoInfo = aVarB.f49353c;
        cryptoInfo.numSubSamples = i13;
        int[] iArr = dVar.f48332d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = dVar.f48333e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = dVar.f48330b;
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
        byte[] bArr2 = dVar.f48329a;
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
        cryptoInfo.mode = dVar.f48331c;
        if (M.f47887a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(dVar.f48335g, dVar.f48336h));
        }
        eVar.f49347c.obtainMessage(1, aVarB).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    @P
    public final ByteBuffer getInputBuffer(int i12) {
        return this.f49332a.getInputBuffer(i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    @P
    public final ByteBuffer getOutputBuffer(int i12) {
        return this.f49332a.getOutputBuffer(i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        g gVar = this.f49333b;
        synchronized (gVar.f49357a) {
            try {
                mediaFormat = gVar.f49364h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void h(l.c cVar, Handler handler) {
        k();
        this.f49332a.setOnFrameRenderedListener(new androidx.media3.exoplayer.mediacodec.a(this, cVar, 0), handler);
    }

    public final void k() {
        if (this.f49335d) {
            try {
                e eVar = this.f49334c;
                C23118i c23118i = eVar.f49349e;
                c23118i.c();
                Handler handler = eVar.f49347c;
                handler.getClass();
                handler.obtainMessage(2).sendToTarget();
                c23118i.a();
            } catch (InterruptedException e12) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e12);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void release() {
        try {
            if (this.f49337f == 1) {
                e eVar = this.f49334c;
                if (eVar.f49350f) {
                    eVar.a();
                    eVar.f49346b.quit();
                }
                eVar.f49350f = false;
                g gVar = this.f49333b;
                synchronized (gVar.f49357a) {
                    gVar.f49368l = true;
                    gVar.f49358b.quit();
                    gVar.a();
                }
            }
            this.f49337f = 2;
            if (this.f49336e) {
                return;
            }
            this.f49332a.release();
            this.f49336e = true;
        } catch (Throwable th2) {
            if (!this.f49336e) {
                this.f49332a.release();
                this.f49336e = true;
            }
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void releaseOutputBuffer(int i12, boolean z12) {
        this.f49332a.releaseOutputBuffer(i12, z12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.l
    public final void setParameters(Bundle bundle) {
        k();
        this.f49332a.setParameters(bundle);
    }
}
