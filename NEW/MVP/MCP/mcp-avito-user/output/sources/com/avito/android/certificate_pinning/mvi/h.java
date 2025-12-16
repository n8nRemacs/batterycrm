package com.avito.android.certificate_pinning.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.certificate_pinning.mvi.entity.UnsafeNetworkInternalAction;
import com.avito.android.certificate_pinning.mvi.entity.UnsafeNetworkState;
import io.InterfaceC41432a;
import io.InterfaceC41433b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UnsafeNetworkFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lio/a;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkState;", "Lio/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements Y41.l<q<InterfaceC41432a, UnsafeNetworkInternalAction, UnsafeNetworkState, InterfaceC41433b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f117831l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f117832m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f117833n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f117834o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f117835p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f117831l = fVar;
        this.f117832m = dVar;
        this.f117833n = screenPerformanceTracker;
        this.f117834o = mVar;
        this.f117835p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC41432a, UnsafeNetworkInternalAction, UnsafeNetworkState, InterfaceC41433b> qVar) {
        q<InterfaceC41432a, UnsafeNetworkInternalAction, UnsafeNetworkState, InterfaceC41433b> qVar2 = qVar;
        qVar2.f92008d = this.f117831l;
        qVar2.f92009e = this.f117832m;
        qVar2.f92011g = new o(this.f117833n, this.f117834o);
        qVar2.f92010f = this.f117835p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
