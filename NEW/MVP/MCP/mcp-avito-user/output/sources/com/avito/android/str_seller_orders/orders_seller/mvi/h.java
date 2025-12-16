package com.avito.android.str_seller_orders.orders_seller.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders.orders_seller.mvi.entity.StrSellerOrdersState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import tz0.InterfaceC48745a;
import tz0.InterfaceC48746b;

/* compiled from: StrSellerOrdersFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ltz0/a;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersInternalAction;", "Lcom/avito/android/str_seller_orders/orders_seller/mvi/entity/StrSellerOrdersState;", "Ltz0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC48745a, StrSellerOrdersInternalAction, StrSellerOrdersState, InterfaceC48746b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f289630l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f289631m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f289632n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f289633o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f289634p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f289630l = fVar;
        this.f289631m = dVar;
        this.f289632n = screenPerformanceTracker;
        this.f289633o = nVar;
        this.f289634p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC48745a, StrSellerOrdersInternalAction, StrSellerOrdersState, InterfaceC48746b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC48745a, StrSellerOrdersInternalAction, StrSellerOrdersState, InterfaceC48746b> qVar2 = qVar;
        qVar2.f92008d = this.f289630l;
        qVar2.f92009e = this.f289631m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f289632n, this.f289633o);
        qVar2.f92010f = this.f289634p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
