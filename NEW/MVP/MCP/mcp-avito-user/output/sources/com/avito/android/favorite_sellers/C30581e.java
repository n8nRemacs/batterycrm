package com.avito.android.favorite_sellers;

import com.avito.android.favorite_sellers.adapter.advert_list.AdvertListItem;
import com.avito.android.serp.adapter.n1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FavoriteSellerAdvertsStatusProcessor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/e;", "Lcom/avito/android/favorite_sellers/d;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorite_sellers.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30581e implements InterfaceC30580d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.T f155886a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n1 f155887b;

    @Inject
    public C30581e(@Y61.k com.avito.android.serp.adapter.T t12, @Y61.k n1 n1Var) {
        this.f155886a = t12;
        this.f155887b = n1Var;
    }

    @Override // com.avito.android.favorite_sellers.InterfaceC30580d
    @Y61.k
    public final List a(@Y61.k ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof AdvertListItem) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            AdvertListItem advertListItem = (AdvertListItem) it.next();
            this.f155887b.b(advertListItem.f155495d);
            this.f155886a.b(advertListItem.f155495d);
        }
        return arrayList;
    }
}
