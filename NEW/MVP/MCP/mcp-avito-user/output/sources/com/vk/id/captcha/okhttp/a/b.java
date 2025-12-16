package com.vk.id.captcha.okhttp.a;

import Y61.k;
import Y61.l;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: CompositeInterceptor.kt */
/* loaded from: classes7.dex */
final class b implements Interceptor.Chain {

    /* renamed from: a, reason: collision with root package name */
    @k
    private final Request f366837a;

    /* renamed from: b, reason: collision with root package name */
    @k
    private final Interceptor.Chain f366838b;

    /* renamed from: c, reason: collision with root package name */
    @k
    private final List<Interceptor> f366839c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k Request request, @k Interceptor.Chain chain, @k List<? extends Interceptor> list) {
        this.f366837a = request;
        this.f366838b = chain;
        this.f366839c = list;
    }

    @Override // okhttp3.Interceptor.Chain
    @k
    public final Call call() {
        return this.f366838b.call();
    }

    @Override // okhttp3.Interceptor.Chain
    public final int connectTimeoutMillis() {
        return this.f366838b.connectTimeoutMillis();
    }

    @Override // okhttp3.Interceptor.Chain
    @l
    public final Connection connection() {
        return this.f366838b.connection();
    }

    @Override // okhttp3.Interceptor.Chain
    @k
    public final Response proceed(@k Request request) {
        if (this.f366839c.isEmpty()) {
            return this.f366838b.proceed(request);
        }
        Interceptor interceptor = this.f366839c.get(0);
        List<Interceptor> list = this.f366839c;
        return interceptor.intercept(new b(request, this.f366838b, list.subList(1, list.size())));
    }

    @Override // okhttp3.Interceptor.Chain
    public final int readTimeoutMillis() {
        return this.f366838b.readTimeoutMillis();
    }

    @Override // okhttp3.Interceptor.Chain
    @k
    public final Request request() {
        return this.f366837a;
    }

    @Override // okhttp3.Interceptor.Chain
    public final /* synthetic */ Interceptor.Chain withConnectTimeout(int i12, TimeUnit timeUnit) {
        return new b(this.f366837a, this.f366838b.withConnectTimeout(i12, timeUnit), this.f366839c);
    }

    @Override // okhttp3.Interceptor.Chain
    public final /* synthetic */ Interceptor.Chain withReadTimeout(int i12, TimeUnit timeUnit) {
        return new b(this.f366837a, this.f366838b.withReadTimeout(i12, timeUnit), this.f366839c);
    }

    @Override // okhttp3.Interceptor.Chain
    public final /* synthetic */ Interceptor.Chain withWriteTimeout(int i12, TimeUnit timeUnit) {
        return new b(this.f366837a, this.f366838b.withWriteTimeout(i12, timeUnit), this.f366839c);
    }

    @Override // okhttp3.Interceptor.Chain
    public final int writeTimeoutMillis() {
        return this.f366838b.writeTimeoutMillis();
    }
}
