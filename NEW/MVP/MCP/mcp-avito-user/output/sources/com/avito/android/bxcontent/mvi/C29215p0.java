package com.avito.android.bxcontent.mvi;

import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.adapter.CommercialBannerItem;
import kotlin.Metadata;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/advertising/adapter/CommercialBannerItem;", "it", "Lcom/avito/android/advertising/CommercialBanner;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.mvi.p0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29215p0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommercialBannerItem f112501b;

    public C29215p0(CommercialBannerItem commercialBannerItem) {
        this.f112501b = commercialBannerItem;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f112501b.copyWithCommercialBanner((CommercialBanner) obj);
    }
}
