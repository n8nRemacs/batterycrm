package com.avito.android.serp.adapter.ad;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.remote.model.AdSize;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import gr0.C40724a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SerpCommercialBannerItem.kt */
@P
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BM\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/avito/android/serp/adapter/ad/SerpCommercialBannerItem;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/android/advertising/adapter/CommercialBannerItem;", "", "id", "", "stringId", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "adViewType", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "", "spanCount", "Lcom/avito/android/remote/model/AdSize;", "adSize", "Lcom/avito/android/advertising/CommercialBanner;", "commercialBanner", "bannerCode", "<init>", "(JLjava/lang/String;Lcom/avito/android/advertising/adapter/items/AdViewType;Lcom/avito/android/remote/model/SerpDisplayType;ILcom/avito/android/remote/model/AdSize;Lcom/avito/android/advertising/CommercialBanner;Ljava/lang/String;)V", "Lcom/avito/android/serp/adapter/SerpViewType;", "getViewType", "()Lcom/avito/android/serp/adapter/SerpViewType;", "viewType", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SerpCommercialBannerItem extends CommercialBannerItem implements l1 {
    public static final int $stable = 0;

    public /* synthetic */ SerpCommercialBannerItem(long j12, String str, AdViewType adViewType, SerpDisplayType serpDisplayType, int i12, AdSize adSize, CommercialBanner commercialBanner, String str2, int i13, C42822w c42822w) {
        this(j12, str, adViewType, serpDisplayType, i12, adSize, commercialBanner, (i13 & 128) != 0 ? null : str2);
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType */
    public SerpViewType getF77840j() {
        return C40724a.a(getAdViewType());
    }

    public SerpCommercialBannerItem(long j12, @k String str, @k AdViewType adViewType, @k SerpDisplayType serpDisplayType, int i12, @k AdSize adSize, @l CommercialBanner commercialBanner, @l String str2) {
        super(j12, str, adViewType, serpDisplayType, i12, adSize, commercialBanner, str2);
    }
}
