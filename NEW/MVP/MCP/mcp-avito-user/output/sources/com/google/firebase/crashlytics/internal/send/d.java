package com.google.firebase.crashlytics.internal.send;

import android.annotation.SuppressLint;
import android.database.SQLException;
import android.os.SystemClock;
import com.google.android.datatransport.g;
import com.google.android.datatransport.i;
import com.google.android.datatransport.runtime.m;
import com.google.android.gms.tasks.C37028k;
import com.google.firebase.crashlytics.internal.common.I;
import com.google.firebase.crashlytics.internal.common.W;
import com.google.firebase.crashlytics.internal.common.e0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ReportQueue.java */
/* loaded from: classes4.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    public final double f361439a;

    /* renamed from: b, reason: collision with root package name */
    public final double f361440b;

    /* renamed from: c, reason: collision with root package name */
    public final long f361441c;

    /* renamed from: d, reason: collision with root package name */
    public final long f361442d;

    /* renamed from: e, reason: collision with root package name */
    public final int f361443e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f361444f;

    /* renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f361445g;

    /* renamed from: h, reason: collision with root package name */
    public final g<CrashlyticsReport> f361446h;

    /* renamed from: i, reason: collision with root package name */
    public final W f361447i;

    /* renamed from: j, reason: collision with root package name */
    public int f361448j;

    /* renamed from: k, reason: collision with root package name */
    public long f361449k;

    /* compiled from: ReportQueue.java */
    public final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final I f361450b;

        /* renamed from: c, reason: collision with root package name */
        public final C37028k<I> f361451c;

        public b() {
            throw null;
        }

        public b(I i12, C37028k c37028k, a aVar) {
            this.f361450b = i12;
            this.f361451c = c37028k;
        }

        @Override // java.lang.Runnable
        public final void run() throws InterruptedException {
            I i12 = this.f361450b;
            C37028k<I> c37028k = this.f361451c;
            d dVar = d.this;
            dVar.b(i12, c37028k);
            dVar.f361447i.f360942b.set(0);
            double dMin = Math.min(3600000.0d, Math.pow(dVar.f361440b, dVar.a()) * (60000.0d / dVar.f361439a));
            com.google.firebase.crashlytics.internal.d dVar2 = com.google.firebase.crashlytics.internal.d.f361031a;
            String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d));
            dVar2.a(3);
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public d() {
        throw null;
    }

    public d(g<CrashlyticsReport> gVar, com.google.firebase.crashlytics.internal.settings.d dVar, W w12) {
        double d12 = dVar.f361458d;
        this.f361439a = d12;
        this.f361440b = dVar.f361459e;
        this.f361441c = dVar.f361460f * 1000;
        this.f361446h = gVar;
        this.f361447i = w12;
        this.f361442d = SystemClock.elapsedRealtime();
        int i12 = (int) d12;
        this.f361443e = i12;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i12);
        this.f361444f = arrayBlockingQueue;
        this.f361445g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f361448j = 0;
        this.f361449k = 0L;
    }

    public final int a() {
        if (this.f361449k == 0) {
            this.f361449k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f361449k) / this.f361441c);
        int iMin = this.f361444f.size() == this.f361443e ? Math.min(100, this.f361448j + iCurrentTimeMillis) : Math.max(0, this.f361448j - iCurrentTimeMillis);
        if (this.f361448j != iMin) {
            this.f361448j = iMin;
            this.f361449k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final I i12, final C37028k<I> c37028k) {
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        i12.getClass();
        dVar.a(3);
        final boolean z12 = SystemClock.elapsedRealtime() - this.f361442d < 2000;
        this.f361446h.b(com.google.android.datatransport.d.f(i12.a()), new i() { // from class: com.google.firebase.crashlytics.internal.send.b
            @Override // com.google.android.datatransport.i
            public final void b(Exception exc) throws Throwable {
                final d dVar2 = this.f361433b;
                dVar2.getClass();
                C37028k c37028k2 = c37028k;
                if (exc != null) {
                    c37028k2.c(exc);
                    return;
                }
                if (z12) {
                    boolean z13 = true;
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.internal.send.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            d dVar3 = dVar2;
                            dVar3.getClass();
                            try {
                                m.a(dVar3.f361446h);
                            } catch (SQLException unused) {
                            }
                            countDownLatch.countDown();
                        }
                    }).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = e0.f360968a;
                    boolean z14 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = jNanoTime - System.nanoTime();
                                    z14 = true;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (z13) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z14) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z13 = z14;
                    }
                }
                c37028k2.d(i12);
            }
        });
    }
}
