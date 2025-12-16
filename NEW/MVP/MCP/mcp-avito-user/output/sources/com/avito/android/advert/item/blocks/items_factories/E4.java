package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.advert.item.services_title.ServicesTitleItem;
import com.avito.android.remote.model.AdvertDetails;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsServicesTitleItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/E4;", "Lcom/avito/android/advert/item/blocks/items_factories/D4;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class E4 implements D4 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73741a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.B2 f73742b;

    @Inject
    public E4(@Y61.k com.avito.android.B2 b22, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73741a = jVar;
        this.f73742b = b22;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.D4
    public final boolean a(@Y61.k AdvertDetails advertDetails) {
        if (advertDetails.getServicesTitle() != null) {
            com.avito.android.B2 b22 = this.f73742b;
            b22.getClass();
            kotlin.reflect.n<Object> nVar = com.avito.android.B2.f67184X[5];
            if (((Boolean) b22.f67213g.a().invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.D4
    @Y61.l
    public final ServicesTitleItem b(@Y61.k AdvertDetails advertDetails) {
        if (!a(advertDetails)) {
            return null;
        }
        return new ServicesTitleItem(0L, null, this.f73741a.a(), null, null, advertDetails.getServicesTitle(), 27, null);
    }
}
