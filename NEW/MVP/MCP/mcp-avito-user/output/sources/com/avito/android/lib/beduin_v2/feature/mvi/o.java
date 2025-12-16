package com.avito.android.lib.beduin_v2.feature.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.log.LogLevel;
import com.avito.android.arch.mvi.log.LogVerbosity;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinInternalAction;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.AbstractC40048c;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LeT/a;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinInternalAction;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class o extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC40047a, BeduinInternalAction, AbstractC40048c, BeduinOneTimeEvent>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f176339l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f176340m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f176341n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f176342o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t f176343p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i iVar, g gVar, ScreenPerformanceTracker screenPerformanceTracker, v vVar, t tVar) {
        super(1);
        this.f176339l = iVar;
        this.f176340m = gVar;
        this.f176341n = screenPerformanceTracker;
        this.f176342o = vVar;
        this.f176343p = tVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC40047a, BeduinInternalAction, AbstractC40048c, BeduinOneTimeEvent> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC40047a, BeduinInternalAction, AbstractC40048c, BeduinOneTimeEvent> qVar2 = qVar;
        qVar2.f92008d = this.f176339l;
        qVar2.f92009e = this.f176340m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f176341n, this.f176342o);
        qVar2.f92010f = this.f176343p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        com.avito.android.arch.mvi.log.g gVar = com.avito.android.arch.mvi.log.g.f91993h;
        qVar2.c(fVar, new com.avito.android.arch.mvi.log.g(LogLevel.f91962b, gVar.f91996b, gVar.f91997c, gVar.f91998d, LogVerbosity.f91968c));
        return G0.f406611a;
    }
}
