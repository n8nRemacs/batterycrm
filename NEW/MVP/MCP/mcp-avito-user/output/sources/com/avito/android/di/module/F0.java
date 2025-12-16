package com.avito.android.di.module;

import com.avito.android.remote.interceptor.C34283g0;
import com.avito.android.remote.interceptor.C34312v0;
import com.avito.android.remote.interceptor.InterfaceC34278e;
import com.avito.android.remote.interceptor.InterfaceC34303q0;
import com.avito.android.remote.interceptor.InterfaceC34313w;
import com.avito.android.util.InterfaceC35940s3;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lW0.C43696c;
import okhttp3.CertificatePinner;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;

/* compiled from: ApiModule_ProvideOkHttpClientWithoutCronetFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/F0;", "Ldagger/internal/h;", "Lokhttp3/OkHttpClient;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class F0 implements dagger.internal.h<OkHttpClient> {

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public static final a f143924x = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.K1 f143925a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f143926b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C30254z2 f143927c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.remote.interceptor.J0> f143928d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC34303q0> f143929e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC34313w> f143930f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C30186t0 f143931g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Provider<C34312v0> f143932h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Provider<OkHttpClient> f143933i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.remote.interceptor.O0> f143934j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.remote.interceptor.Y0> f143935k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC34278e> f143936l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Provider<C34283g0> f143937m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final zl0.f f143938n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.quic.performance.a> f143939o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Provider<C43696c> f143940p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.interceptor.K f143941q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Provider<CookieJar> f143942r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final C30176s1 f143943s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.remote.interceptor.T0> f143944t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final tQ0.b f143945u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.remote.interceptor.E> f143946v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final u40.f f143947w;

    /* compiled from: ApiModule_ProvideOkHttpClientWithoutCronetFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/F0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public F0(@Y61.k B0 b02, @Y61.k com.avito.android.K1 k12, @Y61.k com.avito.android.S s5, @Y61.k C30254z2 c30254z2, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k C30186t0 c30186t0, @Y61.k Provider provider4, @Y61.k Provider provider5, @Y61.k Provider provider6, @Y61.k Provider provider7, @Y61.k Provider provider8, @Y61.k Provider provider9, @Y61.k zl0.f fVar, @Y61.k Provider provider10, @Y61.k Provider provider11, @Y61.k com.avito.android.remote.interceptor.K k13, @Y61.k Provider provider12, @Y61.k C30176s1 c30176s1, @Y61.k Provider provider13, @Y61.k tQ0.b bVar, @Y61.k Provider provider14, @Y61.k u40.f fVar2) {
        this.f143925a = k12;
        this.f143926b = s5;
        this.f143927c = c30254z2;
        this.f143928d = provider;
        this.f143929e = provider2;
        this.f143930f = provider3;
        this.f143931g = c30186t0;
        this.f143932h = provider4;
        this.f143933i = provider5;
        this.f143934j = provider6;
        this.f143935k = provider7;
        this.f143936l = provider8;
        this.f143937m = provider9;
        this.f143938n = fVar;
        this.f143939o = provider10;
        this.f143940p = provider11;
        this.f143941q = k13;
        this.f143942r = provider12;
        this.f143943s = c30176s1;
        this.f143944t = provider13;
        this.f143945u = bVar;
        this.f143946v = provider14;
        this.f143947w = fVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.I1 i12 = (com.avito.android.I1) this.f143925a.get();
        com.avito.android.P p12 = (com.avito.android.P) this.f143926b.get();
        this.f143927c.getClass();
        CertificatePinner certificatePinnerB = C30254z2.b();
        com.avito.android.remote.interceptor.J0 j02 = this.f143928d.get();
        InterfaceC34303q0 interfaceC34303q0 = this.f143929e.get();
        InterfaceC34313w interfaceC34313w = this.f143930f.get();
        com.avito.android.remote.interceptor.D d12 = (com.avito.android.remote.interceptor.D) this.f143931g.get();
        C34312v0 c34312v0 = this.f143932h.get();
        OkHttpClient okHttpClient = this.f143933i.get();
        com.avito.android.remote.interceptor.O0 o02 = this.f143934j.get();
        com.avito.android.remote.interceptor.Y0 y02 = this.f143935k.get();
        InterfaceC34278e interfaceC34278e = this.f143936l.get();
        C34283g0 c34283g0 = this.f143937m.get();
        zl0.d dVar = (zl0.d) this.f143938n.get();
        com.avito.android.quic.performance.a aVar = this.f143939o.get();
        C43696c c43696c = this.f143940p.get();
        com.avito.android.remote.interceptor.J j12 = (com.avito.android.remote.interceptor.J) this.f143941q.get();
        CookieJar cookieJar = this.f143942r.get();
        InterfaceC35940s3 interfaceC35940s3 = (InterfaceC35940s3) this.f143943s.get();
        com.avito.android.remote.interceptor.T0 t02 = this.f143944t.get();
        com.avito.android.zstd.i iVar = (com.avito.android.zstd.i) this.f143945u.get();
        com.avito.android.remote.interceptor.E e12 = this.f143946v.get();
        com.avito.android.offlinization.t tVar = (com.avito.android.offlinization.t) this.f143947w.get();
        f143924x.getClass();
        OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
        builderNewBuilder.eventListener(aVar);
        builderNewBuilder.interceptors().clear();
        OkHttpClient.Builder builderAddNetworkInterceptor = builderNewBuilder.addInterceptor(j02).addInterceptor(t02).addInterceptor(e12).addInterceptor(interfaceC34303q0).addInterceptor(y02).addInterceptor(interfaceC34278e).addInterceptor(c34312v0).addInterceptor(o02).addInterceptor(c34283g0).addInterceptor(iVar).addInterceptor(tVar).addNetworkInterceptor(d12);
        kotlin.reflect.n<Object>[] nVarArr = com.avito.android.P.f67370w0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        if (((Boolean) p12.f67398b.a().invoke()).booleanValue()) {
            builderAddNetworkInterceptor.addInterceptor(c43696c);
        }
        kotlin.reflect.n<Object> nVar2 = com.avito.android.I1.f67278k0[20];
        if (((Boolean) i12.f67334u.a().getValue()).booleanValue()) {
            builderNewBuilder.addInterceptor(dVar);
        }
        builderNewBuilder.cookieJar(cookieJar);
        kotlin.reflect.n<Object> nVar3 = nVarArr[26];
        if (((Boolean) p12.f67432s.a().getValue()).booleanValue()) {
            builderNewBuilder.certificatePinner(certificatePinnerB);
            builderNewBuilder.addInterceptor(interfaceC34313w);
        }
        interfaceC35940s3.a();
        builderNewBuilder.addInterceptor(j12);
        OkHttpClient okHttpClientBuild = builderNewBuilder.build();
        dagger.internal.t.b(okHttpClientBuild, "Cannot return null from a non-@Nullable @Provides method");
        return okHttpClientBuild;
    }
}
