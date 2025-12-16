package com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesTabInternalAction;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesTabState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ExpensesTabFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LRJ0/a;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabInternalAction;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesTabState;", "LRJ0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.l<com.avito.android.arch.mvi.q<RJ0.a, ExpensesTabInternalAction, ExpensesTabState, RJ0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f317840l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f317841m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f317842n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f317843o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f317844p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f317840l = eVar;
        this.f317841m = cVar;
        this.f317842n = screenPerformanceTracker;
        this.f317843o = lVar;
        this.f317844p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<RJ0.a, ExpensesTabInternalAction, ExpensesTabState, RJ0.b> qVar) {
        com.avito.android.arch.mvi.q<RJ0.a, ExpensesTabInternalAction, ExpensesTabState, RJ0.b> qVar2 = qVar;
        qVar2.f92008d = this.f317840l;
        qVar2.f92009e = this.f317841m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f317842n, this.f317843o);
        qVar2.f92010f = this.f317844p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
