package com.avito.android.tariff_cpt.info.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import yC0.InterfaceC50099a;
import yC0.InterfaceC50100b;

/* compiled from: CptInfoV2FeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LyC0/a;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "LyC0/c;", "LyC0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class j extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC50099a, CptInfoV2InternalAction, yC0.c, InterfaceC50100b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f298255l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f298256m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f298257n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ o f298258o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m f298259p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, f fVar, ScreenPerformanceTracker screenPerformanceTracker, o oVar, m mVar) {
        super(1);
        this.f298255l = hVar;
        this.f298256m = fVar;
        this.f298257n = screenPerformanceTracker;
        this.f298258o = oVar;
        this.f298259p = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC50099a, CptInfoV2InternalAction, yC0.c, InterfaceC50100b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC50099a, CptInfoV2InternalAction, yC0.c, InterfaceC50100b> qVar2 = qVar;
        qVar2.f92008d = this.f298255l;
        qVar2.f92009e = this.f298256m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f298257n, this.f298258o);
        qVar2.f92010f = this.f298259p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
