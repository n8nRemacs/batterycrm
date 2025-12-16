package com.avito.android.tariff_lf_publication.region.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.tariff_lf_publication.region.mvi.entity.TariffLfPublicationRegionInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TariffLfPublicationRegionReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_publication/region/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff_lf_publication/region/mvi/entity/TariffLfPublicationRegionInternalAction;", "LVD0/c;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements u<TariffLfPublicationRegionInternalAction, VD0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_publication.region.data.mapper.a f301117b;

    @Inject
    public j(@Y61.k com.avito.android.tariff_lf_publication.region.data.mapper.a aVar) {
        this.f301117b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final VD0.c a(TariffLfPublicationRegionInternalAction tariffLfPublicationRegionInternalAction, VD0.c cVar) {
        TariffLfPublicationRegionInternalAction tariffLfPublicationRegionInternalAction2 = tariffLfPublicationRegionInternalAction;
        VD0.c cVar2 = cVar;
        if (tariffLfPublicationRegionInternalAction2 instanceof TariffLfPublicationRegionInternalAction.Loading) {
            return VD0.c.a(cVar2, true, null, null, null, false, null, 60);
        }
        if (tariffLfPublicationRegionInternalAction2 instanceof TariffLfPublicationRegionInternalAction.Error) {
            return VD0.c.a(cVar2, false, ((TariffLfPublicationRegionInternalAction.Error) tariffLfPublicationRegionInternalAction2).f301106b, null, null, false, null, 60);
        }
        if (tariffLfPublicationRegionInternalAction2 instanceof TariffLfPublicationRegionInternalAction.Content) {
            SD0.a aVar = ((TariffLfPublicationRegionInternalAction.Content) tariffLfPublicationRegionInternalAction2).f301105b;
            com.avito.android.tariff_lf_publication.region.data.mapper.a aVar2 = this.f301117b;
            return VD0.c.a(cVar2, false, null, aVar2.b(aVar), aVar2.c(aVar), false, aVar2.a(aVar), 18);
        }
        if (tariffLfPublicationRegionInternalAction2 instanceof TariffLfPublicationRegionInternalAction.ChangeNextButtonLoading) {
            return VD0.c.a(cVar2, false, null, null, null, ((TariffLfPublicationRegionInternalAction.ChangeNextButtonLoading) tariffLfPublicationRegionInternalAction2).f301102b, null, 47);
        }
        if (!(tariffLfPublicationRegionInternalAction2 instanceof TariffLfPublicationRegionInternalAction.ChangeRegion)) {
            return cVar2;
        }
        TariffLfPublicationRegionInternalAction.ChangeRegion changeRegion = (TariffLfPublicationRegionInternalAction.ChangeRegion) tariffLfPublicationRegionInternalAction2;
        List<com.avito.conveyor_item.a> list = cVar2.f17022d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = changeRegion.f301103b;
            if (!zHasNext) {
                return VD0.c.a(cVar2, false, null, arrayList, null, false, str, 27);
            }
            com.avito.conveyor_item.a cVar3 = (com.avito.conveyor_item.a) it.next();
            if (cVar3 instanceof com.avito.android.tariff_lf_publication.region.ui.items.option.c) {
                com.avito.android.tariff_lf_publication.region.ui.items.option.c cVar4 = (com.avito.android.tariff_lf_publication.region.ui.items.option.c) cVar3;
                boolean zF2 = L.f(cVar4.f301124c, str);
                cVar3 = new com.avito.android.tariff_lf_publication.region.ui.items.option.c(cVar4.f301123b, cVar4.f301124c, cVar4.f301125d, zF2);
            }
            arrayList.add(cVar3);
        }
    }
}
