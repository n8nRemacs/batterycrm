package com.avito.android.analytics.inhouse_transport;

import com.avito.android.util.C;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* compiled from: InHouseCommonSendingModule_ProvideHttpClientFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class s implements dagger.internal.h<OkHttpClient> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f90208a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Set<Interceptor>> f90209b;

    public s(Provider<C> provider, Provider<Set<Interceptor>> provider2) {
        this.f90208a = provider;
        this.f90209b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f90208a.get();
        Set<Interceptor> set = this.f90209b.get();
        int i12 = q.f90207a;
        c12.getF125491k().getClass();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderProtocols = builder.readTimeout(30L, timeUnit).connectTimeout(30L, timeUnit).protocols(C42745f0.U(Protocol.HTTP_2, Protocol.HTTP_1_1));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            builderProtocols.addInterceptor((Interceptor) it.next());
        }
        OkHttpClient okHttpClientBuild = builderProtocols.build();
        dagger.internal.t.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
