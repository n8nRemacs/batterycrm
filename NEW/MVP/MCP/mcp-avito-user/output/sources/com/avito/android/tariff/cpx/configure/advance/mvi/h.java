package com.avito.android.tariff.cpx.configure.advance.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.tariff.cpx.configure.advance.mvi.entity.CpxConfigureAdvanceInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mB0.InterfaceC43942a;

/* compiled from: CpxConfigureAdvanceFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LmB0/a;", "Lcom/avito/android/tariff/cpx/configure/advance/mvi/entity/CpxConfigureAdvanceInternalAction;", "LmB0/e;", "LmB0/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.l<q<InterfaceC43942a, CpxConfigureAdvanceInternalAction, mB0.e, mB0.d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f295757l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f295758m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f295759n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f295760o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f295761p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f295757l = fVar;
        this.f295758m = dVar;
        this.f295759n = screenPerformanceTracker;
        this.f295760o = mVar;
        this.f295761p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC43942a, CpxConfigureAdvanceInternalAction, mB0.e, mB0.d> qVar) {
        q<InterfaceC43942a, CpxConfigureAdvanceInternalAction, mB0.e, mB0.d> qVar2 = qVar;
        qVar2.f92008d = this.f295757l;
        qVar2.f92009e = this.f295758m;
        qVar2.f92011g = new o(this.f295759n, this.f295760o);
        qVar2.f92010f = this.f295761p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
