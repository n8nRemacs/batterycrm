package com.avito.android.advert_details_items.photogallery;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.GalleryButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;
import z8.C50393a;

/* compiled from: AdvertDetailsGalleryPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/GalleryButton;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/GalleryButton;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class i extends N implements Y41.l<GalleryButton, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f85070l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsGalleryItem f85071m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AdvertDetailsGalleryItem advertDetailsGalleryItem, k kVar) {
        super(1);
        this.f85070l = kVar;
        this.f85071m = advertDetailsGalleryItem;
    }

    @Override // Y41.l
    public final G0 invoke(GalleryButton galleryButton) {
        GalleryButton galleryButton2 = galleryButton;
        String str = this.f85071m.f85014m;
        k kVar = this.f85070l;
        DeepLink deeplink = galleryButton2.getDeeplink();
        if (deeplink != null) {
            b.a.a(kVar.f85082j, deeplink, null, null, 6);
        }
        Long lZ02 = C43066x.z0(str);
        long jLongValue = lZ02 != null ? lZ02.longValue() : -1L;
        String slug = galleryButton2.getSlug();
        if (slug == null) {
            slug = "";
        }
        kVar.f85077e.c(new C50393a(jLongValue, slug));
        return G0.f406611a;
    }
}
