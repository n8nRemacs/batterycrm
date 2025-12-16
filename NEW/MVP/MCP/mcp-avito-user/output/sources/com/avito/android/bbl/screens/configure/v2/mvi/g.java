package com.avito.android.bbl.screens.configure.v2.mvi;

import Ah.InterfaceC13032a;
import Ah.InterfaceC13033b;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.bbl.screens.configure.v2.mvi.entity.BblConfigureV2InternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BblConfigureV2FeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LAh/a;", "Lcom/avito/android/bbl/screens/configure/v2/mvi/entity/BblConfigureV2InternalAction;", "LAh/c;", "LAh/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<q<InterfaceC13032a, BblConfigureV2InternalAction, Ah.c, InterfaceC13033b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f99374l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f99375m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f99376n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f99377o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f99378p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f99374l = eVar;
        this.f99375m = cVar;
        this.f99376n = screenPerformanceTracker;
        this.f99377o = lVar;
        this.f99378p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC13032a, BblConfigureV2InternalAction, Ah.c, InterfaceC13033b> qVar) {
        q<InterfaceC13032a, BblConfigureV2InternalAction, Ah.c, InterfaceC13033b> qVar2 = qVar;
        qVar2.f92008d = this.f99374l;
        qVar2.f92009e = this.f99375m;
        qVar2.f92011g = new o(this.f99376n, this.f99377o);
        qVar2.f92010f = this.f99378p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
