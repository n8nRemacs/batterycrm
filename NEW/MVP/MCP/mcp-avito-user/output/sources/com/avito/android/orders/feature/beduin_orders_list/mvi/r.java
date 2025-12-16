package com.avito.android.orders.feature.beduin_orders_list.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.orders.feature.beduin_orders_list.mvi.entity.BeduinOrdersInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinOrdersFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LZ40/a;", "Lcom/avito/android/orders/feature/beduin_orders_list/mvi/entity/BeduinOrdersInternalAction;", "LZ40/c;", "LZ40/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class r extends N implements Y41.l<com.avito.android.arch.mvi.q<Z40.a, BeduinOrdersInternalAction, Z40.c, Z40.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f210156l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C32944a f210157m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f210158n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w f210159o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u f210160p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, C32944a c32944a, ScreenPerformanceTracker screenPerformanceTracker, w wVar, u uVar) {
        super(1);
        this.f210156l = pVar;
        this.f210157m = c32944a;
        this.f210158n = screenPerformanceTracker;
        this.f210159o = wVar;
        this.f210160p = uVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<Z40.a, BeduinOrdersInternalAction, Z40.c, Z40.b> qVar) {
        com.avito.android.arch.mvi.q<Z40.a, BeduinOrdersInternalAction, Z40.c, Z40.b> qVar2 = qVar;
        qVar2.f92008d = this.f210156l;
        qVar2.f92009e = this.f210157m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f210158n, this.f210159o);
        qVar2.f92010f = this.f210160p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
