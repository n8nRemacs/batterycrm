package com.avito.android.photo_gallery_carousel.gallery_view;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselPhotoGalleryView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/photo_gallery_carousel/gallery_view/CarouselPhotoGalleryRecyclerView;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class k extends N implements Y41.a<CarouselPhotoGalleryRecyclerView> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CarouselPhotoGalleryView f217843l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CarouselPhotoGalleryView carouselPhotoGalleryView) {
        super(0);
        this.f217843l = carouselPhotoGalleryView;
    }

    @Override // Y41.a
    public final CarouselPhotoGalleryRecyclerView invoke() {
        View viewFindViewById = this.f217843l.findViewById(R.id.gallery);
        if (viewFindViewById != null) {
            return (CarouselPhotoGalleryRecyclerView) viewFindViewById;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.photo_gallery_carousel.gallery_view.CarouselPhotoGalleryRecyclerView");
    }
}
