package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.safedeal.trust_factors.TrustFactorsItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.safedeal.SafeDeal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: AdvertDetailsSafeDealTrustFactorsItemsFactory.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/g4;", "Lcom/avito/android/advert/item/blocks/items_factories/f4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.items_factories.g4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27968g4 implements InterfaceC27961f4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.safedeal.trust_factors.a f73957a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.safedeal.trust_factors.f f73958b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I6.a f73959c;

    @Inject
    public C27968g4(@Y61.k com.avito.android.advert.item.safedeal.trust_factors.a aVar, @Y61.k com.avito.android.advert.item.safedeal.trust_factors.f fVar, @Y61.k I6.a aVar2) {
        this.f73957a = aVar;
        this.f73958b = fVar;
        this.f73959c = aVar2;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.InterfaceC27961f4
    @Y61.k
    public final List<TrustFactorsItem> a(@Y61.k AdvertDetails advertDetails) {
        LinkedHashMap linkedHashMap;
        SafeDeal safeDeal = advertDetails.getSafeDeal();
        if (safeDeal == null) {
            return C42784z0.f406748b;
        }
        List<SafeDeal.Component> components = safeDeal.getComponents();
        if (components == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        for (SafeDeal.Component component : components) {
            this.f73957a.getClass();
            arrayList.add(com.avito.android.advert.item.safedeal.trust_factors.a.a(component));
        }
        ArrayList arrayListA = com.avito.android.advert.item.safedeal.trust_factors.g.a(this.f73958b, arrayList);
        Set<String> setB = this.f73959c.b();
        Map<String, SafeDeal.TooltipData> mapH = safeDeal.h();
        Object obj = null;
        if (mapH != null) {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, SafeDeal.TooltipData> entry : mapH.entrySet()) {
                if (!setB.contains(entry.getValue().getLabel())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return arrayListA;
        }
        Iterator it = arrayListA.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (linkedHashMap.containsKey(((TrustFactorsItem) next).getF283255b())) {
                obj = next;
                break;
            }
        }
        TrustFactorsItem trustFactorsItem = (TrustFactorsItem) obj;
        if (trustFactorsItem == null) {
            return arrayListA;
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayListA, 10));
        Iterator it2 = arrayListA.iterator();
        while (it2.hasNext()) {
            TrustFactorsItem trustFactorsItemS3 = (TrustFactorsItem) it2.next();
            if (kotlin.jvm.internal.L.f(trustFactorsItemS3, trustFactorsItem)) {
                trustFactorsItemS3 = trustFactorsItemS3.S3((SafeDeal.TooltipData) linkedHashMap.get(trustFactorsItemS3.getF283255b()));
            }
            arrayList2.add(trustFactorsItemS3);
        }
        return arrayList2;
    }
}
