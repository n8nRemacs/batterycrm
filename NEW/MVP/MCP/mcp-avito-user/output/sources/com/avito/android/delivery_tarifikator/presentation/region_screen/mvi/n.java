package com.avito.android.delivery_tarifikator.presentation.region_screen.mvi;

import com.avito.android.delivery_tarifikator.domain.x0;
import com.avito.android.delivery_tarifikator.presentation.region_screen.RegionScreenParams;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TarifikatorRegionBootstrap_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/n;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/m;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f135861c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f135862a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<x0> f135863b;

    /* compiled from: TarifikatorRegionBootstrap_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/n$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public n(@Y61.k dagger.internal.l lVar, @Y61.k Provider provider) {
        this.f135862a = lVar;
        this.f135863b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        RegionScreenParams regionScreenParams = (RegionScreenParams) this.f135862a.f393949a;
        x0 x0Var = this.f135863b.get();
        f135861c.getClass();
        return new m(regionScreenParams, x0Var);
    }
}
