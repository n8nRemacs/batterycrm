package com.avito.android.di.module;

import com.google.gson.Gson;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.OkHttpClient;
import retrofit2.z;

/* compiled from: TinkoffApiModule_ProvideTinkoffApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/V9;", "Ldagger/internal/h;", "Lcom/avito/android/remote/p1;", "a", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class V9 implements dagger.internal.h<com.avito.android.remote.p1> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f144162c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<OkHttpClient> f144163a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<Gson> f144164b;

    /* compiled from: TinkoffApiModule_ProvideTinkoffApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/V9$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public V9(@Y61.k Provider<OkHttpClient> provider, @Y61.k Provider<Gson> provider2) {
        this.f144163a = provider;
        this.f144164b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        OkHttpClient okHttpClient = this.f144163a.get();
        Gson gson = this.f144164b.get();
        f144162c.getClass();
        U9.f144152a.getClass();
        z.b bVar = new z.b();
        bVar.c("https://id.tinkoff.ru");
        bVar.a(hu.akarnokd.rxjava3.retrofit.g.a());
        bVar.b(retrofit2.converter.gson.a.d(gson));
        bVar.f430133b = okHttpClient;
        return (com.avito.android.remote.p1) bVar.e().b(com.avito.android.remote.p1.class);
    }
}
