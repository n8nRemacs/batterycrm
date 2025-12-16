package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

@j.X
/* loaded from: classes8.dex */
final class ec {

    /* renamed from: g, reason: collision with root package name */
    @j.B
    private static final ArrayDeque<b> f384870g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f384871h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f384872a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f384873b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f384874c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f384875d;

    /* renamed from: e, reason: collision with root package name */
    private final bl f384876e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f384877f;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) throws MediaCodec.CryptoException {
            ec.a(ec.this, message);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f384879a;

        /* renamed from: b, reason: collision with root package name */
        public int f384880b;

        /* renamed from: c, reason: collision with root package name */
        public int f384881c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f384882d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f384883e;

        /* renamed from: f, reason: collision with root package name */
        public int f384884f;
    }

    public ec(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new bl());
    }

    public static void a(ec ecVar, Message message) throws MediaCodec.CryptoException {
        ecVar.getClass();
        int i12 = message.what;
        b bVar = null;
        if (i12 == 0) {
            b bVar2 = (b) message.obj;
            try {
                ecVar.f384872a.queueInputBuffer(bVar2.f384879a, bVar2.f384880b, bVar2.f384881c, bVar2.f384883e, bVar2.f384884f);
            } catch (RuntimeException e12) {
                AtomicReference<RuntimeException> atomicReference = ecVar.f384875d;
                while (!atomicReference.compareAndSet(null, e12) && atomicReference.get() == null) {
                }
            }
            bVar = bVar2;
        } else if (i12 == 1) {
            b bVar3 = (b) message.obj;
            int i13 = bVar3.f384879a;
            int i14 = bVar3.f384880b;
            MediaCodec.CryptoInfo cryptoInfo = bVar3.f384882d;
            long j12 = bVar3.f384883e;
            int i15 = bVar3.f384884f;
            try {
                synchronized (f384871h) {
                    ecVar.f384872a.queueSecureInputBuffer(i13, i14, cryptoInfo, j12, i15);
                }
            } catch (RuntimeException e13) {
                AtomicReference<RuntimeException> atomicReference2 = ecVar.f384875d;
                while (!atomicReference2.compareAndSet(null, e13) && atomicReference2.get() == null) {
                }
            }
            bVar = bVar3;
        } else if (i12 != 2) {
            AtomicReference<RuntimeException> atomicReference3 = ecVar.f384875d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            ecVar.f384876e.e();
        }
        if (bVar != null) {
            ArrayDeque<b> arrayDeque = f384870g;
            synchronized (arrayDeque) {
                arrayDeque.add(bVar);
            }
        }
    }

    public final void b() {
        if (this.f384877f) {
            a();
            this.f384873b.quit();
        }
        this.f384877f = false;
    }

    public final void c() {
        if (this.f384877f) {
            return;
        }
        this.f384873b.start();
        this.f384874c = new a(this.f384873b.getLooper());
        this.f384877f = true;
    }

    public final void d() {
        this.f384876e.c();
        Handler handler = this.f384874c;
        handler.getClass();
        handler.obtainMessage(2).sendToTarget();
        this.f384876e.a();
    }

    @j.k0
    public ec(MediaCodec mediaCodec, HandlerThread handlerThread, bl blVar) {
        this.f384872a = mediaCodec;
        this.f384873b = handlerThread;
        this.f384876e = blVar;
        this.f384875d = new AtomicReference<>();
    }

    public final void a() {
        if (this.f384877f) {
            try {
                Handler handler = this.f384874c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.f384876e.c();
                Handler handler2 = this.f384874c;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.f384876e.a();
            } catch (InterruptedException e12) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e12);
            }
        }
    }

    public final void a(int i12, int i13, long j12, int i14) {
        b bVarRemoveFirst;
        RuntimeException andSet = this.f384875d.getAndSet(null);
        if (andSet == null) {
            ArrayDeque<b> arrayDeque = f384870g;
            synchronized (arrayDeque) {
                try {
                    if (arrayDeque.isEmpty()) {
                        bVarRemoveFirst = new b();
                    } else {
                        bVarRemoveFirst = arrayDeque.removeFirst();
                    }
                } finally {
                }
            }
            bVarRemoveFirst.f384879a = i12;
            bVarRemoveFirst.f384880b = 0;
            bVarRemoveFirst.f384881c = i13;
            bVarRemoveFirst.f384883e = j12;
            bVarRemoveFirst.f384884f = i14;
            Handler handler = this.f384874c;
            int i15 = pc1.f388768a;
            handler.obtainMessage(0, bVarRemoveFirst).sendToTarget();
            return;
        }
        throw andSet;
    }

    public final void a(int i12, um umVar, long j12) {
        b bVarRemoveFirst;
        RuntimeException andSet = this.f384875d.getAndSet(null);
        if (andSet == null) {
            ArrayDeque<b> arrayDeque = f384870g;
            synchronized (arrayDeque) {
                try {
                    if (arrayDeque.isEmpty()) {
                        bVarRemoveFirst = new b();
                    } else {
                        bVarRemoveFirst = arrayDeque.removeFirst();
                    }
                } finally {
                }
            }
            bVarRemoveFirst.f384879a = i12;
            bVarRemoveFirst.f384880b = 0;
            bVarRemoveFirst.f384881c = 0;
            bVarRemoveFirst.f384883e = j12;
            bVarRemoveFirst.f384884f = 0;
            MediaCodec.CryptoInfo cryptoInfo = bVarRemoveFirst.f384882d;
            cryptoInfo.numSubSamples = umVar.f390590f;
            int[] iArr = umVar.f390588d;
            int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArrCopyOf != null && iArrCopyOf.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
                } else {
                    iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArrCopyOf;
            int[] iArr2 = umVar.f390589e;
            int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr2 != null) {
                if (iArrCopyOf2 != null && iArrCopyOf2.length >= iArr2.length) {
                    System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
                } else {
                    iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
            byte[] bArr = umVar.f390586b;
            byte[] bArrCopyOf = cryptoInfo.key;
            if (bArr != null) {
                if (bArrCopyOf != null && bArrCopyOf.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
                } else {
                    bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArrCopyOf.getClass();
            cryptoInfo.key = bArrCopyOf;
            byte[] bArr2 = umVar.f390585a;
            byte[] bArrCopyOf2 = cryptoInfo.iv;
            if (bArr2 != null) {
                if (bArrCopyOf2 != null && bArrCopyOf2.length >= bArr2.length) {
                    System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
                } else {
                    bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
                }
            }
            bArrCopyOf2.getClass();
            cryptoInfo.iv = bArrCopyOf2;
            cryptoInfo.mode = umVar.f390587c;
            if (pc1.f388768a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(umVar.f390591g, umVar.f390592h));
            }
            this.f384874c.obtainMessage(1, bVarRemoveFirst).sendToTarget();
            return;
        }
        throw andSet;
    }
}
