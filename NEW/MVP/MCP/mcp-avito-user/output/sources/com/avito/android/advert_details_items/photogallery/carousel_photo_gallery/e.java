package com.avito.android.advert_details_items.photogallery.carousel_photo_gallery;

import Y41.l;
import com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsCarouselPhotoGalleryPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "position", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f85043l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsGalleryItem f85044m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, AdvertDetailsGalleryItem advertDetailsGalleryItem) {
        super(1);
        this.f85043l = hVar;
        this.f85044m = advertDetailsGalleryItem;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        h hVar = this.f85043l;
        hVar.f85052e.c(new R8.a(this.f85044m.f85014m));
        hVar.O(iIntValue, false);
        return G0.f406611a;
    }
}
