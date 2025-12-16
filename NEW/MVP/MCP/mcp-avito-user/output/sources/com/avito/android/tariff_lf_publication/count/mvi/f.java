package com.avito.android.tariff_lf_publication.count.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.tariff_lf_publication.count.mvi.entity.TariffLfPublicationCountInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffLfPublicationCountFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LMD0/a;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "LMD0/c;", "LMD0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.l<q<MD0.a, TariffLfPublicationCountInternalAction, MD0.c, MD0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f300839l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f300840m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f300841n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f300842o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f300843p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f300839l = dVar;
        this.f300840m = bVar;
        this.f300841n = screenPerformanceTracker;
        this.f300842o = kVar;
        this.f300843p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<MD0.a, TariffLfPublicationCountInternalAction, MD0.c, MD0.b> qVar) {
        q<MD0.a, TariffLfPublicationCountInternalAction, MD0.c, MD0.b> qVar2 = qVar;
        qVar2.f92008d = this.f300839l;
        qVar2.f92009e = this.f300840m;
        qVar2.f92011g = new o(this.f300841n, this.f300842o);
        qVar2.f92010f = this.f300843p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
