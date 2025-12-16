package com.avito.android.verification.verification_form_builder.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FormBuilderFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LTM0/a;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "LTM0/c;", "LTM0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class k extends N implements Y41.l<com.avito.android.arch.mvi.q<TM0.a, FormBuilderInternalAction, TM0.c, TM0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f325463l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f325464m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f325465n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p f325466o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n f325467p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, g gVar, ScreenPerformanceTracker screenPerformanceTracker, p pVar, n nVar) {
        super(1);
        this.f325463l = iVar;
        this.f325464m = gVar;
        this.f325465n = screenPerformanceTracker;
        this.f325466o = pVar;
        this.f325467p = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<TM0.a, FormBuilderInternalAction, TM0.c, TM0.b> qVar) {
        com.avito.android.arch.mvi.q<TM0.a, FormBuilderInternalAction, TM0.c, TM0.b> qVar2 = qVar;
        qVar2.f92008d = this.f325463l;
        qVar2.f92009e = this.f325464m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f325465n, this.f325466o);
        qVar2.f92010f = this.f325467p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91994i);
        return G0.f406611a;
    }
}
