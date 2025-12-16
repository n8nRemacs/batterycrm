package gr0;

import Y61.k;
import Y61.l;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.advertising.EmbeddedAdvBanner;
import com.avito.android.remote.model.advertising.EmbeddedProfilePromo;
import com.avito.android.serp.adapter.ad.SerpProfilePromoBannerItem;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;

/* compiled from: SerpCommercialBannerConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgr0/b;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {
    @l
    l1 a(@k EmbeddedAdvBanner embeddedAdvBanner, @k SerpDisplayType serpDisplayType);

    @l
    SerpProfilePromoBannerItem b(@k EmbeddedProfilePromo embeddedProfilePromo, @k SerpDisplayType serpDisplayType);

    @l
    l1 c(@k CommercialBannerItem commercialBannerItem, @k SerpDisplayType serpDisplayType);
}
