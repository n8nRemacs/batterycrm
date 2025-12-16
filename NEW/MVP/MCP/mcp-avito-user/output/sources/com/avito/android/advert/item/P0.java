package com.avito.android.advert.item;

import com.avito.android.InterfaceC32897n0;
import com.avito.android.remote.model.recommended_sellers.RecommendedSeller;
import com.avito.android.remote.model.recommended_sellers.RecommendedSellerElement;
import com.avito.android.remote.model.recommended_sellers.RecommendedSellersCarousel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/n0;", "map", "Lkotlin/G0;", "accept", "(Ljava/util/Set;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class P0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f71787b;

    public P0(C28136i0 c28136i0) {
        this.f71787b = c28136i0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        ArrayList arrayListA = this.f71787b.f76357k.a();
        Set set = (Set) obj;
        int iF2 = kotlin.collections.P0.f(C42745f0.q(set, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (T t12 : set) {
            linkedHashMap.put(((InterfaceC32897n0) t12).getF155494c(), t12);
        }
        ArrayList arrayList = new ArrayList();
        for (T t13 : arrayListA) {
            if (t13 instanceof RecommendedSellersCarousel) {
                arrayList.add(t13);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<RecommendedSellerElement> items = ((RecommendedSellersCarousel) it.next()).getItems();
            if (items != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t14 : items) {
                    if (t14 instanceof RecommendedSeller) {
                        arrayList2.add(t14);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    RecommendedSeller recommendedSeller = (RecommendedSeller) it2.next();
                    InterfaceC32897n0 interfaceC32897n0 = (InterfaceC32897n0) linkedHashMap.get(recommendedSeller.getUserKey());
                    if (interfaceC32897n0 != null) {
                        recommendedSeller.setSubscribed(interfaceC32897n0.getF155497f());
                        recommendedSeller.setNotificationsActivated(interfaceC32897n0.getF155498g());
                    }
                }
            }
        }
    }
}
