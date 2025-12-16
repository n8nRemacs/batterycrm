package gr0;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.LoadedNetworkBanner;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoBannerItem;
import com.avito.android.advertising.loaders.B;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.C;
import com.avito.android.advertising.loaders.D;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.advertising.loaders.my_target.d;
import com.avito.android.remote.model.AdSize;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerRaw;
import com.avito.android.remote.model.advertising.EmbeddedAdvBanner;
import com.avito.android.remote.model.advertising.EmbeddedProfilePromo;
import com.avito.android.serp.adapter.G;
import com.avito.android.serp.adapter.N0;
import com.avito.android.serp.adapter.ad.SerpAvitoNetworkBDUIBannerItem;
import com.avito.android.serp.adapter.ad.SerpAvitoNetworkImageBannerItem;
import com.avito.android.serp.adapter.ad.SerpBuzzoolaDirectBannerItem;
import com.avito.android.serp.adapter.ad.SerpBuzzoolaMediaX2BannerItem;
import com.avito.android.serp.adapter.ad.SerpBuzzoolaPremiumBannerItem;
import com.avito.android.serp.adapter.ad.SerpBuzzoolaPremiumV2BannerItem;
import com.avito.android.serp.adapter.ad.SerpCommercialBannerItem;
import com.avito.android.serp.adapter.ad.SerpCommercialHtmlBannerItem;
import com.avito.android.serp.adapter.ad.SerpCommercialVideoBannerItem;
import com.avito.android.serp.adapter.ad.SerpMyTargetBannerItem;
import com.avito.android.serp.adapter.ad.SerpProfilePromoBannerItem;
import com.avito.android.serp.adapter.ad.SerpProfilePromoGalleryBannerItem;
import com.avito.android.serp.adapter.ad.SerpYandexBannerItem;
import com.avito.android.serp.adapter.l1;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SerpCommercialBannerConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgr0/c;", "Lgr0/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.server_time.a f396885a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final G f396886b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final G f396887c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.advertising.d f396888d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f396889e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.advertising.loaders.avito_targeting.a f396890f;

    public c(@k com.avito.android.server_time.a aVar, @k G g12, @k G g13, @k com.avito.android.advertising.d dVar, @k InterfaceC35863o4 interfaceC35863o4, @k com.avito.android.advertising.loaders.avito_targeting.a aVar2) {
        this.f396885a = aVar;
        this.f396886b = g12;
        this.f396887c = g13;
        this.f396888d = dVar;
        this.f396889e = interfaceC35863o4;
        this.f396890f = aVar2;
    }

    @Override // gr0.b
    @l
    public final l1 a(@k EmbeddedAdvBanner embeddedAdvBanner, @k SerpDisplayType serpDisplayType) {
        String strA = this.f396889e.a();
        String size = embeddedAdvBanner.getSize();
        AdSize adSize = AdSize.BIG;
        if (!L.f(size, adSize.getServerName())) {
            adSize = AdSize.SMALL;
        }
        int iA2 = this.f396886b.a(serpDisplayType);
        int iA3 = this.f396887c.a(serpDisplayType);
        com.avito.android.advertising.d dVar = this.f396888d;
        int iB2 = dVar.b(iA2, iA3, adSize);
        AdViewType adViewTypeA = dVar.a(serpDisplayType, adSize);
        AvitoNetworkBanner avitoNetworkBannerA = this.f396890f.a(embeddedAdvBanner.getCreative());
        BannerInfo.a aVar = BannerInfo.f87863F;
        String string = UUID.randomUUID().toString();
        this.f396885a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AvitoNetworkBanner.AnalyticsParams f88026n = avitoNetworkBannerA.getF88026n();
        Map<String, String> analyticParams = embeddedAdvBanner.getAnalyticParams();
        aVar.getClass();
        BannerInfo bannerInfoB = BannerInfo.a.b(string, jCurrentTimeMillis, f88026n, analyticParams);
        if (avitoNetworkBannerA instanceof AvitoNetworkBanner.BDUI) {
            return new SerpAvitoNetworkBDUIBannerItem(strA.hashCode(), strA, iB2, adViewTypeA, serpDisplayType, bannerInfoB, (AvitoNetworkBanner.BDUI) avitoNetworkBannerA, true);
        }
        if (avitoNetworkBannerA instanceof C) {
            return new SerpCommercialVideoBannerItem(strA.hashCode(), strA, (C) avitoNetworkBannerA, iB2, adViewTypeA, serpDisplayType, bannerInfoB, true);
        }
        if (avitoNetworkBannerA instanceof B) {
            return new SerpCommercialHtmlBannerItem(strA.hashCode(), strA, iB2, adViewTypeA, serpDisplayType, bannerInfoB, (B) avitoNetworkBannerA, true);
        }
        if (avitoNetworkBannerA instanceof AvitoNetworkBanner.Image) {
            return new SerpAvitoNetworkImageBannerItem(strA.hashCode(), strA, iB2, adViewTypeA, serpDisplayType, bannerInfoB, (AvitoNetworkBanner.Image) avitoNetworkBannerA, true);
        }
        if (avitoNetworkBannerA instanceof D) {
            return new SerpProfilePromoBannerItem(strA.hashCode(), strA, (D) avitoNetworkBannerA, iB2, adViewTypeA, serpDisplayType, false, bannerInfoB, true, 64, null);
        }
        return null;
    }

    @Override // gr0.b
    @l
    public final SerpProfilePromoBannerItem b(@k EmbeddedProfilePromo embeddedProfilePromo, @k SerpDisplayType serpDisplayType) {
        long jA2 = N0.a(embeddedProfilePromo.getUniqueId(), this.f396889e.a());
        AdSize adSize = AdSize.SMALL;
        int iA2 = this.f396886b.a(serpDisplayType);
        int iA3 = this.f396887c.a(serpDisplayType);
        com.avito.android.advertising.d dVar = this.f396888d;
        int iB2 = dVar.b(iA2, iA3, adSize);
        AdViewType adViewTypeA = dVar.a(serpDisplayType, adSize);
        String title = embeddedProfilePromo.getCreative().getTitle();
        String description = embeddedProfilePromo.getCreative().getDescription();
        Uri uri = Uri.parse(embeddedProfilePromo.getCreative().getImage());
        String uri2 = embeddedProfilePromo.getCreative().getUri();
        int id2 = embeddedProfilePromo.getCreative().getId();
        AvitoNetworkBannerRaw.MarkInfo markInfo = embeddedProfilePromo.getCreative().getMarkInfo();
        ArrayList arrayList = null;
        AvitoNetworkBanner.MarkInfo markInfo2 = markInfo != null ? new AvitoNetworkBanner.MarkInfo(markInfo.getJuristicInfo(), markInfo.getLegalInfo(), markInfo.getAge()) : null;
        List<AvitoNetworkBannerRaw.HideReason> hideReasons = embeddedProfilePromo.getCreative().getHideReasons();
        if (hideReasons != null) {
            List<AvitoNetworkBannerRaw.HideReason> list = hideReasons;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (AvitoNetworkBannerRaw.HideReason hideReason : list) {
                arrayList.add(new AvitoNetworkBanner.HideReason(hideReason.getId(), hideReason.getDescription()));
            }
        }
        AvitoNetworkBanner.ProfilePromo profilePromo = new AvitoNetworkBanner.ProfilePromo(title, description, uri, uri2, id2, false, markInfo2, arrayList);
        BannerInfo.a aVar = BannerInfo.f87863F;
        String string = UUID.randomUUID().toString();
        this.f396885a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AvitoNetworkBanner.AnalyticsParams f88026n = profilePromo.getF88026n();
        Map<String, String> analyticParams = embeddedProfilePromo.getAnalyticParams();
        aVar.getClass();
        return new SerpProfilePromoBannerItem(jA2, String.valueOf(embeddedProfilePromo.getCreative().getId()), profilePromo, iB2, adViewTypeA, serpDisplayType, false, BannerInfo.a.b(string, jCurrentTimeMillis, f88026n, analyticParams), true);
    }

    @Override // gr0.b
    @l
    public final l1 c(@k CommercialBannerItem commercialBannerItem, @k SerpDisplayType serpDisplayType) {
        String strA = this.f396889e.a();
        long jA2 = N0.a(commercialBannerItem.getUniqueId(), strA);
        AdSize adSize = commercialBannerItem.getAdSize();
        int iA2 = this.f396886b.a(serpDisplayType);
        int iA3 = this.f396887c.a(serpDisplayType);
        com.avito.android.advertising.d dVar = this.f396888d;
        int iB2 = dVar.b(iA2, iA3, adSize);
        AdViewType adViewTypeA = dVar.a(serpDisplayType, adSize);
        CommercialBanner commercialBanner = commercialBannerItem.getCommercialBanner();
        if (commercialBanner == null) {
            return new SerpCommercialBannerItem(jA2, strA, adViewTypeA, serpDisplayType, iB2, adSize, null, commercialBannerItem.getBannerCode());
        }
        if (commercialBannerItem.getHasNotLoadedAd()) {
            return new SerpCommercialBannerItem(jA2, strA, adViewTypeA, serpDisplayType, iB2, adSize, commercialBanner, null, 128, null);
        }
        LoadedNetworkBanner loadedNetworkBanner = commercialBanner.f86892i;
        com.avito.android.advertising.b bVar = loadedNetworkBanner != null ? loadedNetworkBanner.f86903f : null;
        boolean z12 = bVar instanceof AvitoNetworkBanner.Image;
        String str = commercialBanner.f86885b;
        if (z12) {
            return new SerpAvitoNetworkImageBannerItem(jA2, str, iB2, adViewTypeA, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null), (AvitoNetworkBanner.Image) bVar, false, 128, null);
        }
        if (bVar instanceof com.avito.android.advertising.loaders.yandex.a) {
            return new SerpYandexBannerItem(jA2, str, (com.avito.android.advertising.loaders.yandex.a) bVar, iB2, adViewTypeA, serpDisplayType, false, false, BannerInfo.f87863F.a(commercialBanner, null, null), 192, null);
        }
        if (bVar instanceof d.a) {
            return new SerpMyTargetBannerItem(jA2, str, (d.a) bVar, iB2, adViewTypeA, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null));
        }
        if (bVar instanceof BuzzoolaBanner.BuzzoolaDirect) {
            return new SerpBuzzoolaDirectBannerItem(jA2, str, (BuzzoolaBanner.BuzzoolaDirect) bVar, iB2, adViewTypeA, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null), false, false, 384, null);
        }
        if (bVar instanceof BuzzoolaBanner.BuzzoolaPremium) {
            return new SerpBuzzoolaPremiumBannerItem(jA2, str, (BuzzoolaBanner.BuzzoolaPremium) bVar, iB2, adViewTypeA, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null));
        }
        if (bVar instanceof BuzzoolaBanner.BuzzoolaPremiumV2) {
            return new SerpBuzzoolaPremiumV2BannerItem(jA2, str, (BuzzoolaBanner.BuzzoolaPremiumV2) bVar, iB2, adViewTypeA, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null));
        }
        if (bVar instanceof BuzzoolaBanner.BuzzoolaMediaX2) {
            return new SerpBuzzoolaMediaX2BannerItem(jA2, str, (BuzzoolaBanner.BuzzoolaMediaX2) bVar, iB2, adViewTypeA, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null));
        }
        if (bVar instanceof C) {
            return new SerpCommercialVideoBannerItem(jA2, str, (C) bVar, iB2, adViewTypeA, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null), false, 128, null);
        }
        if (bVar instanceof B) {
            return new SerpCommercialHtmlBannerItem(jA2, str, iB2, adViewTypeA, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null), (B) bVar, false, 128, null);
        }
        if (bVar instanceof D) {
            D d12 = (D) bVar;
            return new SerpProfilePromoBannerItem(jA2, str, d12, iB2, adViewTypeA, serpDisplayType, d12.getF88005g(), BannerInfo.f87863F.a(commercialBanner, null, null), false, 256, null);
        }
        if (!(bVar instanceof AvitoNetworkBanner.ProfilePromoGallery)) {
            if (bVar instanceof AvitoNetworkBanner.BDUI) {
                return new SerpAvitoNetworkBDUIBannerItem(jA2, str, iB2, adViewTypeA, serpDisplayType, BannerInfo.f87863F.a(commercialBanner, null, null), (AvitoNetworkBanner.BDUI) bVar, false, 128, null);
            }
            return null;
        }
        AvitoNetworkBanner.ProfilePromoGallery profilePromoGallery = (AvitoNetworkBanner.ProfilePromoGallery) bVar;
        String str2 = profilePromoGallery.f88012b;
        ArrayList arrayList = profilePromoGallery.f88013c;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            AvitoNetworkBanner.ProfilePromo profilePromo = (AvitoNetworkBanner.ProfilePromo) obj;
            arrayList2.add(new ProfilePromoBannerItem(str, i12, profilePromo, 1, AdViewType.f86909c, SerpDisplayType.Grid, profilePromo.f88005g, BannerInfo.f87863F.a(commercialBanner, profilePromo, Integer.valueOf(i12))));
            i12 = i13;
        }
        return new SerpProfilePromoGalleryBannerItem(jA2, str, str2, arrayList2);
    }
}
