package com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi;

import ao0.C23646c;
import ao0.InterfaceC23644a;
import ao0.InterfaceC23645b;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryUniversalCheckoutFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lao0/a;", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction;", "Lao0/c;", "Lao0/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l extends N implements Y41.l<com.avito.android.arch.mvi.q<InterfaceC23644a, DeliveryUniversalCheckoutInternalAction, C23646c, InterfaceC23645b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f257171l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f257172m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f257173n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s f257174o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o f257175p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j jVar, a aVar, ScreenPerformanceTracker screenPerformanceTracker, s sVar, o oVar) {
        super(1);
        this.f257171l = jVar;
        this.f257172m = aVar;
        this.f257173n = screenPerformanceTracker;
        this.f257174o = sVar;
        this.f257175p = oVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.arch.mvi.q<InterfaceC23644a, DeliveryUniversalCheckoutInternalAction, C23646c, InterfaceC23645b> qVar) {
        com.avito.android.arch.mvi.q<InterfaceC23644a, DeliveryUniversalCheckoutInternalAction, C23646c, InterfaceC23645b> qVar2 = qVar;
        qVar2.f92008d = this.f257171l;
        qVar2.f92009e = this.f257172m;
        qVar2.f92011g = new com.avito.android.analytics.screens.mvi.o(this.f257173n, this.f257174o);
        qVar2.f92010f = this.f257175p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
