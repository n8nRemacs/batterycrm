package ru.avito.messenger.internal.di;

import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import ru.avito.messenger.internal.C47747c;

/* compiled from: ImageUploadModule_ProvideImageUploadOkHttpClientFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: ru.avito.messenger.internal.di.q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47815q implements dagger.internal.h<OkHttpClient> {

    /* renamed from: a, reason: collision with root package name */
    public final C47813o f431662a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<OkHttpClient> f431663b;

    public C47815q(C47813o c47813o, Provider<OkHttpClient> provider) {
        this.f431662a = c47813o;
        this.f431663b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        OkHttpClient okHttpClient = this.f431663b.get();
        C47813o c47813o = this.f431662a;
        c47813o.getClass();
        OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
        C47747c c47747c = c47813o.f431656a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j12 = c47747c.f431239e;
        OkHttpClient okHttpClientBuild = builderNewBuilder.readTimeout(j12, timeUnit).writeTimeout(j12, timeUnit).connectTimeout(j12, timeUnit).build();
        dagger.internal.t.d(okHttpClientBuild);
        return okHttpClientBuild;
    }
}
