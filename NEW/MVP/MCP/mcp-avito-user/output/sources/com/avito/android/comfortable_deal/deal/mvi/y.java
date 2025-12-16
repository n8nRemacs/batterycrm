package com.avito.android.comfortable_deal.deal.mvi;

import Ep.InterfaceC13517a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DealFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LEp/a;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "LEp/c;", "LEp/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class y extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC13517a, DealInternalAction, Ep.c, Ep.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f121742l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C29453a f121743m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f121744n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ D f121745o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B f121746p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w wVar, C29453a c29453a, ScreenPerformanceTracker screenPerformanceTracker, D d12, B b12) {
        super(1);
        this.f121742l = wVar;
        this.f121743m = c29453a;
        this.f121744n = screenPerformanceTracker;
        this.f121745o = d12;
        this.f121746p = b12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC13517a, DealInternalAction, Ep.c, Ep.b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC13517a, DealInternalAction, Ep.c, Ep.b> qVar2 = qVar;
        qVar2.f92008d = this.f121742l;
        qVar2.f92009e = this.f121743m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f121744n, this.f121745o);
        qVar2.f92010f = this.f121746p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
