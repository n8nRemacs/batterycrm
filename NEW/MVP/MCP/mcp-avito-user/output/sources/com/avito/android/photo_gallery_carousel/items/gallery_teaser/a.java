package com.avito.android.photo_gallery_carousel.items.gallery_teaser;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GalleryTeaserItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/gallery_teaser/a;", "LTV0/b;", "Lcom/avito/android/photo_gallery_carousel/items/gallery_teaser/f;", "Lcom/avito/android/photo_gallery_carousel/items/gallery_teaser/GalleryTeaserItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements TV0.b<f, GalleryTeaserItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f217918a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.pinch_to_zoom.b f217919b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f217920c = new g.a<>(R.layout.carousel_photo_gallery_gallery_teaser_item, new C6535a());

    /* compiled from: GalleryTeaserItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "Lcom/avito/android/photo_gallery_carousel/items/gallery_teaser/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/photo_gallery_carousel/items/gallery_teaser/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_gallery_carousel.items.gallery_teaser.a$a, reason: collision with other inner class name */
    public static final class C6535a extends N implements p<ViewGroup, View, g> {
        public C6535a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g(view, viewGroup, a.this.f217919b);
        }
    }

    @Inject
    public a(@k d dVar, @k com.avito.android.pinch_to_zoom.b bVar) {
        this.f217918a = dVar;
        this.f217919b = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f217918a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f217920c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof GalleryTeaserItem;
    }
}
