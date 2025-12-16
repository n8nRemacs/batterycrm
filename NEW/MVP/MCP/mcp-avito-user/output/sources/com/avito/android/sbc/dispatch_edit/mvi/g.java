package com.avito.android.sbc.dispatch_edit.mvi;

import Wo0.InterfaceC15786b;
import Wo0.InterfaceC15787c;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.sbc.dispatch_edit.mvi.entity.SbcDispatchEditInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SbcDispatchEditFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LWo0/b;", "Lcom/avito/android/sbc/dispatch_edit/mvi/entity/SbcDispatchEditInternalAction;", "LWo0/d;", "LWo0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g extends N implements Y41.l<q<InterfaceC15786b, SbcDispatchEditInternalAction, Wo0.d, InterfaceC15787c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f260134l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f260135m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f260136n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f260137o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f260138p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar, j jVar) {
        super(1);
        this.f260134l = eVar;
        this.f260135m = cVar;
        this.f260136n = screenPerformanceTracker;
        this.f260137o = lVar;
        this.f260138p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC15786b, SbcDispatchEditInternalAction, Wo0.d, InterfaceC15787c> qVar) {
        q<InterfaceC15786b, SbcDispatchEditInternalAction, Wo0.d, InterfaceC15787c> qVar2 = qVar;
        qVar2.f92008d = this.f260134l;
        qVar2.f92009e = this.f260135m;
        qVar2.f92011g = new o(this.f260136n, this.f260137o);
        qVar2.f92010f = this.f260138p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
