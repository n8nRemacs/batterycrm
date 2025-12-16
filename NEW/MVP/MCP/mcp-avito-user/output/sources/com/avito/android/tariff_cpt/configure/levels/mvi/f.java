package com.avito.android.tariff_cpt.configure.levels.mvi;

import com.avito.android.tariff_cpt.configure.levels.mvi.entity.TariffCptConfigureLevelsInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qC0.C47281c;
import qC0.InterfaceC47279a;

/* compiled from: TariffCptConfigureLevelsActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LqC0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/tariff_cpt/configure/levels/mvi/entity/TariffCptConfigureLevelsInternalAction;", "invoke", "(LqC0/a;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.l<InterfaceC47279a, InterfaceC43160i<? extends TariffCptConfigureLevelsInternalAction>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f297904l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C47281c> f297905m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Y41.a<C47281c> aVar) {
        super(1);
        this.f297904l = gVar;
        this.f297905m = aVar;
    }

    @Override // Y41.l
    public final InterfaceC43160i<? extends TariffCptConfigureLevelsInternalAction> invoke(InterfaceC47279a interfaceC47279a) {
        C47281c c47281cInvoke = this.f297905m.invoke();
        return this.f297904l.b(interfaceC47279a, c47281cInvoke);
    }
}
