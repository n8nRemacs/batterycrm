package com.avito.android.service_orders.mvi;

import Mu0.InterfaceC14531a;
import Mu0.InterfaceC14532b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListInternalAction;
import com.avito.android.service_orders.mvi.entity.ServiceOrdersListState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceOrdersListFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LMu0/a;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListInternalAction;", "Lcom/avito/android/service_orders/mvi/entity/ServiceOrdersListState;", "LMu0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class y extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC14531a, ServiceOrdersListInternalAction, ServiceOrdersListState, InterfaceC14532b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f279674l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f279675m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f279676n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E f279677o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B f279678p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w wVar, s sVar, ScreenPerformanceTracker screenPerformanceTracker, E e12, B b12) {
        super(1);
        this.f279674l = wVar;
        this.f279675m = sVar;
        this.f279676n = screenPerformanceTracker;
        this.f279677o = e12;
        this.f279678p = b12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC14531a, ServiceOrdersListInternalAction, ServiceOrdersListState, InterfaceC14532b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC14531a, ServiceOrdersListInternalAction, ServiceOrdersListState, InterfaceC14532b> qVar2 = qVar;
        qVar2.f92008d = this.f279674l;
        qVar2.f92009e = this.f279675m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f279676n, this.f279677o);
        qVar2.f92010f = this.f279678p;
        qVar2.f92014j = new com.avito.android.arch.mvi.r(false, true, 1, null);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
