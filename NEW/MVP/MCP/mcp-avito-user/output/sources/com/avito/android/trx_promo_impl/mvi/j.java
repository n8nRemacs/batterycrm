package com.avito.android.trx_promo_impl.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TrxPromoFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LZF0/a;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "LZF0/d;", "LZF0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class j extends N implements Y41.l<q<ZF0.a, TrxPromoInternalAction, ZF0.d, ZF0.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f304357l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f304358m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f304359n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f304360o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f304361p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, f fVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f304357l = hVar;
        this.f304358m = fVar;
        this.f304359n = screenPerformanceTracker;
        this.f304360o = oVar;
        this.f304361p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<ZF0.a, TrxPromoInternalAction, ZF0.d, ZF0.c> qVar) {
        q<ZF0.a, TrxPromoInternalAction, ZF0.d, ZF0.c> qVar2 = qVar;
        qVar2.f92008d = this.f304357l;
        qVar2.f92009e = this.f304358m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f304359n, this.f304360o);
        qVar2.f92010f = this.f304361p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
