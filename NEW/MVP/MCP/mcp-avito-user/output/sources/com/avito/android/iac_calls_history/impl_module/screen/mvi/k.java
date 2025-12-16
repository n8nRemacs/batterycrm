package com.avito.android.iac_calls_history.impl_module.screen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenInternalAction;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallsHistoryScreenFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/a;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenState;", "LZJ/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class k extends N implements Y41.l<q<com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a, CallsHistoryScreenInternalAction, CallsHistoryScreenState, ZJ.a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f164862l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f164863m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f164864n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f164865o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f164866p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, g gVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, i iVar) {
        super(1);
        this.f164862l = aVar;
        this.f164863m = gVar;
        this.f164864n = screenPerformanceTracker;
        this.f164865o = nVar;
        this.f164866p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a, CallsHistoryScreenInternalAction, CallsHistoryScreenState, ZJ.a> qVar) {
        q<com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.a, CallsHistoryScreenInternalAction, CallsHistoryScreenState, ZJ.a> qVar2 = qVar;
        qVar2.f92009e = this.f164862l;
        qVar2.f92008d = this.f164863m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f164864n, this.f164865o);
        qVar2.f92010f = this.f164866p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
