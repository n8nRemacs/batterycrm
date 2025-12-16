package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.util.C36592h;
import j.B;
import j.X;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
@X
/* loaded from: classes6.dex */
class e {

    /* renamed from: g, reason: collision with root package name */
    @B
    public static final ArrayDeque<a> f345565g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f345566h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f345567a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f345568b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f345569c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<RuntimeException> f345570d;

    /* renamed from: e, reason: collision with root package name */
    public final C36592h f345571e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f345572f;

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f345573a;

        /* renamed from: b, reason: collision with root package name */
        public int f345574b;

        /* renamed from: c, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f345575c = new MediaCodec.CryptoInfo();

        /* renamed from: d, reason: collision with root package name */
        public long f345576d;

        /* renamed from: e, reason: collision with root package name */
        public int f345577e;
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C36592h c36592h = new C36592h();
        this.f345567a = mediaCodec;
        this.f345568b = handlerThread;
        this.f345571e = c36592h;
        this.f345570d = new AtomicReference<>();
    }

    public static a b() {
        ArrayDeque<a> arrayDeque = f345565g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new a();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a() {
        if (this.f345572f) {
            try {
                Handler handler = this.f345569c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                C36592h c36592h = this.f345571e;
                synchronized (c36592h) {
                    c36592h.f348131b = false;
                }
                Handler handler2 = this.f345569c;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                c36592h.a();
            } catch (InterruptedException e12) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e12);
            }
        }
    }
}
