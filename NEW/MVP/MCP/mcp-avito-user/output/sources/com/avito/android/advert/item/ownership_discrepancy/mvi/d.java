package com.avito.android.advert.item.ownership_discrepancy.mvi;

import Y41.l;
import com.avito.android.advert.item.ownership_discrepancy.mvi.entity.OwnershipDiscrepancyInternalAction;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import l6.InterfaceC43549a;

/* compiled from: OwnershipDiscrepancyFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ll6/a;", "Lcom/avito/android/advert/item/ownership_discrepancy/mvi/entity/OwnershipDiscrepancyInternalAction;", "Ll6/c;", "Ll6/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements l<q<InterfaceC43549a, OwnershipDiscrepancyInternalAction, l6.c, l6.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f78113l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f78114m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f78115n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f78116o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ScreenPerformanceTracker screenPerformanceTracker, i iVar, g gVar) {
        super(1);
        this.f78113l = bVar;
        this.f78114m = screenPerformanceTracker;
        this.f78115n = iVar;
        this.f78116o = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC43549a, OwnershipDiscrepancyInternalAction, l6.c, l6.b> qVar) {
        q<InterfaceC43549a, OwnershipDiscrepancyInternalAction, l6.c, l6.b> qVar2 = qVar;
        qVar2.f92009e = this.f78113l;
        qVar2.f92011g = new o(this.f78114m, this.f78115n);
        qVar2.f92010f = this.f78116o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
