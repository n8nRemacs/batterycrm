package com.avito.android.advert.item.delivery_suggests;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import com.avito.android.remote.delivery_suggests.DeliverySuggests;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsDeliverySuggestsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/delivery_suggests/h;", "Lcom/avito/android/advert/item/delivery_suggests/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28173a f75113b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.price_with_delivery.c f75114c;

    @Inject
    public h(@Y61.k InterfaceC28173a interfaceC28173a, @Y61.k com.avito.android.advert_core.price_with_delivery.c cVar) {
        this.f75113b = interfaceC28173a;
        this.f75114c = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String id2;
        Object next;
        DeliverySuggests.Item.SelectionSettings selectionSettings;
        j jVar = (j) eVar;
        AdvertDetailsDeliverySuggestsItem advertDetailsDeliverySuggestsItem = (AdvertDetailsDeliverySuggestsItem) aVar;
        DeliverySuggests deliverySuggests = advertDetailsDeliverySuggestsItem.f75094d;
        List<DeliverySuggests.Item> items = deliverySuggests.getItems();
        if (!(items instanceof Collection) || !items.isEmpty()) {
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                if (((DeliverySuggests.Item) it.next()).l()) {
                    if (advertDetailsDeliverySuggestsItem.f75098h == null) {
                        Iterator<T> it2 = deliverySuggests.getItems().iterator();
                        while (true) {
                            id2 = null;
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it2.next();
                                if (((DeliverySuggests.Item) next).l()) {
                                    break;
                                }
                            }
                        }
                        DeliverySuggests.Item item = (DeliverySuggests.Item) next;
                        if (item != null && (selectionSettings = item.getSelectionSettings()) != null) {
                            id2 = selectionSettings.getId();
                        }
                        this.f75114c.b(id2);
                        advertDetailsDeliverySuggestsItem.f75098h = id2;
                    }
                    jVar.Lh(advertDetailsDeliverySuggestsItem.f75094d, advertDetailsDeliverySuggestsItem.f75098h, false, new f(this), new g(this, advertDetailsDeliverySuggestsItem, jVar));
                    return;
                }
            }
        }
        jVar.Lh(advertDetailsDeliverySuggestsItem.f75094d, null, false, new d(this), new e(this, advertDetailsDeliverySuggestsItem, jVar));
    }
}
