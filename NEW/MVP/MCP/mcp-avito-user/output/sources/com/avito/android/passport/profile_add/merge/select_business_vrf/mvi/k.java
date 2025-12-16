package com.avito.android.passport.profile_add.merge.select_business_vrf.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.profile_add.merge.select_business_vrf.mvi.entity.SelectBusinessVrfInternalAction;
import g60.InterfaceC40537a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectBusinessVrfFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lg60/a;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/mvi/entity/SelectBusinessVrfInternalAction;", "Lg60/c;", "Lg60/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC40537a, SelectBusinessVrfInternalAction, g60.c, g60.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f213468l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f213469m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f213470n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f213471o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f213472p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, p pVar, n nVar) {
        super(1);
        this.f213468l = iVar;
        this.f213469m = aVar;
        this.f213470n = screenPerformanceTracker;
        this.f213471o = pVar;
        this.f213472p = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC40537a, SelectBusinessVrfInternalAction, g60.c, g60.b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC40537a, SelectBusinessVrfInternalAction, g60.c, g60.b> qVar2 = qVar;
        qVar2.f92008d = this.f213468l;
        qVar2.f92009e = this.f213469m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f213470n, this.f213471o);
        qVar2.f92010f = this.f213472p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
