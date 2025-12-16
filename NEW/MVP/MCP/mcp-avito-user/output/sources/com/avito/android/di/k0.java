package com.avito.android.di;

import com.avito.android.di.module.C30247y6;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ViewedAdvertsStorageModule_ProvideViewedAdvertStorageFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/k0;", "Ldagger/internal/h;", "Lcom/avito/android/advert/viewed/persistance/j;", "a", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k0 implements dagger.internal.h<com.avito.android.advert.viewed.persistance.j> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f143803e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.advert.viewed.persistance.b> f143804a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30247y6 f143805b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f143806c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.server_time.f> f143807d;

    /* compiled from: ViewedAdvertsStorageModule_ProvideViewedAdvertStorageFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/k0$a;", "", "<init>", "()V", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public k0(@Y61.k h0 h0Var, @Y61.k Provider provider, @Y61.k C30247y6 c30247y6, @Y61.k Provider provider2, @Y61.k Provider provider3) {
        this.f143804a = provider;
        this.f143805b = c30247y6;
        this.f143806c = provider2;
        this.f143807d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.advert.viewed.persistance.b bVar = this.f143804a.get();
        wu.b bVar2 = (wu.b) this.f143805b.get();
        R0 r02 = this.f143806c.get();
        com.avito.android.server_time.f fVar = this.f143807d.get();
        f143803e.getClass();
        return new com.avito.android.advert.viewed.persistance.k(bVar, bVar2, r02, fVar);
    }
}
