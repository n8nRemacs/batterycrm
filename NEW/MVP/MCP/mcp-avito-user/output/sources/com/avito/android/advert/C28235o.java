package com.avito.android.advert;

import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import kotlin.Metadata;

/* compiled from: AdvertDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/advertising/adapter/CommercialBannerItem;", "it", "Lcom/avito/android/advertising/CommercialBanner;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28235o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommercialBannerItem f80958b;

    public C28235o(CommercialBannerItem commercialBannerItem) {
        this.f80958b = commercialBannerItem;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f80958b.copyWithCommercialBanner((CommercialBanner) obj);
    }
}
