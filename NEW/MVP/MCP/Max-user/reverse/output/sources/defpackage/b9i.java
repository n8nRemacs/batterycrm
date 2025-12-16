package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class b9i {
    public static final long E;
    public static final String[] F;
    public static final long G;
    public final f94 A;
    public boolean B;
    public volatile boolean C;
    public int D;
    public final y6d a;
    public final z9a b;
    public final byte[] c = new byte[8192];
    public final HandlerThread d;
    public final Handler e;
    public gua f;
    public uh4 g;
    public final long h;
    public long i;
    public Integer j;
    public Integer k;
    public final AtomicInteger l;
    public final AtomicInteger m;
    public final AtomicInteger n;
    public final AtomicInteger o;
    public final AtomicInteger p;
    public final AtomicInteger q;
    public final AtomicInteger r;
    public final AtomicInteger s;
    public final AtomicInteger t;
    public final g9g u;
    public final g9g v;
    public final g9g w;
    public final g9g x;
    public final AtomicInteger y;
    public final AtomicInteger z;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        E = timeUnit.toNanos(1L) / 10;
        F = new String[]{"OMX.google.", "OMX.SEC.", "c2.android"};
        G = timeUnit.toMillis(3L);
    }

    public b9i(y6d y6dVar, y8g y8gVar, z9a z9aVar) {
        HandlerThread handlerThread = new HandlerThread("DecoderWrapperControl");
        this.d = handlerThread;
        this.f = null;
        this.h = -1L;
        this.i = 0L;
        this.l = new AtomicInteger(0);
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(0);
        this.o = new AtomicInteger(0);
        this.p = new AtomicInteger(0);
        this.q = new AtomicInteger(0);
        this.r = new AtomicInteger(0);
        this.s = new AtomicInteger(0);
        this.t = new AtomicInteger(0);
        this.u = new g9g();
        this.v = new g9g();
        this.w = new g9g();
        this.x = new g9g();
        this.y = new AtomicInteger(0);
        this.z = new AtomicInteger(0);
        this.B = false;
        this.a = y6dVar;
        this.b = z9aVar;
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
        this.A = new f94(y8gVar);
    }

    public final void a() {
        if (this.C) {
            return;
        }
        this.C = true;
        HandlerThread handlerThread = this.d;
        Handler handler = this.e;
        m1h m1hVar = new m1h(14, this);
        handler.removeCallbacksAndMessages(null);
        handler.post(m1hVar);
        handlerThread.quitSafely();
    }
}
