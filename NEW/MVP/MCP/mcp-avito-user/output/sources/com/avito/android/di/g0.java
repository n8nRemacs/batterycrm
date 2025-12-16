package com.avito.android.di;

import com.avito.android.serp.adapter.n1;
import com.avito.android.serp.adapter.o1;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ViewedAdvertsModule_ProvideViewedStatusResolverFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/g0;", "Ldagger/internal/h;", "Lcom/avito/android/serp/adapter/n1;", "a", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g0 implements dagger.internal.h<n1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f143791b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.advert.viewed.d> f143792a;

    /* compiled from: ViewedAdvertsModule_ProvideViewedStatusResolverFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/g0$a;", "", "<init>", "()V", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public g0(@Y61.k Provider<com.avito.android.advert.viewed.d> provider) {
        this.f143792a = provider;
    }

    @X41.n
    @Y61.k
    public static final g0 a(@Y61.k Provider<com.avito.android.advert.viewed.d> provider) {
        f143791b.getClass();
        return new g0(provider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert.viewed.d dVar = this.f143792a.get();
        f143791b.getClass();
        int i12 = d0.f143781a;
        return new o1(dVar);
    }
}
