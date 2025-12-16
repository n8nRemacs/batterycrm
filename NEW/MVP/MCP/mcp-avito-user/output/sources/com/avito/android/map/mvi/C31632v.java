package com.avito.android.map.mvi;

import bY.InterfaceC25585b;
import bY.InterfaceC25596c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.map.mvi.entity.MapInternalAction;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MapFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LbY/b;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lcom/avito/android/map/mvi/entity/a;", "LbY/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.map.mvi.v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31632v extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC25585b, MapInternalAction, com.avito.android.map.mvi.entity.a, InterfaceC25596c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.b<MapInternalAction> f185311l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C31612a f185312m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f185313n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ M f185314o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31632v(com.avito.android.arch.mvi.b<MapInternalAction> bVar, C31612a c31612a, ScreenPerformanceTracker screenPerformanceTracker, M m12) {
        super(1);
        this.f185311l = bVar;
        this.f185312m = c31612a;
        this.f185313n = screenPerformanceTracker;
        this.f185314o = m12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC25585b, MapInternalAction, com.avito.android.map.mvi.entity.a, InterfaceC25596c> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC25585b, MapInternalAction, com.avito.android.map.mvi.entity.a, InterfaceC25596c> qVar2 = qVar;
        qVar2.f92008d = this.f185311l;
        qVar2.f92009e = this.f185312m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f185313n, this.f185314o);
        qVar2.f92010f = L.f184968b;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
