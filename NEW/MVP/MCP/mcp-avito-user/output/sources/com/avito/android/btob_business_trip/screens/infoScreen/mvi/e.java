package com.avito.android.btob_business_trip.screens.infoScreen.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.btob_business_trip.screens.infoScreen.mvi.entity.B2bBusinessTripInfoInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import zk.C50579c;
import zk.InterfaceC50577a;
import zk.InterfaceC50578b;

/* compiled from: B2bBusinessTripInfoFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lzk/a;", "Lcom/avito/android/btob_business_trip/screens/infoScreen/mvi/entity/B2bBusinessTripInfoInternalAction;", "Lzk/c;", "Lzk/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements l<q<InterfaceC50577a, B2bBusinessTripInfoInternalAction, C50579c, InterfaceC50578b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f107996l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f107997m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f107998n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f107999o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f108000p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f107996l = cVar;
        this.f107997m = aVar;
        this.f107998n = screenPerformanceTracker;
        this.f107999o = jVar;
        this.f108000p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC50577a, B2bBusinessTripInfoInternalAction, C50579c, InterfaceC50578b> qVar) {
        q<InterfaceC50577a, B2bBusinessTripInfoInternalAction, C50579c, InterfaceC50578b> qVar2 = qVar;
        qVar2.f92008d = this.f107996l;
        qVar2.f92009e = this.f107997m;
        qVar2.f92011g = new o(this.f107998n, this.f107999o);
        qVar2.f92010f = this.f108000p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
