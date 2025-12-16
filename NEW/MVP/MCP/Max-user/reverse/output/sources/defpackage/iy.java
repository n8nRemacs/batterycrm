package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class iy implements nw8 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public ey c;
    public final AtomicReference d;
    public final yn3 e;
    public boolean f;

    public iy(MediaCodec mediaCodec, HandlerThread handlerThread) {
        yn3 yn3Var = new yn3();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = yn3Var;
        this.d = new AtomicReference();
    }

    public static gy c() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new gy();
                }
                return (gy) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.nw8
    public final void a() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.nw8
    public final void b(int i, za4 za4Var, long j, int i2) {
        a();
        gy gyVarC = c();
        gyVarC.a = i;
        gyVarC.b = 0;
        gyVarC.d = j;
        gyVarC.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = gyVarC.c;
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
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(za4Var.g, za4Var.h));
        ey eyVar = this.c;
        String str = zxg.a;
        eyVar.obtainMessage(2, gyVarC).sendToTarget();
    }

    @Override // defpackage.nw8
    public final void d(long j, int i, int i2, int i3) {
        a();
        gy gyVarC = c();
        gyVarC.a = i;
        gyVarC.b = i2;
        gyVarC.d = j;
        gyVarC.e = i3;
        ey eyVar = this.c;
        String str = zxg.a;
        eyVar.obtainMessage(1, gyVarC).sendToTarget();
    }

    @Override // defpackage.nw8
    public final void flush() {
        if (this.f) {
            try {
                ey eyVar = this.c;
                eyVar.getClass();
                eyVar.removeCallbacksAndMessages(null);
                yn3 yn3Var = this.e;
                yn3Var.d();
                ey eyVar2 = this.c;
                eyVar2.getClass();
                eyVar2.obtainMessage(3).sendToTarget();
                yn3Var.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.nw8
    public final void setParameters(Bundle bundle) {
        a();
        ey eyVar = this.c;
        String str = zxg.a;
        eyVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.nw8
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.nw8
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new ey(this, handlerThread.getLooper(), 1);
        this.f = true;
    }
}
