package com.avito.android.photo_gallery_carousel.gallery_view;

import android.view.View;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselPhotoGalleryPagerSnapHelper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_gallery_carousel/gallery_view/e;", "Landroidx/recyclerview/widget/J;", "<init>", "()V", "_avito_photo-gallery-carousel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e extends J {

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public I f217835f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public RecyclerView f217836g;

    @Override // androidx.recyclerview.widget.P, androidx.recyclerview.widget.RecyclerView.p
    public final boolean a(int i12, int i13) {
        RecyclerView recyclerView = this.f217836g;
        if (recyclerView == null) {
            return super.a(i12, i13);
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return super.a(i12, i13);
        }
        Integer numValueOf = Integer.valueOf(linearLayoutManager.K1());
        Integer num = numValueOf.intValue() != -1 ? numValueOf : null;
        if (num == null) {
            return false;
        }
        int iIntValue = num.intValue();
        int minFlingVelocity = recyclerView.getMinFlingVelocity();
        int maxFlingVelocity = (int) ((recyclerView.getMaxFlingVelocity() * 0.5d) + (minFlingVelocity * 0.5f));
        int iAbs = Math.abs(i12);
        boolean z12 = minFlingVelocity <= iAbs && iAbs <= maxFlingVelocity;
        int i14 = iIntValue + ((i12 <= 0 || !z12) ? (i12 <= 0 || z12) ? (i12 > 0 || z12) ? 0 : -5 : 5 : 1);
        int iO02 = linearLayoutManager.o0() - 1;
        if (i14 > iO02) {
            i14 = iO02;
        }
        recyclerView.F0(i14 >= 0 ? i14 : 0);
        return true;
    }

    @Override // androidx.recyclerview.widget.P
    public final void b(@Y61.l RecyclerView recyclerView) {
        super.b(recyclerView);
        this.f217836g = recyclerView;
    }

    @Override // androidx.recyclerview.widget.J, androidx.recyclerview.widget.P
    @Y61.l
    public final int[] c(@Y61.k RecyclerView.m mVar, @Y61.k View view) {
        if (!(mVar instanceof LinearLayoutManager)) {
            return super.c(mVar, view);
        }
        int iT2 = D6.t(view, R.dimen.carousel_photo_gallery_between_offset) / 2;
        int left = view.getLeft();
        RecyclerView recyclerView = this.f217836g;
        return new int[]{(left - (recyclerView != null ? recyclerView.getPaddingStart() : 0)) - iT2, 0};
    }

    @Override // androidx.recyclerview.widget.J, androidx.recyclerview.widget.P
    @Y61.l
    public final View f(@Y61.l RecyclerView.m mVar) {
        if (!(mVar instanceof LinearLayoutManager)) {
            return super.f(mVar);
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar;
        int iK1 = linearLayoutManager.K1();
        Integer numValueOf = Integer.valueOf(iK1);
        if (iK1 == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        int iIntValue = numValueOf.intValue();
        View viewZ = linearLayoutManager.Z(iIntValue);
        I iA2 = this.f217835f;
        if (iA2 == null) {
            iA2 = I.a(mVar);
            this.f217835f = iA2;
        }
        float fD2 = (iA2.d(viewZ) - (this.f217836g != null ? r9.getPaddingStart() : 0)) / iA2.e(viewZ);
        boolean z12 = linearLayoutManager.L1() == linearLayoutManager.o0() - 1;
        View viewZ2 = linearLayoutManager.Z(iIntValue + 1);
        if (fD2 > 0.8f && !z12) {
            return viewZ;
        }
        if (z12) {
            return null;
        }
        return viewZ2;
    }
}
