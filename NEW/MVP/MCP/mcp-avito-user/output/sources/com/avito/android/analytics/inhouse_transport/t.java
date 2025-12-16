package com.avito.android.analytics.inhouse_transport;

import com.avito.android.util.C;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* compiled from: InHouseCommonSendingModule_ProvideInHouseGzipHttpClientFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class t implements dagger.internal.h<OkHttpClient> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<C> f90210a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.A f90211b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Interceptor> f90212c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<EventListener> f90213d;

    public t(dagger.internal.A a12, Provider provider, Provider provider2, Provider provider3) {
        this.f90210a = provider;
        this.f90211b = a12;
        this.f90212c = provider2;
        this.f90213d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C c12 = this.f90210a.get();
        Set set = (Set) this.f90211b.get();
        Interceptor interceptor = this.f90212c.get();
        EventListener eventListener = this.f90213d.get();
        int i12 = q.f90207a;
        c12.getF125491k().getClass();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderAddInterceptor = builder.readTimeout(30L, timeUnit).connectTimeout(30L, timeUnit).addInterceptor(new i());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            builderAddInterceptor.addInterceptor((Interceptor) it.next());
        }
        OkHttpClient.Builder builderEventListener = builderAddInterceptor.protocols(C42745f0.U(Protocol.HTTP_2, Protocol.HTTP_1_1)).eventListener(eventListener);
        builderEventListener.addInterceptor(interceptor);
        OkHttpClient okHttpClientBuild = builderEventListener.build();
        dagger.internal.t.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
