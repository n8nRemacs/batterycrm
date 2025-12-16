package com.avito.android.auto_loans_cabinet.mvi;

import Ke.InterfaceC14305a;
import Ke.InterfaceC14306b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetInternalAction;
import com.avito.android.auto_loans_cabinet.mvi.entity.AutoLoansCabinetState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoLoansCabinetFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LKe/a;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetInternalAction;", "Lcom/avito/android/auto_loans_cabinet/mvi/entity/AutoLoansCabinetState;", "LKe/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class i extends N implements Y41.l<q<InterfaceC14305a, AutoLoansCabinetInternalAction, AutoLoansCabinetState, InterfaceC14306b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f95493l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f95494m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f95495n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f95496o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f95497p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f95493l = gVar;
        this.f95494m = aVar;
        this.f95495n = screenPerformanceTracker;
        this.f95496o = nVar;
        this.f95497p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC14305a, AutoLoansCabinetInternalAction, AutoLoansCabinetState, InterfaceC14306b> qVar) {
        q<InterfaceC14305a, AutoLoansCabinetInternalAction, AutoLoansCabinetState, InterfaceC14306b> qVar2 = qVar;
        qVar2.f92008d = this.f95493l;
        qVar2.f92009e = this.f95494m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f95495n, this.f95496o);
        qVar2.f92010f = this.f95497p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
