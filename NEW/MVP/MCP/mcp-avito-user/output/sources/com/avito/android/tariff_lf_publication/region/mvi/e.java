package com.avito.android.tariff_lf_publication.region.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffLfPublicationRegionFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LVD0/a;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction;", "LVD0/c;", "LVD0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements l<q<VD0.a, TariffLfPublicationRegionInternalAction, VD0.c, VD0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f301097l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f301098m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f301099n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f301100o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f301101p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f301097l = cVar;
        this.f301098m = aVar;
        this.f301099n = screenPerformanceTracker;
        this.f301100o = jVar;
        this.f301101p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<VD0.a, TariffLfPublicationRegionInternalAction, VD0.c, VD0.b> qVar) {
        q<VD0.a, TariffLfPublicationRegionInternalAction, VD0.c, VD0.b> qVar2 = qVar;
        qVar2.f92008d = this.f301097l;
        qVar2.f92009e = this.f301098m;
        qVar2.f92011g = new o(this.f301099n, this.f301100o);
        qVar2.f92010f = this.f301101p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
