package com.avito.android.return_checkout.mvi;

import Wm0.InterfaceC15776a;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.return_checkout.mvi.entity.DeliveryReturnCheckoutInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryReturnCheckoutFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LWm0/a;", "Lcom/avito/android/return_checkout/mvi/entity/DeliveryReturnCheckoutInternalAction;", "LWm0/c;", "LWm0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class g extends N implements Y41.l<q<InterfaceC15776a, DeliveryReturnCheckoutInternalAction, Wm0.c, Wm0.b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f255344l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f255345m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f255346n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f255347o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j f255348p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, j jVar) {
        super(1);
        this.f255344l = eVar;
        this.f255345m = aVar;
        this.f255346n = screenPerformanceTracker;
        this.f255347o = mVar;
        this.f255348p = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC15776a, DeliveryReturnCheckoutInternalAction, Wm0.c, Wm0.b> qVar) {
        q<InterfaceC15776a, DeliveryReturnCheckoutInternalAction, Wm0.c, Wm0.b> qVar2 = qVar;
        qVar2.f92008d = this.f255344l;
        qVar2.f92009e = this.f255345m;
        qVar2.f92011g = new o(this.f255346n, this.f255347o);
        qVar2.f92010f = this.f255348p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
