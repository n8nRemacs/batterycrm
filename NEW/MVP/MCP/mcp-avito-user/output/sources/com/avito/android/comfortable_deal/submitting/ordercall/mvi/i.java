package com.avito.android.comfortable_deal.submitting.ordercall.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.comfortable_deal.submitting.ordercall.mvi.entity.OrderCallInternalAction;
import com.avito.android.comfortable_deal.submitting.ordercall.mvi.entity.OrderCallState;
import jq.InterfaceC42413a;
import jq.InterfaceC42414b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OrderCallFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ljq/a;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallInternalAction;", "Lcom/avito/android/comfortable_deal/submitting/ordercall/mvi/entity/OrderCallState;", "Ljq/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i extends N implements Y41.l<q<InterfaceC42413a, OrderCallInternalAction, OrderCallState, InterfaceC42414b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f123088l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f123089m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f123090n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f123091o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f123092p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, g gVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f123088l = dVar;
        this.f123089m = gVar;
        this.f123090n = screenPerformanceTracker;
        this.f123091o = nVar;
        this.f123092p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC42413a, OrderCallInternalAction, OrderCallState, InterfaceC42414b> qVar) {
        q<InterfaceC42413a, OrderCallInternalAction, OrderCallState, InterfaceC42414b> qVar2 = qVar;
        qVar2.f92009e = this.f123088l;
        qVar2.f92008d = this.f123089m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f123090n, this.f123091o);
        qVar2.f92010f = this.f123092p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
