package com.avito.android.campaigns_sale_search.mvi;

import com.avito.android.campaigns_sale.network.remote.model.SearchBonusInfo;
import com.avito.android.campaigns_sale.network.remote.model.SearchBonusInfoCard;
import com.avito.android.campaigns_sale.network.remote.model.SearchItem;
import com.avito.android.campaigns_sale_search.konveyor.search_item.SearchItemButton;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import um.AbstractC49075a;
import um.g;

/* compiled from: CampaignsSaleSearchReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_campaigns-sale_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class x {
    public static final List a(List list) {
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) next;
            if (!(aVar instanceof com.avito.android.campaigns_sale_search.konveyor.page_loading_item.a) && !(aVar instanceof com.avito.android.campaigns_sale_search.konveyor.page_error_item.a)) {
                arrayList2.add(next);
            }
        }
        return C42745f0.M0(arrayList2);
    }

    public static final ArrayList b(List list) {
        List<SearchItem> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (SearchItem searchItem : list2) {
            arrayList.add(new com.avito.android.campaigns_sale_search.konveyor.search_item.a(searchItem.getId(), searchItem.getTitle(), searchItem.getPrice(), searchItem.getImage(), searchItem.getIsBanned() ? null : searchItem.getIsInSale() ? SearchItemButton.f114594b : SearchItemButton.f114595c, searchItem.getValidate(), searchItem.getIsBanned(), searchItem.getBonusInfo()));
        }
        return arrayList;
    }

    public static final um.d c(String str, AttributedText attributedText, SearchItemButton searchItemButton, SearchBonusInfoCard searchBonusInfoCard, um.d dVar) {
        SearchBonusInfo searchBonusInfoA;
        SearchBonusInfo searchBonusInfo;
        um.g gVar = dVar.f440267g;
        g.e eVar = gVar instanceof g.e ? (g.e) gVar : null;
        if (eVar == null) {
            return dVar;
        }
        List<com.avito.conveyor_item.a> list = eVar.f440276c;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (com.avito.conveyor_item.a aVar : list) {
            if (L.f(aVar.getF262931b(), str) && (aVar instanceof com.avito.android.campaigns_sale_search.konveyor.search_item.a)) {
                if (searchBonusInfoCard != null) {
                    SearchBonusInfo searchBonusInfo2 = ((com.avito.android.campaigns_sale_search.konveyor.search_item.a) aVar).f114605i;
                    if (searchBonusInfo2 != null) {
                        searchBonusInfoA = SearchBonusInfo.a(searchBonusInfo2, searchBonusInfoCard);
                    } else {
                        searchBonusInfo = null;
                        com.avito.android.campaigns_sale_search.konveyor.search_item.a aVar2 = (com.avito.android.campaigns_sale_search.konveyor.search_item.a) aVar;
                        aVar = new com.avito.android.campaigns_sale_search.konveyor.search_item.a(aVar2.f114598b, aVar2.f114599c, attributedText, aVar2.f114601e, searchItemButton, aVar2.f114603g, aVar2.f114604h, searchBonusInfo);
                    }
                } else {
                    searchBonusInfoA = ((com.avito.android.campaigns_sale_search.konveyor.search_item.a) aVar).f114605i;
                }
                searchBonusInfo = searchBonusInfoA;
                com.avito.android.campaigns_sale_search.konveyor.search_item.a aVar22 = (com.avito.android.campaigns_sale_search.konveyor.search_item.a) aVar;
                aVar = new com.avito.android.campaigns_sale_search.konveyor.search_item.a(aVar22.f114598b, aVar22.f114599c, attributedText, aVar22.f114601e, searchItemButton, aVar22.f114603g, aVar22.f114604h, searchBonusInfo);
            }
            arrayList.add(aVar);
        }
        return um.d.a(dVar, null, null, null, null, null, g.e.a(eVar, arrayList, null, 11), 31);
    }

    public static final um.d d(com.avito.android.campaigns_sale_search.konveyor.search_item.a aVar, um.d dVar) {
        um.g gVar = dVar.f440267g;
        g.e eVar = gVar instanceof g.e ? (g.e) gVar : null;
        return eVar == null ? dVar : aVar == null ? um.d.a(dVar, null, null, null, null, null, g.e.a(eVar, null, AbstractC49075a.C12726a.f440226a, 7), 31) : um.d.a(dVar, null, null, null, null, null, g.e.a(eVar, null, new AbstractC49075a.b(aVar, null, null, false), 7), 31);
    }

    public static um.d e(Y41.a aVar, Y41.a aVar2, Y41.a aVar3, um.d dVar, int i12) {
        if ((i12 & 1) != 0) {
            aVar = null;
        }
        if ((i12 & 2) != 0) {
            aVar2 = null;
        }
        if ((i12 & 4) != 0) {
            aVar3 = null;
        }
        um.g gVar = dVar.f440267g;
        g.e eVar = gVar instanceof g.e ? (g.e) gVar : null;
        AbstractC49075a abstractC49075a = eVar != null ? eVar.f440277d : null;
        AbstractC49075a.b bVar = abstractC49075a instanceof AbstractC49075a.b ? (AbstractC49075a.b) abstractC49075a : null;
        if (bVar != null) {
            return um.d.a(dVar, null, null, null, null, null, g.e.a(eVar, null, new AbstractC49075a.b(bVar.f440227a, aVar != null ? (Integer) ((t) aVar).invoke() : bVar.f440228b, aVar2 != null ? (String) ((u) aVar2).invoke() : bVar.f440229c, aVar3 != null ? Boolean.TRUE.booleanValue() : bVar.f440230d), 7), 31);
        }
        return dVar;
    }
}
