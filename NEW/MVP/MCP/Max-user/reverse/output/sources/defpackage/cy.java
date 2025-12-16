package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class cy implements jw8 {
    public final MediaCodec a;
    public final jy b;
    public final hy c;
    public boolean o;
    public final boolean d = true;
    public int X = 0;

    public cy(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.a = mediaCodec;
        this.b = new jy(handlerThread);
        this.c = new hy(mediaCodec, handlerThread2);
    }

    public static void a(cy cyVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        jy jyVar = cyVar.b;
        MediaCodec mediaCodec = cyVar.a;
        HandlerThread handlerThread = jyVar.b;
        fsi.d(jyVar.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(jyVar, handler);
        jyVar.c = handler;
        lfi.a("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        lfi.c();
        hy hyVar = cyVar.c;
        HandlerThread handlerThread2 = hyVar.b;
        if (!hyVar.f) {
            handlerThread2.start();
            hyVar.c = new ey(hyVar, handlerThread2.getLooper(), 0);
            hyVar.f = true;
        }
        lfi.a("startCodec");
        mediaCodec.start();
        lfi.c();
        cyVar.X = 1;
    }

    public static String b(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.jw8
    public final void d(long j, int i, int i2, int i3) {
        hy hyVar = this.c;
        RuntimeException runtimeException = (RuntimeException) hyVar.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        fy fyVarB = hy.b();
        fyVarB.a = i;
        fyVarB.b = i2;
        fyVarB.d = j;
        fyVarB.e = i3;
        ey eyVar = hyVar.c;
        int i4 = xxg.a;
        eyVar.obtainMessage(0, fyVarB).sendToTarget();
    }

    @Override // defpackage.jw8
    public final void flush() {
        this.c.a();
        MediaCodec mediaCodec = this.a;
        mediaCodec.flush();
        boolean z = this.d;
        jy jyVar = this.b;
        if (!z) {
            jyVar.a(mediaCodec);
        } else {
            jyVar.a(null);
            mediaCodec.start();
        }
    }

    @Override // defpackage.jw8
    public final void g(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.jw8
    public final ByteBuffer getInputBuffer(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.jw8
    public final ByteBuffer getOutputBuffer(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.jw8
    public final MediaFormat getOutputFormat() {
        MediaFormat mediaFormat;
        jy jyVar = this.b;
        synchronized (jyVar.a) {
            try {
                mediaFormat = jyVar.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.jw8
    public final int h() {
        jy jyVar = this.b;
        synchronized (jyVar.a) {
            try {
                boolean z = true;
                int iG = -1;
                if (jyVar.k > 0 || jyVar.l) {
                    return -1;
                }
                IllegalStateException illegalStateException = jyVar.m;
                if (illegalStateException != null) {
                    jyVar.m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = jyVar.j;
                if (codecException != null) {
                    jyVar.j = null;
                    throw codecException;
                }
                ry ryVar = jyVar.d;
                if (ryVar.d != 0) {
                    z = false;
                }
                if (!z) {
                    iG = ryVar.g();
                }
                return iG;
            } finally {
            }
        }
    }

    @Override // defpackage.jw8
    public final int i(MediaCodec.BufferInfo bufferInfo) {
        jy jyVar = this.b;
        synchronized (jyVar.a) {
            try {
                boolean z = true;
                if (jyVar.k > 0 || jyVar.l) {
                    return -1;
                }
                IllegalStateException illegalStateException = jyVar.m;
                if (illegalStateException != null) {
                    jyVar.m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = jyVar.j;
                if (codecException != null) {
                    jyVar.j = null;
                    throw codecException;
                }
                ry ryVar = jyVar.e;
                if (ryVar.d != 0) {
                    z = false;
                }
                if (z) {
                    return -1;
                }
                int iG = ryVar.g();
                if (iG >= 0) {
                    fsi.e(jyVar.h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) jyVar.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iG == -2) {
                    jyVar.h = (MediaFormat) jyVar.g.remove();
                }
                return iG;
            } finally {
            }
        }
    }

    @Override // defpackage.jw8
    public final void j(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.jw8
    public final void k(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.jw8
    public final void l(int i, za4 za4Var, long j) {
        hy hyVar = this.c;
        RuntimeException runtimeException = (RuntimeException) hyVar.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        fy fyVarB = hy.b();
        fyVarB.a = i;
        fyVarB.b = 0;
        fyVarB.d = j;
        fyVarB.e = 0;
        MediaCodec.CryptoInfo cryptoInfo = fyVarB.c;
        cryptoInfo.numSubSamples = za4Var.f;
        int[] iArr = (int[]) za4Var.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = (int[]) za4Var.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = (byte[]) za4Var.b;
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
        byte[] bArr2 = (byte[]) za4Var.a;
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
        cryptoInfo.mode = za4Var.c;
        if (xxg.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(za4Var.g, za4Var.h));
        }
        hyVar.c.obtainMessage(1, fyVarB).sendToTarget();
    }

    @Override // defpackage.jw8
    public final void n(hx8 hx8Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new yx(this, hx8Var, 0), handler);
    }

    @Override // defpackage.jw8
    public final void release() {
        try {
            if (this.X == 1) {
                hy hyVar = this.c;
                if (hyVar.f) {
                    hyVar.a();
                    hyVar.b.quit();
                }
                hyVar.f = false;
                jy jyVar = this.b;
                synchronized (jyVar.a) {
                    jyVar.l = true;
                    jyVar.b.quit();
                    jyVar.b();
                }
            }
            this.X = 2;
            if (this.o) {
                return;
            }
            this.a.release();
            this.o = true;
        } catch (Throwable th) {
            if (!this.o) {
                this.a.release();
                this.o = true;
            }
            throw th;
        }
    }

    @Override // defpackage.jw8
    public final void releaseOutputBuffer(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // defpackage.jw8
    public final void setParameters(Bundle bundle) {
        this.a.setParameters(bundle);
    }
}
