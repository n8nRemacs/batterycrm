package com.google.firebase.installations.remote;

import com.google.firebase.installations.p;
import j.B;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import zZ0.C50533b;

/* compiled from: RequestLimiter.java */
/* loaded from: classes6.dex */
class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f361715d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f361716e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final p f361717a;

    /* renamed from: b, reason: collision with root package name */
    @B
    public long f361718b;

    /* renamed from: c, reason: collision with root package name */
    @B
    public int f361719c;

    public d() {
        if (C50533b.f444077a == null) {
            Pattern pattern = p.f361685c;
            C50533b.f444077a = new C50533b();
        }
        C50533b c50533b = C50533b.f444077a;
        if (p.f361686d == null) {
            p.f361686d = new p(c50533b);
        }
        this.f361717a = p.f361686d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f361719c     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L1b
            com.google.firebase.installations.p r0 = r4.f361717a     // Catch: java.lang.Throwable -> L19
            zZ0.b r0 = r0.f361687a     // Catch: java.lang.Throwable -> L19
            r0.getClass()     // Catch: java.lang.Throwable -> L19
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L19
            long r2 = r4.f361718b     // Catch: java.lang.Throwable -> L19
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            goto L1b
        L17:
            r0 = 0
            goto L1c
        L19:
            r0 = move-exception
            goto L1e
        L1b:
            r0 = 1
        L1c:
            monitor-exit(r4)
            return r0
        L1e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.d.a():boolean");
    }

    public final synchronized void b(int i12) {
        long jMin;
        if ((i12 >= 200 && i12 < 300) || i12 == 401 || i12 == 404) {
            synchronized (this) {
                this.f361719c = 0;
            }
            return;
        }
        this.f361719c++;
        synchronized (this) {
            if (i12 == 429 || (i12 >= 500 && i12 < 600)) {
                double dPow = Math.pow(2.0d, this.f361719c);
                this.f361717a.getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f361716e);
            } else {
                jMin = f361715d;
            }
            this.f361717a.f361687a.getClass();
            this.f361718b = System.currentTimeMillis() + jMin;
        }
        return;
    }
}
