package com.avito.android.loyalty.ui.criteria_gray.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.loyalty.ui.criteria_gray.mvi.entity.CriteriaGrayInternalAction;
import kX.AbstractC42642c;
import kX.InterfaceC42640a;
import kX.InterfaceC42641b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CriteriaGrayFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LkX/a;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction;", "LkX/c;", "LkX/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class h extends N implements Y41.l<q<InterfaceC42640a, CriteriaGrayInternalAction, AbstractC42642c, InterfaceC42641b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f183629l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f183630m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f183631n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f183632o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f183633p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f183629l = fVar;
        this.f183630m = dVar;
        this.f183631n = screenPerformanceTracker;
        this.f183632o = mVar;
        this.f183633p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC42640a, CriteriaGrayInternalAction, AbstractC42642c, InterfaceC42641b> qVar) {
        q<InterfaceC42640a, CriteriaGrayInternalAction, AbstractC42642c, InterfaceC42641b> qVar2 = qVar;
        qVar2.f92008d = this.f183629l;
        qVar2.f92009e = this.f183630m;
        qVar2.f92011g = new o(this.f183631n, this.f183632o);
        qVar2.f92010f = this.f183633p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        return G0.f406611a;
    }
}
