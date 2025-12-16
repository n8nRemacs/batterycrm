package com.avito.android.service_order_map.serviceordermap.mvi;

import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceOrderMapActor_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/e;", "Ldagger/internal/h;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/a;", "a", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<com.avito.android.service_order_map.serviceordermap.mvi.a> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f278750d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.service_order_map.serviceordermap.domain.f> f278751a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.service_order_map.serviceordermap.domain.c> f278752b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u f278753c;

    /* compiled from: ServiceOrderMapActor_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/e$a;", "", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public e(@Y61.k u uVar, @Y61.k Provider provider, @Y61.k Provider provider2) {
        this.f278751a = provider;
        this.f278752b = provider2;
        this.f278753c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service_order_map.serviceordermap.domain.f fVar = this.f278751a.get();
        com.avito.android.service_order_map.serviceordermap.domain.c cVar = this.f278752b.get();
        com.avito.android.service_order_map.serviceordermap.domain.i iVar = (com.avito.android.service_order_map.serviceordermap.domain.i) this.f278753c.get();
        f278750d.getClass();
        return new com.avito.android.service_order_map.serviceordermap.mvi.a(fVar, cVar, iVar);
    }
}
