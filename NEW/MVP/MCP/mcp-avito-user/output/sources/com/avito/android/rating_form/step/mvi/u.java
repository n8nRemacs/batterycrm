package com.avito.android.rating_form.step.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import ih0.C41404c;
import ih0.InterfaceC41402a;
import ih0.InterfaceC41403b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingFormStepFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lih0/a;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction;", "Lih0/c;", "Lih0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class u extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC41402a, RatingFormStepInternalAction, C41404c, InterfaceC41403b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f249706l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f249707m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f249708n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A f249709o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x f249710p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar, j jVar, ScreenPerformanceTracker screenPerformanceTracker, A a12, x xVar) {
        super(1);
        this.f249706l = sVar;
        this.f249707m = jVar;
        this.f249708n = screenPerformanceTracker;
        this.f249709o = a12;
        this.f249710p = xVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC41402a, RatingFormStepInternalAction, C41404c, InterfaceC41403b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC41402a, RatingFormStepInternalAction, C41404c, InterfaceC41403b> qVar2 = qVar;
        qVar2.f92008d = this.f249706l;
        qVar2.f92009e = this.f249707m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f249708n, this.f249709o);
        qVar2.f92010f = this.f249710p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
