package com.avito.android.str_seller_orders.strsellerorders.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersInternalAction;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.StrSellerOrdersState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import yz0.InterfaceC50328b;
import yz0.InterfaceC50329c;

/* compiled from: StrSellerOrdersFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lyz0/b;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersInternalAction;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersState;", "Lyz0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class l extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC50328b, StrSellerOrdersInternalAction, StrSellerOrdersState, InterfaceC50329c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f290049l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f290050m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f290051n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f290052o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o f290053p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, q qVar, o oVar) {
        super(1);
        this.f290049l = jVar;
        this.f290050m = aVar;
        this.f290051n = screenPerformanceTracker;
        this.f290052o = qVar;
        this.f290053p = oVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC50328b, StrSellerOrdersInternalAction, StrSellerOrdersState, InterfaceC50329c> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC50328b, StrSellerOrdersInternalAction, StrSellerOrdersState, InterfaceC50329c> qVar2 = qVar;
        qVar2.f92008d = this.f290049l;
        qVar2.f92009e = this.f290050m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f290051n, this.f290052o);
        qVar2.f92010f = this.f290053p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
