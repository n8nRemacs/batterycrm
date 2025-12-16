package com.avito.android.rating_ui.reviews.review;

import Ch0.C13305a;
import Ch0.c;
import Dh0.C13401b;
import android.app.Activity;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.review_text_section.RatingReviewTextSectionView;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tns_gallery.t;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.q6;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import j.InterfaceC42156l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: RatingReviewItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/p;", "Lcom/avito/android/rating_ui/reviews/review/o;", "Lcom/avito/konveyor/adapter/b;", "Lru/avito/component/animator/c;", "a", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p extends com.avito.konveyor.adapter.b implements o, ru.avito.component.animator.c {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f250364J = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final TextView f250365A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final TextView f250366B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f250367C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final ImageView f250368D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f250369E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final TextView f250370F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final RatingReviewTextSectionView f250371G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final t f250372H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final t f250373I;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f250374b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final q f250375c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC42156l
    public final int f250376d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC42156l
    public final int f250377e;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC42156l
    public final int f250378f;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC42156l
    public final int f250379g;

    /* renamed from: h, reason: collision with root package name */
    @InterfaceC42156l
    public final int f250380h;

    /* renamed from: i, reason: collision with root package name */
    @InterfaceC42156l
    public final int f250381i;

    /* renamed from: j, reason: collision with root package name */
    @InterfaceC42156l
    public final int f250382j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f250383k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f250384l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f250385m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ImageView f250386n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f250387o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final TextView f250388p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f250389q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f250390r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final RatingBar f250391s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final TextView f250392t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final TextView f250393u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final TextView f250394v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f250395w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final Group f250396x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f250397y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f250398z;

    /* compiled from: RatingReviewItemView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/p$a;", "", "<init>", "()V", "", "CAPTION_DELIMITER", "Ljava/lang/String;", "", "SECTION_COLLAPSED_LINES_COUNT", "I", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingReviewItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f250399a;

        static {
            int[] iArr = new int[BaseRatingReviewItem.ReviewStatus.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BaseRatingReviewItem.ReviewStatus reviewStatus = BaseRatingReviewItem.ReviewStatus.f250323b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BaseRatingReviewItem.ReviewStatus reviewStatus2 = BaseRatingReviewItem.ReviewStatus.f250323b;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                BaseRatingReviewItem.ReviewStatus reviewStatus3 = BaseRatingReviewItem.ReviewStatus.f250323b;
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                BaseRatingReviewItem.ReviewStatus reviewStatus4 = BaseRatingReviewItem.ReviewStatus.f250323b;
                iArr[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus reviewAnswerStatus = BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus.f250318b;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f250399a = iArr2;
        }
    }

    static {
        new a(null);
    }

    public p(@Y61.k Activity activity, @Y61.k View view) {
        super(view);
        this.f250374b = view;
        this.f250375c = q.f250400a;
        this.f250376d = C80(R.attr.black);
        this.f250377e = C80(R.attr.gray4);
        this.f250378f = C80(R.attr.gray24);
        this.f250379g = C80(R.attr.gray54);
        this.f250380h = C80(R.attr.red100);
        this.f250381i = C80(R.attr.red600);
        this.f250382j = C80(R.attr.red900);
        this.f250383k = (SimpleDraweeView) view.findViewById(R.id.review_avatar);
        this.f250384l = (TextView) view.findViewById(R.id.review_name);
        this.f250385m = (TextView) view.findViewById(R.id.review_rated);
        this.f250386n = (ImageView) view.findViewById(R.id.review_actions);
        this.f250387o = (FrameLayout) view.findViewById(R.id.review_status_container);
        this.f250388p = (TextView) view.findViewById(R.id.review_status);
        View viewFindViewById = view.findViewById(R.id.review_images);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f250389q = recyclerView;
        this.f250390r = (LinearLayout) view.findViewById(R.id.review_score_stage_title_container);
        this.f250391s = (RatingBar) view.findViewById(R.id.review_score);
        this.f250392t = (TextView) view.findViewById(R.id.review_stage_title);
        this.f250393u = (TextView) view.findViewById(R.id.review_item_title);
        this.f250394v = (TextView) view.findViewById(R.id.review_delivery_title);
        this.f250395w = (LinearLayout) view.findViewById(R.id.review_text_sections);
        this.f250396x = (Group) view.findViewById(R.id.answer_content);
        this.f250397y = (SimpleDraweeView) view.findViewById(R.id.answer_user_avatar);
        this.f250398z = (SimpleDraweeView) view.findViewById(R.id.answer_shop_avatar);
        this.f250365A = (TextView) view.findViewById(R.id.answer_name);
        this.f250366B = (TextView) view.findViewById(R.id.answer_rated);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.answer_images);
        this.f250367C = recyclerView2;
        this.f250368D = (ImageView) view.findViewById(R.id.answer_actions);
        this.f250369E = (FrameLayout) view.findViewById(R.id.answer_status_container);
        this.f250370F = (TextView) view.findViewById(R.id.answer_status);
        this.f250371G = (RatingReviewTextSectionView) view.findViewById(R.id.answer_text_section);
        int iB2 = kotlin.math.b.b(recyclerView.getContext().getResources().getDimension(R.dimen.gallery_start_end_padding));
        this.f250372H = new t(recyclerView, activity, new com.avito.android.tns_gallery.r(null, Integer.valueOf(iB2), Integer.valueOf(iB2), null, y6.b(6), y6.b(2), 9, null));
        this.f250373I = new t(recyclerView2, activity, new com.avito.android.tns_gallery.r(null, Integer.valueOf(iB2), Integer.valueOf(iB2), null, y6.b(6), y6.b(2), 9, null));
    }

    public final void B80(boolean z12) {
        RecyclerView recyclerView = this.f250389q;
        LinearLayout linearLayout = this.f250395w;
        TextView textView = this.f250394v;
        TextView textView2 = this.f250393u;
        TextView textView3 = this.f250392t;
        RatingBar ratingBar = this.f250391s;
        if (z12) {
            ratingBar.setSelectedColor(C35835l0.d(R.attr.orange200, this.itemView.getContext()));
            ratingBar.setUnselectedColor(C35835l0.d(R.attr.warmGray4, this.itemView.getContext()));
            int i12 = this.f250378f;
            textView3.setTextColor(i12);
            textView2.setTextColor(i12);
            textView.setTextColor(i12);
            q6 q6Var = new q6(linearLayout);
            ArrayList<RatingReviewTextSectionView> arrayList = new ArrayList();
            Iterator<View> it = q6Var.iterator();
            while (it.hasNext()) {
                View next = it.next();
                if (next instanceof RatingReviewTextSectionView) {
                    arrayList.add(next);
                }
            }
            for (RatingReviewTextSectionView ratingReviewTextSectionView : arrayList) {
                ratingReviewTextSectionView.setTextsColor(i12);
                ratingReviewTextSectionView.setExpandViewsColor(i12);
            }
            recyclerView.setAlpha(0.25f);
            return;
        }
        ratingBar.setSelectedColor(C35835l0.d(R.attr.orange, this.itemView.getContext()));
        ratingBar.setUnselectedColor(C35835l0.d(R.attr.warmGray12, this.itemView.getContext()));
        int i13 = this.f250379g;
        textView3.setTextColor(i13);
        textView2.setTextColor(i13);
        textView.setTextColor(i13);
        q6 q6Var2 = new q6(linearLayout);
        ArrayList<RatingReviewTextSectionView> arrayList2 = new ArrayList();
        Iterator<View> it2 = q6Var2.iterator();
        while (it2.hasNext()) {
            View next2 = it2.next();
            if (next2 instanceof RatingReviewTextSectionView) {
                arrayList2.add(next2);
            }
        }
        for (RatingReviewTextSectionView ratingReviewTextSectionView2 : arrayList2) {
            ratingReviewTextSectionView2.setTextsColor(this.f250376d);
            ratingReviewTextSectionView2.setExpandViewsColor(i13);
        }
        recyclerView.setAlpha(1.0f);
    }

    public final int C80(int i12) {
        return C35835l0.d(i12, this.itemView.getContext());
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void Cb(@Y61.k String str, boolean z12, @Y61.k Y41.a aVar) {
        RatingReviewTextSectionView ratingReviewTextSectionView = this.f250371G;
        ratingReviewTextSectionView.h(str, z12, false);
        ratingReviewTextSectionView.setOnExpandClickListener(aVar);
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void E(@Y61.k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        int dimension = (int) this.itemView.getResources().getDimension(ratingItemsMarginHorizontal.H0());
        D6.c(this.f250383k, Integer.valueOf(dimension), null, null, null, 14);
        D6.c(this.f250386n, null, null, Integer.valueOf(dimension), null, 11);
        D6.f(this.f250389q, dimension, 0, dimension, 0, 10);
        D6.f(this.f250367C, dimension + ((int) this.f250374b.getResources().getDimension(R.dimen.answer_gallery_start_additional_padding)), 0, dimension, 0, 10);
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void E6(boolean z12) {
        D6.G(this.f250396x, z12);
        D6.w(this.f250369E);
        D6.w(this.f250368D);
        D6.w(this.f250367C);
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void EO(boolean z12) {
        this.f250386n.setVisibility(z12 ? 0 : 4);
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void F8(boolean z12) {
        this.f250368D.setVisibility(z12 ? 0 : 4);
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void GJ(@Y61.l String str, @Y61.l String str2) {
        if (str != null && str2 != null) {
            str = androidx.appcompat.app.r.r(str, " · ", str2);
        } else if (str == null) {
            str = str2 == null ? "" : str2;
        }
        this.f250385m.setText(str);
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void GK(@Y61.l String str, boolean z12) {
        TextView textView = this.f250393u;
        I5.a(textView, str, false);
        textView.setSingleLine(z12);
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void J(@Y61.l String str) {
        this.f250384l.setText(str);
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    @Y61.k
    /* renamed from: Mc, reason: from getter */
    public final t getF250373I() {
        return this.f250373I;
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void Nh(@Y61.l String str) {
        I5.a(this.f250394v, str, false);
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void R4(@Y61.k Y41.a<G0> aVar) {
        this.f250386n.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(21, aVar));
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void R7() {
        this.f250395w.removeAllViews();
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void WX(@Y61.k BaseRatingReviewItem.ReviewStatus reviewStatus, @Y61.l String str, @Y61.l AttributedText attributedText, boolean z12, boolean z13, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        int iOrdinal = reviewStatus.ordinal();
        int i12 = this.f250381i;
        int i13 = this.f250380h;
        int i14 = this.f250382j;
        FrameLayout frameLayout = this.f250387o;
        TextView textView = this.f250388p;
        if (iOrdinal == 2) {
            if (z13) {
                C13401b.a(frameLayout, textView, i13, i14);
            } else {
                C13401b.b(frameLayout, textView, i12);
            }
            B80(true);
            I5.a(textView, str, false);
            frameLayout.setVisibility(0);
            return;
        }
        int i15 = this.f250377e;
        int i16 = this.f250376d;
        if (iOrdinal == 3 || iOrdinal == 4) {
            if (z13) {
                C13401b.a(frameLayout, textView, i15, i16);
            } else {
                C13401b.b(frameLayout, textView, i16);
            }
            B80(false);
            I5.a(textView, str, false);
            frameLayout.setVisibility(0);
            return;
        }
        if (iOrdinal != 5 && iOrdinal != 6) {
            B80(false);
            frameLayout.setVisibility(8);
            return;
        }
        if (z13) {
            BaseRatingReviewItem.ReviewStatus reviewStatus2 = BaseRatingReviewItem.ReviewStatus.f250329h;
            if (reviewStatus != reviewStatus2) {
                i14 = i16;
            }
            if (reviewStatus != reviewStatus2) {
                i13 = i15;
            }
            C13401b.a(frameLayout, textView, i13, i14);
        } else {
            if (reviewStatus != BaseRatingReviewItem.ReviewStatus.f250329h) {
                i12 = i16;
            }
            C13401b.b(frameLayout, textView, i12);
        }
        B80(z12);
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new B(8, lVar));
            com.avito.android.util.text.j.a(textView, attributedText, null);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            I5.a(textView, str, false);
        }
        frameLayout.setVisibility(0);
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    @Y61.k
    /* renamed from: Z2, reason: from getter */
    public final t getF250372H() {
        return this.f250372H;
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void a9(@Y61.k String str) {
        this.f250365A.setText(str);
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void cP(@Y61.l String str, @Y61.l String str2) {
        if (str2 != null) {
            str = androidx.appcompat.app.r.r(str, " · ", str2);
        }
        I5.a(this.f250366B, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f250372H.d();
        this.f250373I.d();
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void k8(@Y61.l BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus reviewAnswerStatus, @Y61.l String str, @Y61.l String str2, boolean z12) {
        boolean z13 = (reviewAnswerStatus == null || reviewAnswerStatus == BaseRatingReviewItem.ReviewAnswer.ReviewAnswerStatus.f250319c) ? false : true;
        FrameLayout frameLayout = this.f250369E;
        D6.G(frameLayout, z13);
        int i12 = reviewAnswerStatus == null ? -1 : b.f250399a[reviewAnswerStatus.ordinal()];
        int i13 = this.f250379g;
        RecyclerView recyclerView = this.f250367C;
        int i14 = this.f250376d;
        RatingReviewTextSectionView ratingReviewTextSectionView = this.f250371G;
        TextView textView = this.f250370F;
        if (i12 == 1) {
            if (z12) {
                C13401b.a(frameLayout, textView, this.f250377e, i14);
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
            C13401b.a(frameLayout, textView, this.f250380h, this.f250382j);
        } else {
            C13401b.b(frameLayout, textView, this.f250381i);
        }
        int i15 = this.f250378f;
        ratingReviewTextSectionView.setTextsColor(i15);
        ratingReviewTextSectionView.setExpandViewsColor(i15);
        recyclerView.setAlpha(0.25f);
        I5.a(textView, str2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void s9(@Y61.k BaseRatingReviewItem.ReviewTextSection reviewTextSection, int i12, @Y61.k Y41.a aVar) {
        UniversalColor universalColor;
        RatingReviewTextSectionView ratingReviewTextSectionView = new RatingReviewTextSectionView(this.itemView.getContext(), null, 0, 6, null);
        ratingReviewTextSectionView.setTitle(reviewTextSection.f250332b);
        List<BaseRatingReviewItem.ReviewTextSection.HighlightedText> list = reviewTextSection.f250334d;
        if (list != null) {
            boolean z12 = reviewTextSection.f250335e;
            float f12 = RatingReviewTextSectionView.f250127j;
            TextView textView = ratingReviewTextSectionView.f250129c;
            textView.setShadowLayer(f12, 0.0f, 0.0f, 0);
            textView.getContext();
            c.a aVar2 = new c.a(RatingReviewTextSectionView.f250126i);
            Iterator<T> it = list.iterator();
            while (true) {
                Integer numValueOf = null;
                if (!it.hasNext()) {
                    break;
                }
                BaseRatingReviewItem.ReviewTextSection.HighlightedText highlightedText = (BaseRatingReviewItem.ReviewTextSection.HighlightedText) it.next();
                SpannableString spannableString = new SpannableString(highlightedText.f250340b);
                BaseRatingReviewItem.ReviewTextSection.Highlight highlight = highlightedText.f250341c;
                if (highlight != null && (universalColor = highlight.f250338b) != null) {
                    numValueOf = Integer.valueOf(C48063a.f437606a.a(ratingReviewTextSectionView.getContext(), universalColor));
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    BaseRatingReviewItem.ReviewTextSection.BorderRadius borderRadius = highlight.f250339c;
                    aVar2.a(spannableString, iIntValue, borderRadius.f250336b, borderRadius.f250337c);
                } else {
                    aVar2.a(spannableString, 0, 0, 0);
                }
            }
            ArrayList arrayList = aVar2.f2640b;
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("You must specify at least one text part");
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Q q12 = (Q) it2.next();
                ((C13305a) q12.f406620c).f2621e = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) q12.f406619b);
                ((C13305a) q12.f406620c).f2622f = spannableStringBuilder.length();
            }
            spannableStringBuilder.setSpan(new Ch0.c(aVar2, null), 0, spannableStringBuilder.length(), 33);
            ratingReviewTextSectionView.f250134h = spannableStringBuilder;
            ratingReviewTextSectionView.h(spannableStringBuilder, z12, true);
        } else {
            ratingReviewTextSectionView.h(reviewTextSection.f250333c, reviewTextSection.f250335e, false);
        }
        ratingReviewTextSectionView.setOnExpandClickListener(aVar);
        ratingReviewTextSectionView.setPadding(ratingReviewTextSectionView.getPaddingLeft(), y6.b(i12 == 0 ? 4 : 12), ratingReviewTextSectionView.getPaddingRight(), ratingReviewTextSectionView.getPaddingBottom());
        this.f250395w.addView(ratingReviewTextSectionView);
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void w30(@Y61.l String str, @Y61.l Float f12) {
        LinearLayout linearLayout = this.f250390r;
        if (f12 == null && str == null) {
            D6.w(linearLayout);
            return;
        }
        D6.G(linearLayout, true);
        float fFloatValue = f12 != null ? f12.floatValue() : 0.0f;
        RatingBar ratingBar = this.f250391s;
        ratingBar.setRating(fFloatValue);
        D6.G(ratingBar, f12 != null);
        I5.a(this.f250392t, str, false);
        ViewGroup.LayoutParams layoutParams = ratingBar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, y6.b(1), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        ratingBar.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, y6.b(1));
        linearLayout.setLayoutParams(marginLayoutParams2);
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void xa(@Y61.k com.avito.android.image_loader.a aVar, boolean z12) {
        D6.G(this.f250397y, !z12);
        D6.G(this.f250398z, z12);
        if (z12) {
            C35949t5.c(this.f250398z, aVar, null, null, null, 14);
        } else {
            C35949t5.c(this.f250397y, aVar, null, null, null, 14);
        }
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void xp(@Y61.k Y41.a<G0> aVar) {
        this.f250368D.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(20, aVar));
    }

    @Override // ru.avito.component.animator.c
    @Y61.k
    public final ru.avito.component.animator.b y00() {
        return this.f250375c;
    }

    @Override // com.avito.android.rating_ui.reviews.review.o
    public final void z5(@Y61.k com.avito.android.image_loader.k kVar) {
        C35949t5.c(this.f250383k, kVar, null, null, null, 14);
    }
}
