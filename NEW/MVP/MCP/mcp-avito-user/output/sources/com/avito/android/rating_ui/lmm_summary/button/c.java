package com.avito.android.rating_ui.lmm_summary.button;

import TV0.e;
import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RatingLLMSummaryButtonPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_ui/lmm_summary/button/c;", "LTV0/d;", "Lcom/avito/android/rating_ui/lmm_summary/button/d;", "Lcom/avito/android/rating_ui/lmm_summary/button/RatingLLMSummaryButtonItem;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements TV0.d<d, RatingLLMSummaryButtonItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f250084b;

    /* JADX WARN: Multi-variable type inference failed */
    public c(@k l<? super DeepLink, G0> lVar) {
        this.f250084b = lVar;
    }

    @Override // TV0.d
    public final void O5(e eVar, TV0.a aVar, int i12) {
        RatingLLMSummaryButtonItem ratingLLMSummaryButtonItem = (RatingLLMSummaryButtonItem) aVar;
        Button button = ((d) eVar).f250086b;
        button.setText(ratingLLMSummaryButtonItem.f250077c);
        button.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(18, new b(this, ratingLLMSummaryButtonItem)));
    }
}
