package com.avito.android.verification.verification_disclaimer.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.verification.verification_disclaimer.mvi.entity.DisclaimerInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DisclaimerFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LNM0/a;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction;", "LNM0/c;", "LNM0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class k extends N implements Y41.l<q<NM0.a, DisclaimerInternalAction, NM0.c, NM0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f325112l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f325113m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f325114n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f325115o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i f325116p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, g gVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, i iVar) {
        super(1);
        this.f325112l = bVar;
        this.f325113m = gVar;
        this.f325114n = screenPerformanceTracker;
        this.f325115o = nVar;
        this.f325116p = iVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<NM0.a, DisclaimerInternalAction, NM0.c, NM0.b> qVar) {
        q<NM0.a, DisclaimerInternalAction, NM0.c, NM0.b> qVar2 = qVar;
        qVar2.f92009e = this.f325112l;
        qVar2.f92008d = this.f325113m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f325114n, this.f325115o);
        qVar2.f92010f = this.f325116p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91992g);
        return G0.f406611a;
    }
}
