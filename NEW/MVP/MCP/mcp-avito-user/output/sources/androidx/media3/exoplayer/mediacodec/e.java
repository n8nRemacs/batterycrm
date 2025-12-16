package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.media3.common.util.C23118i;
import j.B;
import j.X;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
@X
/* loaded from: classes.dex */
class e {

    /* renamed from: g, reason: collision with root package name */
    @B
    public static final ArrayDeque<a> f49343g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f49344h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f49345a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f49346b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f49347c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference<RuntimeException> f49348d;

    /* renamed from: e, reason: collision with root package name */
    public final C23118i f49349e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f49350f;

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f49351a;

        /* renamed from: b, reason: collision with root package name */
        public int f49352b;

        /* renamed from: c, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f49353c = new MediaCodec.CryptoInfo();

        /* renamed from: d, reason: collision with root package name */
        public long f49354d;

        /* renamed from: e, reason: collision with root package name */
        public int f49355e;
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C23118i c23118i = new C23118i();
        this.f49345a = mediaCodec;
        this.f49346b = handlerThread;
        this.f49349e = c23118i;
        this.f49348d = new AtomicReference<>();
    }

    public static a b() {
        ArrayDeque<a> arrayDeque = f49343g;
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
        if (this.f49350f) {
            try {
                Handler handler = this.f49347c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                C23118i c23118i = this.f49349e;
                c23118i.c();
                Handler handler2 = this.f49347c;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                c23118i.a();
            } catch (InterruptedException e12) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e12);
            }
        }
    }
}
