package com.avito.android.rating_ui.reviews.model_review;

import Dh0.C13401b;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.review_text_section.RatingReviewTextSectionView;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.tns_gallery.r;
import com.avito.android.tns_gallery.t;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.p6;
import com.avito.android.util.q6;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RatingModelReviewItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_ui/reviews/model_review/n;", "Lcom/avito/android/rating_ui/reviews/model_review/m;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: I, reason: collision with root package name */
    public static final /* synthetic */ int f250189I = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final TextView f250190A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final TextView f250191B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f250192C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final ImageView f250193D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f250194E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final TextView f250195F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final RatingReviewTextSectionView f250196G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final t f250197H;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f250198b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC42156l
    public final int f250199c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC42156l
    public final int f250200d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42156l
    public final int f250201e;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC42156l
    public final int f250202f;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC42156l
    public final int f250203g;

    /* renamed from: h, reason: collision with root package name */
    @InterfaceC42156l
    public final int f250204h;

    /* renamed from: i, reason: collision with root package name */
    @InterfaceC42156l
    public final int f250205i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f250206j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f250207k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f250208l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f250209m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f250210n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f250211o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final RatingBar f250212p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f250213q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f250214r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final TextView f250215s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final TextView f250216t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final TextView f250217u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final ImageView f250218v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final t f250219w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final Group f250220x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f250221y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f250222z;

    /* compiled from: RatingModelReviewItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_ui/reviews/model_review/n$a;", "", "<init>", "()V", "", "SECTION_COLLAPSED_LINES_COUNT", "I", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingModelReviewItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f250223a;

        static {
            int[] iArr = new int[ReviewStatus.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ReviewStatus reviewStatus = ReviewStatus.f250165b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ReviewStatus reviewStatus2 = ReviewStatus.f250165b;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus reviewAnswerStatus = BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus.f250318b;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f250223a = iArr2;
        }
    }

    static {
        new a(null);
    }

    public n(@Y61.k Activity activity, @Y61.k View view) {
        super(view);
        this.f250198b = view;
        this.f250199c = C80(R.attr.black);
        this.f250200d = C80(R.attr.gray4);
        this.f250201e = C80(R.attr.gray24);
        this.f250202f = C80(R.attr.gray54);
        this.f250203g = C80(R.attr.red100);
        this.f250204h = C80(R.attr.red600);
        this.f250205i = C80(R.attr.red900);
        this.f250206j = (LinearLayout) view.findViewById(R.id.review_text_sections);
        this.f250207k = (FrameLayout) view.findViewById(R.id.review_status_container);
        this.f250208l = (TextView) view.findViewById(R.id.review_status);
        this.f250209m = (SimpleDraweeView) view.findViewById(R.id.review_avatar);
        this.f250210n = (TextView) view.findViewById(R.id.review_name);
        this.f250211o = (TextView) view.findViewById(R.id.review_rated);
        this.f250212p = (RatingBar) view.findViewById(R.id.review_score);
        View viewFindViewById = view.findViewById(R.id.review_images);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f250213q = recyclerView;
        this.f250214r = (LinearLayout) view.findViewById(R.id.review_score_stage_title_container);
        this.f250215s = (TextView) view.findViewById(R.id.review_score_desciption);
        this.f250216t = (TextView) view.findViewById(R.id.review_model_title);
        this.f250217u = (TextView) view.findViewById(R.id.review_title);
        this.f250218v = (ImageView) view.findViewById(R.id.review_actions);
        this.f250220x = (Group) view.findViewById(R.id.answer_content);
        this.f250221y = (SimpleDraweeView) view.findViewById(R.id.answer_user_avatar);
        this.f250222z = (SimpleDraweeView) view.findViewById(R.id.answer_shop_avatar);
        this.f250190A = (TextView) view.findViewById(R.id.answer_name);
        this.f250191B = (TextView) view.findViewById(R.id.answer_rated);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.answer_images);
        this.f250192C = recyclerView2;
        this.f250193D = (ImageView) view.findViewById(R.id.answer_actions);
        this.f250194E = (FrameLayout) view.findViewById(R.id.answer_status_container);
        this.f250195F = (TextView) view.findViewById(R.id.answer_status);
        this.f250196G = (RatingReviewTextSectionView) view.findViewById(R.id.answer_text_section);
        int iB2 = kotlin.math.b.b(recyclerView.getContext().getResources().getDimension(R.dimen.gallery_start_end_padding));
        this.f250219w = new t(recyclerView, activity, new r(null, Integer.valueOf(iB2), Integer.valueOf(iB2), null, y6.b(6), y6.b(2), 9, null));
        this.f250197H = new t(recyclerView2, activity, new r(null, Integer.valueOf(iB2), Integer.valueOf(iB2), null, y6.b(6), y6.b(2), 9, null));
    }

    public final void B80(boolean z12) {
        LinearLayout linearLayout = this.f250206j;
        TextView textView = this.f250215s;
        TextView textView2 = this.f250217u;
        TextView textView3 = this.f250216t;
        RecyclerView recyclerView = this.f250213q;
        RatingBar ratingBar = this.f250212p;
        if (z12) {
            ratingBar.setSelectedColor(C35835l0.d(R.attr.orange200, this.itemView.getContext()));
            ratingBar.setUnselectedColor(C35835l0.d(R.attr.warmGray4, this.itemView.getContext()));
            int i12 = this.f250201e;
            textView3.setTextColor(i12);
            textView2.setTextColor(i12);
            textView.setTextColor(i12);
            q6 q6Var = new q6(linearLayout);
            ArrayList arrayList = new ArrayList();
            Iterator<View> it = q6Var.iterator();
            while (true) {
                p6 p6Var = (p6) it;
                if (!p6Var.hasNext()) {
                    break;
                }
                Object next = p6Var.next();
                if (next instanceof RatingReviewTextSectionView) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                RatingReviewTextSectionView ratingReviewTextSectionView = (RatingReviewTextSectionView) it2.next();
                ratingReviewTextSectionView.setTextsColor(i12);
                ratingReviewTextSectionView.setExpandViewsColor(i12);
            }
            recyclerView.setAlpha(0.25f);
            recyclerView.setAlpha(0.25f);
            return;
        }
        ratingBar.setSelectedColor(C35835l0.d(R.attr.orange, this.itemView.getContext()));
        ratingBar.setUnselectedColor(C35835l0.d(R.attr.warmGray12, this.itemView.getContext()));
        int i13 = this.f250202f;
        textView3.setTextColor(i13);
        int i14 = this.f250199c;
        textView2.setTextColor(i14);
        textView.setTextColor(i13);
        q6 q6Var2 = new q6(linearLayout);
        ArrayList arrayList2 = new ArrayList();
        Iterator<View> it3 = q6Var2.iterator();
        while (true) {
            p6 p6Var2 = (p6) it3;
            if (!p6Var2.hasNext()) {
                break;
            }
            Object next2 = p6Var2.next();
            if (next2 instanceof RatingReviewTextSectionView) {
                arrayList2.add(next2);
            }
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            RatingReviewTextSectionView ratingReviewTextSectionView2 = (RatingReviewTextSectionView) it4.next();
            ratingReviewTextSectionView2.setTextsColor(i14);
            ratingReviewTextSectionView2.setExpandViewsColor(i13);
        }
        recyclerView.setAlpha(1.0f);
    }

    public final int C80(int i12) {
        return C35835l0.d(i12, this.itemView.getContext());
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void Cb(@Y61.k String str, boolean z12, @Y61.k Y41.a aVar) {
        RatingReviewTextSectionView ratingReviewTextSectionView = this.f250196G;
        ratingReviewTextSectionView.h(str, z12, false);
        ratingReviewTextSectionView.setOnExpandClickListener(aVar);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void Dp(@Y61.k ReviewStatus reviewStatus, @Y61.l String str, boolean z12) {
        boolean z13 = (reviewStatus == ReviewStatus.f250165b || reviewStatus == ReviewStatus.f250166c || str == null) ? false : true;
        FrameLayout frameLayout = this.f250207k;
        D6.G(frameLayout, z13);
        int iOrdinal = reviewStatus.ordinal();
        TextView textView = this.f250208l;
        if (iOrdinal == 2) {
            if (z12) {
                C13401b.a(frameLayout, textView, this.f250203g, this.f250205i);
            } else {
                C13401b.b(frameLayout, textView, this.f250204h);
            }
            B80(true);
            I5.a(textView, str, false);
            return;
        }
        if (iOrdinal != 3 && iOrdinal != 4) {
            B80(false);
            return;
        }
        int i12 = this.f250199c;
        if (z12) {
            C13401b.a(frameLayout, textView, this.f250200d, i12);
        } else {
            C13401b.b(frameLayout, textView, i12);
        }
        B80(false);
        I5.a(textView, str, false);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void E(@Y61.k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        int dimension = (int) this.itemView.getResources().getDimension(ratingItemsMarginHorizontal.H0());
        D6.c(this.f250209m, Integer.valueOf(dimension), null, null, null, 14);
        D6.c(this.f250214r, null, null, Integer.valueOf(dimension), null, 11);
        D6.c(this.f250206j, null, null, Integer.valueOf(dimension), null, 11);
        D6.c(this.f250216t, null, null, Integer.valueOf(dimension), null, 11);
        D6.c(this.f250210n, null, null, Integer.valueOf(dimension), null, 11);
        D6.c(this.f250217u, null, null, Integer.valueOf(dimension), null, 11);
        D6.c(this.f250218v, null, null, Integer.valueOf(dimension), null, 11);
        D6.c(this.f250207k, null, null, Integer.valueOf(dimension), null, 11);
        D6.f(this.f250213q, dimension, 0, dimension, 0, 10);
        D6.f(this.f250192C, dimension + ((int) this.f250198b.getResources().getDimension(R.dimen.answer_gallery_start_additional_padding)), 0, dimension, 0, 10);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void E6(boolean z12) {
        D6.G(this.f250220x, z12);
        D6.w(this.f250195F);
        D6.w(this.f250193D);
        D6.w(this.f250192C);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void F8(boolean z12) {
        this.f250193D.setVisibility(z12 ? 0 : 4);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    @Y61.k
    /* renamed from: Mc, reason: from getter */
    public final t getF250197H() {
        return this.f250197H;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void Mk(@Y61.l String str) {
        I5.a(this.f250217u, str, false);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void ON(@Y61.l com.avito.android.image_loader.a aVar, @Y61.l String str) {
        C35949t5.c(this.f250209m, aVar, null, null, null, 14);
        this.f250210n.setText(str);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void R4(@Y61.k Y41.a<G0> aVar) {
        this.f250218v.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(19, aVar));
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void R7() {
        this.f250206j.removeAllViews();
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    @Y61.k
    /* renamed from: Z2, reason: from getter */
    public final t getF250219w() {
        return this.f250219w;
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void a9(@Y61.k String str) {
        this.f250190A.setText(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f250219w.d();
        this.f250197H.d();
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void k8(@Y61.l BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus reviewAnswerStatus, @Y61.l String str, @Y61.l String str2, boolean z12) {
        boolean z13 = (reviewAnswerStatus == null || reviewAnswerStatus == BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus.f250319c) ? false : true;
        FrameLayout frameLayout = this.f250194E;
        D6.G(frameLayout, z13);
        int i12 = reviewAnswerStatus == null ? -1 : b.f250223a[reviewAnswerStatus.ordinal()];
        int i13 = this.f250202f;
        RecyclerView recyclerView = this.f250192C;
        RatingReviewTextSectionView ratingReviewTextSectionView = this.f250196G;
        int i14 = this.f250199c;
        TextView textView = this.f250195F;
        if (i12 == 1) {
            textView.setTextColor(i14);
            if (z12) {
                C13401b.a(frameLayout, textView, this.f250200d, i14);
            } else {
                C13401b.b(frameLayout, textView, i14);
            }
            ratingReviewTextSectionView.setTextsColor(i14);
            ratingReviewTextSectionView.setExpandViewsColor(i13);
            recyclerView.setAlpha(1.0f);
            I5.a(textView, str, false);
            return;
        }
        if (i12 != 2) {
            C13401b.b(frameLayout, textView, i14);
            ratingReviewTextSectionView.setTextsColor(i14);
            ratingReviewTextSectionView.setExpandViewsColor(i13);
            recyclerView.setAlpha(1.0f);
            return;
        }
        if (z12) {
            C13401b.a(frameLayout, textView, this.f250203g, this.f250205i);
        } else {
            C13401b.b(frameLayout, textView, this.f250204h);
        }
        int i15 = this.f250201e;
        ratingReviewTextSectionView.setTextsColor(i15);
        ratingReviewTextSectionView.setExpandViewsColor(i15);
        recyclerView.setAlpha(0.25f);
        I5.a(textView, str2, false);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void o20(@Y61.l String str) {
        I5.a(this.f250216t, str, false);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void oY(@Y61.l String str) {
        I5.a(this.f250215s, str, false);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void s9(@Y61.k BaseRatingReviewItem.ReviewTextSection reviewTextSection, int i12, @Y61.k Y41.a aVar) {
        RatingReviewTextSectionView ratingReviewTextSectionView = new RatingReviewTextSectionView(this.itemView.getContext(), null, 0, 6, null);
        ratingReviewTextSectionView.setTitle(reviewTextSection.f250332b);
        ratingReviewTextSectionView.h(reviewTextSection.f250333c, reviewTextSection.f250335e, false);
        ratingReviewTextSectionView.setOnExpandClickListener(aVar);
        ratingReviewTextSectionView.setPadding(ratingReviewTextSectionView.getPaddingLeft(), y6.b(i12 == 0 ? 4 : 12), ratingReviewTextSectionView.getPaddingRight(), ratingReviewTextSectionView.getPaddingBottom());
        this.f250206j.addView(ratingReviewTextSectionView);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void ue(boolean z12) {
        D6.G(this.f250218v, z12);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void vA(@Y61.l String str) {
        I5.a(this.f250191B, str, false);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void vc(@Y61.l Float f12) {
        float fFloatValue = f12 != null ? f12.floatValue() : 0.0f;
        RatingBar ratingBar = this.f250212p;
        ratingBar.setRating(fFloatValue);
        D6.G(ratingBar, f12 != null);
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void xa(@Y61.k com.avito.android.image_loader.a aVar, boolean z12) {
        D6.G(this.f250221y, !z12);
        D6.G(this.f250222z, z12);
        if (z12) {
            C35949t5.c(this.f250222z, aVar, null, null, null, 14);
        } else {
            C35949t5.c(this.f250221y, aVar, null, null, null, 14);
        }
    }

    @Override // com.avito.android.rating_ui.reviews.model_review.m
    public final void xw(@Y61.l String str) {
        this.f250211o.setText(str);
    }
}
