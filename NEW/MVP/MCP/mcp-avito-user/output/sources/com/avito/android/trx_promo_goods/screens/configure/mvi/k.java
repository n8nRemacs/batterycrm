package com.avito.android.trx_promo_goods.screens.configure.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrxPromoGoodsConfigureFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LMF0/a;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction;", "LMF0/d;", "LMF0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<MF0.a, TrxPromoGoodsConfigureInternalAction, MF0.d, MF0.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f303604l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f303605m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f303606n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f303607o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f303608p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, f fVar, ScreenPerformanceTracker screenPerformanceTracker, p pVar, n nVar) {
        super(1);
        this.f303604l = iVar;
        this.f303605m = fVar;
        this.f303606n = screenPerformanceTracker;
        this.f303607o = pVar;
        this.f303608p = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<MF0.a, TrxPromoGoodsConfigureInternalAction, MF0.d, MF0.c> qVar) {
        com.avito.android.arch.mvi.q<MF0.a, TrxPromoGoodsConfigureInternalAction, MF0.d, MF0.c> qVar2 = qVar;
        qVar2.f92008d = this.f303604l;
        qVar2.f92009e = this.f303605m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f303606n, this.f303607o);
        qVar2.f92010f = this.f303608p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
