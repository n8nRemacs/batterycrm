package com.avito.android.photo_gallery_carousel.items.image;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.photo_gallery_carousel.items.common.SizableGalleryItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BigGalleryImageItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/image/d;", "LTV0/b;", "Lcom/avito/android/photo_gallery_carousel/items/image/k;", "Lcom/avito/android/photo_gallery_carousel/items/image/GalleryImageItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements TV0.b<k, GalleryImageItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f217953a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.b f217954b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f217955c = new g.a<>(R.layout.carousel_photo_gallery_big_image_item, new a());

    /* compiled from: BigGalleryImageItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "Lcom/avito/android/photo_gallery_carousel/items/image/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/photo_gallery_carousel/items/image/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, f> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final f invoke(ViewGroup viewGroup, View view) {
            return new f(view, viewGroup, d.this.f217954b);
        }
    }

    @Inject
    public d(@Y61.k i iVar, @Y61.k com.avito.android.pinch_to_zoom.b bVar) {
        this.f217953a = iVar;
        this.f217954b = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f217953a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f217955c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof GalleryImageItem) {
            if (((GalleryImageItem) aVar).f217938c == SizableGalleryItem.Type.f217904b) {
                return true;
            }
        }
        return false;
    }
}
