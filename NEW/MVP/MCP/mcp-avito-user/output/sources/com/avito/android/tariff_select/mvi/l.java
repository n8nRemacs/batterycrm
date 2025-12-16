package com.avito.android.tariff_select.mvi;

import cE0.C27030a;
import com.avito.android.arch.mvi.u;
import com.avito.android.tariff_select.mvi.entity.TariffSelectInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffSelectReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_select/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff_select/mvi/entity/TariffSelectInternalAction;", "LZD0/c;", "_avito_tariff-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements u<TariffSelectInternalAction, ZD0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_select.data.a f301249b;

    @Inject
    public l(@Y61.k com.avito.android.tariff_select.data.a aVar) {
        this.f301249b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final ZD0.c a(TariffSelectInternalAction tariffSelectInternalAction, ZD0.c cVar) {
        TariffSelectInternalAction tariffSelectInternalAction2 = tariffSelectInternalAction;
        ZD0.c cVar2 = cVar;
        if (tariffSelectInternalAction2 instanceof TariffSelectInternalAction.Loading) {
            return ZD0.c.a(cVar2, null, true);
        }
        if (!(tariffSelectInternalAction2 instanceof TariffSelectInternalAction.Content)) {
            return tariffSelectInternalAction2 instanceof TariffSelectInternalAction.Error ? ZD0.c.a(cVar2, ((TariffSelectInternalAction.Error) tariffSelectInternalAction2).f301234b, false) : cVar2;
        }
        C27030a c27030a = ((TariffSelectInternalAction.Content) tariffSelectInternalAction2).f301233b;
        return new ZD0.c(c27030a.getNavBar(), this.f301249b.a(c27030a), null, false);
    }
}
