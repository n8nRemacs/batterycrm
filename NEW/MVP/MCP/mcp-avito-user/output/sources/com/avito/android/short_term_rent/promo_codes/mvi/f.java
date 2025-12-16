package com.avito.android.short_term_rent.promo_codes.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.short_term_rent.promo_codes.mvi.entity.StrSoftBookingPromoCodesInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import nw0.InterfaceC44484a;
import nw0.InterfaceC44485b;

/* compiled from: StrSoftBookingPromoCodesFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lnw0/a;", "Lcom/avito/android/short_term_rent/promo_codes/mvi/entity/StrSoftBookingPromoCodesInternalAction;", "Lnw0/c;", "Lnw0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.l<q<InterfaceC44484a, StrSoftBookingPromoCodesInternalAction, nw0.c, InterfaceC44485b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f282472l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f282473m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f282474n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f282475o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f282476p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f282472l = dVar;
        this.f282473m = bVar;
        this.f282474n = screenPerformanceTracker;
        this.f282475o = kVar;
        this.f282476p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC44484a, StrSoftBookingPromoCodesInternalAction, nw0.c, InterfaceC44485b> qVar) {
        q<InterfaceC44484a, StrSoftBookingPromoCodesInternalAction, nw0.c, InterfaceC44485b> qVar2 = qVar;
        qVar2.f92008d = this.f282472l;
        qVar2.f92009e = this.f282473m;
        qVar2.f92011g = new o(this.f282474n, this.f282475o);
        qVar2.f92010f = this.f282476p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
