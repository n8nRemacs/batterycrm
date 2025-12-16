package com.avito.android.tariff_cpt.configure.landing.mvi;

import com.avito.android.tariff_cpt.configure.landing.mvi.entity.TariffCptConfigureLandingInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;
import oC0.C44625c;
import oC0.InterfaceC44623a;

/* compiled from: TariffCptConfigureLandingActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LoC0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/tariff_cpt/configure/landing/mvi/entity/TariffCptConfigureLandingInternalAction;", "invoke", "(LoC0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements Y41.l<InterfaceC44623a, InterfaceC43160i<? extends TariffCptConfigureLandingInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f297770l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C44625c> f297771m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Y41.a<C44625c> aVar) {
        super(1);
        this.f297770l = cVar;
        this.f297771m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends TariffCptConfigureLandingInternalAction> invoke(InterfaceC44623a interfaceC44623a) {
        C44625c c44625cInvoke = this.f297771m.invoke();
        return this.f297770l.b(interfaceC44623a, c44625cInvoke);
    }
}
