package com.avito.android.str_seller_orders.orders_filters.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.str_seller_orders.orders_filters.mvi.entity.StrOrdersFiltersInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import qz0.InterfaceC47467a;
import qz0.InterfaceC47468b;

/* compiled from: StrOrdersFiltersFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lqz0/a;", "Lcom/avito/android/str_seller_orders/orders_filters/mvi/entity/StrOrdersFiltersInternalAction;", "Lqz0/c;", "Lqz0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.l<q<InterfaceC47467a, StrOrdersFiltersInternalAction, qz0.c, InterfaceC47468b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f289196l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f289197m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f289198n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f289199o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f289200p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f289196l = dVar;
        this.f289197m = bVar;
        this.f289198n = screenPerformanceTracker;
        this.f289199o = lVar;
        this.f289200p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC47467a, StrOrdersFiltersInternalAction, qz0.c, InterfaceC47468b> qVar) {
        q<InterfaceC47467a, StrOrdersFiltersInternalAction, qz0.c, InterfaceC47468b> qVar2 = qVar;
        qVar2.f92008d = this.f289196l;
        qVar2.f92009e = this.f289197m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f289198n, this.f289199o);
        qVar2.f92010f = this.f289200p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
