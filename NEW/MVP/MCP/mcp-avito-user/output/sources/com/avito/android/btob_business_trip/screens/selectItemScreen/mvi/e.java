package com.avito.android.btob_business_trip.screens.selectItemScreen.mvi;

import Bk.InterfaceC13157a;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.btob_business_trip.screens.selectItemScreen.mvi.entity.B2bBusinessTripSelectInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: B2bBusinessTripSelectFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LBk/a;", "Lcom/avito/android/btob_business_trip/screens/selectItemScreen/mvi/entity/B2bBusinessTripSelectInternalAction;", "LBk/c;", "LBk/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.l<q<InterfaceC13157a, B2bBusinessTripSelectInternalAction, Bk.c, Bk.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f108205l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f108206m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f108207n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f108208o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f108209p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f108205l = cVar;
        this.f108206m = aVar;
        this.f108207n = screenPerformanceTracker;
        this.f108208o = jVar;
        this.f108209p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC13157a, B2bBusinessTripSelectInternalAction, Bk.c, Bk.b> qVar) {
        q<InterfaceC13157a, B2bBusinessTripSelectInternalAction, Bk.c, Bk.b> qVar2 = qVar;
        qVar2.f92008d = this.f108205l;
        qVar2.f92009e = this.f108206m;
        qVar2.f92011g = new o(this.f108207n, this.f108208o);
        qVar2.f92010f = this.f108209p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
