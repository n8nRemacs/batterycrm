package com.avito.android.str_seller_orders.strsellerordersrange.mvi;

import Fz0.InterfaceC13858a;
import Fz0.InterfaceC13859b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeInternalAction;
import com.avito.android.str_seller_orders.strsellerordersrange.mvi.entity.StrSellerOrdersRangeState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrSellerOrdersRangeFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LFz0/a;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeInternalAction;", "Lcom/avito/android/str_seller_orders/strsellerordersrange/mvi/entity/StrSellerOrdersRangeState;", "LFz0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC13858a, StrSellerOrdersRangeInternalAction, StrSellerOrdersRangeState, InterfaceC13859b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f290304l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f290305m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f290306n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f290307o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f290308p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, f fVar, k kVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar) {
        super(1);
        this.f290304l = dVar;
        this.f290305m = fVar;
        this.f290306n = kVar;
        this.f290307o = screenPerformanceTracker;
        this.f290308p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC13858a, StrSellerOrdersRangeInternalAction, StrSellerOrdersRangeState, InterfaceC13859b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC13858a, StrSellerOrdersRangeInternalAction, StrSellerOrdersRangeState, InterfaceC13859b> qVar2 = qVar;
        qVar2.f92009e = this.f290304l;
        qVar2.f92008d = this.f290305m;
        qVar2.f92010f = this.f290306n;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f290307o, this.f290308p);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
