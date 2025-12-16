package com.avito.android.lf_levels.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.lf_levels.mvi.entity.LfLevelsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import wR.InterfaceC49553a;

/* compiled from: LfLevelsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LwR/a;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction;", "LwR/c;", "LwR/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class g extends N implements Y41.l<q<InterfaceC49553a, LfLevelsInternalAction, wR.c, wR.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f175385l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f175386m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f175387n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f175388o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f175389p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f175385l = eVar;
        this.f175386m = cVar;
        this.f175387n = screenPerformanceTracker;
        this.f175388o = lVar;
        this.f175389p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC49553a, LfLevelsInternalAction, wR.c, wR.b> qVar) {
        q<InterfaceC49553a, LfLevelsInternalAction, wR.c, wR.b> qVar2 = qVar;
        qVar2.f92008d = this.f175385l;
        qVar2.f92009e = this.f175386m;
        qVar2.f92011g = new o(this.f175387n, this.f175388o);
        qVar2.f92010f = this.f175389p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
