package com.avito.android.universal_map.map.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rG0.AbstractC47541a;
import rG0.InterfaceC47542b;

/* compiled from: UniversalMapFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LrG0/a;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lcom/avito/android/universal_map/map/mvi/entity/e;", "LrG0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class o extends N implements Y41.l<com.avito.android.arch.mvi.q<AbstractC47541a, UniversalMapInternalAction, com.avito.android.universal_map.map.mvi.entity.e, InterfaceC47542b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f305665l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.universal_map.map.mvi.actor.m f305666m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f305667n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.universal_map.map.mvi.reducer.q f305668o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r f305669p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a aVar, com.avito.android.universal_map.map.mvi.actor.m mVar, ScreenPerformanceTracker screenPerformanceTracker, com.avito.android.universal_map.map.mvi.reducer.q qVar, r rVar) {
        super(1);
        this.f305665l = aVar;
        this.f305666m = mVar;
        this.f305667n = screenPerformanceTracker;
        this.f305668o = qVar;
        this.f305669p = rVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<AbstractC47541a, UniversalMapInternalAction, com.avito.android.universal_map.map.mvi.entity.e, InterfaceC47542b> qVar) {
        com.avito.android.arch.mvi.q<AbstractC47541a, UniversalMapInternalAction, com.avito.android.universal_map.map.mvi.entity.e, InterfaceC47542b> qVar2 = qVar;
        qVar2.f92008d = this.f305665l;
        qVar2.f92009e = this.f305666m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f305667n, this.f305668o);
        qVar2.f92010f = this.f305669p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        qVar2.f92014j = new com.avito.android.arch.mvi.r(true, true);
        return G0.f406611a;
    }
}
