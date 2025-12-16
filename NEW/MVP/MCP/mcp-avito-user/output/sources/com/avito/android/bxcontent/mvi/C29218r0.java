package com.avito.android.bxcontent.mvi;

import com.avito.android.advertising.adapter.CommercialBannerItem;
import kotlin.Metadata;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/advertising/adapter/CommercialBannerItem;", "it", "Lkotlin/Q;", "", "apply", "(Lcom/avito/android/advertising/adapter/CommercialBannerItem;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.bxcontent.mvi.r0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29218r0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CommercialBannerItem f112510b;

    public C29218r0(CommercialBannerItem commercialBannerItem) {
        this.f112510b = commercialBannerItem;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        CommercialBannerItem commercialBannerItem = (CommercialBannerItem) obj;
        return new kotlin.Q(commercialBannerItem, Boolean.valueOf(this.f112510b.isProfilePromo() && commercialBannerItem.isEmpty()));
    }
}
