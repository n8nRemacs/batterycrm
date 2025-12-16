package com.avito.android.tariff.cpa.info.mvi;

import bB0.C25490c;
import bB0.InterfaceC25488a;
import bB0.InterfaceC25489b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.tariff.cpa.info.mvi.entity.CpaInfoInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpaInfoFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LbB0/a;", "Lcom/avito/android/tariff/cpa/info/mvi/entity/CpaInfoInternalAction;", "LbB0/c;", "LbB0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class i extends N implements Y41.l<q<InterfaceC25488a, CpaInfoInternalAction, C25490c, InterfaceC25489b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f294772l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f294773m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f294774n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f294775o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f294776p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f294772l = gVar;
        this.f294773m = cVar;
        this.f294774n = screenPerformanceTracker;
        this.f294775o = nVar;
        this.f294776p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC25488a, CpaInfoInternalAction, C25490c, InterfaceC25489b> qVar) {
        q<InterfaceC25488a, CpaInfoInternalAction, C25490c, InterfaceC25489b> qVar2 = qVar;
        qVar2.f92008d = this.f294772l;
        qVar2.f92009e = this.f294773m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f294774n, this.f294775o);
        qVar2.f92010f = this.f294776p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
