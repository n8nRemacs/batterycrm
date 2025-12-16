package com.avito.android.delivery_tarifikator.presentation.region_screen.mvi;

import Xv.C17052c;
import Xv.InterfaceC17050a;
import Xv.InterfaceC17051b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TarifikatorRegionFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LXv/a;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "LXv/c;", "LXv/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class o extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC17050a, TarifikatorRegionInternalAction, C17052c, InterfaceC17051b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f135864l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f135865m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f135866n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f135867o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f135868p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, t tVar, r rVar) {
        super(1);
        this.f135864l = mVar;
        this.f135865m = aVar;
        this.f135866n = screenPerformanceTracker;
        this.f135867o = tVar;
        this.f135868p = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC17050a, TarifikatorRegionInternalAction, C17052c, InterfaceC17051b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC17050a, TarifikatorRegionInternalAction, C17052c, InterfaceC17051b> qVar2 = qVar;
        qVar2.f92008d = this.f135864l;
        qVar2.f92009e = this.f135865m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f135866n, this.f135867o);
        qVar2.f92010f = this.f135868p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        qVar2.f92014j = new com.avito.android.arch.mvi.r(true, true);
        return G0.f406611a;
    }
}
