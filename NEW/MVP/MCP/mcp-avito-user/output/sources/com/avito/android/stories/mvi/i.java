package com.avito.android.stories.mvi;

import Fx0.InterfaceC13851a;
import Fx0.InterfaceC13852b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.stories.mvi.entity.StoriesInternalAction;
import com.avito.android.stories.mvi.entity.StoriesState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StoriesFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LFx0/a;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "Lcom/avito/android/stories/mvi/entity/StoriesState;", "LFx0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC13851a, StoriesInternalAction, StoriesState, InterfaceC13852b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f285281l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f285282m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f285283n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n f285284o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(a aVar, ScreenPerformanceTracker screenPerformanceTracker, p pVar, n nVar) {
        super(1);
        this.f285281l = aVar;
        this.f285282m = screenPerformanceTracker;
        this.f285283n = pVar;
        this.f285284o = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC13851a, StoriesInternalAction, StoriesState, InterfaceC13852b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC13851a, StoriesInternalAction, StoriesState, InterfaceC13852b> qVar2 = qVar;
        qVar2.f92009e = this.f285281l;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f285282m, this.f285283n);
        qVar2.f92010f = this.f285284o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
