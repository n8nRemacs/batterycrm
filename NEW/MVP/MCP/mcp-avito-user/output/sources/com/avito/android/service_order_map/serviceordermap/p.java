package com.avito.android.service_order_map.serviceordermap;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceOrderMapViewModel_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/p;", "Ldagger/internal/h;", "Lcom/avito/android/service_order_map/serviceordermap/o;", "a", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f278816b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_order_map.serviceordermap.mvi.j f278817a;

    /* compiled from: ServiceOrderMapViewModel_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/p$a;", "", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public p(@Y61.k com.avito.android.service_order_map.serviceordermap.mvi.j jVar) {
        this.f278817a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.service_order_map.serviceordermap.mvi.i iVar = (com.avito.android.service_order_map.serviceordermap.mvi.i) this.f278817a.get();
        f278816b.getClass();
        return new o(iVar, null, 2, null);
    }
}
