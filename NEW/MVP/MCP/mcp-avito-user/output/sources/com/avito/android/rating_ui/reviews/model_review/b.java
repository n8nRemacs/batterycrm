package com.avito.android.rating_ui.reviews.model_review;

import TV0.g;
import Y41.p;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingModelReviewItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_ui/reviews/model_review/b;", "LTV0/b;", "Lcom/avito/android/rating_ui/reviews/model_review/m;", "Lcom/avito/android/rating_ui/reviews/model_review/a;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements TV0.b<m, com.avito.android.rating_ui.reviews.model_review.a> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f250172a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<n> f250173b;

    /* compiled from: RatingModelReviewItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/rating_ui/reviews/model_review/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/rating_ui/reviews/model_review/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, n> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Activity f250174l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(2);
            this.f250174l = activity;
        }

        @Override // Y41.p
        public final n invoke(ViewGroup viewGroup, View view) {
            return new n(this.f250174l, view);
        }
    }

    @Inject
    public b(@Y61.k d dVar, @Y61.k Activity activity) {
        this.f250172a = dVar;
        this.f250173b = new g.a<>(R.layout.review_model_item, new a(activity));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f250172a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<n> b() {
        return this.f250173b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof com.avito.android.rating_ui.reviews.model_review.a;
    }
}
