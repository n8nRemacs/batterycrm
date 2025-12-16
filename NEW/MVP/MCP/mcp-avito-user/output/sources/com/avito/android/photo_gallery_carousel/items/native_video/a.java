package com.avito.android.photo_gallery_carousel.items.native_video;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.photo_gallery_carousel.items.common.SizableGalleryItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BigAdaptiveGalleryNativeVideoItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/native_video/a;", "LTV0/b;", "Lcom/avito/android/photo_gallery_carousel/items/native_video/k;", "Lcom/avito/android/photo_gallery_carousel/items/native_video/GalleryNativeVideoItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements TV0.b<k, GalleryNativeVideoItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f217984a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f217985b = new g.a<>(R.layout.carousel_photo_gallery_video_item, C6537a.f217986l);

    /* compiled from: BigAdaptiveGalleryNativeVideoItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "view", "Lcom/avito/android/photo_gallery_carousel/items/native_video/c;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/photo_gallery_carousel/items/native_video/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_gallery_carousel.items.native_video.a$a, reason: collision with other inner class name */
    public static final class C6537a extends N implements p<ViewGroup, View, c> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6537a f217986l = new C6537a();

        public C6537a() {
            super(2);
        }

        @Override // Y41.p
        public final c invoke(ViewGroup viewGroup, View view) {
            return new c(view, viewGroup);
        }
    }

    @Inject
    public a(@Y61.k i iVar) {
        this.f217984a = iVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f217984a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f217985b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof GalleryNativeVideoItem) {
            if (((GalleryNativeVideoItem) aVar).f217980c == SizableGalleryItem.Type.f217905c) {
                return true;
            }
        }
        return false;
    }
}
