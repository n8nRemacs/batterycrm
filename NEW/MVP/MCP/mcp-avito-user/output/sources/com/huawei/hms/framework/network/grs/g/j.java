package com.huawei.hms.framework.network.grs.g;

import android.os.SystemClock;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import q01.C47180a;
import s01.C47953b;
import s01.C47954c;
import t01.d;

/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f363576a = ExecutorsUtils.newCachedThreadPool("GRS_RequestController-Task");

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f363577b = new ConcurrentHashMap(16);

    /* renamed from: c, reason: collision with root package name */
    public final Object f363578c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public C47180a f363579d;

    public class a implements Callable<e> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C47954c f363580b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f363581c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q01.c f363582d;

        public a(C47954c c47954c, String str, q01.c cVar) {
            this.f363580b = c47954c;
            this.f363581c = str;
            this.f363582d = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final e call() {
            String str;
            j jVar = j.this;
            d dVar = new d(this.f363580b, jVar.f363579d);
            ExecutorService executorService = jVar.f363576a;
            String str2 = this.f363581c;
            q01.c cVar = this.f363582d;
            if (dVar.f363552h.isEmpty() && dVar.f363553i.isEmpty()) {
                return null;
            }
            try {
                return (e) executorService.submit(new c(dVar, executorService, str2, cVar)).get(dVar.f363555k != null ? r5.f437285d : 10, TimeUnit.SECONDS);
            } catch (InterruptedException e12) {
                e = e12;
                str = "{submitExcutorTaskWithTimeout} the current thread was interrupted while waiting";
                Logger.w("c", str, e);
                return null;
            } catch (CancellationException unused) {
                Logger.i("c", "{submitExcutorTaskWithTimeout} the computation was cancelled");
                return null;
            } catch (ExecutionException e13) {
                e = e13;
                str = "{submitExcutorTaskWithTimeout} the computation threw an ExecutionException";
                Logger.w("c", str, e);
                return null;
            } catch (TimeoutException unused2) {
                Logger.w("c", "{submitExcutorTaskWithTimeout} the wait timed out");
                return null;
            } catch (Exception e14) {
                e = e14;
                str = "{submitExcutorTaskWithTimeout} catch Exception";
                Logger.w("c", str, e);
                return null;
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C47954c f363584b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f363585c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q01.c f363586d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.huawei.hms.framework.network.grs.c f363587e;

        public b(C47954c c47954c, String str, q01.c cVar, com.huawei.hms.framework.network.grs.c cVar2) {
            this.f363584b = c47954c;
            this.f363585c = str;
            this.f363586d = cVar;
            this.f363587e = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e eVarA = j.this.a(this.f363584b, this.f363585c, this.f363586d);
            com.huawei.hms.framework.network.grs.c cVar = this.f363587e;
            if (cVar != null) {
                if (eVarA == null) {
                    Logger.v("RequestController", "GrsResponse is null");
                    cVar.a();
                } else {
                    Logger.v("RequestController", "GrsResponse is not null");
                    cVar.a(eVarA);
                }
            }
        }
    }

    public final e a(C47954c c47954c, String str, q01.c cVar) {
        Future<e> futureSubmit;
        String str2;
        String str3;
        Logger.d("RequestController", "request to server with service name is: " + str);
        String grsParasKey = c47954c.f437279a.getGrsParasKey(true, true, c47954c.f437280b);
        Logger.v("RequestController", "request spUrlKey: " + grsParasKey);
        synchronized (this.f363578c) {
            try {
                if (!NetworkUtil.isNetworkAvailable(c47954c.f437280b)) {
                    return null;
                }
                d.a aVarA = t01.d.a(grsParasKey);
                C47953b c47953b = (C47953b) this.f363577b.get(grsParasKey);
                if (c47953b != null && SystemClock.elapsedRealtime() - c47953b.f437278b <= 300000) {
                    futureSubmit = c47953b.f437277a;
                } else {
                    if (aVarA != null && SystemClock.elapsedRealtime() - aVarA.f439022b <= aVarA.f439021a) {
                        return null;
                    }
                    Logger.d("RequestController", "hitGrsRequestBean == null or request block is released.");
                    futureSubmit = this.f363576a.submit(new a(c47954c, str, cVar));
                    this.f363577b.put(grsParasKey, new C47953b(futureSubmit));
                }
                try {
                    return futureSubmit.get();
                } catch (InterruptedException e12) {
                    e = e12;
                    str2 = "RequestController";
                    str3 = "when check result, find InterruptedException, check others";
                    Logger.w(str2, str3, e);
                    return null;
                } catch (CancellationException e13) {
                    e = e13;
                    str2 = "RequestController";
                    str3 = "when check result, find CancellationException, check others";
                    Logger.w(str2, str3, e);
                    return null;
                } catch (ExecutionException e14) {
                    e = e14;
                    str2 = "RequestController";
                    str3 = "when check result, find ExecutionException, check others";
                    Logger.w(str2, str3, e);
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(String str) {
        synchronized (this.f363578c) {
            this.f363577b.remove(str);
        }
    }

    public final void c(C47954c c47954c, com.huawei.hms.framework.network.grs.c cVar, String str, q01.c cVar2) {
        this.f363576a.execute(new b(c47954c, str, cVar2, cVar));
    }
}
