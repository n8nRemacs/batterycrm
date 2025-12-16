package com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi;

import Y41.l;
import ab.InterfaceC19855a;
import ab.InterfaceC19856b;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIInternalAction;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIState;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailStatsMVIFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lab/a;", "Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/entity/AdvertDetailStatsMVIInternalAction;", "Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/entity/AdvertDetailStatsMVIState;", "Lab/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements l<q<InterfaceC19855a, AdvertDetailStatsMVIInternalAction, AdvertDetailStatsMVIState, InterfaceC19856b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f86097l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f86098m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f86099n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f86100o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f86101p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f86097l = cVar;
        this.f86098m = aVar;
        this.f86099n = screenPerformanceTracker;
        this.f86100o = jVar;
        this.f86101p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC19855a, AdvertDetailStatsMVIInternalAction, AdvertDetailStatsMVIState, InterfaceC19856b> qVar) {
        q<InterfaceC19855a, AdvertDetailStatsMVIInternalAction, AdvertDetailStatsMVIState, InterfaceC19856b> qVar2 = qVar;
        qVar2.f92008d = this.f86097l;
        qVar2.f92009e = this.f86098m;
        qVar2.f92011g = new o(this.f86099n, this.f86100o);
        qVar2.f92010f = this.f86101p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
