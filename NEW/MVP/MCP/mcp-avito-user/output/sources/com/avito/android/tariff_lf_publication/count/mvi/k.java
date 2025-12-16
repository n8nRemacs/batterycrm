package com.avito.android.tariff_lf_publication.count.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.tariff_lf_publication.count.mvi.entity.TariffLfPublicationCountInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TariffLfPublicationCountReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_publication/count/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff_lf_publication/count/mvi/entity/TariffLfPublicationCountInternalAction;", "LMD0/c;", "_avito_tariff-lf-publication_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements u<TariffLfPublicationCountInternalAction, MD0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_publication.count.data.mapper.a f300850b;

    @Inject
    public k(@Y61.k com.avito.android.tariff_lf_publication.count.data.mapper.a aVar) {
        this.f300850b = aVar;
    }

    public static com.avito.android.tariff_lf_publication.count.ui.items.option.c b(List list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof com.avito.android.tariff_lf_publication.count.ui.items.option.c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.avito.android.tariff_lf_publication.count.ui.items.option.c) next).f300860e) {
                break;
            }
        }
        return (com.avito.android.tariff_lf_publication.count.ui.items.option.c) next;
    }

    @Override // com.avito.android.arch.mvi.u
    public final MD0.c a(TariffLfPublicationCountInternalAction tariffLfPublicationCountInternalAction, MD0.c cVar) {
        long j12;
        TariffLfPublicationCountInternalAction tariffLfPublicationCountInternalAction2 = tariffLfPublicationCountInternalAction;
        MD0.c cVar2 = cVar;
        if (tariffLfPublicationCountInternalAction2 instanceof TariffLfPublicationCountInternalAction.Loading) {
            return MD0.c.a(cVar2, true, null, null, null, false, null, null, false, null, 508);
        }
        if (tariffLfPublicationCountInternalAction2 instanceof TariffLfPublicationCountInternalAction.ScreenError) {
            return MD0.c.a(cVar2, false, ((TariffLfPublicationCountInternalAction.ScreenError) tariffLfPublicationCountInternalAction2).f300833b, null, null, false, null, null, false, null, 508);
        }
        if (tariffLfPublicationCountInternalAction2 instanceof TariffLfPublicationCountInternalAction.Content) {
            PD0.a aVar = ((TariffLfPublicationCountInternalAction.Content) tariffLfPublicationCountInternalAction2).f300828b;
            com.avito.android.tariff_lf_publication.count.data.mapper.a aVar2 = this.f300850b;
            ArrayList arrayListA = aVar2.a(aVar);
            com.avito.android.tariff_lf_publication.count.ui.items.option.c cVarB = b(arrayListA);
            return MD0.c.a(cVar2, false, null, arrayListA, aVar2.b(aVar), false, aVar.getTotalInfo().getTitle(), cVarB != null ? cVarB.f300862g : null, false, cVarB != null ? Long.valueOf(cVarB.f300858c) : null, 146);
        }
        if (tariffLfPublicationCountInternalAction2 instanceof TariffLfPublicationCountInternalAction.ChangeNextButtonLoading) {
            return MD0.c.a(cVar2, false, null, null, null, ((TariffLfPublicationCountInternalAction.ChangeNextButtonLoading) tariffLfPublicationCountInternalAction2).f300826b, null, null, false, null, 495);
        }
        boolean z12 = tariffLfPublicationCountInternalAction2 instanceof TariffLfPublicationCountInternalAction.ChangeCount;
        List<com.avito.conveyor_item.a> list = cVar2.f10475d;
        if (z12) {
            TariffLfPublicationCountInternalAction.ChangeCount changeCount = (TariffLfPublicationCountInternalAction.ChangeCount) tariffLfPublicationCountInternalAction2;
            List<com.avito.conveyor_item.a> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                j12 = changeCount.f300824b;
                if (!zHasNext) {
                    break;
                }
                TV0.a aVarA = (com.avito.conveyor_item.a) it.next();
                if (aVarA instanceof com.avito.android.tariff_lf_publication.count.ui.items.option.c) {
                    com.avito.android.tariff_lf_publication.count.ui.items.option.c cVar3 = (com.avito.android.tariff_lf_publication.count.ui.items.option.c) aVarA;
                    aVarA = com.avito.android.tariff_lf_publication.count.ui.items.option.c.a(cVar3, cVar3.f300858c == j12, null, null, 55);
                }
                arrayList.add(aVarA);
            }
            LD0.a aVar3 = changeCount.f300825c;
            return MD0.c.a(cVar2, false, null, arrayList, null, false, null, aVar3, aVar3 == null, Long.valueOf(j12), 59);
        }
        if (!(tariffLfPublicationCountInternalAction2 instanceof TariffLfPublicationCountInternalAction.UpdatePriceInfo)) {
            return cVar2;
        }
        TariffLfPublicationCountInternalAction.UpdatePriceInfo updatePriceInfo = (TariffLfPublicationCountInternalAction.UpdatePriceInfo) tariffLfPublicationCountInternalAction2;
        QD0.b bVar = updatePriceInfo.f300837c;
        LD0.a aVar4 = new LD0.a(bVar.getOldPrice(), bVar.getPrice());
        List<com.avito.conveyor_item.a> list3 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
        for (TV0.a aVarA2 : list3) {
            if (aVarA2 instanceof com.avito.android.tariff_lf_publication.count.ui.items.option.c) {
                com.avito.android.tariff_lf_publication.count.ui.items.option.c cVar4 = (com.avito.android.tariff_lf_publication.count.ui.items.option.c) aVarA2;
                if (cVar4.f300858c == updatePriceInfo.f300836b) {
                    aVarA2 = com.avito.android.tariff_lf_publication.count.ui.items.option.c.a(cVar4, false, updatePriceInfo.f300838d, aVar4, 15);
                }
            }
            arrayList2.add(aVarA2);
        }
        com.avito.android.tariff_lf_publication.count.ui.items.option.c cVarB2 = b(arrayList2);
        LD0.a aVar5 = cVarB2 != null ? cVarB2.f300862g : null;
        return MD0.c.a(cVar2, false, null, arrayList2, null, false, null, aVar5, aVar5 == null, null, 315);
    }
}
