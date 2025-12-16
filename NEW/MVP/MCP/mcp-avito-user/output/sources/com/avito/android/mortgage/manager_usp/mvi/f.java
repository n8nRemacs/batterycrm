package com.avito.android.mortgage.manager_usp.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.mortgage.manager_usp.mvi.entity.ManagerUspInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import z00.C50335d;
import z00.InterfaceC50333b;
import z00.InterfaceC50334c;

/* compiled from: ManagerUspFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lz00/b;", "Lcom/avito/android/mortgage/manager_usp/mvi/entity/ManagerUspInternalAction;", "Lz00/d;", "Lz00/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.l<q<InterfaceC50333b, ManagerUspInternalAction, C50335d, InterfaceC50334c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f200428l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f200429m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f200430n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f200431o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f200432p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, b bVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f200428l = dVar;
        this.f200429m = bVar;
        this.f200430n = screenPerformanceTracker;
        this.f200431o = kVar;
        this.f200432p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC50333b, ManagerUspInternalAction, C50335d, InterfaceC50334c> qVar) {
        q<InterfaceC50333b, ManagerUspInternalAction, C50335d, InterfaceC50334c> qVar2 = qVar;
        qVar2.f92008d = this.f200428l;
        qVar2.f92009e = this.f200429m;
        qVar2.f92011g = new o(this.f200430n, this.f200431o);
        qVar2.f92010f = this.f200432p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
