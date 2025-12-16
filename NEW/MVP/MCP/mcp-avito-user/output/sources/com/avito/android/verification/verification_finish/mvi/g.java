package com.avito.android.verification.verification_finish.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.verification.verification_finish.mvi.entity.FinishInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FinishFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LQM0/a;", "Lcom/avito/android/verification/verification_finish/mvi/entity/FinishInternalAction;", "LQM0/c;", "LQM0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.l<q<QM0.a, FinishInternalAction, QM0.c, QM0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f325288l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f325289m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f325290n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f325291o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f325292p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f325288l = eVar;
        this.f325289m = cVar;
        this.f325290n = screenPerformanceTracker;
        this.f325291o = lVar;
        this.f325292p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<QM0.a, FinishInternalAction, QM0.c, QM0.b> qVar) {
        q<QM0.a, FinishInternalAction, QM0.c, QM0.b> qVar2 = qVar;
        qVar2.f92008d = this.f325288l;
        qVar2.f92009e = this.f325289m;
        qVar2.f92011g = new o(this.f325290n, this.f325291o);
        qVar2.f92010f = this.f325292p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        return G0.f406611a;
    }
}
