package com.google.net.cronet.okhttptransport;

import com.google.net.cronet.okhttptransport.h;
import com.google.net.cronet.okhttptransport.j;
import com.google.net.cronet.okhttptransport.n;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* compiled from: CronetInterceptor.java */
/* loaded from: classes14.dex */
public final class e implements Interceptor, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public final n f362519b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f362520c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f362521d;

    /* compiled from: CronetInterceptor.java */
    public static final class b extends o<b, e> {
        public final e a() {
            if (this.f362573b == null) {
                this.f362573b = h.b.f362545a;
            }
            return new e(new n(this.f362572a, Executors.newFixedThreadPool(4), new j(new j.b(), new j.c(Executors.newCachedThreadPool())), new q(), this.f362573b), null);
        }
    }

    /* compiled from: CronetInterceptor.java */
    public class c extends f {

        /* renamed from: c, reason: collision with root package name */
        public final Call f362522c;

        public c(ResponseBody responseBody, Call call, a aVar) {
            super(responseBody);
            this.f362522c = call;
        }

        @Override // com.google.net.cronet.okhttptransport.f
        public final void a() {
            e.this.f362520c.remove(this.f362522c);
        }
    }

    public e(n nVar, a aVar) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        this.f362521d = scheduledThreadPoolExecutor;
        nVar.getClass();
        this.f362519b = nVar;
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.google.net.cronet.okhttptransport.d
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = this.f362518b.f362520c.entrySet().iterator();
                while (it.hasNext()) {
                    try {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((Call) entry.getKey()).isCanceled()) {
                            it.remove();
                            ((UrlRequest) entry.getValue()).cancel();
                        }
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }, 500L, 500L, TimeUnit.MILLISECONDS);
    }

    public static b a(CronetEngine cronetEngine) {
        return new b(cronetEngine);
    }

    public final Response b(Call call, Response response) {
        response.body().getClass();
        return response.body() instanceof c ? response : response.newBuilder().body(new c(response.body(), call, null)).build();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f362521d.shutdown();
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        if (chain.call().isCanceled()) {
            throw new IOException("Canceled");
        }
        n.a aVarA = this.f362519b.a(chain.request(), chain.readTimeoutMillis(), chain.writeTimeoutMillis());
        ConcurrentHashMap concurrentHashMap = this.f362520c;
        Call call = chain.call();
        UrlRequest urlRequest = aVarA.f362570a;
        concurrentHashMap.put(call, urlRequest);
        try {
            urlRequest.start();
            return b(chain.call(), aVarA.f362571b.a());
        } catch (IOException | RuntimeException e12) {
            concurrentHashMap.remove(chain.call());
            throw e12;
        }
    }
}
