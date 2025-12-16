package com.avito.android.campaigns_sale_search.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CampaignsSaleSearchFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lum/b;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lum/d;", "Lum/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class o extends N implements Y41.l<com.avito.android.arch.mvi.q<um.b, CampaignsSaleSearchInternalAction, um.d, um.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f114780l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f114781m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f114782n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w f114783o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f114784p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, w wVar, r rVar) {
        super(1);
        this.f114780l = mVar;
        this.f114781m = aVar;
        this.f114782n = screenPerformanceTracker;
        this.f114783o = wVar;
        this.f114784p = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<um.b, CampaignsSaleSearchInternalAction, um.d, um.c> qVar) {
        com.avito.android.arch.mvi.q<um.b, CampaignsSaleSearchInternalAction, um.d, um.c> qVar2 = qVar;
        qVar2.f92008d = this.f114780l;
        qVar2.f92009e = this.f114781m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f114782n, this.f114783o);
        qVar2.f92010f = this.f114784p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
