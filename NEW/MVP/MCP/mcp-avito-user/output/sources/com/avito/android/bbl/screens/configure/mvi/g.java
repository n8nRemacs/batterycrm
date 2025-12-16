package com.avito.android.bbl.screens.configure.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.bbl.screens.configure.mvi.entity.BblConfigureInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import yh.C50251c;
import yh.InterfaceC50249a;
import yh.InterfaceC50250b;

/* compiled from: BblConfigureFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lyh/a;", "Lcom/avito/android/bbl/screens/configure/mvi/entity/BblConfigureInternalAction;", "Lyh/c;", "Lyh/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class g extends N implements Y41.l<q<InterfaceC50249a, BblConfigureInternalAction, C50251c, InterfaceC50250b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f99226l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f99227m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f99228n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f99229o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f99230p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f99226l = eVar;
        this.f99227m = cVar;
        this.f99228n = screenPerformanceTracker;
        this.f99229o = lVar;
        this.f99230p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC50249a, BblConfigureInternalAction, C50251c, InterfaceC50250b> qVar) {
        q<InterfaceC50249a, BblConfigureInternalAction, C50251c, InterfaceC50250b> qVar2 = qVar;
        qVar2.f92008d = this.f99226l;
        qVar2.f92009e = this.f99227m;
        qVar2.f92011g = new o(this.f99228n, this.f99229o);
        qVar2.f92010f = this.f99230p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
