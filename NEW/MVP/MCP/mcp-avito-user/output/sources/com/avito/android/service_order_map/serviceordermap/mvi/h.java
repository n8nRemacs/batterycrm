package com.avito.android.service_order_map.serviceordermap.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import vu0.InterfaceC49384a;

/* compiled from: ServiceOrderMapFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/a;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapInternalAction;", "Lcom/avito/android/service_order_map/serviceordermap/mvi/entity/ServiceOrderMapState;", "Lvu0/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h extends N implements Y41.l<q<com.avito.android.service_order_map.serviceordermap.mvi.entity.a, ServiceOrderMapInternalAction, ServiceOrderMapState, InterfaceC49384a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f278803l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f278804m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f278805n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f278806o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f278807p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f278803l = fVar;
        this.f278804m = aVar;
        this.f278805n = screenPerformanceTracker;
        this.f278806o = mVar;
        this.f278807p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<com.avito.android.service_order_map.serviceordermap.mvi.entity.a, ServiceOrderMapInternalAction, ServiceOrderMapState, InterfaceC49384a> qVar) {
        q<com.avito.android.service_order_map.serviceordermap.mvi.entity.a, ServiceOrderMapInternalAction, ServiceOrderMapState, InterfaceC49384a> qVar2 = qVar;
        qVar2.f92008d = this.f278803l;
        qVar2.f92009e = this.f278804m;
        qVar2.f92011g = new o(this.f278805n, this.f278806o);
        qVar2.f92010f = this.f278807p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
