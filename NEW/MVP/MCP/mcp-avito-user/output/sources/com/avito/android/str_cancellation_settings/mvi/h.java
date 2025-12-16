package com.avito.android.str_cancellation_settings.mvi;

import Sy0.InterfaceC15270a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction;
import com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrCancellationSettingsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LSy0/a;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsState;", "LSy0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC15270a, StrCancellationSettingsInternalAction, StrCancellationSettingsState, Sy0.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f288509l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f288510m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f288511n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f288512o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f288513p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f288509l = fVar;
        this.f288510m = aVar;
        this.f288511n = screenPerformanceTracker;
        this.f288512o = mVar;
        this.f288513p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC15270a, StrCancellationSettingsInternalAction, StrCancellationSettingsState, Sy0.c> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC15270a, StrCancellationSettingsInternalAction, StrCancellationSettingsState, Sy0.c> qVar2 = qVar;
        qVar2.f92008d = this.f288509l;
        qVar2.f92009e = this.f288510m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f288511n, this.f288512o);
        qVar2.f92010f = this.f288513p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
