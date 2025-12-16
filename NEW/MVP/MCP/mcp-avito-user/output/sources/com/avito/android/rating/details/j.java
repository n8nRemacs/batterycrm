package com.avito.android.rating.details;

import com.avito.android.rating.details.RatingDetailsFragment;
import com.avito.android.rating.details.mvi.entity.a;
import com.avito.android.rating_ui.reviews.model_review.ModelAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rating_ui/reviews/model_review/ModelAction;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/rating_ui/reviews/model_review/ModelAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j extends N implements Y41.l<ModelAction, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RatingDetailsFragment f247171l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating_ui.reviews.model_review.a f247172m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ModelAction f247173n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.rating_ui.reviews_options.c f247174o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(RatingDetailsFragment ratingDetailsFragment, com.avito.android.rating_ui.reviews.model_review.a aVar, ModelAction modelAction, com.avito.android.rating_ui.reviews_options.c cVar) {
        super(1);
        this.f247171l = ratingDetailsFragment;
        this.f247172m = aVar;
        this.f247173n = modelAction;
        this.f247174o = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(ModelAction modelAction) {
        RatingDetailsFragment.C34165a c34165a = RatingDetailsFragment.f246422S0;
        RatingDetailsFragment ratingDetailsFragment = this.f247171l;
        ratingDetailsFragment.E5().accept(new a.n(this.f247172m, this.f247173n));
        this.f247174o.r();
        ratingDetailsFragment.f246438P0 = null;
        return G0.f406611a;
    }
}
