package com.avito.android.service_order_map.serviceordermap.domain;

import Y61.k;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CurrentLocationUseCase_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/domain/b;", "Ldagger/internal/h;", "Lcom/avito/android/service_order_map/serviceordermap/domain/a;", "a", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<com.avito.android.service_order_map.serviceordermap.domain.a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f278633c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.geo_common.interactor.g> f278634a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<R0> f278635b;

    /* compiled from: CurrentLocationUseCase_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/domain/b$a;", "", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k Provider<com.avito.android.geo_common.interactor.g> provider, @k Provider<R0> provider2) {
        this.f278634a = provider;
        this.f278635b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.geo_common.interactor.g gVar = this.f278634a.get();
        R0 r02 = this.f278635b.get();
        f278633c.getClass();
        return new com.avito.android.service_order_map.serviceordermap.domain.a(gVar, r02);
    }
}
