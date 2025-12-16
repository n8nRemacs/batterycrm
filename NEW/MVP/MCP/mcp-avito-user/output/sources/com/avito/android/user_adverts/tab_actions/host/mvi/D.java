package com.avito.android.user_adverts.tab_actions.host.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsInternalAction;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState;
import com.avito.android.util.R0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserAdvertsActionsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LYI0/a;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsInternalAction;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/UserAdvertsActionsState;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class D extends N implements Y41.l<com.avito.android.arch.mvi.q<YI0.a, UserAdvertsActionsInternalAction, UserAdvertsActionsState, com.avito.android.user_adverts.tab_actions.host.mvi.entity.a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C35641a f314382l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f314383m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G f314384n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ B f314385o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ R0 f314386p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(C35641a c35641a, ScreenPerformanceTracker screenPerformanceTracker, G g12, B b12, R0 r02) {
        super(1);
        this.f314382l = c35641a;
        this.f314383m = screenPerformanceTracker;
        this.f314384n = g12;
        this.f314385o = b12;
        this.f314386p = r02;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<YI0.a, UserAdvertsActionsInternalAction, UserAdvertsActionsState, com.avito.android.user_adverts.tab_actions.host.mvi.entity.a> qVar) {
        com.avito.android.arch.mvi.q<YI0.a, UserAdvertsActionsInternalAction, UserAdvertsActionsState, com.avito.android.user_adverts.tab_actions.host.mvi.entity.a> qVar2 = qVar;
        qVar2.f92009e = this.f314382l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f314383m, this.f314384n);
        qVar2.f92010f = this.f314385o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        qVar2.f92013i = this.f314386p.c();
        return G0.f406611a;
    }
}
