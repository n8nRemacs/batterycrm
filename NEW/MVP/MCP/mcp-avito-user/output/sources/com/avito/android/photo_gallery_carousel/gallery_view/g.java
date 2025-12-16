package com.avito.android.photo_gallery_carousel.gallery_view;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.photo_gallery_carousel.gallery_view.CarouselPhotoGalleryView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CarouselPhotoGalleryPositionChangeListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/g;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f217837b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, G0> f217838c;

    /* renamed from: d, reason: collision with root package name */
    public int f217839d = -1;

    public g(@Y61.k e eVar, @Y61.k Y41.l lVar) {
        this.f217837b = eVar;
        this.f217838c = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void k(@Y61.k RecyclerView recyclerView, int i12, int i13) {
        int iK1;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        View viewF = this.f217837b.f(linearLayoutManager);
        if (viewF != null) {
            iK1 = RecyclerView.m.t0(viewF);
        } else if (i12 > 0) {
            iK1 = linearLayoutManager.M1();
        } else if (i12 >= 0) {
            return;
        } else {
            iK1 = linearLayoutManager.K1();
        }
        if (iK1 == -1 || this.f217839d == iK1) {
            return;
        }
        this.f217839d = iK1;
        ((CarouselPhotoGalleryView.b) this.f217838c).invoke(Integer.valueOf(iK1));
    }
}
