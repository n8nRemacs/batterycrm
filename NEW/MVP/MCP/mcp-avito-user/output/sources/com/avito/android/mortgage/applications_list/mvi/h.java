package com.avito.android.mortgage.applications_list.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.applications_list.mvi.entity.ApplicationsListInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApplicationsListFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LSZ/a;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "LSZ/c;", "LSZ/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.l<com.avito.android.arch.mvi.q<SZ.a, ApplicationsListInternalAction, SZ.c, SZ.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f198465l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f198466m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f198467n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ q f198468o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o f198469p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, q qVar, o oVar) {
        super(1);
        this.f198465l = fVar;
        this.f198466m = cVar;
        this.f198467n = screenPerformanceTracker;
        this.f198468o = qVar;
        this.f198469p = oVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<SZ.a, ApplicationsListInternalAction, SZ.c, SZ.b> qVar) {
        com.avito.android.arch.mvi.q<SZ.a, ApplicationsListInternalAction, SZ.c, SZ.b> qVar2 = qVar;
        qVar2.f92008d = this.f198465l;
        qVar2.f92009e = this.f198466m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f198467n, this.f198468o);
        qVar2.f92010f = this.f198469p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
