package com.avito.android.di;

import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ViewedAdvertsModule_ProvideViewedAdvertsInteractorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/e0;", "Ldagger/internal/h;", "Lcom/avito/android/advert/viewed/d;", "a", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e0 implements dagger.internal.h<com.avito.android.advert.viewed.d> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f143782d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f143783a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f143784b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f143785c;

    /* compiled from: ViewedAdvertsModule_ProvideViewedAdvertsInteractorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/e0$a;", "", "<init>", "()V", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e0(@Y61.k dagger.internal.u uVar, @Y61.k dagger.internal.u uVar2, @Y61.k Provider provider) {
        this.f143783a = uVar;
        this.f143784b = provider;
        this.f143785c = uVar2;
    }

    @X41.n
    @Y61.k
    public static final e0 a(@Y61.k dagger.internal.u uVar, @Y61.k dagger.internal.u uVar2, @Y61.k Provider provider) {
        f143782d.getClass();
        return new e0(uVar, uVar2, provider);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert.viewed.persistance.j jVar = (com.avito.android.advert.viewed.persistance.j) this.f143783a.get();
        R0 r02 = this.f143784b.get();
        com.avito.android.advert.viewed.a aVar = (com.avito.android.advert.viewed.a) this.f143785c.get();
        f143782d.getClass();
        int i12 = d0.f143781a;
        return new com.avito.android.advert.viewed.e(jVar, r02, aVar);
    }
}
