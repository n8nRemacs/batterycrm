package com.avito.android.loyalty.ui.quality_service_gray.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.loyalty.ui.quality_service_gray.mvi.entity.QualityServiceGrayInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rX.AbstractC47609c;
import rX.InterfaceC47607a;
import rX.InterfaceC47608b;

/* compiled from: QualityServiceGrayFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LrX/a;", "Lcom/avito/android/loyalty/ui/quality_service_gray/mvi/entity/QualityServiceGrayInternalAction;", "LrX/c;", "LrX/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class i extends N implements Y41.l<q<InterfaceC47607a, QualityServiceGrayInternalAction, AbstractC47609c, InterfaceC47608b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f184134l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f184135m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f184136n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f184137o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g f184138p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, g gVar) {
        super(1);
        this.f184134l = eVar;
        this.f184135m = cVar;
        this.f184136n = screenPerformanceTracker;
        this.f184137o = lVar;
        this.f184138p = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC47607a, QualityServiceGrayInternalAction, AbstractC47609c, InterfaceC47608b> qVar) {
        q<InterfaceC47607a, QualityServiceGrayInternalAction, AbstractC47609c, InterfaceC47608b> qVar2 = qVar;
        qVar2.f92008d = this.f184134l;
        qVar2.f92009e = this.f184135m;
        qVar2.f92011g = new o(this.f184136n, this.f184137o);
        qVar2.f92010f = this.f184138p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        return G0.f406611a;
    }
}
