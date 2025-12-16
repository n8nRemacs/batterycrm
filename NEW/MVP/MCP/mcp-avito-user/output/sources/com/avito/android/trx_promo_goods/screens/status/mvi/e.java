package com.avito.android.trx_promo_goods.screens.status.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.trx_promo_goods.screens.status.mvi.entity.TrxPromoGoodsStatusInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrxPromoGoodsStatusFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LPF0/a;", "Lcom/avito/android/trx_promo_goods/screens/status/mvi/entity/TrxPromoGoodsStatusInternalAction;", "LPF0/c;", "LPF0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements l<q<PF0.a, TrxPromoGoodsStatusInternalAction, PF0.c, PF0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f303840l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f303841m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f303842n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f303843o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f303844p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f303840l = cVar;
        this.f303841m = aVar;
        this.f303842n = screenPerformanceTracker;
        this.f303843o = jVar;
        this.f303844p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<PF0.a, TrxPromoGoodsStatusInternalAction, PF0.c, PF0.b> qVar) {
        q<PF0.a, TrxPromoGoodsStatusInternalAction, PF0.c, PF0.b> qVar2 = qVar;
        qVar2.f92008d = this.f303840l;
        qVar2.f92009e = this.f303841m;
        qVar2.f92011g = new o(this.f303842n, this.f303843o);
        qVar2.f92010f = this.f303844p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
