package com.avito.android.rating_ui.reviews.review;

import Dh0.InterfaceC13400a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingReviewItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m f250356l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BaseRatingReviewItem f250357m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, BaseRatingReviewItem baseRatingReviewItem) {
        super(1);
        this.f250356l = mVar;
        this.f250357m = baseRatingReviewItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        m mVar = this.f250356l;
        mVar.f250362b.invoke(new InterfaceC13400a.e(this.f250357m, deepLink));
        return G0.f406611a;
    }
}
