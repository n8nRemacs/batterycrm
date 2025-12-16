package com.avito.android.cpx_promo.impl.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoInternalAction;
import com.avito.android.cpx_promo.impl.mvi.entity.CpxPromoState;
import es.InterfaceC40150a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpxPromoFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/a;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoInternalAction;", "Lcom/avito/android/cpx_promo/impl/mvi/entity/CpxPromoState;", "Les/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class p extends N implements Y41.l<com.avito.android.arch.mvi.q<com.avito.android.cpx_promo.impl.mvi.entity.a, CpxPromoInternalAction, CpxPromoState, InterfaceC40150a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f127233l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f127234m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f127235n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u f127236o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ s f127237p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, k kVar, ScreenPerformanceTracker screenPerformanceTracker, u uVar, s sVar) {
        super(1);
        this.f127233l = nVar;
        this.f127234m = kVar;
        this.f127235n = screenPerformanceTracker;
        this.f127236o = uVar;
        this.f127237p = sVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<com.avito.android.cpx_promo.impl.mvi.entity.a, CpxPromoInternalAction, CpxPromoState, InterfaceC40150a> qVar) {
        com.avito.android.arch.mvi.q<com.avito.android.cpx_promo.impl.mvi.entity.a, CpxPromoInternalAction, CpxPromoState, InterfaceC40150a> qVar2 = qVar;
        qVar2.f92008d = this.f127233l;
        qVar2.f92009e = this.f127234m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f127235n, this.f127236o);
        qVar2.f92010f = this.f127237p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
