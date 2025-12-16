package com.avito.android.advert.item;

import com.avito.android.advert_details_items.sellerprofile.subscription.SellerSubscriptionItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k4.C42501e;
import k4.InterfaceC42497a;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertDetailsView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/y1;", "Lcom/avito/android/advert/item/Q;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.y1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28226y1 implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I1 f80765a;

    public C28226y1(I1 i12) {
        this.f80765a = i12;
    }

    @Override // com.avito.android.advert.item.Q
    @Y61.k
    public final ArrayList a() {
        List<C42501e.a> list = this.f80765a.f71691a0.getState().getValue().f406058a.f406080a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C42745f0.h(C42745f0.B(((C42501e.a) it.next()).f406084b, SellerSubscriptionItem.class), arrayList);
        }
        return arrayList;
    }

    @Override // com.avito.android.advert.item.Q
    public final void e(@Y61.k PersistableSpannedItem persistableSpannedItem) {
        this.f80765a.f71691a0.accept(new InterfaceC42497a.f(persistableSpannedItem));
    }
}
