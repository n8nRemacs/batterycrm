package com.avito.android.tariff_lf_publication.level.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.tariff_lf_publication.level.mvi.entity.TariffLfPublicationLevelInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffLfPublicationLevelFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LUD0/a;", "Lcom/avito/android/tariff_lf_publication/level/mvi/entity/TariffLfPublicationLevelInternalAction;", "LUD0/c;", "LUD0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.l<q<UD0.a, TariffLfPublicationLevelInternalAction, UD0.c, UD0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f300934l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f300935m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f300936n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f300937o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f300938p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f300934l = eVar;
        this.f300935m = cVar;
        this.f300936n = screenPerformanceTracker;
        this.f300937o = lVar;
        this.f300938p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<UD0.a, TariffLfPublicationLevelInternalAction, UD0.c, UD0.b> qVar) {
        q<UD0.a, TariffLfPublicationLevelInternalAction, UD0.c, UD0.b> qVar2 = qVar;
        qVar2.f92008d = this.f300934l;
        qVar2.f92009e = this.f300935m;
        qVar2.f92011g = new o(this.f300936n, this.f300937o);
        qVar2.f92010f = this.f300938p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
