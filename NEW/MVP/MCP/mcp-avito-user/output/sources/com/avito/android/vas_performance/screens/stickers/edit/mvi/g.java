package com.avito.android.vas_performance.screens.stickers.edit.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.vas_performance.screens.stickers.edit.mvi.entity.StickersEditInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StickersEditFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LML0/a;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "LML0/c;", "LML0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.l<q<ML0.a, StickersEditInternalAction, ML0.c, ML0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f320814l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f320815m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f320816n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f320817o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f320818p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f320814l = eVar;
        this.f320815m = cVar;
        this.f320816n = screenPerformanceTracker;
        this.f320817o = lVar;
        this.f320818p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<ML0.a, StickersEditInternalAction, ML0.c, ML0.b> qVar) {
        q<ML0.a, StickersEditInternalAction, ML0.c, ML0.b> qVar2 = qVar;
        qVar2.f92008d = this.f320814l;
        qVar2.f92009e = this.f320815m;
        qVar2.f92011g = new o(this.f320816n, this.f320817o);
        qVar2.f92010f = this.f320818p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
