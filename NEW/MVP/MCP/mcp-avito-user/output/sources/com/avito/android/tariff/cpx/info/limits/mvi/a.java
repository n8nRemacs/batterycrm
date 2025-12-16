package com.avito.android.tariff.cpx.info.limits.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.tariff.cpx.info.limits.mvi.entity.TariffCpxInfoLimitsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vB0.InterfaceC49191a;

/* compiled from: TariffCpxInfoLimitsActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff/cpx/info/limits/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LvB0/a;", "Lcom/avito/android/tariff/cpx/info/limits/mvi/entity/TariffCpxInfoLimitsInternalAction;", "LvB0/c;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC49191a, TariffCpxInfoLimitsInternalAction, vB0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpx.info.limits.mvi.domain.a f296598a;

    @Inject
    public a(@Y61.k com.avito.android.tariff.cpx.info.limits.mvi.domain.a aVar) {
        this.f296598a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<TariffCpxInfoLimitsInternalAction> b(InterfaceC49191a interfaceC49191a, vB0.c cVar) {
        InterfaceC49191a interfaceC49191a2 = interfaceC49191a;
        if (interfaceC49191a2 instanceof InterfaceC49191a.b) {
            return this.f296598a.a();
        }
        if (interfaceC49191a2 instanceof InterfaceC49191a.C12748a) {
            return new C43210w(TariffCpxInfoLimitsInternalAction.Close.f296614b);
        }
        if (interfaceC49191a2 instanceof InterfaceC49191a.c) {
            return new C43210w(new TariffCpxInfoLimitsInternalAction.SelectTab(((InterfaceC49191a.c) interfaceC49191a2).f440519a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
