package com.avito.android.advert.item.spare_parts;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SparePartsFilters;
import com.avito.android.remote.model.SparePartsParameters;
import com.avito.android.remote.models.SparePartsV2Response;
import com.avito.android.util.P2;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SparePartsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/spare_parts/a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: SparePartsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.spare_parts.a$a, reason: collision with other inner class name */
    public static final class C2378a {
    }

    @k
    InterfaceC43160i<P2<SparePartsV2Response>> a(@k SparePartsParameters sparePartsParameters, @k String str);

    void b(@l DeepLink deepLink);

    @k
    InterfaceC43160i<P2<com.avito.android.advert.item.spare_parts.data.a>> c(@l SparePartsFilters sparePartsFilters, @l Map<String, String> map, @k String str);

    void m0();
}
