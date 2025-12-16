package com.avito.android.serp.adapter.ad;

import Y61.k;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoBannerItem;
import com.avito.android.advertising.adapter.items.buzzoola.profile_promo.ProfilePromoGalleryBannerItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import gr0.C40724a;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SerpProfilePromoGalleryBannerItem.kt */
@P
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/serp/adapter/ad/SerpProfilePromoGalleryBannerItem;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/android/advertising/adapter/items/buzzoola/profile_promo/ProfilePromoGalleryBannerItem;", "", "id", "", "stringId", "title", "", "Lcom/avito/android/advertising/adapter/items/buzzoola/profile_promo/ProfilePromoBannerItem;", "profilePromoItems", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Lcom/avito/android/serp/adapter/SerpViewType;", "getViewType", "()Lcom/avito/android/serp/adapter/SerpViewType;", "viewType", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SerpProfilePromoGalleryBannerItem extends ProfilePromoGalleryBannerItem implements l1 {
    public static final int $stable = 0;

    public SerpProfilePromoGalleryBannerItem(long j12, @k String str, @k String str2, @k List<? extends ProfilePromoBannerItem> list) {
        super(str, j12, str2, list, 0, null, null, 112, null);
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType */
    public SerpViewType getF77840j() {
        return C40724a.a(getAdViewType());
    }
}
