package com.avito.android.review_gallery.mvi;

import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.remote.model.Image;
import dagger.internal.x;
import dagger.internal.y;
import gn0.C40714c;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: ReviewGalleryFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final h f255546a;

    /* renamed from: b, reason: collision with root package name */
    public final m f255547b;

    /* renamed from: c, reason: collision with root package name */
    public final o f255548c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Pv0.b> f255549d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.l f255550e;

    public k(h hVar, m mVar, o oVar, Provider provider, dagger.internal.l lVar) {
        this.f255546a = hVar;
        this.f255547b = mVar;
        this.f255548c = oVar;
        this.f255549d = provider;
        this.f255550e = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        String str;
        GalleryItem.ReviewTextSection reviewTextSection;
        f fVar = (f) this.f255546a.get();
        this.f255547b.getClass();
        l lVar = new l();
        this.f255548c.getClass();
        n nVar = new n();
        Pv0.b bVar = this.f255549d.get();
        int iIntValue = ((Integer) this.f255550e.f393949a).intValue();
        C40714c.a aVar = C40714c.f396856m;
        GalleryItem galleryItem = bVar.read();
        aVar.getClass();
        for (GalleryItem.GalleyReview galleyReview : galleryItem.f68403e) {
            if (L.f(galleyReview.f68427b, galleryItem.f68405g.get(iIntValue).f68426c)) {
                ArrayList arrayList = galleyReview.f68434i;
                String str2 = (arrayList == null || (reviewTextSection = (GalleryItem.ReviewTextSection) C42745f0.G(arrayList)) == null) ? null : reviewTextSection.f68437c;
                GalleryItem.GalleryContactBar galleryContactBar = galleryItem.f68404f;
                Image image = galleryContactBar != null ? galleryContactBar.f68420c : null;
                if (galleryContactBar == null || (str = galleryContactBar.f68419b) == null) {
                    str = "";
                }
                return new j("ReviewGallery", new C40714c(galleryItem.f68402d, galleyReview.f68428c, galleyReview.f68429d, galleyReview.f68433h, str2, image, str, galleryContactBar != null ? galleryContactBar.f68422e : null, galleryContactBar != null ? galleryContactBar.f68423f : null, galleryContactBar != null ? (GalleryItem.GalleryButton) C42745f0.K(0, galleryContactBar.f68421d) : null, galleryContactBar != null ? (GalleryItem.GalleryButton) C42745f0.K(1, galleryContactBar.f68421d) : null), new i(fVar, nVar, lVar));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
