package com.avito.android.serp.adapter.ad;

import Y61.k;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.adapter.items.buzzoola.media_x2.BuzzoolaMediaX2BannerItem;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaBanner;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.my.tracker.ads.AdFormat;
import gr0.C40724a;
import kotlin.Metadata;

/* compiled from: SerpBuzzoolaMediaX2BannerItem.kt */
@P
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/avito/android/serp/adapter/ad/SerpBuzzoolaMediaX2BannerItem;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/android/advertising/adapter/items/buzzoola/media_x2/BuzzoolaMediaX2BannerItem;", "", "id", "", "stringId", "Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaMediaX2;", AdFormat.BANNER, "", "spanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "adViewType", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "Lcom/avito/android/advertising/loaders/BannerInfo;", "bannerInfo", "<init>", "(JLjava/lang/String;Lcom/avito/android/advertising/loaders/buzzoola/BuzzoolaBanner$BuzzoolaMediaX2;ILcom/avito/android/advertising/adapter/items/AdViewType;Lcom/avito/android/remote/model/SerpDisplayType;Lcom/avito/android/advertising/loaders/BannerInfo;)V", "Lcom/avito/android/serp/adapter/SerpViewType;", "getViewType", "()Lcom/avito/android/serp/adapter/SerpViewType;", "viewType", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SerpBuzzoolaMediaX2BannerItem extends BuzzoolaMediaX2BannerItem implements l1 {
    public static final int $stable = 0;

    public SerpBuzzoolaMediaX2BannerItem(long j12, @k String str, @k BuzzoolaBanner.BuzzoolaMediaX2 buzzoolaMediaX2, int i12, @k AdViewType adViewType, @k SerpDisplayType serpDisplayType, @k BannerInfo bannerInfo) {
        super(str, j12, buzzoolaMediaX2, i12, adViewType, serpDisplayType, bannerInfo);
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType */
    public SerpViewType getF270731e() {
        return C40724a.a(getAdViewType());
    }
}
