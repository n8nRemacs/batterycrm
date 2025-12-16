package com.avito.android.photo_gallery_carousel.items.autoteka_teaser;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserGalleryInsight;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.autotekateaser.GalleryTeaserType;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GalleryAutotekaTeaserItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/items/autoteka_teaser/c;", "LTV0/d;", "Lcom/avito/android/photo_gallery_carousel/items/autoteka_teaser/g;", "Lcom/avito/android/photo_gallery_carousel/items/autoteka_teaser/GalleryAutotekaTeaserItem;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements TV0.d<g, GalleryAutotekaTeaserItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<com.avito.android.photo_gallery_carousel.gallery_view.a, G0> f217859b;

    /* compiled from: GalleryAutotekaTeaserItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f217860a;

        static {
            int[] iArr = new int[GalleryTeaserType.values().length];
            try {
                iArr[GalleryTeaserType.SINGLE_INSIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f217860a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public c(@k l<? super com.avito.android.photo_gallery_carousel.gallery_view.a, G0> lVar) {
        this.f217859b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String title;
        String title2;
        g gVar = (g) eVar;
        AutotekaTeaserResult autotekaTeaserResult = ((GalleryAutotekaTeaserItem) aVar).f217854c;
        AutotekaTeaserGalleryInsight galleryInsight = autotekaTeaserResult.getGalleryInsight();
        if (galleryInsight == null || (title = galleryInsight.getFullscreenGalleryButtonText()) == null) {
            title = autotekaTeaserResult.getReportLink().getTitle();
        }
        GalleryTeaserType galleryTeaserTypeValue = autotekaTeaserResult.getGalleryTeaserTypeValue();
        if ((galleryTeaserTypeValue == null ? -1 : a.f217860a[galleryTeaserTypeValue.ordinal()]) == 1) {
            AutotekaTeaserGalleryInsight galleryInsight2 = autotekaTeaserResult.getGalleryInsight();
            title2 = galleryInsight2 != null ? galleryInsight2.getTitle() : null;
            if (title2 == null) {
                title2 = "";
            }
        } else {
            title2 = autotekaTeaserResult.getTitle();
        }
        gVar.setTitle(title2);
        AutotekaTeaserGalleryInsight galleryInsight3 = autotekaTeaserResult.getGalleryInsight();
        String subtitle = galleryInsight3 != null ? galleryInsight3.getSubtitle() : null;
        gVar.f(subtitle != null ? subtitle : "");
        gVar.b50(title);
        if (autotekaTeaserResult.getGalleryTeaserTypeValue() == GalleryTeaserType.SINGLE_INSIGHT) {
            gVar.c9();
        } else {
            gVar.u9();
        }
        gVar.cB(new d(this, i12));
    }
}
