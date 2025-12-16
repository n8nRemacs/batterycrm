package com.avito.android.review_gallery.dialog;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.adapter.gallery.GalleryItem;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.ReviewGalleryDetailsScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.tns_gallery.t;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: ReviewGalleryDetailsDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/review_gallery/dialog/ReviewGalleryDetailsDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReviewGalleryDetailsDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    public RecyclerView f255481h0;

    /* renamed from: i0, reason: collision with root package name */
    public TextView f255482i0;

    /* renamed from: j0, reason: collision with root package name */
    public TextView f255483j0;

    /* renamed from: k0, reason: collision with root package name */
    public RatingBar f255484k0;

    /* renamed from: l0, reason: collision with root package name */
    public TextView f255485l0;

    /* renamed from: m0, reason: collision with root package name */
    public t f255486m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f255487n0;

    /* compiled from: ReviewGalleryDetailsDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<View, G0> {
        public final void f(@k View view) {
            GalleryItem.ReviewTextSection reviewTextSection;
            ReviewGalleryDetailsDialog reviewGalleryDetailsDialog = (ReviewGalleryDetailsDialog) this.receiver;
            reviewGalleryDetailsDialog.getClass();
            View viewFindViewById = view.findViewById(R.id.review_gallery_sheet_container);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            reviewGalleryDetailsDialog.f255481h0 = (RecyclerView) view.findViewById(R.id.review_gallery_photos);
            reviewGalleryDetailsDialog.f255482i0 = (TextView) view.findViewById(R.id.review_gallery_sheet_name);
            reviewGalleryDetailsDialog.f255483j0 = (TextView) view.findViewById(R.id.review_gallery_sheet_date);
            reviewGalleryDetailsDialog.f255484k0 = (RatingBar) view.findViewById(R.id.review_gallery_sheet_rating);
            reviewGalleryDetailsDialog.f255485l0 = (TextView) view.findViewById(R.id.review_gallery_sheet_description);
            RecyclerView recyclerView = reviewGalleryDetailsDialog.f255481h0;
            reviewGalleryDetailsDialog.f255486m0 = new t(recyclerView == null ? null : recyclerView, reviewGalleryDetailsDialog.requireActivity(), null, 4, null);
            ScreenPerformanceTracker screenPerformanceTracker = reviewGalleryDetailsDialog.f255487n0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            RecyclerView recyclerView2 = reviewGalleryDetailsDialog.f255481h0;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            screenPerformanceTracker.b(recyclerView2);
            Bundle arguments = reviewGalleryDetailsDialog.getArguments();
            if (arguments != null) {
                GalleryItem.GalleyReview galleyReview = (GalleryItem.GalleyReview) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("reviewItem", GalleryItem.GalleyReview.class) : arguments.getParcelable("reviewItem"));
                if (galleyReview == null) {
                    return;
                }
                TextView textView = reviewGalleryDetailsDialog.f255482i0;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(galleyReview.f68428c);
                TextView textView2 = reviewGalleryDetailsDialog.f255483j0;
                if (textView2 == null) {
                    textView2 = null;
                }
                textView2.setText(galleyReview.f68433h);
                TextView textView3 = reviewGalleryDetailsDialog.f255485l0;
                if (textView3 == null) {
                    textView3 = null;
                }
                ArrayList arrayList = galleyReview.f68434i;
                textView3.setText((arrayList == null || (reviewTextSection = (GalleryItem.ReviewTextSection) C42745f0.G(arrayList)) == null) ? null : reviewTextSection.f68437c);
                Float f12 = galleyReview.f68429d;
                if (f12 != null) {
                    RatingBar ratingBar = reviewGalleryDetailsDialog.f255484k0;
                    if (ratingBar == null) {
                        ratingBar = null;
                    }
                    ratingBar.setRating(f12.floatValue());
                    RatingBar ratingBar2 = reviewGalleryDetailsDialog.f255484k0;
                    if (ratingBar2 == null) {
                        ratingBar2 = null;
                    }
                    D6.H(ratingBar2);
                } else {
                    RatingBar ratingBar3 = reviewGalleryDetailsDialog.f255484k0;
                    if (ratingBar3 == null) {
                        ratingBar3 = null;
                    }
                    D6.w(ratingBar3);
                }
                List<TnsGalleryImage> list = galleyReview.f68432g;
                if (list == null) {
                    return;
                }
                t tVar = reviewGalleryDetailsDialog.f255486m0;
                if (tVar == null) {
                    tVar = null;
                }
                tVar.b(list, new com.avito.android.review_gallery.dialog.a(reviewGalleryDetailsDialog), null);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            f(view);
            return G0.f406611a;
        }
    }

    public ReviewGalleryDetailsDialog() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.review_gallery.dialog.di.a.a().a((com.avito.android.review_gallery.dialog.di.b) C29972i.a(C29972i.b(this), com.avito.android.review_gallery.dialog.di.b.class), new C28478k(ReviewGalleryDetailsScreen.f90464d, s.b(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f255487n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f255487n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ContextThemeWrapper contextThemeWrapperB = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Dialog_Re23));
        Drawable drawableM = C35835l0.m(contextThemeWrapperB, R.attr.ic_close24, R.attr.black);
        d dVar = new d(contextThemeWrapperB, 0, 2, null);
        dVar.C(R.layout.review_gallery_sheet, new a(1, this, ReviewGalleryDetailsDialog.class, "setupViews", "setupViews(Landroid/view/View;)V", 0));
        d.M(dVar, null, true, true, 3);
        dVar.z(drawableM);
        d.I(dVar, true);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f255487n0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }
}
