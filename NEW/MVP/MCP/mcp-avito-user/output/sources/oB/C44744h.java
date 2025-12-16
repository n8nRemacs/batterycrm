package ob;

import Y61.l;
import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.remote.model.SerpBannerContainer;
import com.avito.android.remote.model.SerpBannerContainerKt;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.advertising.AdNetworkBannerItem;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CommercialBannerItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advertising_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: ob.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44744h {
    @l
    public static final String a(@Y61.k CommercialBanner commercialBanner) {
        AdNetworkBannerItem adNetworkBannerItem = (AdNetworkBannerItem) C42745f0.G(commercialBanner.f86886c);
        if (adNetworkBannerItem != null) {
            return adNetworkBannerItem.getBannerCode();
        }
        return null;
    }

    @Y61.k
    public static final CommercialBannerItem b(@Y61.k SerpBannerContainer serpBannerContainer) {
        List<SerpElement> elements = serpBannerContainer.getElements();
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            if (obj instanceof AdNetworkBannerItem) {
                arrayList.add(obj);
            }
        }
        String string = UUID.randomUUID().toString();
        Boolean enableEventSampling = serpBannerContainer.getEnableEventSampling();
        return new CommercialBannerItem(0L, "", AdViewType.f86911e, SerpDisplayType.Grid, 0, SerpBannerContainerKt.getAdSize(serpBannerContainer), new CommercialBanner(string, arrayList, enableEventSampling != null ? enableEventSampling.booleanValue() : false, serpBannerContainer.getAnalyticParams(), 0L, null, null, null, 240, null), null, 128, null);
    }
}
