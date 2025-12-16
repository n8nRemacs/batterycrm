package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.arch.mvi.r;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenOneTimeEvent;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacFinishedFallbackScreenFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenInternalAction;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenState;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenOneTimeEvent;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class i extends N implements Y41.l<q<IacFinishedFallbackScreenAction, IacFinishedFallbackScreenInternalAction, IacFinishedFallbackScreenState, IacFinishedFallbackScreenOneTimeEvent>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f166605l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f166606m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f166607n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f166608o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f166609p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, g gVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f166605l = aVar;
        this.f166606m = gVar;
        this.f166607n = screenPerformanceTracker;
        this.f166608o = nVar;
        this.f166609p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<IacFinishedFallbackScreenAction, IacFinishedFallbackScreenInternalAction, IacFinishedFallbackScreenState, IacFinishedFallbackScreenOneTimeEvent> qVar) {
        q<IacFinishedFallbackScreenAction, IacFinishedFallbackScreenInternalAction, IacFinishedFallbackScreenState, IacFinishedFallbackScreenOneTimeEvent> qVar2 = qVar;
        qVar2.f92009e = this.f166605l;
        qVar2.f92008d = this.f166606m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f166607n, this.f166608o);
        qVar2.f92010f = this.f166609p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        qVar2.f92014j = new r(false, true, 1, null);
        return G0.f406611a;
    }
}
