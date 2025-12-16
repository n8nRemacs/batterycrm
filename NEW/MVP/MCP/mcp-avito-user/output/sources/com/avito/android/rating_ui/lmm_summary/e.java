package com.avito.android.rating_ui.lmm_summary;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingLLMSummaryPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BaseRatingLLMSummaryItem f250089l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f250090m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f250091n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BaseRatingLLMSummaryItem baseRatingLLMSummaryItem, h hVar, f fVar) {
        super(1);
        this.f250089l = baseRatingLLMSummaryItem;
        this.f250090m = hVar;
        this.f250091n = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        BaseRatingLLMSummaryItem baseRatingLLMSummaryItem = this.f250089l;
        baseRatingLLMSummaryItem.A1();
        this.f250090m.Du(baseRatingLLMSummaryItem.getF250056e().f250060b, baseRatingLLMSummaryItem.getF250056e().f250061c);
        this.f250091n.f250093c.invoke(deepLink);
        return G0.f406611a;
    }
}
