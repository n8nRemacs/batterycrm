package com.avito.android.advert.item.blocks.items_factories;

import com.avito.android.C29640d;
import com.avito.android.advert.item.compatibility.v4.GarageCompatibilityV4Item;
import com.avito.android.remote.model.AdvertDetails;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GarageCompatibilityV4ItemFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/items_factories/w5;", "Lcom/avito/android/advert/item/blocks/items_factories/v5;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class w5 implements v5 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C29640d f74065a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f74066b;

    @Inject
    public w5(@Y61.k C29640d c29640d, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f74065a = c29640d;
        this.f74066b = jVar;
    }

    @Override // com.avito.android.advert.item.blocks.items_factories.v5
    @Y61.l
    public final GarageCompatibilityV4Item a(@Y61.k AdvertDetails advertDetails) {
        Map<String, String> sparePartFiltersV4 = advertDetails.getSparePartFiltersV4();
        C29640d c29640d = this.f74065a;
        c29640d.getClass();
        kotlin.reflect.n<Object> nVar = C29640d.f132175X[45];
        if (!((Boolean) c29640d.f132194S.a().invoke()).booleanValue() || !advertDetails.isActive() || sparePartFiltersV4 == null) {
            return null;
        }
        return new GarageCompatibilityV4Item(0L, null, sparePartFiltersV4, advertDetails.getId(), this.f74066b.a(), null, null, 99, null);
    }
}
