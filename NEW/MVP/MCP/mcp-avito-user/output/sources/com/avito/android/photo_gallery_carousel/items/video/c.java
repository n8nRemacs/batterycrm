package com.avito.android.photo_gallery_carousel.items.video;

import android.view.View;
import android.view.ViewGroup;
import com.avito.android.photo_gallery_carousel.items.common.SizableGalleryItem;
import com.avito.android.remote.model.CarouselGalleryGroup;
import com.avito.android.remote.model.Image;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryVideoItemView.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/video/c;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/photo_gallery_carousel/items/video/k;", "Lcom/avito/android/photo_gallery_carousel/items/common/c;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends com.avito.konveyor.adapter.b implements k, com.avito.android.photo_gallery_carousel.items.common.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f218021b;

    public c(@Y61.k View view, @Y61.k ViewGroup viewGroup) {
        super(view);
        this.f218021b = new l(view, viewGroup);
        new com.avito.android.photo_gallery_carousel.items.common.d(view, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.photo_gallery_carousel.items.common.a
    public final void Fg(@Y61.k Y41.a<Boolean> aVar) {
        this.f218021b.f217911d = (N) aVar;
    }

    @Override // com.avito.android.photo_gallery_carousel.items.common.a
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f218021b.a(aVar);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f218021b.getClass();
    }

    @Override // com.avito.android.photo_gallery_carousel.items.common.a
    public final void uz(@Y61.l Image image, @Y61.l String str, @Y61.k SizableGalleryItem.Type type, @Y61.l CarouselGalleryGroup carouselGalleryGroup) {
        this.f218021b.uz(image, str, type, carouselGalleryGroup);
    }
}
