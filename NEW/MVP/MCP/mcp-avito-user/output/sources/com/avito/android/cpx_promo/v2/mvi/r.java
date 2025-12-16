package com.avito.android.cpx_promo.v2.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ks.InterfaceC43492a;

/* compiled from: CpxPromoV2FeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/a;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State;", "Lks/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class r extends N implements Y41.l<com.avito.android.arch.mvi.q<com.avito.android.cpx_promo.v2.mvi.entity.a, CpxPromoV2InternalAction, CpxPromoV2State, InterfaceC43492a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f127768l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f127769m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f127770n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w f127771o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u f127772p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, m mVar, ScreenPerformanceTracker screenPerformanceTracker, w wVar, u uVar) {
        super(1);
        this.f127768l = pVar;
        this.f127769m = mVar;
        this.f127770n = screenPerformanceTracker;
        this.f127771o = wVar;
        this.f127772p = uVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<com.avito.android.cpx_promo.v2.mvi.entity.a, CpxPromoV2InternalAction, CpxPromoV2State, InterfaceC43492a> qVar) {
        com.avito.android.arch.mvi.q<com.avito.android.cpx_promo.v2.mvi.entity.a, CpxPromoV2InternalAction, CpxPromoV2State, InterfaceC43492a> qVar2 = qVar;
        qVar2.f92008d = this.f127768l;
        qVar2.f92009e = this.f127769m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f127770n, this.f127771o);
        qVar2.f92010f = this.f127772p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
