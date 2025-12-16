package com.avito.android.cart_sheet_after_adding.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cart_sheet_after_adding.mvi.entity.CartSheetAfterAddingInternalAction;
import gn.InterfaceC40710b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CartSheetAfterAddingFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lgn/b;", "Lcom/avito/android/cart_sheet_after_adding/mvi/entity/CartSheetAfterAddingInternalAction;", "Lgn/e;", "Lgn/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC40710b, CartSheetAfterAddingInternalAction, gn.e, gn.d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f115400l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f115401m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f115402n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f115403o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f115404p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f115400l = gVar;
        this.f115401m = eVar;
        this.f115402n = screenPerformanceTracker;
        this.f115403o = nVar;
        this.f115404p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC40710b, CartSheetAfterAddingInternalAction, gn.e, gn.d> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC40710b, CartSheetAfterAddingInternalAction, gn.e, gn.d> qVar2 = qVar;
        qVar2.f92008d = this.f115400l;
        qVar2.f92009e = this.f115401m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f115402n, this.f115403o);
        qVar2.f92010f = this.f115404p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        qVar2.f92014j = new com.avito.android.arch.mvi.r(false, true, 1, null);
        return G0.f406611a;
    }
}
