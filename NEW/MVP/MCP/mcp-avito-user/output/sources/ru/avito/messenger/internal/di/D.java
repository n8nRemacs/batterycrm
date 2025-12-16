package ru.avito.messenger.internal.di;

import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import ru.avito.messenger.internal.C47745a;

/* compiled from: OkHttpModule_ProvideOkHttpClientFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes9.dex */
public final class D implements dagger.internal.h<OkHttpClient> {

    /* renamed from: a, reason: collision with root package name */
    public final C f431550a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f431551b;

    public D(C c12, dagger.internal.u uVar) {
        this.f431550a = c12;
        this.f431551b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        OkHttpClient.Builder builder;
        C47745a c47745a = (C47745a) this.f431551b.get();
        OkHttpClient okHttpClient = this.f431550a.f431549a.get();
        if (okHttpClient == null || (builder = okHttpClient.newBuilder()) == null) {
            builder = new OkHttpClient.Builder();
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient okHttpClientBuild = builder.pingInterval(c47745a.f431214g, timeUnit).readTimeout(15000L, timeUnit).connectTimeout(15000L, timeUnit).writeTimeout(15000L, timeUnit).cookieJar(CookieJar.NO_COOKIES).build();
        dagger.internal.t.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
