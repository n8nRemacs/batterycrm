package com.avito.android.safedeal.delivery.order_cancellation.details.mvi;

import Dn0.InterfaceC13421a;
import Dn0.InterfaceC13422b;
import Y41.l;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.safedeal.delivery.order_cancellation.details.mvi.entity.ReasonDetailsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReasonDetailsFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LDn0/a;", "Lcom/avito/android/safedeal/delivery/order_cancellation/details/mvi/entity/ReasonDetailsInternalAction;", "LDn0/c;", "LDn0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<q<InterfaceC13421a, ReasonDetailsInternalAction, Dn0.c, InterfaceC13422b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f256243l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f256244m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f256245n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f256246o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f256247p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, j jVar, h hVar) {
        super(1);
        this.f256243l = cVar;
        this.f256244m = aVar;
        this.f256245n = screenPerformanceTracker;
        this.f256246o = jVar;
        this.f256247p = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC13421a, ReasonDetailsInternalAction, Dn0.c, InterfaceC13422b> qVar) {
        q<InterfaceC13421a, ReasonDetailsInternalAction, Dn0.c, InterfaceC13422b> qVar2 = qVar;
        qVar2.f92008d = this.f256243l;
        qVar2.f92009e = this.f256244m;
        qVar2.f92011g = new o(this.f256245n, this.f256246o);
        qVar2.f92010f = this.f256247p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
