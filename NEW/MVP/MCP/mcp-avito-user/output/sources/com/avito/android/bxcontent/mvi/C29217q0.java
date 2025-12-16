package com.avito.android.bxcontent.mvi;

import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.remote.model.AdSize;
import com.avito.android.remote.model.SerpDisplayType;
import kotlin.Metadata;
import ob.C44744h;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/advertising/adapter/CommercialBannerItem;", "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.mvi.q0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29217q0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommercialBannerItem f112509b;

    public C29217q0(CommercialBannerItem commercialBannerItem) {
        this.f112509b = commercialBannerItem;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        CommercialBannerItem commercialBannerItem = this.f112509b;
        long f82706b = commercialBannerItem.getF82706b();
        String f331197i = commercialBannerItem.getF331197i();
        AdViewType adViewType = commercialBannerItem.getAdViewType();
        SerpDisplayType displayType = commercialBannerItem.getDisplayType();
        int spanCount = commercialBannerItem.getSpanCount();
        AdSize adSize = commercialBannerItem.getAdSize();
        CommercialBanner commercialBanner = commercialBannerItem.getCommercialBanner();
        return new CommercialBannerItem(f82706b, f331197i, adViewType, displayType, spanCount, adSize, null, commercialBanner != null ? C44744h.a(commercialBanner) : null);
    }
}
