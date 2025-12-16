package com.avito.android.developments_agency_search.screen.deal_cabinet.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.developments_agency_search.screen.deal_cabinet.mvi.entity.DealCabinetInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DealCabinetFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lzw/b;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/mvi/entity/DealCabinetInternalAction;", "Lzw/d;", "Lzw/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class h extends N implements Y41.l<com.avito.android.arch.mvi.q<zw.b, DealCabinetInternalAction, zw.d, zw.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f137115l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f137116m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f137117n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f137118o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o f137119p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, q qVar, o oVar) {
        super(1);
        this.f137115l = fVar;
        this.f137116m = aVar;
        this.f137117n = screenPerformanceTracker;
        this.f137118o = qVar;
        this.f137119p = oVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<zw.b, DealCabinetInternalAction, zw.d, zw.c> qVar) {
        com.avito.android.arch.mvi.q<zw.b, DealCabinetInternalAction, zw.d, zw.c> qVar2 = qVar;
        qVar2.f92008d = this.f137115l;
        qVar2.f92009e = this.f137116m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f137117n, this.f137118o);
        qVar2.f92010f = this.f137119p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
