package com.avito.android.serp.adapter.ad;

import Y61.k;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.adapter.items.avito.AvitoNetworkImageBannerItem;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.my.tracker.ads.AdFormat;
import gr0.C40724a;
import gr0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SerpAvitoNetworkImageBannerItem.kt */
@P
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/avito/android/serp/adapter/ad/SerpAvitoNetworkImageBannerItem;", "Lcom/avito/android/serp/adapter/l1;", "Lgr0/d;", "Lcom/avito/android/advertising/adapter/items/avito/AvitoNetworkImageBannerItem;", "", "id", "", "stringId", "", "spanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "adViewType", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "Lcom/avito/android/advertising/loaders/BannerInfo;", "bannerInfo", "Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$Image;", AdFormat.BANNER, "", "isEmbedded", "<init>", "(JLjava/lang/String;ILcom/avito/android/advertising/adapter/items/AdViewType;Lcom/avito/android/remote/model/SerpDisplayType;Lcom/avito/android/advertising/loaders/BannerInfo;Lcom/avito/android/advertising/loaders/avito_targeting/AvitoNetworkBanner$Image;Z)V", "Z", "()Z", "Lcom/avito/android/serp/adapter/SerpViewType;", "getViewType", "()Lcom/avito/android/serp/adapter/SerpViewType;", "viewType", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SerpAvitoNetworkImageBannerItem extends AvitoNetworkImageBannerItem implements l1, d {
    public static final int $stable = 0;
    private final boolean isEmbedded;

    public /* synthetic */ SerpAvitoNetworkImageBannerItem(long j12, String str, int i12, AdViewType adViewType, SerpDisplayType serpDisplayType, BannerInfo bannerInfo, AvitoNetworkBanner.Image image, boolean z12, int i13, C42822w c42822w) {
        this(j12, str, i12, adViewType, serpDisplayType, bannerInfo, image, (i13 & 128) != 0 ? false : z12);
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType */
    public SerpViewType getF128562k() {
        return C40724a.a(getAdViewType());
    }

    @Override // gr0.d
    /* renamed from: isEmbedded, reason: from getter */
    public boolean getIsEmbedded() {
        return this.isEmbedded;
    }

    public SerpAvitoNetworkImageBannerItem(long j12, @k String str, int i12, @k AdViewType adViewType, @k SerpDisplayType serpDisplayType, @k BannerInfo bannerInfo, @k AvitoNetworkBanner.Image image, boolean z12) {
        super(str, j12, i12, adViewType, serpDisplayType, bannerInfo, false, image, 64, null);
        this.isEmbedded = z12;
    }
}
