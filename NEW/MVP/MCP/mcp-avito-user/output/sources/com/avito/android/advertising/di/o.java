package com.avito.android.advertising.di;

import com.avito.android.C30828i;
import com.avito.android.remote.interceptor.U0;
import com.google.gson.Gson;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.text.C43066x;
import okhttp3.OkHttpClient;
import retrofit2.z;
import xb.C49917c;
import xb.InterfaceC49915a;

/* compiled from: BuzzoolaNetworkModule_ProvideBuzzoolaApiServiceFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class o implements dagger.internal.h<InterfaceC49915a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f87815a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C30828i> f87816b;

    public o(dagger.internal.u uVar, Provider provider) {
        this.f87815a = uVar;
        this.f87816b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        U0 u02 = (U0) this.f87815a.get();
        C30828i c30828i = this.f87816b.get();
        n.f87814a.getClass();
        InterfaceC49915a.C12874a c12874a = InterfaceC49915a.f442566a;
        kotlin.reflect.n<Object> nVar = C30828i.f164256k[4];
        boolean zBooleanValue = ((Boolean) c30828i.f164261f.a().invoke()).booleanValue();
        c12874a.getClass();
        z.b bVar = new z.b();
        bVar.c("https://exchange.buzzoola.com");
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        String f253555a = u02.getF253555a();
        if (f253555a != null && !C43066x.K(f253555a)) {
            builder.addInterceptor(new C49917c(u02, f253555a));
        }
        OkHttpClient okHttpClientBuild = builder.callTimeout(10L, TimeUnit.SECONDS).retryOnConnectionFailure(zBooleanValue).build();
        Objects.requireNonNull(okHttpClientBuild, "client == null");
        bVar.f430133b = okHttpClientBuild;
        bVar.b(retrofit2.converter.gson.a.d(new Gson()));
        bVar.a(hu.akarnokd.rxjava3.retrofit.g.a());
        return (InterfaceC49915a) bVar.e().b(InterfaceC49915a.class);
    }
}
