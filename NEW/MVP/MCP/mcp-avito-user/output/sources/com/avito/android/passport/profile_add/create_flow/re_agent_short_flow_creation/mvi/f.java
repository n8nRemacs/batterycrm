package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.mvi.entity.ReAgentShortFlowCreationInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReAgentShortFlowCreationFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LS50/a;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/mvi/entity/ReAgentShortFlowCreationInternalAction;", "LS50/c;", "LS50/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.l<q<S50.a, ReAgentShortFlowCreationInternalAction, S50.c, S50.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f211604l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f211605m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f211606n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i f211607o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, ScreenPerformanceTracker screenPerformanceTracker, k kVar, i iVar) {
        super(1);
        this.f211604l = cVar;
        this.f211605m = screenPerformanceTracker;
        this.f211606n = kVar;
        this.f211607o = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<S50.a, ReAgentShortFlowCreationInternalAction, S50.c, S50.b> qVar) {
        q<S50.a, ReAgentShortFlowCreationInternalAction, S50.c, S50.b> qVar2 = qVar;
        qVar2.f92009e = this.f211604l;
        qVar2.f92011g = new o(this.f211605m, this.f211606n);
        qVar2.f92010f = this.f211607o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
