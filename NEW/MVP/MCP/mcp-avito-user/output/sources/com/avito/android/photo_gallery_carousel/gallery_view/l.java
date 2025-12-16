package com.avito.android.photo_gallery_carousel.gallery_view;

import android.view.View;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselPhotoGalleryView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/d;", "invoke", "()Lcom/avito/android/photo_gallery_carousel/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class l extends N implements Y41.a<com.avito.android.photo_gallery_carousel.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CarouselPhotoGalleryView f217844l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CarouselPhotoGalleryView carouselPhotoGalleryView) {
        super(0);
        this.f217844l = carouselPhotoGalleryView;
    }

    @Override // Y41.a
    public final com.avito.android.photo_gallery_carousel.d invoke() {
        View viewFindViewById = this.f217844l.findViewById(R.id.fl_page_indicator);
        if (viewFindViewById != null) {
            return new com.avito.android.photo_gallery_carousel.d(viewFindViewById);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }
}
