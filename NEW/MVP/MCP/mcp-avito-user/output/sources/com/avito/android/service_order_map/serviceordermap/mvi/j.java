package com.avito.android.service_order_map.serviceordermap.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapState;
import dagger.internal.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceOrderMapFeatureBuilder_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/j;", "Ldagger/internal/h;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/i;", "a", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f278808f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f278809a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f278810b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l f278811c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n f278812d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final u f278813e;

    /* compiled from: ServiceOrderMapFeatureBuilder_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/mvi/j$a;", "", "<init>", "()V", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(@Y61.k g gVar, @Y61.k e eVar, @Y61.k l lVar, @Y61.k n nVar, @Y61.k u uVar) {
        this.f278809a = gVar;
        this.f278810b = eVar;
        this.f278811c = lVar;
        this.f278812d = nVar;
        this.f278813e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f278809a.get();
        com.avito.android.service_order_map.serviceordermap.mvi.a aVar = (com.avito.android.service_order_map.serviceordermap.mvi.a) this.f278810b.get();
        this.f278811c.getClass();
        k kVar = new k();
        this.f278812d.getClass();
        m mVar = new m();
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f278813e.get();
        f278808f.getClass();
        ServiceOrderMapState.f278772k.getClass();
        return new i("ServiceOrderMap", ServiceOrderMapState.f278773l, new h(fVar, aVar, screenPerformanceTracker, mVar, kVar));
    }
}
