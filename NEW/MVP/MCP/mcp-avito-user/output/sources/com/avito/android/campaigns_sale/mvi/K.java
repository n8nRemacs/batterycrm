package com.avito.android.campaigns_sale.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import im.InterfaceC41424a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CampaignsSaleFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lim/a;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleState;", "Lim/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC41424a, CampaignsSaleInternalAction, CampaignsSaleState, im.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f114100l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f114101m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f114102n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ P f114103o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f114104p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(I i12, w wVar, ScreenPerformanceTracker screenPerformanceTracker, P p12, N n12) {
        super(1);
        this.f114100l = i12;
        this.f114101m = wVar;
        this.f114102n = screenPerformanceTracker;
        this.f114103o = p12;
        this.f114104p = n12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC41424a, CampaignsSaleInternalAction, CampaignsSaleState, im.b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC41424a, CampaignsSaleInternalAction, CampaignsSaleState, im.b> qVar2 = qVar;
        qVar2.f92008d = this.f114100l;
        qVar2.f92009e = this.f114101m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f114102n, this.f114103o);
        qVar2.f92010f = this.f114104p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
