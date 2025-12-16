package com.avito.android.serp.adapter.ad;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.adapter.items.avito.bdui.AvitoNetworkBDUIBannerItem;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import gr0.C40724a;
import gr0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SerpAvitoNetworkBDUIBannerItem.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/ad/SerpAvitoNetworkBDUIBannerItem;", "Lcom/avito/android/serp/adapter/l1;", "Lgr0/d;", "Lcom/avito/android/advertising/adapter/items/avito/bdui/AvitoNetworkBDUIBannerItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SerpAvitoNetworkBDUIBannerItem extends AvitoNetworkBDUIBannerItem implements l1, d {
    public /* synthetic */ SerpAvitoNetworkBDUIBannerItem(long j12, String str, int i12, AdViewType adViewType, SerpDisplayType serpDisplayType, BannerInfo bannerInfo, AvitoNetworkBanner.BDUI bdui, boolean z12, int i13, C42822w c42822w) {
        this(j12, str, i12, adViewType, serpDisplayType, bannerInfo, bdui, (i13 & 128) != 0 ? false : z12);
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType */
    public final SerpViewType getF85220f() {
        return C40724a.a(this.f87010e);
    }

    public SerpAvitoNetworkBDUIBannerItem(long j12, @k String str, int i12, @k AdViewType adViewType, @k SerpDisplayType serpDisplayType, @k BannerInfo bannerInfo, @k AvitoNetworkBanner.BDUI bdui, boolean z12) {
        super(str, j12, i12, adViewType, serpDisplayType, false, bannerInfo, bdui, z12, 32, null);
    }
}
