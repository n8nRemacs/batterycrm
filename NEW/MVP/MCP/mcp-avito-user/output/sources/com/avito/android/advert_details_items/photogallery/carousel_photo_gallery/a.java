package com.avito.android.advert_details_items.photogallery.carousel_photo_gallery;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_details_items.photogallery.AdvertDetailsGalleryItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsCarouselPhotoGalleryBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/photogallery/carousel_photo_gallery/a;", "LTV0/b;", "LX70/d;", "Lcom/avito/android/advert_details_items/photogallery/AdvertDetailsGalleryItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<X70.d, AdvertDetailsGalleryItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f85035a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final X70.b f85036b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<X70.d> f85037c;

    /* compiled from: AdvertDetailsCarouselPhotoGalleryBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "LX70/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)LX70/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_details_items.photogallery.carousel_photo_gallery.a$a, reason: collision with other inner class name */
    public static final class C2529a extends N implements p<ViewGroup, View, X70.d> {
        public C2529a() {
            super(2);
        }

        @Override // Y41.p
        public final X70.d invoke(ViewGroup viewGroup, View view) {
            return a.this.f85036b.z(view);
        }
    }

    @Inject
    public a(@k c cVar, @k X70.b bVar) {
        this.f85035a = cVar;
        this.f85036b = bVar;
        this.f85037c = new g.a<>(bVar.y(), new C2529a());
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f85035a;
    }

    @Override // TV0.b
    @k
    public final g.a<X70.d> b() {
        return this.f85037c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof AdvertDetailsGalleryItem) && ((AdvertDetailsGalleryItem) aVar).f85024w;
    }
}
