package com.avito.android.free_delivery.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.free_delivery.mvi.entity.FreeDeliveryInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreeDeliveryFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LUE/a;", "Lcom/avito/android/free_delivery/mvi/entity/FreeDeliveryInternalAction;", "LUE/c;", "LUE/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class i extends N implements Y41.l<q<UE.a, FreeDeliveryInternalAction, UE.c, UE.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f158797l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f158798m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f158799n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f158800o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f158801p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, e eVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f158797l = gVar;
        this.f158798m = eVar;
        this.f158799n = screenPerformanceTracker;
        this.f158800o = nVar;
        this.f158801p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<UE.a, FreeDeliveryInternalAction, UE.c, UE.b> qVar) {
        q<UE.a, FreeDeliveryInternalAction, UE.c, UE.b> qVar2 = qVar;
        qVar2.f92008d = this.f158797l;
        qVar2.f92009e = this.f158798m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f158799n, this.f158800o);
        qVar2.f92010f = this.f158801p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
