package com.avito.android.developments_advice.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.developments_advice.mvi.entity.DevelopmentsAdviceInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mw.C44146c;
import mw.InterfaceC44144a;
import mw.InterfaceC44145b;

/* compiled from: DevelopmentsAdviceFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lmw/a;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "Lmw/c;", "Lmw/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class j extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC44144a, DevelopmentsAdviceInternalAction, C44146c, InterfaceC44145b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f136175l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f136176m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f136177n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f136178o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f136179p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, f fVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f136175l = hVar;
        this.f136176m = fVar;
        this.f136177n = screenPerformanceTracker;
        this.f136178o = oVar;
        this.f136179p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC44144a, DevelopmentsAdviceInternalAction, C44146c, InterfaceC44145b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC44144a, DevelopmentsAdviceInternalAction, C44146c, InterfaceC44145b> qVar2 = qVar;
        qVar2.f92008d = this.f136175l;
        qVar2.f92009e = this.f136176m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f136177n, this.f136178o);
        qVar2.f92010f = this.f136179p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
