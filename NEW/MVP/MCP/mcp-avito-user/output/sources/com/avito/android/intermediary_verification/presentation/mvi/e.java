package com.avito.android.intermediary_verification.presentation.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.intermediary_verification.presentation.mvi.entity.IntermediaryVerificationAction;
import com.avito.android.intermediary_verification.presentation.mvi.entity.IntermediaryVerificationInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import mO.InterfaceC43987a;

/* compiled from: IntermediaryVerificationFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationAction;", "Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationInternalAction;", "LmO/b;", "LmO/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements Y41.l<q<IntermediaryVerificationAction, IntermediaryVerificationInternalAction, mO.b, InterfaceC43987a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f173179l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f173180m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f173181n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f173182o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f173183p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f173179l = cVar;
        this.f173180m = aVar;
        this.f173181n = screenPerformanceTracker;
        this.f173182o = jVar;
        this.f173183p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<IntermediaryVerificationAction, IntermediaryVerificationInternalAction, mO.b, InterfaceC43987a> qVar) {
        q<IntermediaryVerificationAction, IntermediaryVerificationInternalAction, mO.b, InterfaceC43987a> qVar2 = qVar;
        qVar2.f92008d = this.f173179l;
        qVar2.f92009e = this.f173180m;
        qVar2.f92011g = new o(this.f173181n, this.f173182o);
        qVar2.f92010f = this.f173183p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
