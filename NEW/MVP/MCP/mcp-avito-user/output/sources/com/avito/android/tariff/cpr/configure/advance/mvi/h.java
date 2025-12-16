package com.avito.android.tariff.cpr.configure.advance.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.tariff.cpr.configure.advance.mvi.entity.CprConfigureAdvanceInternalAction;
import gB0.C40568c;
import gB0.InterfaceC40566a;
import gB0.InterfaceC40567b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CprConfigureAdvanceFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LgB0/a;", "Lcom/avito/android/tariff/cpr/configure/advance/mvi/entity/CprConfigureAdvanceInternalAction;", "LgB0/c;", "LgB0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.l<q<InterfaceC40566a, CprConfigureAdvanceInternalAction, C40568c, InterfaceC40567b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f295476l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f295477m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f295478n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f295479o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f295480p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f295476l = fVar;
        this.f295477m = dVar;
        this.f295478n = screenPerformanceTracker;
        this.f295479o = mVar;
        this.f295480p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40566a, CprConfigureAdvanceInternalAction, C40568c, InterfaceC40567b> qVar) {
        q<InterfaceC40566a, CprConfigureAdvanceInternalAction, C40568c, InterfaceC40567b> qVar2 = qVar;
        qVar2.f92008d = this.f295476l;
        qVar2.f92009e = this.f295477m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f295478n, this.f295479o);
        qVar2.f92010f = this.f295480p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
