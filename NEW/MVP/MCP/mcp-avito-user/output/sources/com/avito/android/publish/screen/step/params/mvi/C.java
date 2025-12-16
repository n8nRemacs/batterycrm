package com.avito.android.publish.screen.step.params.mvi;

import Ie0.InterfaceC14065a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishDetailsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LIe0/a;", "Lcom/avito/android/publish/screen/step/params/mvi/entity/PublishDetailsInternalAction;", "LIe0/f;", "LIe0/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class C extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC14065a, PublishDetailsInternalAction, Ie0.f, Ie0.d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f241333l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y f241334m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f241335n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ H f241336o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ F f241337p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(A a12, y yVar, ScreenPerformanceTracker screenPerformanceTracker, H h12, F f12) {
        super(1);
        this.f241333l = a12;
        this.f241334m = yVar;
        this.f241335n = screenPerformanceTracker;
        this.f241336o = h12;
        this.f241337p = f12;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC14065a, PublishDetailsInternalAction, Ie0.f, Ie0.d> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC14065a, PublishDetailsInternalAction, Ie0.f, Ie0.d> qVar2 = qVar;
        qVar2.f92008d = this.f241333l;
        qVar2.f92009e = this.f241334m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f241335n, this.f241336o);
        qVar2.f92010f = this.f241337p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
