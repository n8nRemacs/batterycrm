package com.avito.android.advertising;

import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.adapter.items.avito.AvitoNetworkImageBannerItem;
import com.avito.android.advertising.adapter.items.avito.bdui.AvitoNetworkBDUIBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.BuzzoolaDirectBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.CommercialHtmlBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.media_x2.BuzzoolaMediaX2BannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.premium.BuzzoolaPremiumBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.premium_v2.BuzzoolaPremiumV2BannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoGalleryBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.video.CommercialVideoBannerItem;
import com.avito.android.advertising.adapter.items.yandex.YandexBannerItem;
import com.avito.android.advertising.loaders.B;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.C;
import com.avito.android.advertising.loaders.D;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.remote.model.SerpBannerContainer;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.advertising.AdNetworkBannerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CommercialItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_advertising_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g {
    @Y61.k
    public static final CommercialItem a(@Y61.k CommercialBanner commercialBanner, int i12, @Y61.k SerpDisplayType serpDisplayType) {
        CommercialItem profilePromoBannerItem;
        AdViewType adViewType = i12 == 1 ? serpDisplayType.isInformative() ? AdViewType.f86911e : AdViewType.f86909c : AdViewType.f86910d;
        LoadedNetworkBanner loadedNetworkBanner = commercialBanner.f86892i;
        b bVar = loadedNetworkBanner != null ? loadedNetworkBanner.f86903f : null;
        if (bVar instanceof com.avito.android.advertising.loaders.yandex.a) {
            return new YandexBannerItem(commercialBanner.f86885b, 0L, (com.avito.android.advertising.loaders.yandex.a) bVar, i12, adViewType, serpDisplayType, false, false, BannerInfo.f87863F.a(commercialBanner, null, null), 66, null);
        }
        boolean z12 = bVar instanceof BuzzoolaBanner;
        String str = commercialBanner.f86885b;
        if (z12) {
            BuzzoolaBanner buzzoolaBanner = (BuzzoolaBanner) bVar;
            if (buzzoolaBanner instanceof BuzzoolaBanner.BuzzoolaAVL) {
                return new CommercialBuzzoolaAVLItem(commercialBanner.f86885b, (BuzzoolaBanner.BuzzoolaAVL) bVar, BannerInfo.f87863F.a(commercialBanner, null, null), false, 8, null);
            }
            if (buzzoolaBanner instanceof BuzzoolaBanner.BuzzoolaDirect) {
                return new BuzzoolaDirectBannerItem(commercialBanner.f86885b, 0L, (BuzzoolaBanner.BuzzoolaDirect) bVar, i12, adViewType, serpDisplayType, false, false, BannerInfo.f87863F.a(commercialBanner, null, null), 194, null);
            }
            if (buzzoolaBanner instanceof BuzzoolaBanner.BuzzoolaMediaX2) {
                return new BuzzoolaMediaX2BannerItem(commercialBanner.f86885b, 0L, (BuzzoolaBanner.BuzzoolaMediaX2) bVar, i12, adViewType, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null), 2, null);
            }
            if (buzzoolaBanner instanceof BuzzoolaBanner.BuzzoolaPremium) {
                return new BuzzoolaPremiumBannerItem(commercialBanner.f86885b, 0L, (BuzzoolaBanner.BuzzoolaPremium) bVar, i12, adViewType, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null), 2, null);
            }
            if (buzzoolaBanner instanceof BuzzoolaBanner.BuzzoolaPremiumV2) {
                return new BuzzoolaPremiumV2BannerItem(commercialBanner.f86885b, 0L, (BuzzoolaBanner.BuzzoolaPremiumV2) bVar, i12, adViewType, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null), 2, null);
            }
            if (buzzoolaBanner instanceof BuzzoolaBanner.BuzzoolaVideo) {
                return new CommercialVideoBannerItem(commercialBanner.f86885b, 0L, (C) bVar, i12, adViewType, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null), 2, null);
            }
            if (buzzoolaBanner instanceof BuzzoolaBanner.Html) {
                return new CommercialHtmlBannerItem(commercialBanner.f86885b, 0L, i12, adViewType, serpDisplayType, false, BannerInfo.f87863F.a(commercialBanner, null, null), (B) bVar, 34, null);
            }
            return new CommercialUnavailableItem(str);
        }
        if (!(bVar instanceof AvitoNetworkBanner)) {
            return new CommercialUnavailableItem(str);
        }
        AvitoNetworkBanner avitoNetworkBanner = (AvitoNetworkBanner) bVar;
        if (avitoNetworkBanner instanceof AvitoNetworkBanner.BDUI) {
            return new AvitoNetworkBDUIBannerItem(commercialBanner.f86885b, 0L, i12, adViewType, serpDisplayType, false, BannerInfo.f87863F.a(commercialBanner, null, null), (AvitoNetworkBanner.BDUI) bVar, false, 290, null);
        }
        if (avitoNetworkBanner instanceof AvitoNetworkBanner.Video) {
            return new CommercialVideoBannerItem(commercialBanner.f86885b, 0L, (C) bVar, i12, adViewType, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null), 2, null);
        }
        if (avitoNetworkBanner instanceof AvitoNetworkBanner.Html) {
            profilePromoBannerItem = new CommercialHtmlBannerItem(commercialBanner.f86885b, 0L, i12, adViewType, serpDisplayType, false, BannerInfo.f87863F.a(commercialBanner, null, null), (B) bVar, 34, null);
        } else if (avitoNetworkBanner instanceof AvitoNetworkBanner.Image) {
            profilePromoBannerItem = new AvitoNetworkImageBannerItem(commercialBanner.f86885b, 0L, i12, adViewType, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null), false, (AvitoNetworkBanner.Image) bVar, 66, null);
        } else {
            if (!(avitoNetworkBanner instanceof AvitoNetworkBanner.ProfilePromo)) {
                if (!(avitoNetworkBanner instanceof AvitoNetworkBanner.ProfilePromoGallery)) {
                    throw new NoWhenBranchMatchedException();
                }
                AvitoNetworkBanner.ProfilePromoGallery profilePromoGallery = (AvitoNetworkBanner.ProfilePromoGallery) bVar;
                String str2 = profilePromoGallery.f88012b;
                ArrayList arrayList = profilePromoGallery.f88013c;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                int i13 = 0;
                for (Object obj : arrayList) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    AvitoNetworkBanner.ProfilePromo profilePromo = (AvitoNetworkBanner.ProfilePromo) obj;
                    arrayList2.add(new ProfilePromoBannerItem(commercialBanner.f86885b, 0L, profilePromo, 1, AdViewType.f86909c, SerpDisplayType.Grid, profilePromo.f88005g, BannerInfo.f87863F.a(commercialBanner, profilePromo, Integer.valueOf(i13)), 2, null));
                    i13 = i14;
                }
                return new ProfilePromoGalleryBannerItem(commercialBanner.f86885b, 0L, str2, arrayList2, 0, null, null, 114, null);
            }
            profilePromoBannerItem = new ProfilePromoBannerItem(commercialBanner.f86885b, 0L, (D) bVar, i12, adViewType, serpDisplayType, false, BannerInfo.f87863F.a(commercialBanner, null, null), 66, null);
        }
        return profilePromoBannerItem;
    }

    @Y61.k
    public static final CommercialLoadingItem c(@Y61.k SerpBannerContainer serpBannerContainer, @Y61.k String str) {
        List<SerpElement> elements = serpBannerContainer.getElements();
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            if (obj instanceof AdNetworkBannerItem) {
                arrayList.add(obj);
            }
        }
        Boolean enableEventSampling = serpBannerContainer.getEnableEventSampling();
        return new CommercialLoadingItem(new CommercialBanner(str, arrayList, enableEventSampling != null ? enableEventSampling.booleanValue() : false, serpBannerContainer.getAnalyticParams(), 0L, null, null, null, 240, null));
    }
}
