package com.avito.android.success.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.success.mvi.entity.SuccessInternalAction;
import eA0.C39981c;
import eA0.InterfaceC39979a;
import eA0.InterfaceC39980b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuccessFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LeA0/a;", "Lcom/avito/android/success/mvi/entity/SuccessInternalAction;", "LeA0/c;", "LeA0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.l<q<InterfaceC39979a, SuccessInternalAction, C39981c, InterfaceC39980b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f291682l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f291683m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f291684n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f291685o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l f291686p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, c cVar, j jVar, ScreenPerformanceTracker screenPerformanceTracker, l lVar) {
        super(1);
        this.f291682l = eVar;
        this.f291683m = cVar;
        this.f291684n = jVar;
        this.f291685o = screenPerformanceTracker;
        this.f291686p = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC39979a, SuccessInternalAction, C39981c, InterfaceC39980b> qVar) {
        q<InterfaceC39979a, SuccessInternalAction, C39981c, InterfaceC39980b> qVar2 = qVar;
        qVar2.f92008d = this.f291682l;
        qVar2.f92009e = this.f291683m;
        qVar2.f92010f = this.f291684n;
        qVar2.f92011g = new o(this.f291685o, this.f291686p);
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
