package com.avito.android.serp.adapter.ad;

import Y61.k;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.adapter.items.buzzoola.BuzzoolaDirectBannerItem;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.my.tracker.ads.AdFormat;
import gr0.C40724a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SerpBuzzoolaDirectBannerItem.kt */
@P
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/serp/adapter/ad/SerpBuzzoolaDirectBannerItem;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/android/advertising/adapter/items/buzzoola/BuzzoolaDirectBannerItem;", "", "id", "", "stringId", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaDirect;", AdFormat.BANNER, "", "spanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "adViewType", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "Lcom/avito/android/advertising/loaders/BannerInfo;", "bannerInfo", "", "fullSize", "isHidden", "<init>", "(JLjava/lang/String;Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaDirect;ILcom/avito/android/advertising/adapter/items/AdViewType;Lcom/avito/android/remote/model/SerpDisplayType;Lcom/avito/android/advertising/loaders/BannerInfo;ZZ)V", "newIsHidden", "copyWithIsHidden", "(Z)Lcom/avito/android/serp/adapter/ad/SerpBuzzoolaDirectBannerItem;", "Lcom/avito/android/serp/adapter/SerpViewType;", "getViewType", "()Lcom/avito/android/serp/adapter/SerpViewType;", "viewType", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SerpBuzzoolaDirectBannerItem extends BuzzoolaDirectBannerItem implements l1 {
    public static final int $stable = 0;

    public /* synthetic */ SerpBuzzoolaDirectBannerItem(long j12, String str, BuzzoolaBanner.BuzzoolaDirect buzzoolaDirect, int i12, AdViewType adViewType, SerpDisplayType serpDisplayType, BannerInfo bannerInfo, boolean z12, boolean z13, int i13, C42822w c42822w) {
        this(j12, str, buzzoolaDirect, i12, adViewType, serpDisplayType, bannerInfo, (i13 & 128) != 0 ? false : z12, (i13 & 256) != 0 ? false : z13);
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType */
    public SerpViewType getF85540j() {
        return C40724a.a(getAdViewType());
    }

    public SerpBuzzoolaDirectBannerItem(long j12, @k String str, @k BuzzoolaBanner.BuzzoolaDirect buzzoolaDirect, int i12, @k AdViewType adViewType, @k SerpDisplayType serpDisplayType, @k BannerInfo bannerInfo, boolean z12, boolean z13) {
        super(str, j12, buzzoolaDirect, i12, adViewType, serpDisplayType, z12, z13, bannerInfo);
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.BuzzoolaDirectBannerItem, com.avito.android.advertising.i
    @k
    public SerpBuzzoolaDirectBannerItem copyWithIsHidden(boolean newIsHidden) {
        return new SerpBuzzoolaDirectBannerItem(getF85532b(), getF154734b(), getBanner(), getSpanCount(), getAdViewType(), getDisplayType(), getBannerInfo(), getFullSize(), newIsHidden);
    }
}
