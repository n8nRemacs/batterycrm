package com.avito.android.rating.details.mvi;

import Cg0.InterfaceC13303a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.rating.details.mvi.entity.RatingDetailsInternalAction;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RatingDetailsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lcom/avito/android/rating/details/mvi/entity/a;", "Lcom/avito/android/rating/details/mvi/entity/RatingDetailsInternalAction;", "Lcom/avito/android/rating/details/mvi/entity/b;", "LCg0/a;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class N extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.arch.mvi.q<com.avito.android.rating.details.mvi.entity.a, RatingDetailsInternalAction, com.avito.android.rating.details.mvi.entity.b, InterfaceC13303a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.b<RatingDetailsInternalAction> f247253l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C34175a f247254m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f247255n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T f247256o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Q f247257p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(com.avito.android.arch.mvi.b<RatingDetailsInternalAction> bVar, C34175a c34175a, ScreenPerformanceTracker screenPerformanceTracker, T t12, Q q12) {
        super(1);
        this.f247253l = bVar;
        this.f247254m = c34175a;
        this.f247255n = screenPerformanceTracker;
        this.f247256o = t12;
        this.f247257p = q12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<com.avito.android.rating.details.mvi.entity.a, RatingDetailsInternalAction, com.avito.android.rating.details.mvi.entity.b, InterfaceC13303a> qVar) {
        com.avito.android.arch.mvi.q<com.avito.android.rating.details.mvi.entity.a, RatingDetailsInternalAction, com.avito.android.rating.details.mvi.entity.b, InterfaceC13303a> qVar2 = qVar;
        qVar2.f92008d = this.f247253l;
        qVar2.f92009e = this.f247254m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f247255n, this.f247256o);
        qVar2.f92010f = this.f247257p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        qVar2.f92014j = new com.avito.android.arch.mvi.r(false, true, 1, null);
        return G0.f406611a;
    }
}
