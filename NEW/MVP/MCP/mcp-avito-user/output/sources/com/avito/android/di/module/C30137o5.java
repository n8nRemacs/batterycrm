package com.avito.android.di.module;

import com.avito.android.remote.interceptor.C34271a0;
import com.avito.android.util.InterfaceC35940s3;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import lW0.C43696c;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* compiled from: HttpClientModule_ProvideFrescoHttpClient$_avito_network_implFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/o5;", "Ldagger/internal/h;", "Lokhttp3/OkHttpClient;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.o5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30137o5 implements dagger.internal.h<OkHttpClient> {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f144492m = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.K1 f144493a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f144494b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C30159q5 f144495c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<C34271a0> f144496d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f144497e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final zl0.f f144498f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.quic.u> f144499g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.quic.b> f144500h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.quic.performance.a> f144501i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Provider<C43696c> f144502j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C30155q1 f144503k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.interceptor.K f144504l;

    /* compiled from: HttpClientModule_ProvideFrescoHttpClient$_avito_network_implFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/avito/android/di/module/HttpClientModule_ProvideFrescoHttpClient$_avito_network_implFactory.Companion", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.o5$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30137o5(@Y61.k C30115m5 c30115m5, @Y61.k com.avito.android.K1 k12, @Y61.k com.avito.android.S s5, @Y61.k C30159q5 c30159q5, @Y61.k Provider provider, @Y61.k dagger.internal.u uVar, @Y61.k zl0.f fVar, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k Provider provider4, @Y61.k Provider provider5, @Y61.k C30155q1 c30155q1, @Y61.k com.avito.android.remote.interceptor.K k13) {
        this.f144493a = k12;
        this.f144494b = s5;
        this.f144495c = c30159q5;
        this.f144496d = provider;
        this.f144497e = uVar;
        this.f144498f = fVar;
        this.f144499g = provider2;
        this.f144500h = provider3;
        this.f144501i = provider4;
        this.f144502j = provider5;
        this.f144503k = c30155q1;
        this.f144504l = k13;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.I1 i12 = (com.avito.android.I1) this.f144493a.get();
        com.avito.android.P p12 = (com.avito.android.P) this.f144494b.get();
        this.f144495c.get();
        C34271a0 c34271a0 = this.f144496d.get();
        com.avito.android.remote.analytics.image.a aVar = (com.avito.android.remote.analytics.image.a) this.f144497e.get();
        zl0.d dVar = (zl0.d) this.f144498f.get();
        com.avito.android.quic.u uVar = this.f144499g.get();
        com.avito.android.quic.b bVar = this.f144500h.get();
        com.avito.android.quic.performance.a aVar2 = this.f144501i.get();
        InterfaceC35940s3 interfaceC35940s3 = (InterfaceC35940s3) this.f144503k.get();
        com.avito.android.remote.interceptor.J j12 = (com.avito.android.remote.interceptor.J) this.f144504l.get();
        f144492m.getClass();
        Interceptor[] interceptorArr = {c34271a0, aVar};
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderProtocols = builder.readTimeout(30L, timeUnit).connectTimeout(30L, timeUnit).protocols(C42745f0.U(Protocol.HTTP_2, Protocol.HTTP_1_1));
        interfaceC35940s3.a();
        for (int i13 = 0; i13 < 2; i13++) {
            builderProtocols.addInterceptor(interceptorArr[i13]);
        }
        kotlin.reflect.n<Object> nVar = com.avito.android.P.f67370w0[0];
        if (((Boolean) p12.f67398b.a().invoke()).booleanValue()) {
            builderProtocols.addInterceptor(this.f144502j.get());
        }
        builderProtocols.eventListener(aVar2);
        kotlin.reflect.n<Object> nVar2 = com.avito.android.I1.f67278k0[20];
        if (((Boolean) i12.f67334u.a().invoke()).booleanValue()) {
            builderProtocols.retryOnConnectionFailure(false);
            builderProtocols.addInterceptor(dVar);
        }
        builderProtocols.addInterceptor(j12);
        builderProtocols.addInterceptor(uVar);
        builderProtocols.addInterceptor(bVar);
        OkHttpClient okHttpClientBuild = builderProtocols.build();
        dagger.internal.t.b(okHttpClientBuild, "Cannot return null from a non-@Nullable @Provides method");
        return okHttpClientBuild;
    }
}
