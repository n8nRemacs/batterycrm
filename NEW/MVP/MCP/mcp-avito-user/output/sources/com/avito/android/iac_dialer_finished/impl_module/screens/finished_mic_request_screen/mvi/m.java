package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacFinishedMicRequestScreenFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LZK/a;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenInternalAction;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState;", "LZK/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class m extends N implements Y41.l<com.avito.android.arch.mvi.q<ZK.a, IacFinishedMicRequestScreenInternalAction, IacFinishedMicRequestScreenState, ZK.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f166795l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f166796m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f166797n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f166798o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f166799p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, g gVar, ScreenPerformanceTracker screenPerformanceTracker, p pVar, k kVar) {
        super(1);
        this.f166795l = iVar;
        this.f166796m = gVar;
        this.f166797n = screenPerformanceTracker;
        this.f166798o = pVar;
        this.f166799p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<ZK.a, IacFinishedMicRequestScreenInternalAction, IacFinishedMicRequestScreenState, ZK.b> qVar) {
        com.avito.android.arch.mvi.q<ZK.a, IacFinishedMicRequestScreenInternalAction, IacFinishedMicRequestScreenState, ZK.b> qVar2 = qVar;
        qVar2.f92008d = this.f166795l;
        qVar2.f92009e = this.f166796m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f166797n, this.f166798o);
        qVar2.f92010f = this.f166799p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
