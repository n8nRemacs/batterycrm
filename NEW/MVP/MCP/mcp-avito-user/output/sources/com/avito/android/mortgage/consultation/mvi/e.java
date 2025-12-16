package com.avito.android.mortgage.consultation.mvi;

import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.mortgage.consultation.mvi.entity.MortgageConsultationInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageConsultationFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LXZ/a;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "LXZ/d;", "LXZ/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e extends N implements l<q<XZ.a, MortgageConsultationInternalAction, XZ.d, XZ.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f198610l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f198611m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f198612n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f198613o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f198614p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f198610l = cVar;
        this.f198611m = aVar;
        this.f198612n = screenPerformanceTracker;
        this.f198613o = jVar;
        this.f198614p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<XZ.a, MortgageConsultationInternalAction, XZ.d, XZ.c> qVar) {
        q<XZ.a, MortgageConsultationInternalAction, XZ.d, XZ.c> qVar2 = qVar;
        qVar2.f92008d = this.f198610l;
        qVar2.f92009e = this.f198611m;
        qVar2.f92011g = new o(this.f198612n, this.f198613o);
        qVar2.f92010f = this.f198614p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
