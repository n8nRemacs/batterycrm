package com.avito.android.di.module;

import android.app.Application;
import com.avito.android.remote.interceptor.InterfaceC34278e;
import com.avito.android.util.InterfaceC35940s3;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import lW0.C43696c;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;

/* compiled from: HttpClientModule_ProvideRetrofitHttpClient$_avito_network_implFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/p5;", "Ldagger/internal/h;", "Lokhttp3/OkHttpClient;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.p5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30148p5 implements dagger.internal.h<OkHttpClient> {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final a f144511k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30159q5 f144512a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f144513b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f144514c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C30176s1 f144515d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.retrofit.H> f144516e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.remote.interceptor.O0> f144517f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.remote.interceptor.Y0> f144518g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC34278e> f144519h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f144520i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.offlinization.r f144521j;

    /* compiled from: HttpClientModule_ProvideRetrofitHttpClient$_avito_network_implFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/avito/android/di/module/HttpClientModule_ProvideRetrofitHttpClient$_avito_network_implFactory.Companion", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.p5$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30148p5(@Y61.k C30115m5 c30115m5, @Y61.k C30159q5 c30159q5, @Y61.k dagger.internal.l lVar, @Y61.k com.avito.android.S s5, @Y61.k C30176s1 c30176s1, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k Provider provider4, @Y61.k dagger.internal.u uVar, @Y61.k com.avito.android.offlinization.r rVar) {
        this.f144512a = c30159q5;
        this.f144513b = lVar;
        this.f144514c = s5;
        this.f144515d = c30176s1;
        this.f144516e = provider;
        this.f144517f = provider2;
        this.f144518g = provider3;
        this.f144519h = provider4;
        this.f144520i = uVar;
        this.f144521j = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        this.f144512a.get();
        Application application = (Application) this.f144513b.f393949a;
        com.avito.android.P p12 = (com.avito.android.P) this.f144514c.get();
        InterfaceC35940s3 interfaceC35940s3 = (InterfaceC35940s3) this.f144515d.get();
        com.avito.android.retrofit.H h12 = this.f144516e.get();
        com.avito.android.remote.interceptor.O0 o02 = this.f144517f.get();
        com.avito.android.remote.interceptor.Y0 y02 = this.f144518g.get();
        InterfaceC34278e interfaceC34278e = this.f144519h.get();
        C43696c c43696c = (C43696c) this.f144520i.get();
        com.avito.android.offlinization.p pVar = (com.avito.android.offlinization.p) this.f144521j.get();
        f144511k.getClass();
        Interceptor[] interceptorArr = {o02, y02, interfaceC34278e};
        kotlin.reflect.n<Object>[] nVarArr = com.avito.android.P.f67370w0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        if (((Boolean) p12.f67398b.a().invoke()).booleanValue()) {
            Object[] objArrCopyOf = Arrays.copyOf(interceptorArr, 4);
            objArrCopyOf[3] = c43696c;
            interceptorArr = (Interceptor[]) objArrCopyOf;
        }
        Interceptor[] interceptorArr2 = (Interceptor[]) Arrays.copyOf(interceptorArr, interceptorArr.length);
        h12.b();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderProtocols = builder.readTimeout(30L, timeUnit).connectTimeout(30L, timeUnit).protocols(C42745f0.U(Protocol.HTTP_2, Protocol.HTTP_1_1));
        kotlin.reflect.n<Object> nVar2 = nVarArr[17];
        if (!((Boolean) p12.f67420m.a().getValue()).booleanValue() && !pVar.f()) {
            builderProtocols.cache(new Cache(new File(application.getCacheDir(), "http"), 10485760L));
        }
        interfaceC35940s3.a();
        for (Interceptor interceptor : interceptorArr2) {
            builderProtocols.addInterceptor(interceptor);
        }
        OkHttpClient okHttpClientBuild = builderProtocols.build();
        dagger.internal.t.b(okHttpClientBuild, "Cannot return null from a non-@Nullable @Provides method");
        return okHttpClientBuild;
    }
}
