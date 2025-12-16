package com.avito.android.delivery_tarifikator.presentation.region_screen.mvi;

import com.avito.android.delivery_tarifikator.domain.D;
import com.avito.android.delivery_tarifikator.domain.p0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TarifikatorRegionActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/l;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/a;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements dagger.internal.h<com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.a> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f135845e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.delivery_tarifikator.presentation.region_screen.domain.a> f135846a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<p0> f135847b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<D> f135848c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final cv.e f135849d;

    /* compiled from: TarifikatorRegionActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/l$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public l(@Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k cv.e eVar) {
        this.f135846a = provider;
        this.f135847b = provider2;
        this.f135848c = provider3;
        this.f135849d = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.delivery_tarifikator.presentation.region_screen.domain.a aVar = this.f135846a.get();
        p0 p0Var = this.f135847b.get();
        D d12 = this.f135848c.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = (com.avito.android.deeplink_handler.handler.composite.a) this.f135849d.get();
        f135845e.getClass();
        return new com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.a(aVar, p0Var, d12, aVar2);
    }
}
