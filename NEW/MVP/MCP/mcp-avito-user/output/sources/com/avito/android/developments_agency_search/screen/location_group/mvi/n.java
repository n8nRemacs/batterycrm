package com.avito.android.developments_agency_search.screen.location_group.mvi;

import Iw.C14165c;
import Iw.InterfaceC14163a;
import Iw.InterfaceC14164b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.developments_agency_search.screen.location_group.mvi.entity.LocationGroupInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LocationGroupFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LIw/a;", "Lcom/avito/android/developments_agency_search/screen/location_group/mvi/entity/LocationGroupInternalAction;", "LIw/c;", "LIw/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class n extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC14163a, LocationGroupInternalAction, C14165c, InterfaceC14164b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f138205l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f138206m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f138207n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s f138208o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ q f138209p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l lVar, j jVar, ScreenPerformanceTracker screenPerformanceTracker, s sVar, q qVar) {
        super(1);
        this.f138205l = lVar;
        this.f138206m = jVar;
        this.f138207n = screenPerformanceTracker;
        this.f138208o = sVar;
        this.f138209p = qVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC14163a, LocationGroupInternalAction, C14165c, InterfaceC14164b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC14163a, LocationGroupInternalAction, C14165c, InterfaceC14164b> qVar2 = qVar;
        qVar2.f92008d = this.f138205l;
        qVar2.f92009e = this.f138206m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f138207n, this.f138208o);
        qVar2.f92010f = this.f138209p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
