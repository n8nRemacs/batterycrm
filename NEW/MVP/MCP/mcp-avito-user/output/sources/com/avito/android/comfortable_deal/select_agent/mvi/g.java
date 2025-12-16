package com.avito.android.comfortable_deal.select_agent.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.comfortable_deal.select_agent.mvi.entity.SelectAgentInternalAction;
import dq.InterfaceC39778a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectAgentFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ldq/a;", "Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentInternalAction;", "Ldq/c;", "Ldq/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g extends N implements Y41.l<q<InterfaceC39778a, SelectAgentInternalAction, dq.c, dq.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f122767l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f122768m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f122769n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f122770o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f122771p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f122767l = eVar;
        this.f122768m = cVar;
        this.f122769n = screenPerformanceTracker;
        this.f122770o = lVar;
        this.f122771p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC39778a, SelectAgentInternalAction, dq.c, dq.b> qVar) {
        q<InterfaceC39778a, SelectAgentInternalAction, dq.c, dq.b> qVar2 = qVar;
        qVar2.f92008d = this.f122767l;
        qVar2.f92009e = this.f122768m;
        qVar2.f92011g = new o(this.f122769n, this.f122770o);
        qVar2.f92010f = this.f122771p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
