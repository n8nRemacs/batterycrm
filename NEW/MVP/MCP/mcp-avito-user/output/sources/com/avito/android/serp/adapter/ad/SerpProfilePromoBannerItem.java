package com.avito.android.serp.adapter.ad;

import Y61.k;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoBannerItem;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.D;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.my.tracker.ads.AdFormat;
import gr0.C40724a;
import gr0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SerpProfilePromoBannerItem.kt */
@P
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BS\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0014\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/serp/adapter/ad/SerpProfilePromoBannerItem;", "Lcom/avito/android/serp/adapter/l1;", "Lgr0/d;", "Lcom/avito/android/advertising/adapter/items/buzzoola/profile_promo/ProfilePromoBannerItem;", "", "id", "", "stringId", "Lcom/avito/android/advertising/loaders/D;", AdFormat.BANNER, "", "spanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "adViewType", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "", "isHidden", "Lcom/avito/android/advertising/loaders/BannerInfo;", "bannerInfo", "isEmbedded", "<init>", "(JLjava/lang/String;Lcom/avito/android/advertising/loaders/D;ILcom/avito/android/advertising/adapter/items/AdViewType;Lcom/avito/android/remote/model/SerpDisplayType;ZLcom/avito/android/advertising/loaders/BannerInfo;Z)V", "newIsHidden", "copyWithIsHidden", "(Z)Lcom/avito/android/serp/adapter/ad/SerpProfilePromoBannerItem;", "Z", "()Z", "Lcom/avito/android/serp/adapter/SerpViewType;", "getViewType", "()Lcom/avito/android/serp/adapter/SerpViewType;", "viewType", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SerpProfilePromoBannerItem extends ProfilePromoBannerItem implements l1, d {
    public static final int $stable = 0;
    private final boolean isEmbedded;

    public /* synthetic */ SerpProfilePromoBannerItem(long j12, String str, D d12, int i12, AdViewType adViewType, SerpDisplayType serpDisplayType, boolean z12, BannerInfo bannerInfo, boolean z13, int i13, C42822w c42822w) {
        this(j12, str, d12, i12, adViewType, serpDisplayType, (i13 & 64) != 0 ? false : z12, bannerInfo, (i13 & 256) != 0 ? false : z13);
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType */
    public SerpViewType getF74872n() {
        return C40724a.a(getAdViewType());
    }

    @Override // gr0.d
    /* renamed from: isEmbedded, reason: from getter */
    public boolean getIsEmbedded() {
        return this.isEmbedded;
    }

    public SerpProfilePromoBannerItem(long j12, @k String str, @k D d12, int i12, @k AdViewType adViewType, @k SerpDisplayType serpDisplayType, boolean z12, @k BannerInfo bannerInfo, boolean z13) {
        super(str, j12, d12, i12, adViewType, serpDisplayType, z12, bannerInfo);
        this.isEmbedded = z13;
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoBannerItem, com.avito.android.advertising.i
    @k
    public SerpProfilePromoBannerItem copyWithIsHidden(boolean newIsHidden) {
        return new SerpProfilePromoBannerItem(getF74860b(), getF155493b(), getBanner(), getSpanCount(), getAdViewType(), getDisplayType(), newIsHidden, getBannerInfo(), false, 256, null);
    }
}
