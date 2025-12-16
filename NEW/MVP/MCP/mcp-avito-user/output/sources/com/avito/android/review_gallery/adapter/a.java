package com.avito.android.review_gallery.adapter;

import Y61.k;
import androidx.fragment.app.Fragment;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.review_gallery.ReviewGalleryActivity;
import com.avito.android.util.C35966w1;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReviewGalleryAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/review_gallery/adapter/a;", "Landroidx/viewpager2/adapter/b;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends androidx.viewpager2.adapter.b {

    /* renamed from: k, reason: collision with root package name */
    @k
    public final ReviewGalleryActivity f255464k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public ArrayList f255465l;

    public a(@k ReviewGalleryActivity reviewGalleryActivity, @k ReviewGalleryActivity reviewGalleryActivity2, @k ArrayList arrayList) {
        super(reviewGalleryActivity);
        this.f255464k = reviewGalleryActivity2;
        this.f255465l = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f255465l.size();
    }

    @Override // androidx.viewpager2.adapter.b
    @k
    public final Fragment l(int i12) {
        TnsGalleryImage tnsGalleryImage = (TnsGalleryImage) this.f255465l.get(i12);
        float width = tnsGalleryImage.getOriginalSize() != null ? r0.getWidth() / r0.getHeight() : 1.0f;
        Image image = tnsGalleryImage.getImage();
        ReviewGalleryFragment reviewGalleryFragment = new ReviewGalleryFragment();
        C35966w1.a(reviewGalleryFragment, -1, new d(image, width));
        reviewGalleryFragment.f255461r0 = this.f255464k;
        return reviewGalleryFragment;
    }
}
