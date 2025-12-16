package com.avito.android.advert.item.consultation.expert_reviews;

import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.B;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.expert_reviews.ExpertReviewsBottomSheetFragment;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.page_indicator_re23.PageIndicatorRe23;
import com.avito.android.remote.model.AvatarStatus;
import com.avito.android.remote.model.advert_details.realty.Review;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ExpertReviewsBottomSheetDialog.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/consultation/expert_reviews/ExpertReviewsBottomSheetDialog;", "Landroidx/fragment/app/DialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExpertReviewsBottomSheetDialog extends DialogFragment implements InterfaceC28477j.a {

    /* renamed from: f0, reason: collision with root package name */
    @k
    public final List<Review> f74761f0;

    /* renamed from: g0, reason: collision with root package name */
    @l
    public ViewPager f74762g0;

    /* renamed from: h0, reason: collision with root package name */
    @k
    public final b f74763h0 = new b();

    /* compiled from: ExpertReviewsBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/consultation/expert_reviews/ExpertReviewsBottomSheetDialog$a", "Landroidx/fragment/app/B;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends B {
        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public final int c() {
            return ExpertReviewsBottomSheetDialog.this.f74761f0.size();
        }

        @Override // androidx.fragment.app.B
        @k
        public final Fragment o(int i12) {
            ExpertReviewsBottomSheetFragment.a aVar = ExpertReviewsBottomSheetFragment.f74765k0;
            Review review = ExpertReviewsBottomSheetDialog.this.f74761f0.get(i12);
            aVar.getClass();
            ExpertReviewsBottomSheetFragment expertReviewsBottomSheetFragment = new ExpertReviewsBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(AvatarStatus.REVIEW, review);
            expertReviewsBottomSheetFragment.setArguments(bundle);
            return expertReviewsBottomSheetFragment;
        }
    }

    public ExpertReviewsBottomSheetDialog(@k List<Review> list) {
        this.f74761f0 = list;
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) throws Resources.NotFoundException {
        ViewPager viewPager;
        ViewPager viewPager2 = null;
        d dVar = new d(requireContext(), 0, 2, null);
        d.M(dVar, null, true, true, 3);
        dVar.D(R.layout.expert_reviews_bottom_sheet_layout, true);
        ViewPager viewPager3 = (ViewPager) dVar.findViewById(R.id.expert_reviews_bottom_sheet_pager);
        if (viewPager3 != null) {
            viewPager3.setAdapter(new a(getChildFragmentManager()));
            viewPager3.setOffscreenPageLimit(this.f74761f0.size());
            viewPager2 = viewPager3;
        }
        this.f74762g0 = viewPager2;
        PageIndicatorRe23 pageIndicatorRe23 = (PageIndicatorRe23) dVar.findViewById(R.id.expert_reviews_bottom_sheet_indicator);
        if (pageIndicatorRe23 != null && (viewPager = this.f74762g0) != null) {
            com.avito.android.lib.design.page_indicator_re23.b.b(pageIndicatorRe23, viewPager);
        }
        if (getResources().getBoolean(R.bool.is_landscape)) {
            dVar.T();
        } else {
            d.I(dVar, true);
        }
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() throws Resources.NotFoundException {
        ViewPager viewPager = this.f74762g0;
        if (viewPager != null) {
            viewPager.x(0, false);
        }
        ViewPager viewPager2 = this.f74762g0;
        if (viewPager2 != null) {
            viewPager2.c(this.f74763h0);
        }
        super.onStart();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        ViewPager viewPager = this.f74762g0;
        if (viewPager != null) {
            viewPager.u(this.f74763h0);
        }
        super.onStop();
    }

    /* compiled from: ExpertReviewsBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/consultation/expert_reviews/ExpertReviewsBottomSheetDialog$b", "Landroidx/viewpager/widget/ViewPager$i;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ViewPager.i {
        @Override // androidx.viewpager.widget.ViewPager.i
        public final void b(int i12) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void c(int i12) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public final void h(int i12, float f12, int i13) {
        }
    }
}
