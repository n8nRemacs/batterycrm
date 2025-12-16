package com.avito.http;

import Y41.l;
import Y61.k;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: RetryInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/http/f;", "Lokhttp3/Interceptor;", "okhttp"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    public final int f338478b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<String> f338479c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Integer> f338480d;

    /* renamed from: e, reason: collision with root package name */
    public final long f338481e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f338482f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final l<Request, Request> f338483g;

    /* compiled from: RetryInterceptor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lokhttp3/Request;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<Request, Request> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f338484l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Request invoke(Request request) {
            return request;
        }
    }

    public f() {
        this(0, null, null, 0L, false, null, 63, null);
    }

    public final boolean a(Response response) {
        if (response == null) {
            return true;
        }
        if (this.f338479c.contains(response.request().method())) {
            if (this.f338480d.contains(Integer.valueOf(response.code()))) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.Interceptor
    @k
    public final Response intercept(@k Interceptor.Chain chain) throws InterruptedException, IOException {
        Request request = chain.request();
        int i12 = 0;
        Response responseProceed = null;
        IOException e12 = null;
        while (a(responseProceed) && i12 < this.f338478b) {
            if (i12 > 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                boolean z12 = this.f338482f;
                long j12 = this.f338481e;
                if (z12) {
                    j12 *= i12;
                }
                timeUnit.sleep(j12);
            }
            i12++;
            if (responseProceed != null && a(responseProceed)) {
                responseProceed.close();
            }
            try {
                responseProceed = chain.proceed(i12 > 1 ? this.f338483g.invoke(request) : request);
            } catch (IOException e13) {
                e12 = e13;
                responseProceed = null;
            }
        }
        if (responseProceed != null) {
            return responseProceed;
        }
        if (e12 == null) {
            throw new IllegalStateException("Failed to execute request for unknown reason");
        }
        throw e12;
    }

    public f(int i12, List list, List list2, long j12, boolean z12, l lVar, int i13, C42822w c42822w) {
        i12 = (i13 & 1) != 0 ? 5 : i12;
        list = (i13 & 2) != 0 ? Collections.singletonList("GET") : list;
        list2 = (i13 & 4) != 0 ? C42745f0.U(408, 500, 502, 503, 504) : list2;
        j12 = (i13 & 8) != 0 ? TimeUnit.SECONDS.toMillis(1L) : j12;
        z12 = (i13 & 16) != 0 ? true : z12;
        lVar = (i13 & 32) != 0 ? a.f338484l : lVar;
        this.f338478b = i12;
        this.f338479c = list;
        this.f338480d = list2;
        this.f338481e = j12;
        this.f338482f = z12;
        this.f338483g = lVar;
        if (i12 < 2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
