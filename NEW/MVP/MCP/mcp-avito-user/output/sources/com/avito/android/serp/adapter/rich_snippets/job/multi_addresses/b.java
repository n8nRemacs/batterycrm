package com.avito.android.serp.adapter.rich_snippets.job.multi_addresses;

import Y61.k;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertRichJobMultiAddressesItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {
    public static final boolean a(@k TV0.a aVar) {
        GeoReference geoReference;
        GeoReference geoReference2;
        GeoReference.AdditionalInfo additionalInfo = null;
        if (aVar instanceof AdvertItem) {
            GeoReference.AdditionalInfo.Companion companion = GeoReference.AdditionalInfo.INSTANCE;
            List<GeoReference> list = ((AdvertItem) aVar).f268426c0;
            if (list != null && (geoReference2 = (GeoReference) C42745f0.E(list)) != null) {
                additionalInfo = geoReference2.getAdditionalInfo();
            }
            return companion.isNotNullAndNotEmpty(additionalInfo);
        }
        if (!(aVar instanceof AdvertXlItem)) {
            return false;
        }
        GeoReference.AdditionalInfo.Companion companion2 = GeoReference.AdditionalInfo.INSTANCE;
        List<GeoReference> list2 = ((AdvertXlItem) aVar).f268765R;
        if (list2 != null && (geoReference = (GeoReference) C42745f0.E(list2)) != null) {
            additionalInfo = geoReference.getAdditionalInfo();
        }
        return companion2.isNotNullAndNotEmpty(additionalInfo);
    }
}
