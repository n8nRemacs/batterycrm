package com.avito.android.photo_gallery_carousel.gallery_view;

import android.view.View;
import com.avito.android.R;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CarouselPhotoGalleryFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/b;", "LX70/b;", "<init>", "()V", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements X70.b {
    @Inject
    public b() {
    }

    @Override // X70.b
    public final int y() {
        return R.layout.carousel_photo_gallery;
    }

    @Override // X70.b
    @Y61.k
    public final o z(@Y61.k View view) {
        return new o(view);
    }
}
