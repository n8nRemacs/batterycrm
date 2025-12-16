package com.avito.android.advert_details_items.photogallery;

import com.avito.android.advert_core.analytics.realty_ai_design.RealtyAiDesignButtonClicked;
import com.avito.android.analytics.InterfaceC28373a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsGalleryPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f85066l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsGalleryItem f85067m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AdvertDetailsGalleryItem advertDetailsGalleryItem, k kVar) {
        super(0);
        this.f85066l = kVar;
        this.f85067m = advertDetailsGalleryItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        k kVar = this.f85066l;
        InterfaceC28373a interfaceC28373a = kVar.f85077e;
        AdvertDetailsGalleryItem advertDetailsGalleryItem = this.f85067m;
        interfaceC28373a.c(new RealtyAiDesignButtonClicked(advertDetailsGalleryItem.f85014m, RealtyAiDesignButtonClicked.PageType.f82840c));
        kVar.V(advertDetailsGalleryItem.f85012k, true);
        return G0.f406611a;
    }
}
