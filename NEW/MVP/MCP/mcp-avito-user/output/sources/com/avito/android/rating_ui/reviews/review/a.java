package com.avito.android.rating_ui.reviews.review;

import TV0.g;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingReviewItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/a;", "LTV0/b;", "Lcom/avito/android/rating_ui/reviews/review/o;", "Lcom/avito/android/rating_ui/reviews/review/BaseRatingReviewItem;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<o, BaseRatingReviewItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f250342a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<p> f250343b;

    /* compiled from: RatingReviewItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/rating_ui/reviews/review/p;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/rating_ui/reviews/review/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.rating_ui.reviews.review.a$a, reason: collision with other inner class name */
    public static final class C7505a extends N implements Y41.p<ViewGroup, View, p> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Activity f250344l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7505a(Activity activity) {
            super(2);
            this.f250344l = activity;
        }

        @Override // Y41.p
        public final p invoke(ViewGroup viewGroup, View view) {
            return new p(this.f250344l, view);
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k Activity activity) {
        this.f250342a = cVar;
        this.f250343b = new g.a<>(R.layout.review_item, new C7505a(activity));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f250342a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<p> b() {
        return this.f250343b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof BaseRatingReviewItem;
    }
}
