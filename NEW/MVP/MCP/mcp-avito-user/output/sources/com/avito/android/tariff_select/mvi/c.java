package com.avito.android.tariff_select.mvi;

import ZD0.a;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff_select.mvi.entity.TariffSelectInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TariffSelectActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/tariff_select/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LZD0/a;", "Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction;", "LZD0/c;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements com.avito.android.arch.mvi.a<ZD0.a, TariffSelectInternalAction, ZD0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_select.domain.a f301229a;

    @Inject
    public c(@Y61.k com.avito.android.tariff_select.domain.a aVar) {
        this.f301229a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return com.avito.android.arch.mvi.utils.h.e(c43197r1, a.f301226l, new b(this, aVar), 1000L);
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<TariffSelectInternalAction> b(@Y61.k ZD0.a aVar, @Y61.k ZD0.c cVar) {
        C43210w c43210w;
        ButtonAction button;
        if (aVar instanceof a.C1426a) {
            return new C43210w(TariffSelectInternalAction.Back.f301232b);
        }
        if (aVar instanceof a.c) {
            uZ.e eVar = cVar.f19995b;
            return new C43210w(new TariffSelectInternalAction.HandleDeeplink((eVar == null || (button = eVar.getButton()) == null) ? null : button.getDeeplink()));
        }
        if (aVar instanceof a.d) {
            return this.f301229a.invoke();
        }
        if (aVar instanceof a.b) {
            c43210w = new C43210w(new TariffSelectInternalAction.HandleDeeplink(((a.b) aVar).f19987a));
        } else {
            if (!(aVar instanceof a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(new TariffSelectInternalAction.HandleDeeplink(((a.e) aVar).f19990a));
        }
        return c43210w;
    }
}
