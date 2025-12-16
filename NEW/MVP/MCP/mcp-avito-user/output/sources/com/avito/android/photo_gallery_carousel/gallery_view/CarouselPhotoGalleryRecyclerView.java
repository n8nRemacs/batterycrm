package com.avito.android.photo_gallery_carousel.gallery_view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CarouselPhotoGalleryRecyclerView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/CarouselPhotoGalleryRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "ratio", "Lkotlin/G0;", "setHeightRatio", "(F)V", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CarouselPhotoGalleryRecyclerView extends RecyclerView {

    /* renamed from: F0, reason: collision with root package name */
    public final int f217794F0;

    /* renamed from: G0, reason: collision with root package name */
    public float f217795G0;

    @X41.j
    public CarouselPhotoGalleryRecyclerView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i12, int i13) {
        int size = View.MeasureSpec.getSize(i12);
        int i14 = this.f217794F0;
        if (i14 == 0) {
            setMeasuredDimension(size, kotlin.math.b.b(size * this.f217795G0));
        } else {
            setMeasuredDimension(size, i14);
        }
    }

    public final void setHeightRatio(float ratio) {
        this.f217795G0 = ratio;
        requestLayout();
    }

    public CarouselPhotoGalleryRecyclerView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f217794F0 = D6.t(this, R.dimen.carousel_photo_gallery_height);
        this.f217795G0 = 0.75f;
    }
}
