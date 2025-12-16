package com.avito.android.rating_form.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rating_form.mvi.entity.RatingFormInternalAction;
import com.avito.android.rating_form.mvi.entity.RatingFormState;
import dh0.InterfaceC39727a;
import dh0.InterfaceC39728b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingFormFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Ldh0/a;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormState;", "Ldh0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC39727a, RatingFormInternalAction, RatingFormState, InterfaceC39728b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f248782l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f248783m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f248784n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f248785o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f248786p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, n nVar, l lVar) {
        super(1);
        this.f248782l = fVar;
        this.f248783m = dVar;
        this.f248784n = screenPerformanceTracker;
        this.f248785o = nVar;
        this.f248786p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC39727a, RatingFormInternalAction, RatingFormState, InterfaceC39728b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC39727a, RatingFormInternalAction, RatingFormState, InterfaceC39728b> qVar2 = qVar;
        qVar2.f92008d = this.f248782l;
        qVar2.f92009e = this.f248783m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f248784n, this.f248785o);
        qVar2.f92010f = this.f248786p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
