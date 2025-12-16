package io.sentry.connection;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: LockdownManager.java */
/* loaded from: classes8.dex */
public class h {

    /* renamed from: f, reason: collision with root package name */
    public static final long f405136f = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: g, reason: collision with root package name */
    public static final long f405137g = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    public final long f405138a;

    /* renamed from: b, reason: collision with root package name */
    public final long f405139b;

    /* renamed from: c, reason: collision with root package name */
    public long f405140c;

    /* renamed from: d, reason: collision with root package name */
    public Date f405141d;

    /* renamed from: e, reason: collision with root package name */
    public final B41.c f405142e;

    public h() {
        B41.c cVar = new B41.c();
        this.f405138a = f405136f;
        this.f405139b = f405137g;
        this.f405140c = 0L;
        this.f405141d = null;
        this.f405142e = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.Date r0 = r4.f405141d     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            B41.c r0 = r4.f405142e     // Catch: java.lang.Throwable -> L1d
            r0.getClass()     // Catch: java.lang.Throwable -> L1d
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1d
            java.util.Date r2 = r4.f405141d     // Catch: java.lang.Throwable -> L1d
            long r2 = r2.getTime()     // Catch: java.lang.Throwable -> L1d
            long r0 = r0 - r2
            long r2 = r4.f405140c     // Catch: java.lang.Throwable -> L1d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L1f
            r0 = 1
            goto L20
        L1d:
            r0 = move-exception
            goto L22
        L1f:
            r0 = 0
        L20:
            monitor-exit(r4)
            return r0
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.connection.h.a():boolean");
    }
}
