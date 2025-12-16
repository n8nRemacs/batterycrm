package com.avito.android.retrofit;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RetrofitConverterFactoryErrorHandlingWrapper_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/Q;", "Ldagger/internal/h;", "Lcom/avito/android/retrofit/P;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Q implements dagger.internal.h<P> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f255115d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f255116a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.remote.analytics.B> f255117b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.e f255118c;

    /* compiled from: RetrofitConverterFactoryErrorHandlingWrapper_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/retrofit/Q$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public Q(@Y61.k dagger.internal.u uVar, @Y61.k Provider provider, @Y61.k com.avito.android.remote.error.e eVar) {
        this.f255116a = uVar;
        this.f255117b = provider;
        this.f255118c = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.remote.analytics.n nVar = (com.avito.android.remote.analytics.n) this.f255116a.get();
        com.avito.android.remote.analytics.B b12 = this.f255117b.get();
        com.avito.android.remote.error.a aVar = (com.avito.android.remote.error.a) this.f255118c.get();
        f255115d.getClass();
        return new P(nVar, b12, aVar);
    }
}
